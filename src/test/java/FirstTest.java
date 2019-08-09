
import appiumFramework.pages.pageObjects.DependanciesPage;
import appiumFramework.pages.pageObjects.HomePage;
import appiumFramework.pages.pageObjects.PreferencePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import appiumFramework.capabilities.CapabilitiesFactory;
import org.testng.asserts.Assertion;

import java.net.MalformedURLException;

public class FirstTest {
    HomePage homePage;
    private Assertion assertion = new Assertion();

    @BeforeClass
    public void init() throws MalformedURLException {
        homePage = new HomePage();
    }

    @Test
    public void clickApp() throws InterruptedException {
        assertion.assertTrue(homePage.preference.isDisplayed(), "Oh shittt!!!!");
        homePage.preference.click();

        PreferencePage preferencePage = new PreferencePage();

        assertion.assertTrue(preferencePage.dependenciesButton.isDisplayed(), "Oh shittt!!!!");

       preferencePage.dependenciesButton.click();

        DependanciesPage dependanciesPage = new DependanciesPage();
        assertion.assertTrue(dependanciesPage.wifiCheckox.isPresent(), "Oh shiittt!!!!");

        dependanciesPage.wifiCheckox.setChecked();

        dependanciesPage.wifiCheckox.isChecked();
    }

}
