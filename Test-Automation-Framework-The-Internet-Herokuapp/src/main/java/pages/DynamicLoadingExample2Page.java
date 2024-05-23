package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    By startButton = By.cssSelector("#start button");
    By loadedText = By.id("finish");

    public void clickStart(){
        driver.findElement(startButton).click();
    }

    public String getLoadedElement(){
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedText)));
        return driver.findElement(loadedText).getText();
    }



}
