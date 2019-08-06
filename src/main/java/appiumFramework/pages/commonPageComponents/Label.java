package appiumFramework.pages.commonPageComponents;

import org.openqa.selenium.By;

public class Label extends UIObject {
    public Label(String rootXpath){
        super(rootXpath);
    }

    public String getText() {
        return getDriver().findElement(By.xpath(this.locator)).getText();
    }
}
