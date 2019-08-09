package appiumFramework.pages.commonPageComponents;

import appiumFramework.capabilities.CapabilitiesFactory;
import appiumFramework.capabilities.WebDriverDecorator;
import appiumFramework.utils.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.Objects;

public abstract class UIObject {
    protected String locator;
    protected Logger logger;

    public UIObject(String locator) {
        this.locator = locator;
    }


    /**
     *
     * @return
     */
    public boolean isDisplayed() {
       return WebDriverDecorator.findElement(By.xpath(locator)).isDisplayed();
    }

    /**
     *
     * @return
     */
    public boolean isPresent() {
        return WebDriverDecorator.getDriver().findElement(By.xpath(locator)).isEnabled();
    }
}
