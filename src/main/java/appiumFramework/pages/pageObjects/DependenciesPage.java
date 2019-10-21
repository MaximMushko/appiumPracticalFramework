package appiumFramework.pages.pageObjects;

import appiumFramework.pages.commonPageComponents.Checkbox;
import org.openqa.selenium.support.FindBy;

public class DependenciesPage {
    private String checkboxLocator = ".//android.widget.CheckBox";

    @FindBy
    public Checkbox wifiCheckbox = new Checkbox(checkboxLocator);
}
