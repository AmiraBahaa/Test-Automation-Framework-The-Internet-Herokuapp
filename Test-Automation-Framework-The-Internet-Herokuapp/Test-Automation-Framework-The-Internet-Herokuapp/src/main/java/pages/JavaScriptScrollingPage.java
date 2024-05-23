package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptScrollingPage {
    private WebDriver driver;
    public JavaScriptScrollingPage(WebDriver driver){
        this.driver=driver;
    }

    By tableId = By.id("large-table");


    public void scrollIntoTable(){
        WebElement element = driver.findElement(tableId);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, element);

    }
}
