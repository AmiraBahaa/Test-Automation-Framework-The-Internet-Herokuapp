package DynamicLoading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;

public class WaitTest extends BaseTests {
    @Test
    public  void testWaitUntilElementHidden(){
        DynamicLoadingExample1Page dynamicLoadingExample1Page= homePage.clickDynamicLoadingPage().clickExample1();
        dynamicLoadingExample1Page.clickStart();
        Assert.assertEquals(dynamicLoadingExample1Page.getLoadedText(), "Hello World!");
    }

    @Test
    public void testWaitUntilElementAppears(){
        DynamicLoadingExample2Page dynamicLoadingExample2Page = homePage.clickDynamicLoadingPage().clickExample2();
        dynamicLoadingExample2Page.clickStart();
        String loadedText = dynamicLoadingExample2Page.getLoadedElement();
        Assert.assertEquals(loadedText, "Hello World!", "Unmatched message");
    }
}
