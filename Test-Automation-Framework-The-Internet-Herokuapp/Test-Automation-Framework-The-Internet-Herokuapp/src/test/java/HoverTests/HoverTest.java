package HoverTests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTests {
    @Test
    public void testUser1(){
       var hoversPage=  homePage.clickHover();
      var caption=   hoversPage.hoverOverFigure(1);
      assertTrue(caption.isCaptionDisplayed(), "not displayed");
      assertEquals(caption.getTitle(), "name: user1", "Caption title not correct");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text not correct");
        assertTrue(caption.getLink().endsWith("/users/1"), "not displayed");

    }
}
