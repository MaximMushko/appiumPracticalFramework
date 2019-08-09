package appiumFramework.pages.pageObjects;

import appiumFramework.pages.commonPageComponents.Checkbox;

public class DependanciesPage {
    private String checkboxLocator = ".//android.widget.CheckBox";

    public Checkbox wifiCheckox = new Checkbox(checkboxLocator);
}
