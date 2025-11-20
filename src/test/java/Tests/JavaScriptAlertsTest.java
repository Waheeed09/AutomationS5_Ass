package Tests;

import BaseTest.BaseTestClass;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends BaseTestClass {

    @Test
    public void verifyJsAlert(){
        javaScriptAlertsPage = homePage.clickJavaAlertsLink();
        javaScriptAlertsPage.clickJsAlertButton();
        Assert.assertEquals(javaScriptAlertsPage.getResultMessage(),javaScriptAlertsPage.getExpectedAlertResultMessage());
    }
    @Test
    public void verifyJsConfirm(){
        javaScriptAlertsPage = homePage.clickJavaAlertsLink();
        javaScriptAlertsPage.clickOKButtonInConfirmButton();
        Assert.assertEquals(javaScriptAlertsPage.getResultMessage(),javaScriptAlertsPage.getExpectedOkConfirmResultMessage());
        javaScriptAlertsPage.clickCancelButtonInConfirmButton();
        Assert.assertEquals(javaScriptAlertsPage.getResultMessage(),javaScriptAlertsPage.getExpectedCancelConfirmResultMessage());
    }
    @Test
    public void verifyJsPrompt(){
        javaScriptAlertsPage = homePage.clickJavaAlertsLink();
        javaScriptAlertsPage.clickOkButtonInPromptMessage();
        Assert.assertEquals(javaScriptAlertsPage.getResultMessage(),javaScriptAlertsPage.getExpectedOkPromptResultMessage());
        javaScriptAlertsPage.clickCancelButtonInPromptMessage();
        Assert.assertEquals(javaScriptAlertsPage.getResultMessage(),javaScriptAlertsPage.getExpectedCancelPromptResultMessage());
    }


}
