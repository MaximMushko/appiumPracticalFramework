package appiumFramework.pages.commonPageComponents;

import appiumFramework.capabilities.CapabilitiesFactory;
import appiumFramework.utils.Logger;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.Objects;

public abstract class UIObject {
    protected String locator;
    protected Logger logger;
    private MobileDriver driver;

    public UIObject(String locator) {
        this.locator = locator;
    }

    public MobileDriver getDriver() {
        try {
            if(Objects.nonNull(this.driver)){
                this.driver = CapabilitiesFactory.getCapability("Android");
            }

        } catch (MalformedURLException e)  {
            e.printStackTrace();
        }

        return this.driver;
    }
    /**
     *
     * @return
     */
    public boolean isDisplayed() {
        return getDriver().findElement(By.xpath(locator)).isDisplayed();
    }

    /**
     *
     * @return
     */
    public boolean isPresent() {
        return getDriver().findElement(By.xpath(locator)).isEnabled();
    }

    public void waitFor(long timeout) throws InterruptedException {
        getDriver().findElement(By.xpath(locator)).wait(timeout);
    }
}
