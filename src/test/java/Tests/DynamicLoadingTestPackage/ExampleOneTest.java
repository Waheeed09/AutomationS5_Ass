package Tests.DynamicLoadingTestPackage;

import BaseTest.BaseTestClass;
import Pages.DynamicLoadingPackage.ExampleOnePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOneTest extends BaseTestClass {
    ExampleOnePage exampleOnePage;

    @Test
    public void verifyExampleOnePage(){
        dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        exampleOnePage = dynamicLoadingPage.clickExampleOneButton();
        exampleOnePage.clickStartButton();
        Assert.assertEquals(exampleOnePage.getResultText(),exampleOnePage.getExpectedResultText());
    }
}
