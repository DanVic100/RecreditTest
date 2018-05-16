package ru.credit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import ru.credit.steps.BaseStep;

public class BasePage {

    public BasePage() {
           PageFactory.initElements(BaseStep.getDriver(),this);
    }

    public void scroll(WebElement element)
    {
        Actions action = new Actions(BaseStep.getDriver());

        action.moveToElement(element).build().perform();

    }
}
