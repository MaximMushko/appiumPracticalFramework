package appiumFramework.pages.commonPageComponents;

import appiumFramework.capabilities.WebDriverDecorator;
import org.openqa.selenium.By;

public class Checkbox extends UIObject {
    public Checkbox(String rootXpath) {
        super(rootXpath);
    }

    public boolean isChecked() {
        String checked = WebDriverDecorator.getDriver().findElement(By.xpath(this.locator)).getAttribute("checked");
        return Boolean.parseBoolean(checked);
    }

    public void setChecked() {
        if(!isChecked()){
            WebDriverDecorator.getDriver().findElement(By.xpath(this.locator)).click();
        }
    }

    public void setUnchecked() {
        if(isChecked()){
            WebDriverDecorator.getDriver().findElement(By.xpath(this.locator)).click();
        }
    }
}
