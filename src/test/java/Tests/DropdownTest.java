package Tests;

import BaseTest.BaseTestClass;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTestClass {

    @Test
    public void verifyDropdownOption1(){
        dropdownPage = homePage.clickDropdownLink();
        dropdownPage.clickOnOption1();
    }
    @Test
    public void verifyDropdownOption2(){
        dropdownPage = homePage.clickDropdownLink();
        dropdownPage.clickOnOption2();
    }
}
