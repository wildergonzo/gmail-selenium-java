import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
    private static WebDriver driver;
    private WebDriverSingleton () {}

    public static WebDriver getWebDriverInstance() {
        Utils utils = new Utils();
        if (null == driver) {
            System.setProperty("webdriver.gecko.driver", utils.getGeckoDriverPath());
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeWebBrowser() {
        if (null != driver) {
            driver.quit();
        }
        driver = null;
    }
}
