package lesson_3.ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.MainPageLocators;
import org.openqa.selenium.By;

public class AndroidMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By formsButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
    }

    @Override
    public By swipeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.widget.TextView");
    }

}
