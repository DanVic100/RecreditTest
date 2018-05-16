package ru.credit.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.credit.pages.CalculateResultPage;

import java.util.concurrent.TimeUnit;

public class goStep {

    MainStep mainStep  = new MainStep();
    CalculaterStep calculateStep = new CalculaterStep();
    CalculateResultStep calculateResultStep = new CalculateResultStep();

    @When("^нажата кнопка калькулятор$")
    public void click_Label()
    {
        mainStep.clickCalc();
    }

    @Then("^проверенн заголовок страницы (.+)$")
    public void assert_title(String title)
    {
        calculateStep.assert_title(title);
    }

    @When("^выбраны (.+)$")
    public void clickDollar(String str)
    {
        calculateStep.clickDollar(str);
    }

    @When("^сумма вклада (.+)$")
    public void sendAmount(String str)
    {
        calculateStep.sendAmount(str);
    }

    @When("^срок (.+)$")
    public void clickDate(String str)
    {
        if (str.equals("6 месяцев")) {calculateStep.clickDate(1);}
        else if (str.equals("9 месяцев"))  {calculateStep.clickDate(2);}
        else if (str.equals("12 месяцев")) {calculateStep.clickDate(3);}
        else if (str.equals("3 месяцев")){calculateStep.clickDate(0);}

    }

    @When("^ежемесячный взнос (.+)$")
    public void sendReplanish(String str)
    {
        calculateStep.sendReplanish(str);
    }

    @When("^выбрана ежемесячная капитализация$")
    public void clickCapital()
    {
        calculateStep.clickCapital();
    }

    @Then("^проверенно поле (.+) (.+)$")
    public void asseptTextStep(String str1, String str2) throws InterruptedException {
        Thread.sleep(5000);
        calculateResultStep.asseptText(str1,str2);
    }



}
