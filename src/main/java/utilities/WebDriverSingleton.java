package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
    private static WebDriver driver;
    private WebDriverSingleton () {}

    public static WebDriver getWebDriverInstance() {
        PropertiesManager propertiesManager = new PropertiesManager();
        if (null == driver) {
            System.setProperty("webdriver.gecko.driver", propertiesManager.getProperty("gecko_path"));
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
