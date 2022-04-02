package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class SwipeButtonTest extends BaseTest {

    @Test
    @Description("Переключаем Swipe")
    public void swipeButtonTest() {
        openApp()
                .clickSwipeButton()
                .clickSwipeButtonChange(2)
                .clickSwipeButtonChange(3)
                .clickSwipeButtonChange(1);
    }
}
