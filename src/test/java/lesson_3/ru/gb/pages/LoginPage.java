package lesson_3.ru.gb.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lesson_3.ru.gb.locators.Android.AndroidLoginPageLocators;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private AndroidLoginPageLocators locator() {
        return new AndroidLoginPageLocators();
    }

    @Step("Кликаем по кнопке 'логин' в форме")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
    @Step("Вводим логин")
    public LoginPage inputLogin(String login) {
        $(locator().loginLogin()).sendKeys(login);
        return this;
    }

    @Step("Вводим пароль")
    public LoginPage inputPassword(String password) {
        $(locator().loginPassword()).sendKeys(password);
        return this;
    }

    @Step("Кликаем по кнопке 'LOGIN'")
    public LoginPage inputButtonClick() {
        $(locator().loginButton()).click();
        return this;
    }

    @Step("Проверяем корректность ввода логина и пароля")
    public LoginPage checkMessage(String text) {
        $(locator().happyText()).shouldHave(Condition.text(text));
        return this;
    }
}
