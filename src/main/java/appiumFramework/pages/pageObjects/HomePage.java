package appiumFramework.pages.pageObjects;

import appiumFramework.pages.commonPageComponents.Button;

public class HomePage {
    private String buttonLocator = ".//android.widget.TextView[@text='%s']";
    public HomePage() {

    }

    public Button app = new Button(String.format(buttonLocator, "App"));
    public Button content = new Button(String.format(buttonLocator, "Content"));
    public Button preference = new Button(String.format(buttonLocator, "Preference"));
}
