package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptInfiniteScroller {
    WebDriver driver;
    public JavaScriptInfiniteScroller(WebDriver driver){
        this.driver=driver;
    }

    By textBlock = By.className("jscroll-added");
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
           while (getNumberOfParagraphsPresent()<index){
               javascriptExecutor.executeScript(script);
           }

    }

    private int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlock).size();
    }

}
