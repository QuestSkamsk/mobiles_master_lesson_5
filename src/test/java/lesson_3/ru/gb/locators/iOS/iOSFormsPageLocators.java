package lesson_3.ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.FormsPageLocators;
import org.openqa.selenium.By;


public class iOSFormsPageLocators implements FormsPageLocators {

    public By formsSwitchButton() {
        return MobileBy.AccessibilityId("switch");
    }

    public By formScreen() {
        return MobileBy.AccessibilityId("Forms-screen");
    }
}
