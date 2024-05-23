package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.FileUploadPage;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    String url = "https://the-internet.herokuapp.com/";
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(url);
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get(url);

    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                // Create the directory if it doesn't exist
                Path directory = Paths.get("resources", "screenshots");
                Files.createDirectories(directory);

                // Take screenshot
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                // Move the screenshot to the destination directory
                Path destination = directory.resolve(result.getName()+".png");
                Files.move(screenshot.toPath(), destination);

            } catch (IOException e) {
                e.printStackTrace(); // Print the exception for debugging
            }
        }}

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
//    @AfterClass
//    public void closing(){
//        driver.quit();
//    }

}













//    String url = "https://the-internet.herokuapp.com/";
//
//    @Test
//    public void setUp(){
//driver = new ChromeDriver();
//driver.get(url);
////task to enter specifc link tag
//        // Find all elements with the specified tag name
//        WebElement elements = driver.findElement(By.linkText("Shifting Content"));
//        elements.click();
//        WebElement elements2 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        elements2.click();
//       List < WebElement> elementsSize= driver.findElements(By.tagName("li"));
//        int size = elementsSize.size();
//        System.out.println(size);
//
//        // Close the browser
//
//    }


