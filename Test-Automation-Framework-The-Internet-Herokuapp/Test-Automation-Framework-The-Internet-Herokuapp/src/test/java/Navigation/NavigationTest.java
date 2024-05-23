package Navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.MultipleWindowsPage;

public class NavigationTest extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1();

        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://github.com/AmiraBahaa");
    }


    @Test
    public void testSwitchTab(){
     homePage.clickMultipleWindows().clickHere();
       getWindowManager().switchToTab("New Window");
    }


    @Test
    public void testOpenLinkInNewTab(){
      DynamicLoadingExample1Page dynamicLoadingExample1Page= homePage.clickDynamicLoadingPage().clickExample1InNewTab();
      getWindowManager().switchToSecondTab();
      Assert.assertTrue(dynamicLoadingExample1Page.startButtonIsDisplayed());

    }

}
