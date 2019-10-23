package appiumFramework.pages.pageObjects;

import appiumFramework.pages.commonPageComponents.Button;
import appiumFramework.pages.commonPageComponents.Label;

public class HomePage extends Page {
    private static final String pageName = "English grammar test";

    private String subtitleXpath = "";
    private String buttonXpath = "";

    public HomePage() {
        super(pageName);
    }

    Label pageSubtitle = new Label(subtitleXpath);
    Button intermediateButton = new Button(String.format(buttonXpath, "Intermediate"));
    Button upperIntermediateButton = new Button(String.format(buttonXpath, "Upper Intermediate"));
}
