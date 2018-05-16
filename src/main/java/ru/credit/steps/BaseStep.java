package ru.credit.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import util.PropertyTest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseStep {

    protected static WebDriver webDriver;
    protected static String url;
    public static Properties prop = PropertyTest.getInstance().getProperties();

    public static WebDriver getDriver()
    {
        return webDriver;
    }

    @Before
    public static void setUp()
    {
        System.setProperty("webdriver.chrome.driver", prop.getProperty("webdriver.chrome.driver"));
        webDriver = new ChromeDriver();

        url = prop.getProperty("app.url");
        webDriver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }

    @After
    public static void tearDown() throws Exception
    {
       webDriver.quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
    }
}
