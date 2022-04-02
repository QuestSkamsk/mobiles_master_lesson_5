package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class ErrorTextLoginTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Невалидный email.")
    public void EmptyEmailTest() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}


