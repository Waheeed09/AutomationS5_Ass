package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
//    WebElement formLink = driver.findElement(By.linkText("Form Authentication"));
    By formLinkLocator = By.linkText("Form Authentication");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }


    public FormAuthPage clickFormLink(){
        driver.findElement(formLinkLocator).click();
        return new FormAuthPage(driver);
    }
}
