package ForgetPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.ForgetPassAlertPage;
import pages.ForgetPassword;
import static org.testng.Assert.assertEquals;

public class ForgetPasswordTest extends BaseTests {

    @Test
    public void  testRecievedMessage(){
        ForgetPassword forgetPassword = homePage.clickForgetPassword();
        forgetPassword.setEmail("mira@gmail.com");
        ForgetPassAlertPage forgetPassAlertPage = forgetPassword.clickForgetPAssword();
      String alertText =  forgetPassAlertPage.getAlertText();
        assertEquals(alertText, "Internal Server Error", "dismatched alert message");
    }
}
