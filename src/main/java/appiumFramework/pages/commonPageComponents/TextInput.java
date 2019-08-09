package appiumFramework.pages.commonPageComponents;

import appiumFramework.capabilities.WebDriverDecorator;
import org.openqa.selenium.By;

public class TextInput extends UIObject {
    public TextInput(String rootXpath){
        super(rootXpath);
    }

    public void sendKeys(String text) {
        WebDriverDecorator.getDriver().findElement(By.xpath(this.locator)).sendKeys(text);
    }
}
