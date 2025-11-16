package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;
    public CheckBoxPage(WebDriver driver){
        this.driver=driver;
    }
    By checkBox1Locator = By.xpath("//input[@type='checkbox'][1]");
    By checkBox2Locator = By.xpath("//input[@type='checkbox'][2]");

    public void clickCheckBox1(){
        driver.findElement(checkBox1Locator).click();
    }
    public void clickCheckBox2(){
        driver.findElement(checkBox2Locator).click();
    }

    public boolean checkBoxOneIsSelected(){
        return driver.findElement(checkBox1Locator).isSelected();
    }
    public boolean checkBoxTwoIsSelected(){
        return driver.findElement(checkBox2Locator).isSelected();
    }


}
