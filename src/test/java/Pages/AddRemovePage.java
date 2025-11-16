package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {
    WebDriver driver;
    int removeCount = 0;
    public AddRemovePage(WebDriver driver){
        this.driver=driver;
    }

    By addButtonLocator = By.xpath("//button[@onclick='addElement()']");
    By removeButtonLocator = By.xpath("//button[@onclick='deleteElement()']");

    public void clickOnAddButton(int n){
        for (int i=0 ; i<n ; i++){
        driver.findElement(addButtonLocator).click();
        removeCount++;
        }
    }
    public void clickOnRemoveButton(int n){
        for (int i=0 ; i<n ; i++){
        driver.findElement(removeButtonLocator).click();
        removeCount--;
        }
    }
    public int getNumberOfItems(){
        return removeCount;
    }
}
