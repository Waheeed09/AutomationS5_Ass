package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTestClass {

    @Test
    public void verifyCheckBoxOneIsSelected(){
        checkBoxPage = homePage.clickCheckBoxLink();
        checkBoxPage.clickCheckBox1();
        Assert.assertTrue(checkBoxPage.checkBoxOneIsSelected());
    }

    @Test
    public void verifyCheckBoxTwoIsSelectedByDefault(){
        checkBoxPage = homePage.clickCheckBoxLink();
        Assert.assertTrue(checkBoxPage.checkBoxTwoIsSelected());
    }

    @Test
    public void ensureCheckBoxPageFunctionality(){
        checkBoxPage = homePage.clickCheckBoxLink();
        Assert.assertFalse(checkBoxPage.checkBoxOneIsSelected());

        checkBoxPage.clickCheckBox1();
        Assert.assertTrue(checkBoxPage.checkBoxOneIsSelected());

        Assert.assertTrue(checkBoxPage.checkBoxTwoIsSelected());

        checkBoxPage.clickCheckBox2();
        Assert.assertFalse(checkBoxPage.checkBoxTwoIsSelected());

    }


}
