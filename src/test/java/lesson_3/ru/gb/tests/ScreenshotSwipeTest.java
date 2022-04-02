package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class ScreenshotSwipeTest extends BaseTest {

    @Test
    @Description("Проверяем UI страницы Swipe с помощью скриншота.")
    public void ScreenshotSwipeTest() {
        openApp()
                .clickSwipeButton()
                .checkScreenshot("swipePage.png", "CheckScreenshotSwipePage");
    }
}
