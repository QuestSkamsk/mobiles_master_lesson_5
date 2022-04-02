package lesson_3.ru.gb.locators;

import lesson_3.ru.gb.locators.Android.AndroidFormsPageLocators;
import lesson_3.ru.gb.locators.Android.AndroidLoginPageLocators;
import lesson_3.ru.gb.locators.Android.AndroidMainPageLocators;
import lesson_3.ru.gb.locators.Android.AndroidSwipePageLocators;
import lesson_3.ru.gb.locators.iOS.iOSFormsPageLocators;
import lesson_3.ru.gb.locators.iOS.iOSLoginPageLocators;
import lesson_3.ru.gb.locators.iOS.iOSMainPageLocators;
import lesson_3.ru.gb.locators.iOS.iOSSwipePageLocators;


public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();
    public static final FormsPageLocators FORMS_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidFormsPageLocators() : new iOSFormsPageLocators();
    public static final SwipePageLocators SWIPE_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidSwipePageLocators() : new iOSSwipePageLocators();

}