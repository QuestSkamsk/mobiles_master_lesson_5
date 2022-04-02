package lesson_3.ru.gb.pages;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import lesson_3.ru.gb.locators.LocatorService;
import lesson_3.ru.gb.locators.SwipePageLocators;
import java.awt.image.BufferedImage;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class SwipePage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    @Step("Swipe в положении {swipe_number}")
    public SwipePage clickSwipeButtonChange(Integer swipe_number) {
        $(locator().swipeButton(swipe_number)).click();
        return this;
    }

    /*@Step("Swipe в положении 1")
    public SwipePage clickSwipeButtonChange1() {
        $(locator().swipeButton1()).click();
        return new SwipePage();
    }

    @Step("Swipe в положении 2")
    public SwipePage clickSwipeButtonChange2() {
        $(locator().swipeButton2()).click();
        return new SwipePage();
    }

    @Step("Swipe в положении 3")
    public SwipePage clickSwipeButtonChange3() {
        $(locator().swipeButton3()).click();
        return new SwipePage();
    }*/

    @Step("Делаем скриншот {imageName} страницы и сравниваем с требованием.")
    public SwipePage checkScreenshot(String imageName, String methodName) {
        // Загружаем ожидаемое изображения для сравнения.
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/" + imageName);
        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
        File actualScreenshot = $(locator().swipeScreen()).screenshot();
        // Загружаем актуальный скриншот.
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        // Где будем хранить скриншот с различиями в случае падения теста.
        File resultDestination = new File("diff/diff_" + methodName + ".png");

        // Сравниваем.
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }
}
