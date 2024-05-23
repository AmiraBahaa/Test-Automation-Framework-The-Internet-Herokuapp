package Alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlerts;

public class AlertTests extends BaseTests {

    String text= "Hello prompt alert";
    @Test
    public void testAcceptAlert(){

       JavaScriptAlerts javaScriptAlerts = homePage.clickJavaScriptAlert();
        javaScriptAlerts.clickAlertButton();
        javaScriptAlerts.alert_clickToAccept();
        Assert.assertEquals(javaScriptAlerts.getResult(), "You successfully clicked an alert", "message results incorrect");

    }


    @Test
    void testGetTextFromAlert(){
        JavaScriptAlerts javaScriptAlerts= homePage.clickJavaScriptAlert();
        javaScriptAlerts.clickConfirmButton();
        String alertText = javaScriptAlerts.alert_getText();
        javaScriptAlerts.alert_clickToCancel();
        Assert.assertEquals(alertText, "I am a JS Confirm");

    }


    @Test
    void testSetInputText(){
        JavaScriptAlerts javaScriptAlerts= homePage.clickJavaScriptAlert();
        javaScriptAlerts.clickPromptButton();
        javaScriptAlerts.alert_setInput(text);
        javaScriptAlerts.alert_clickToAccept();
        Assert.assertEquals(javaScriptAlerts.getResult(), "You entered: Hello prompt alert");

    }
}
