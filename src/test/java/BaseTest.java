import appiumFramework.pages.pageObjects.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.Assertion;

public class BaseTest {
    HomePage homePage;
    protected Assertion assertion = new Assertion();

    @BeforeClass
    public void openApp(){
        homePage = new HomePage();
        assertion.assertTrue(homePage.pageTitle.isDisplayed(), "Ololo");
    }

}
