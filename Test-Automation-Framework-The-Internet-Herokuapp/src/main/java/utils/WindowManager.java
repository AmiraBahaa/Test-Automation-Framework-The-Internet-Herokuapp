package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager (WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();

    }
    public void goBack(){
     navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refresh(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
      Set<String> windows=  driver.getWindowHandles();
      for (String window : windows){
          driver.switchTo().window(window);
          if(driver.getTitle().equals(tabTitle)){
              break;
          }
        }
    }

    public void switchToSecondTab() {
        Set<String> windows = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle(); // Get the current window handle

        for (String window : windows) {
            if (!window.equals(currentHandle)) {
                driver.switchTo().window(window);
            break;
            }
        }}
}
