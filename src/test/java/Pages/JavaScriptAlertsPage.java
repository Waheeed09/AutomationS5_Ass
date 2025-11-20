package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptAlertsPage {
    WebDriver driver;
    Alert alert;
    WebDriverWait wait;
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    String enteredMessage = "Hello Ahmed";
    By jsAlertsButton = By.xpath("//button[@onclick='jsAlert()']");
    By jsConfirmButton = By.xpath("//button[@onclick='jsConfirm()']");
    By jsPromptButton = By.xpath("//button[@onclick='jsPrompt()']");
    By jsResultMessage = By.id("result");
    String alertMessage;
    String expectedAlertResultMessage = "You successfully clicked an alert";
    String expectedOkConfirmResultMessage = "You clicked: Ok";
    String expectedCancelConfirmResultMessage = "You clicked: Cancel";
    String expectedOkPromptResultMessage = "You entered: " + enteredMessage;
    String expectedCancelPromptResultMessage = "You entered: null";

    public void clickJsAlertButton(){
        driver.findElement(jsAlertsButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alertMessage = alert.getText();
        alert.accept();
    }
    public void clickOKButtonInConfirmButton(){
        driver.findElement(jsConfirmButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alertMessage = alert.getText();
        alert.accept();
    }
    public void clickCancelButtonInConfirmButton(){
        driver.findElement(jsConfirmButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alertMessage = alert.getText();
        alert.dismiss();
    }
    public void clickOkButtonInPromptMessage(){
        driver.findElement(jsPromptButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alertMessage = alert.getText();
        alert.sendKeys(enteredMessage);
        alert.accept();
    }
    public void clickCancelButtonInPromptMessage(){
        driver.findElement(jsPromptButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alertMessage = alert.getText();
        alert.dismiss();
    }
    public String getAlertMessage(){
        return alertMessage;
    }
    public String getResultMessage(){
        return driver.findElement(jsResultMessage).getText();
    }
    public String getExpectedAlertResultMessage(){
        return expectedAlertResultMessage;
    }
    public String getExpectedOkConfirmResultMessage(){
        return expectedOkConfirmResultMessage;
    }
    public String getExpectedCancelConfirmResultMessage(){
        return expectedCancelConfirmResultMessage;
    }
    public String getExpectedOkPromptResultMessage(){
        return expectedOkPromptResultMessage;
    }
    public String getExpectedCancelPromptResultMessage(){
        return expectedCancelPromptResultMessage;
    }


}
