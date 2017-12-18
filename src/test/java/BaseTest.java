import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.WebDriverSingleton;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeSuite
    public void beforeSuite() {
        driver = WebDriverSingleton.getWebDriverInstance();
        wait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
