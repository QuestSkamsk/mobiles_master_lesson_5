package lesson_3.ru.gb.tests;

import io.qameta.allure.Description;
import lesson_3.ru.gb.base.BaseTest;
import lesson_3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class SwitchOnTest extends BaseTest {

    @Test
    @Description("Переключаем Switch в положение 'on'")
    public void SwitchOnTest() {
        openApp()
                .clickFormsButton()
                .formsSwitchButtonOn()
                .checkSwitchButtonOn();
    }
}
