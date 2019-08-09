package appiumFramework.pages.pageObjects;

import appiumFramework.pages.commonPageComponents.Button;

public class PreferencePage {
    private String buttonLocator = ".//android.widget.TextView[@text='%s']";

    public Button dependenciesButton = new Button(String.format(buttonLocator, "3. Preference dependencies"));
    public Button advicedPrefferences = new Button(String.format(buttonLocator, "6. Advanced preferences"));

}
