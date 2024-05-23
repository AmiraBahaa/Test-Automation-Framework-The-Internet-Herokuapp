package LoginTests;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTests {
    @Test
    public void testSuccessLoginStatus(){
        LoginPage loginpg= homePage.clickFormAuth();
         loginpg.setUsername("tomsith");
         loginpg.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpg.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!") ,"alert text incorrect");
    }
}
