package lesson_3.ru.gb;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

//Ненастоящий тест. Помогает сделать скриншот для ожидаемого результата.
public class ScreenshotHelper extends BaseTest {

    @Test
    @Description("Скриншот главной страницы")
    public void createScreenMainPage() {
        openApp();
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }

    @Test
    @Description("Скриншот Forms")
    public void createScreenFormPage() {
        openApp()
                .clickFormsButton();
        File actualScreenshot = $(MobileBy.AccessibilityId("Forms-screen")).screenshot();
    }

    @Test
    @Description("Скриншот Swipe")
    public void createScreenSwipePage() {
        openApp()
                .clickSwipeButton();
        File actualScreenshot = $(MobileBy.AccessibilityId("Swipe-screen")).screenshot();
    }
}
