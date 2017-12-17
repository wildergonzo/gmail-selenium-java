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
    String gmailUrl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    // web elements
    String txtEmail = "identifierId";
    String txtPassword = "input.whsOnd.zHQkBf";
    String btnNext = "span.RveJvd.snByac";

    // page methods
    public void login (String email, String password) {
        writeText(By.id(txtEmail), email);
        click(By.cssSelector(btnNext));
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(txtPassword)));
        writeText(By.cssSelector(txtPassword), password);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(btnNext)));
        click(By.cssSelector(btnNext));*/ //in progress
    }

    public void goGmail () {
        goUrl(gmailUrl);
    }
}
