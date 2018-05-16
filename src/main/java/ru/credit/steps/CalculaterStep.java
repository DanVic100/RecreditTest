package ru.credit.steps;


import org.openqa.selenium.support.ui.Select;
import ru.credit.pages.CalculatePage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class CalculaterStep{


    CalculatePage calculatePage = new CalculatePage();

    public HashMap<String,String> fields = new HashMap();

    public CalculaterStep setFields() {


        fields.put("Заголовок страницы",calculatePage.title.getText());
        fields.put("Ставка",calculatePage.rate.getText());
        fields.put("Начислено",calculatePage.earned.getText());
        fields.put("Пополнение за",calculatePage.replenish_calc.getText());
        fields.put("К снятию",calculatePage.result.getText());

        return this;
    }

    @Step("Выбран валюта {0}")
    public void clickDollar(String string)

    {
        if (string.equals("доллары")){calculatePage.dollar.click();}
        else if (string.equals("рубли")){calculatePage.rubles.click();}
    }

    @Step("Сумма вклада {0}")
    public void sendAmount(String str)
    {
        calculatePage.amount.sendKeys(str);
    }

    @Step("Срок")
    public void clickDate(int i)
    {
       Select timeSelect =new Select( calculatePage.selectbox);
       timeSelect.selectByIndex(i);
    }

    @Step("Ежемесячный взнос {0}")
    public void sendReplanish(String str)
    {
        calculatePage.replenish.sendKeys(str);
    }

    @Step("Выбрана ежемесячная капитализация")
    public void clickCapital()
    {
        calculatePage.checkbox.click();
    }

    @Step("проверенно поле {0} {1}")
    public void asseptText(String actualTitle,String expectedTitle)
    {
                assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }
}
