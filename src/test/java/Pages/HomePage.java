package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
//    WebElement formLink = driver.findElement(By.linkText("Form Authentication"));
    By formLinkLocator = By.linkText("Form Authentication");
    By checkBoxLocator = By.linkText("Checkboxes");
    By dropDownLocator = By.linkText("Dropdown");
    By addRemoveLocator = By.linkText("Add/Remove Elements");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }


    public FormAuthPage clickFormLink(){
        driver.findElement(formLinkLocator).click();
        return new FormAuthPage(driver);
    }
    public CheckBoxPage clickCheckBoxLink(){
        driver.findElement(checkBoxLocator).click();
        return new CheckBoxPage(driver);
    }
    public DropdownPage clickDropdownLink(){
        driver.findElement(dropDownLocator).click();
        return new DropdownPage(driver);
    }
    public AddRemovePage clickAddRemoveLink(){
        driver.findElement(addRemoveLocator).click();
        return new AddRemovePage(driver);
    }
}
