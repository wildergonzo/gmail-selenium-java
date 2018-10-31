package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    // constructor
    public LoginPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // login_url
    String signInUrl = "https://gmail.com";

    // web elements
    By txtEmail = By.id("identifierId");
    By btnNext = By.cssSelector("span.RveJvd.snByac");
    By txtPassword = By.cssSelector("input.whsOnd.zHQkBf");

    // open gmail login page
    public void openGmailSignInPage () {
        openUrl(signInUrl);
    }

    // page methods
    public void loginAs (String email, String password) throws InterruptedException {
        sendText(txtEmail, email);
        wait.until(ExpectedConditions.elementToBeClickable(btnNext));
        clickElement(btnNext);
        Thread.sleep(2000); // need to improve this
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword));
        sendText(txtPassword, password);
        wait.until(ExpectedConditions.elementToBeClickable(btnNext));
        clickElement(btnNext);
    }

}
