package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassAlertPage {
    private WebDriver driver;
    private By message = By.tagName("h1");
    public ForgetPassAlertPage(WebDriver driver){
        this.driver= driver;
    }

    public String getAlertText(){
        return driver.findElement(message).getText();
    }
}
