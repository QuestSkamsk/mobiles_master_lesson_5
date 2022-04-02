package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class FailErrorTextLoginTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Сообщения об ошибке валидного email")
    public void FailEmptyEmailTest() {
        openApp()
                .clickLoginMenuButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}


