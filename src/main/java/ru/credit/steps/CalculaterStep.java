package ru.credit.steps;


import org.openqa.selenium.support.ui.Select;
import ru.credit.pages.CalculatePage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class CalculaterStep{


    CalculatePage calculatePage = new CalculatePage();

    @Step("Выбран валюта {0}")
    public void clickDollar(String string)

    {
        if (string.equals("доллары")){calculatePage.dollar.click();}
        else if (string.equals("рубли")){calculatePage.rubles.click();}
    }

    @Step("проверенн заголовок страницы")
    public void assert_title(String expectedTitle)

    {
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                calculatePage.title.getText(), expectedTitle), calculatePage.title.getText().contains(expectedTitle));
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


}
