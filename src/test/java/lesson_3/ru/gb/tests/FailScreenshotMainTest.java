package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class FailScreenshotMainTest extends BaseTest {

    @Test
    @Description("Неудачной проверки UI главной страницы с помощью скриншота.")
    public void FailScreenshotMainTest() {
        openApp()
                .checkScreenshot("failTestMainPage.png", "CheckFailScreenshotMainPage");
    }
}


