package Tests;

import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTestClass {
    @Test(priority = 0)
    public void verifyLoginPageWithValidCredentials(){
        formAuthPage = homePage.clickFormLink();
        formAuthPage.setUserName("tomsmith");
        formAuthPage.setPassword("SuperSecretPassword!");
        formAuthPage.clickLoginButton();
        Assert.assertTrue(formAuthPage.getActualErrorMsg().contains(" You logged into a secure area!"));
    }
    @Test(priority = 1)
    public void verifyLoginPageWithInvalidUserName(){
        formAuthPage = homePage.clickFormLink();
        formAuthPage.setUserName("ahmed");
        formAuthPage.setPassword("SuperSecretPassword!");
        formAuthPage.clickLoginButton();
        Assert.assertTrue(formAuthPage.getActualErrorMsg().contains(formAuthPage.getExpectedUserNameFailedMsg()),"Actual and Expected value Not Matching");
    }
    @Test(priority = 3)
    public void verifyLoginPageWithInvalidPassword(){
        formAuthPage = homePage.clickFormLink();
        formAuthPage.setUserName("tomsmith");
        formAuthPage.setPassword("ahmed");
        formAuthPage.clickLoginButton();
        Assert.assertTrue(formAuthPage.getActualErrorMsg().contains(formAuthPage.getExpectedPasswordFailedMsg()),"Actual and Expected value Not Matching");
    }
}
