package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class ScreenshotMainTest extends BaseTest {

    @Test
    @Description("Проверяем UI главной страницы с помощью скриншота.")
    public void ScreenshotMainTest() {
        openApp()
                .checkScreenshot("mainPage.png", "CheckScreenshotMainPage");
    }
}


