package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassword {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By forgetPasswordButton = By.id("form_submit");

    public ForgetPassword(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public ForgetPassAlertPage clickForgetPAssword(){
       driver.findElement(forgetPasswordButton).click();
       return new ForgetPassAlertPage(driver);
    }
}
