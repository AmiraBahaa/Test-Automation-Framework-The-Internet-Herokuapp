package Actions;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenu;

public class Actions extends BaseTests {

    @Test
    public void contextMenuTest(){
        ContextMenu contextMenu = homePage.clickContextMenu();
        contextMenu.rightClickOnBox();
        String alertText=  contextMenu.alert_getText();
        contextMenu.alert_clickOk();
        Assert.assertEquals(alertText, "You selected a context menu", "incorrect alert message");
    }
}
