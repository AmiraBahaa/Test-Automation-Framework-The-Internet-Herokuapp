package Alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUpload extends BaseTests {
    @Test
    public void testFileUpload(){
    FileUploadPage fileUpload= homePage.clickFileUploadPage();
    fileUpload.uploadFile("C:\\Users\\amira\\Pictures\\Screenshots\\festival colors.png");
    Assert.assertEquals(fileUpload.getUploadedFiles(),"festival colors.png", "unmatched file names");
    }
}
