package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    public DropdownPage(WebDriver driver){
        this.driver=driver;
    }
    By dropDownLocator = By.id("dropdown");
    public void clickOnOption1(){
        Select select = new Select(driver.findElement(dropDownLocator));
        select.selectByIndex(1);
    }
    public void clickOnOption2(){
        Select select = new Select(driver.findElement(dropDownLocator));
        select.selectByValue("2");
    }

}
