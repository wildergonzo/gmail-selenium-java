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
    String gmailUrl = "https://gmail.com";

    // web elements
    String txtEmail = "identifierId";
    String txtPassword = "input.whsOnd.zHQkBf";
    String btnNext = "span.RveJvd.snByac";


    // page methods
    public void login (String email, String password) throws InterruptedException {
        writeText(By.id(txtEmail), email);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(btnNext)));
        click(By.cssSelector(btnNext));
        Thread.sleep(2000); // need to improve this
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(txtPassword)));
        writeText(By.cssSelector(txtPassword), password);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(btnNext)));
        click(By.cssSelector(btnNext));
    }

    public void goGmail () {
        goUrl(gmailUrl);
    }
}
