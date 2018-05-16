package ru.credit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.credit.steps.BaseStep;

import java.util.concurrent.TimeUnit;

public class CalculatePage extends BasePage{

    public CalculatePage() {
        BaseStep.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        PageFactory.initElements(BaseStep.getDriver(),this);
    }

    @FindBy(xpath = "//h2[ @class='calculator-block__title block-title']")
    public WebElement title;

    @FindBy(xpath = "//span[contains(text(),'Доллары')]")
    public WebElement dollar;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amount;

    @FindBy(xpath = "//select")
    public WebElement selectbox;

    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement replenish;

    @FindBy(xpath = "//*[@id=\"section_1\"]/div/div/form/div[1]/div[6]/div[1]/label/span[1]/div")
    public WebElement checkbox;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement rubles;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    public WebElement rate;

    @FindBy(xpath = "//span[@class='js-calc-earned']")
    public WebElement earned;

    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    public WebElement replenish_calc;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement result;

}
