package appiumFramework.capabilities;

import appiumFramework.utils.Logger;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class WebDriverDecorator {
    private static AppiumDriver driver;
    protected Logger logger = new Logger();
    private WebDriverDecorator () {}

    public static AppiumDriver getDriver() {
        try {
            if(Objects.isNull(driver)){
                driver = CapabilitiesFactory.getCapability("Android");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

        } catch (MalformedURLException e)  {
            e.printStackTrace();
        }

        return driver;
    }

    public static WebElement findElement(By locator) {
        return getDriver().findElement(locator);
    }

    public static List<WebElement> findElements(By locator) {
        return getDriver().findElements(locator);
    }
}
