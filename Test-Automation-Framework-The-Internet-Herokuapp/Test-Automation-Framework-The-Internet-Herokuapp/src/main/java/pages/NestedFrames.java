package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NestedFrames {
    private WebDriver driver;

    public NestedFrames(WebDriver driver){
        this.driver = driver;
    }

    By frameLeft = By.xpath("//frame[contains(@name, 'frame-left')]");

    public void switchToEditArea(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLeft));
    }
}

