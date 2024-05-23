package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;

public class SliderPage {
    private WebDriver driver;

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By slider = By.cssSelector("input");
    private By rangeValue = By.xpath("//span[@id=\"range\"]");

    public String resultRange(){
        return  driver.findElement(rangeValue).getText();

    }

    public void moveSliderByArrow(String value) {

        for(int i=0; i<(Integer.parseInt(value )*2); i++){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void moveSliderByMouse(String targetValue) {


        Actions actions = new Actions(driver);
        // Click and hold the slider
        actions.clickAndHold(driver.findElement(slider)).perform();
        // Move the mouse horizontally based on the difference
        actions.moveByOffset(1, 0).perform();
        // Release the slider
        actions.release().perform();

//        for(int i=0; i<(Integer.parseInt(targetValue )*2.5); i++) {
//            Actions actions = new Actions(driver);
//            WebElement sliderElement = driver.findElement(slider);
//            int currentValue = Integer.parseInt(resultRange());
//            int difference = Integer.parseInt(targetValue) - currentValue;
//
//            // Click and hold the slider
//            actions.clickAndHold(sliderElement).perform();
//            // Move the mouse horizontally based on the difference
//            actions.moveByOffset(difference, 0).perform();
//            // Release the slider
//            actions.release().perform();
//        }
    }

//    public void moveSliderByMouse(String value) {
//        Actions actions = new Actions(driver);
//        // Click and hold the slider
//        actions.clickAndHold(driver.findElement(slider)).perform();
//        // Move the mouse horizontally based on the difference
//        actions.moveByOffset(7, 0).perform();
//        // Release the slider
//        actions.release().perform();

//    }



}