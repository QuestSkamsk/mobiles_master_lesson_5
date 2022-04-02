package lesson_3.ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.FormsPageLocators;
import org.openqa.selenium.By;


public class AndroidFormsPageLocators implements FormsPageLocators {

    @Override
    public By formsSwitchButton() {
        return MobileBy.AccessibilityId("switch");
    }

    @Override
    public By formScreen() {
        return MobileBy.AccessibilityId("Forms-screen");
    }
}
