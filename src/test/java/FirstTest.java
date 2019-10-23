
import appiumFramework.pages.pageObjects.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.net.MalformedURLException;

public class FirstTest {
    HomePage homePage;

    @BeforeClass
    public void init() throws MalformedURLException {
        //homePage = new HomePage();
    }

    @Test
    public void clickApp() throws InterruptedException {
//        assertion.assertTrue(homePage.preference.isDisplayed(), "Oh shittt!!!!");
//        homePage.preference.click();
//
//        PreferencePage preferencePage = new PreferencePage();
//
//        assertion.assertTrue(preferencePage.dependenciesButton.isDisplayed(), "Oh shittt!!!!");
//
//       preferencePage.dependenciesButton.click();
//
//        DependanciesPage dependanciesPage = new DependanciesPage();
//        assertion.assertTrue(dependanciesPage.wifiCheckox.isPresent(), "Oh shiittt!!!!");
//
//        dependanciesPage.wifiCheckox.setChecked();
//
//        dependanciesPage.wifiCheckox.isChecked();
    }

}
