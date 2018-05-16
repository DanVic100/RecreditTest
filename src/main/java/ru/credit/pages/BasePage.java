package ru.credit.pages;

import org.openqa.selenium.support.PageFactory;
import ru.credit.steps.BaseStep;

public class BasePage {

    public BasePage() {
           PageFactory.initElements(BaseStep.getDriver(),this);
    }
}
