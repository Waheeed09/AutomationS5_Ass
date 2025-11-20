package Pages.DynamicLoadingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    By exampleOneButtonLocator = By.partialLinkText("Example 1:");
    By exampleTwoButtonLocator = By.partialLinkText("Example 2:");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public ExampleOnePage clickExampleOneButton(){
        driver.findElement(exampleOneButtonLocator).click();
        return new ExampleOnePage(driver);
    }
    public ExampleTwoPage clickExampleTwoButton(){
        driver.findElement(exampleTwoButtonLocator).click();
        return new ExampleTwoPage(driver);
    }


}
