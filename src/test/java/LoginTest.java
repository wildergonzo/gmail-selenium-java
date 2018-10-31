import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.PropertiesManager;

public class LoginTest extends BaseTest {

    PropertiesManager propertiesManager = new PropertiesManager();

    @Test (priority = 0)
    public void ShouldLoginGmailSuccessfully() throws InterruptedException {

        String email = propertiesManager.getProperty("user_email");
        String password = propertiesManager.getProperty("user_password");

        LoginPage loginPage = new LoginPage(driver, wait);

        loginPage.openGmailSignInPage();
        loginPage.loginAs(email, password);

        Assert.assertTrue(driver.getTitle().contains("Gmail"));

    }
}
