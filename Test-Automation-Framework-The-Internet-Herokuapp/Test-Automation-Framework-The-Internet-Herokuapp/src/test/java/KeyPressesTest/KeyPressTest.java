package KeyPressesTest;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyPressTest  extends BaseTests {


    //String text= "hello";
    String backSpace= (""+ Keys.BACK_SPACE);
    @Test
    public void testBackSpace(){

        KeyPressesPage keyPressesPage= homePage.clickKeyPresses();
        keyPressesPage.setText(backSpace);
        Assert.assertEquals(keyPressesPage.result(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPiSymbol(){

        KeyPressesPage keyPressesPage= homePage.clickKeyPresses();
        keyPressesPage.writePiValue();
    }

}
