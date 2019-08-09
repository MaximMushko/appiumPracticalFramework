package appiumFramework.pages.commonPageComponents;

import appiumFramework.capabilities.WebDriverDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Button extends UIObject {

    public Button(String rootXpath){
        super(rootXpath);
    }

    public void click() {
        WebElement element = WebDriverDecorator.getDriver().findElement(By.xpath(this.locator));
        element.click();

    }
}
