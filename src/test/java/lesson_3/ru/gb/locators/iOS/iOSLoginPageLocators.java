package lesson_3.ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.LoginPageLocators;
import org.openqa.selenium.By;


public class iOSLoginPageLocators implements LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    public By loginErrorText() {
        return MobileBy.AccessibilityId("Please enter a valid email address");
    }
}