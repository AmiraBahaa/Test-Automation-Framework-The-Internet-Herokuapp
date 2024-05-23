package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {

    private WebDriver driver;

    JavaScriptAlerts(WebDriver driver){
        this.driver = driver;
    }

    By jsAlertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    By jsConfirmButton = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    By jsPromptButton = By.xpath("//button[text()=\"Click for JS Prompt\"]");


    By results = By.id("result");
public void clickAlertButton(){
    driver.findElement(jsAlertButton).click();
}
    public void clickPromptButton(){
        driver.findElement(jsPromptButton).click();
    }

    public void alert_clickToAccept(){
      driver.switchTo().alert().accept();
    }

    public void clickConfirmButton(){
        driver.findElement(jsConfirmButton).click();
    }
    public void alert_clickToCancel(){
       driver.switchTo().alert().dismiss();
    }


    public void alert_setInput(String text){
    driver.switchTo().alert().sendKeys(text);
    }
    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }

    public String getResult(){
       return driver.findElement(results).getText();
    }

}
