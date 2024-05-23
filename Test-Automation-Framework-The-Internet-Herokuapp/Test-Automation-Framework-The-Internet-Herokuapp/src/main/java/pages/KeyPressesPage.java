package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {

    private WebDriver driver;

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }


    private By textField = By.id("target");
    private By result = By.id("result");


    public void setText(String text){
        driver.findElement(textField).sendKeys(text);
    }

    public void writePiValue(){
        setText(Keys.chord(Keys.SHIFT, "pi") + " = 3.14");
    }


    public String result(){
      return   driver.findElement(result).getText();
    }



}
