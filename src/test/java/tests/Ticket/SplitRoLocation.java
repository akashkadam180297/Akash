package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("SplitRoLocation")

public class SplitRoLocation extends TestDriverActions {

    @Test(priority=0, description = "Test_001 Login the page and go to complete Ro screen",enabled = true)
    @Description("Test Description: Login the page and go to complete Ro screen")
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        splitRoLocation.gotoCompleteRo();
    }

    @Test(priority=1, description = "Test_002 Verify location and Click on New Ro",enabled = true)
    @Description("Test Description: Verify location and Click on New Ro")
    public void clickOnNewRo() throws InterruptedException {
        splitRoLocation.verifyLocation();
        splitRoLocation.clickNewRo();
    }

    @Test(priority=2, description="Test_003 Select unit",enabled = true)
    @Description("Test Description: Select unit")
    public void clickOnAnyUnit() throws InterruptedException {
        splitRoLocation.clickOnSelect();
    }

    @Test(priority=3, description = "Test_004 Verify Location name, owner name and unit name",enabled = true)
    @Description("Test Description: Verify Location name, owner name and unit name")
    public void verifyLocation_Owner() throws InterruptedException {
        splitRoLocation.verifyLocationwithName();
        splitRoLocation.verifyOwnerName();
        splitRoLocation.verifyUnitName();
    }
    @Test(priority=4, description = "Test_005 Verify Labour and Part elements",enabled = true)
    @Description("Test Description :Verify Labour and Part elements")
    public void verifyLabourAndPart() throws InterruptedException {
        splitRoLocation.verifyHash();
        splitRoLocation.verifyP();
        splitRoLocation.verifyDescription();
        splitRoLocation.verifyEstimateHours();
        splitRoLocation.verifyCharge_Hours();
        splitRoLocation.verifyHourly_Charge();
        splitRoLocation.verifyTotalCharge();
    }

    @Test(priority=5, description = "Test_006 click on Add Labour",enabled = true)
    @Description("Test Description : click on Add Labour")
    public void clickOnAddLabour() throws InterruptedException {
        splitRoLocation.clickOnAddLabour();
    }
    @Test(priority=6, description = "Test_007 click on VMRS tab",enabled = true)
    @Description("Test Description : Click on VMRS tab")
    public void clickOnVMRS() throws InterruptedException {
        splitRoLocation.clickOnVMRS();
    }

    @Test(priority=7, description = "Test_008 Enter first labour",enabled = true)
    @Description("Test Description : Enter first labour")
    public void enterFirstLabour() throws InterruptedException {
        splitRoLocation.enterFirstLabour();
        splitRoLocation.clickOnFirstLabourImg();
        splitRoLocation.clickOnPlusbtn();
        splitRoLocation.clickOnOkbtn();
    }
    @Test(priority=8, description = "Test_009 Enter Second labour",enabled = true)
    @Description("Test Description : Enter Second labour")
    public void enterSecondLabour() throws InterruptedException {
        splitRoLocation.clickOnAddLabour();
        splitRoLocation.clickOnVMRS();
        splitRoLocation.enterSecondLabour();
        splitRoLocation.clickOnSecondLabourImg();
        splitRoLocation.clickOnPlusbtn();
        splitRoLocation.clickOnOkbtn();
    }

    @Test(priority=9, description = "Test_010 Click on Split Ro",enabled = true)
    @Description("Test Description : Click on Split Ro")
    public void clickOnSplitRo() throws InterruptedException {
        splitRoLocation.clickOnSplitRo();
    }
    @Test(priority=10, description = "Test_011 Click on New Ro",enabled = true)
    @Description("Test Description : Click on New Ro")
    public void clickOnNew_Ro() throws InterruptedException {
        splitRoLocation.verifySplitFromRoNumber();
        splitRoLocation.verifySplitToRo();
        splitRoLocation.clickOnNewRo();
    }
    @Test(priority=11, description = "Test_012 Verify create new Ro",enabled = true)
    @Description("Test Description : Verify create new Ro")
    public void verifyCreateNewRo() throws InterruptedException {
         splitRoLocation.verifyCreateNewRo();
    }
    @Test(priority=12, description = "Test_013 Click on location name",enabled = true)
    @Description("Test Description : Click on location name")
    public void clickOnLocationName() throws InterruptedException {
        splitRoLocation.clickOnLocationName();
    }
    @Test(priority = 13, description = "Test_014 Enter search name",enabled = true)
    @Description("Test Description : Enter search name")
    public void eneterSearchName() throws InterruptedException {
        splitRoLocation.enterSearchName();
    }
    @Test(priority=14, description = "Test_015 Click on Select" ,enabled = true)
    @Description("Test Description : Click on Select")
    public void clickOnSelect() throws InterruptedException {
        splitRoLocation.clickOnSelectBtn();
    }
    @Test(priority = 15,description="Test_016 Click on Create New Ro",enabled = true)
    @Description("Test Description : Click on Create New Ro")
    public void clickOnCreateNewRo() throws InterruptedException {
        splitRoLocation.clickOnCreateNewRo();
        splitRoLocation.verifyNewSplitRoNumber();
    }

    @Test(priority = 16, description = "Test_017 Click on Back Arrow of Ro Number",enabled = true)
    @Description("Test Description : Click on Back Arrow of Ro Number")
    public void clickOnBackArrowOfNumber() throws InterruptedException {
        splitRoLocation.clickOnBackArrow();
    }
    @Test(priority=17, description="Test_018 Click on back to Complete Ro",enabled = true)
    @Description("Test Description : Click on back to Complete Ro")
    public void clickOnBackToCompleteRo() throws InterruptedException {
        splitRoLocation.clickOnBackArrow();
    }
    @Test(priority=18,description = "Test_019 Search new created Ro Number",enabled = true)
    @Description("Test Description : Search new created Ro Number")
    public void searchNewCreatedRoNumber() throws InterruptedException {
        splitRoLocation.enterCreateRoLocation();
        splitRoLocation.clickOnRefreshButton();
        splitRoLocation.verifyNewRoNumber();
    }

    @Test(priority=19, description="Test_020 Verify Location change",enabled = true)
    @Description("Test Description = Verify Location change")
    public void verfiyLocatioChange() throws InterruptedException {
        splitRoLocation.clickNewRo();
        splitRoLocation.clickOnSelect();
        splitRoLocation.verifyChangeLocation();

    }

    @Test(priority=20, description="Test_021 Click on Sign Out and Verify Username",enabled = true)
    @Description("Test Description : Click on Sign Out and Verify Username")
    public void ClickOnSignOutAndVerify() throws InterruptedException {
        splitRoLocation.clickOnSignOutAndVerifyName();
    }
}
