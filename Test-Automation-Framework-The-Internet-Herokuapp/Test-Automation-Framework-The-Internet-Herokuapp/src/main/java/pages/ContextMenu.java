package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenu {
    WebDriver driver;

    public ContextMenu(WebDriver driver){
        this.driver=driver;
    }
    By box = By.id("hot-spot");

    public void rightClickOnBox(){
        Actions actions = new Actions(driver);
        actions.contextClick( driver.findElement(box)).perform();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void   alert_clickOk(){
         driver.switchTo().alert().accept();
    }
}
