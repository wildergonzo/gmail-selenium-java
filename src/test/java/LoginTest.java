import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.logging.Level;

public class LoginTest {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        Utils utils = new Utils();
        System.setProperty("webdriver.gecko.driver", utils.getGeckoDriverPath());
        FirefoxOptions opts = new FirefoxOptions().setLogLevel(FirefoxDriverLogLevel.fromLevel(Level.OFF));
        driver = new FirefoxDriver(opts);
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
