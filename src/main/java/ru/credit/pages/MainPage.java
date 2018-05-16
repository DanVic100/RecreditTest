package ru.credit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.credit.steps.BaseStep;

public class MainPage extends BasePage{

    public MainPage() {
        PageFactory.initElements(BaseStep.getDriver(),this);
    }
    //Калькулятор
    @FindBy(xpath = "//span[contains(text(),'Калькулятор')]/parent::a[@href = '/contributions/']")
    public WebElement calculateHref;
}
