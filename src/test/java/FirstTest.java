
import appiumFramework.pages.pageObjects.DependenciesPage;
import appiumFramework.pages.pageObjects.HomePage;
import appiumFramework.pages.pageObjects.PreferencePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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

        DependenciesPage dependenciesPage = new DependenciesPage();
        assertion.assertTrue(dependenciesPage.wifiCheckbox.isPresent(), "Oh shiittt!!!!");

        dependenciesPage.wifiCheckbox.setChecked();

        dependenciesPage.wifiCheckbox.isChecked();
    }

}
