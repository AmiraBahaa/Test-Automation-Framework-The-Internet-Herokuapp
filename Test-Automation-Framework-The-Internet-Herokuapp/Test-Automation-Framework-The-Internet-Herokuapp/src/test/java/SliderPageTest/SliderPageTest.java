package SliderPageTest;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;

public class SliderPageTest extends BaseTests {
    String value = "4";

    @Test
    public void SliderRangeTest(){
        SliderPage sliderPage= homePage.clickSliderPage();
        sliderPage.moveSliderByArrow(value);
        Assert.assertEquals(sliderPage.resultRange(), value);
    }


    @Test
    public void SliderRangeByMouseTest(){
        SliderPage sliderPage= homePage.clickSliderPage();
        sliderPage.moveSliderByMouse(value);
        Assert.assertEquals(sliderPage.resultRange(), value);
    }
}
