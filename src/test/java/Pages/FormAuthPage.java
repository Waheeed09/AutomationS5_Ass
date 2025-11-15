package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthPage {
    WebDriver driver;

    public FormAuthPage(WebDriver driver){
        this.driver=driver;
    }

    By userNameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.className("radius");
    String expectedUserNameFailedMsg = " Your username is invalid!";
    String expectedPasswordFailedMsg = " Your password is invalid!";
    By actualErrorMsgLocator = By.id("flash");

    public void setUserName(String userName){
        driver.findElement(userNameLocator).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }

    public String getExpectedUserNameFailedMsg(){
        return expectedUserNameFailedMsg;
    }
    public String getExpectedPasswordFailedMsg(){
        return expectedPasswordFailedMsg;
    }
    public String getActualErrorMsg(){
        return driver.findElement(actualErrorMsgLocator).getText();
    }
}
