package Iframes;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFrames;

public class NestedFramesTest extends BaseTests {
    @Test
    public void checkLeftFrame(){
        NestedFrames nestedFrames = homePage.clickNestedFrames();
        nestedFrames.switchToEditArea();
    }
}
