package appiumFramework.pages.commonPageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Button extends UIObject {

    public Button(String rootXpath, String name){
        super(rootXpath);
    }

    public void click(){
        getDriver().findElement(By.xpath(this.locator)).click();
    }
}
