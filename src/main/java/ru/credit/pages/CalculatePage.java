package ru.credit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CalculatePage extends BasePage{

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

    @FindBy(xpath = "//span[contains(text(),'Рубли')]")
    public WebElement rubles;
}
