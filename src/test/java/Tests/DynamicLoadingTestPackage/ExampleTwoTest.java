package Tests.DynamicLoadingTestPackage;

import BaseTest.BaseTestClass;
import Pages.DynamicLoadingPackage.ExampleTwoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTwoTest extends BaseTestClass {
    ExampleTwoPage exampleTwoPage;

    @Test
    public void verifyExampleOnePage(){
        dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        exampleTwoPage = dynamicLoadingPage.clickExampleTwoButton();
        exampleTwoPage.clickStartButton();
        Assert.assertEquals(exampleTwoPage.getResultText(),exampleTwoPage.getExpectedResultText());
    }
}
