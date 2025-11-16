package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTestClass {

    @Test
    public void verifyAddingAndRemoving(){
        addRemovePage = homePage.clickAddRemoveLink();
        addRemovePage.clickOnAddButton(5);
        addRemovePage.clickOnRemoveButton(3);
        Assert.assertEquals(addRemovePage.getNumberOfItems(),2);

        addRemovePage.clickOnAddButton(5);
        addRemovePage.clickOnRemoveButton(6);
        Assert.fail("Expected exception not thrown");
    }

}
