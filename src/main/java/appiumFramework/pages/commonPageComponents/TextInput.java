package appiumFramework.pages.commonPageComponents;

import org.openqa.selenium.By;

public class TextInput extends UIObject {
    public TextInput(String rootXpath){
        super(rootXpath);
    }

    public void sendKeys(String text) {
        getDriver().findElement(By.xpath(this.locator)).sendKeys(text);
    }
}
