package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframeEditor {
    private WebDriver driver;
    public IframeEditor(WebDriver driver){
        this.driver=driver;
    }

    private String frameId = "mce_0_ifr";
    By textArea = By.id("tinymce");
    By decreaseIndent =By.xpath("//button[@aria-label=\"Decrease indent\"]");

    public void switchToEditArea(){
        driver.switchTo().frame(frameId);
    }


    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        returnToMainPage();
    }

    public void setTextArea(String text){
        switchToEditArea();

        driver.findElement(textArea).sendKeys(text);
        returnToMainPage();
    }

    public String getTextArea(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        returnToMainPage();
        return text;
    }




    public void returnToMainPage(){
        driver.switchTo().parentFrame();
    }

    public void decreaseIndent(){
        driver.findElement(decreaseIndent).click();
    }

}
