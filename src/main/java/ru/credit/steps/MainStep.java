package ru.credit.steps;

import ru.credit.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainStep {

    @Step("Нажата кнопка калькулятор")
    public void clickCalc()
    {
        new MainPage().calculateHref.click();
    }
}
