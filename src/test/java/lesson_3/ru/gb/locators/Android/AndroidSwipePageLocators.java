package lesson_3.ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import lesson_3.ru.gb.locators.SwipePageLocators;
import org.openqa.selenium.By;


public class AndroidSwipePageLocators implements SwipePageLocators {

    @Override
    public By swipeButton(Integer swipe_number) {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup[" + swipe_number + "]/android.view.ViewGroup");
    }

    /*@Override
    public By swipeButton1() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup[1]/android.view.ViewGroup");
    }

    @Override
    public By swipeButton2() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup[2]");
    }

    @Override
    public By swipeButton3() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup[3]/android.view.ViewGroup");
    }*/

    @Override
    public By swipeScreen() {
        return MobileBy.AccessibilityId("Swipe-screen");
    }
}
