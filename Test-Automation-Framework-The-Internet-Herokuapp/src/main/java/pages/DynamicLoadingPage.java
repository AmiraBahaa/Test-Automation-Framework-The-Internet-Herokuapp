package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage (WebDriver driver){
        this.driver=driver;
    }

    By example1 = By.xpath("//a[text()=\"Example 1: Element on page that is hidden\"]");

    By example2 = By.linkText("Example 2: Element rendered after the fact");



    public DynamicLoadingExample1Page clickExample1(){

        driver.findElement(example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){

        driver.findElement(example2).click();
        return new DynamicLoadingExample2Page(driver);
    }
    public DynamicLoadingExample1Page clickExample1InNewTab(){
        WebElement link = driver.findElement(example1);
        String linkUrl = link.getAttribute("href");  // Get the href attribute of the link

        // Use JavaScript to open a new tab with the link URL
        ((JavascriptExecutor)driver).executeScript("window.open(arguments[0], '_blank');", linkUrl);


        return new DynamicLoadingExample1Page(driver);
    }



}
