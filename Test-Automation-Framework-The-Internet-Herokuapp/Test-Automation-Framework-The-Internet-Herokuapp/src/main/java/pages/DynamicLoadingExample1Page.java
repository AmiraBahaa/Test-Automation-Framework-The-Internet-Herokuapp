package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver= driver;
    }

    By startButton = By.cssSelector("#start button");
    By loading = By.id("loading");

    By loadedText = By.id("finish");


    public void clickStart() {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));

//        FluentWait fluentWait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(30 ))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//
//
//        fluentWait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)))
//;
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

    public Boolean startButtonIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return  wait.until(ExpectedConditions.visibilityOf(driver.findElement(startButton))).isDisplayed();
    }



}
