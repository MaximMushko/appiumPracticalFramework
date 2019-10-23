package appiumFramework.pages.pageObjects;

import appiumFramework.capabilities.WebDriverDecorator;
import appiumFramework.pages.commonPageComponents.Label;
import org.openqa.selenium.By;

public class Page {
    private String pageName ;
    private String titleLocator = "//android.view.View[0]";
    public Label pageTitle;

    public Page (String pageName) {
        this.pageName = pageName;
        this.pageTitle = new Label(String.format(titleLocator, this.pageName));
    }
}
