package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    // constructor
    public BasePage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // methods
    public void clickElement (By element) {
        driver.findElement(element).click();
    }

    public void sendText (By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void openUrl (String url) {
        driver.get(url);
    }
}
