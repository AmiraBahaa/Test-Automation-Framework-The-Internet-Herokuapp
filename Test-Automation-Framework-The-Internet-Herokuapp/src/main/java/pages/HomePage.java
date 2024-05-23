package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver =driver;
    }


    public void clickLink(String pgLink){
driver.findElement(By.linkText(pgLink)).click();
    }



    public LoginPage clickFormAuth(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoverPage clickHover(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public ForgetPassword clickForgetPassword(){
        clickLink("Forgot Password");
        return new ForgetPassword(driver);
    }


    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public SliderPage clickSliderPage(){
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }

    public JavaScriptAlerts clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlerts(driver);
    }

    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }


    public ContextMenu clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }

    public IframeEditor clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new IframeEditor(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }


    public JavaScriptScrollingPage clickJavaScriptScrollingPage(){
        clickLink("Large & Deep DOM");
        return new JavaScriptScrollingPage(driver);
    }

    public JavaScriptInfiniteScroller clickJavaScriptInfiniteScroller(){
        clickLink("Infinite Scroll");
        return new JavaScriptInfiniteScroller(driver);
    }

    public NestedFrames clickNestedFrames(){
        clickLink("Nested Frames");
        return new NestedFrames(driver);
    }

    public MultipleWindowsPage clickMultipleWindows() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}
