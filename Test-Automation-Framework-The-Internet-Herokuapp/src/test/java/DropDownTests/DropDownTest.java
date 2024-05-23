package DropDownTests;

import base.BaseTests;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectedOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.SelectOption("Option 2");
        var selectOptionDrownpage = dropDownPage.getSelectOption();
        assertEquals(selectOptionDrownpage.size(),1, "incorrect numbers of options");

    }
}
