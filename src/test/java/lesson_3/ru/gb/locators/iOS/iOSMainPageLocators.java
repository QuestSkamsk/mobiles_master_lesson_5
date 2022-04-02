package lesson_3.ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.MainPageLocators;
import org.openqa.selenium.By;


public class iOSMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    public By formsButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
    }

    public By swipeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.widget.TextView");
    }
}