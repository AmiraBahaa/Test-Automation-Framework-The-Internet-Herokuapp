package Iframes;

import base.BaseTests;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframeEditor;

public class WYSIWYGEditorTest extends BaseTests {

    String text= "Amira Bahaa";

    @Test
    public void iframeTest(){
        IframeEditor iframeEditor= homePage.clickWYSIWYGEditor();
       iframeEditor.clearTextArea();
        iframeEditor.setTextArea(text);

      //  iframeEditor.setTextArea(text);
//        System.out.println(iframeEditor.getTextArea());
      //  Assert.assertEquals(iframeEditor.getTextArea(), text, "Unmatched texts");
    }
}
