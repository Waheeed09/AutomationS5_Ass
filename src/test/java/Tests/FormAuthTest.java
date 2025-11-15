package Tests;

import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTestClass {
    @Test
    public void verifyLoginPageWithValidCredentials(){
        formAuthPage = homePage.clickFormLink();
        formAuthPage.setUserName("tomsmith");
        formAuthPage.setPassword("SuperSecretPassword!");
        formAuthPage.clickLoginButton();
    }
}
