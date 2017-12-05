import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = WebDriverSingleton.getWebDriverInstance();
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void TestLoadPage() {

        driver.get("https://www.gmail.com");
        Assert.assertTrue(driver.getTitle().contains("Gmail"));

    }
}
