package lesson_3.ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.LoginPageLocators;
import org.openqa.selenium.By;

public class AndroidLoginPageLocators implements LoginPageLocators {

    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
    }
    public By loginLogin() {
        return MobileBy.AccessibilityId("input-email");
    }

    public By loginPassword() {
        return MobileBy.AccessibilityId("input-password");
    }

    public By inputButtonClick() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
    }

    public By happyText() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
    }
}

