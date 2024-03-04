package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Testing")
@Feature("NonIcCompletedAndWorkFine")

public class NonIcCompletedAndWorkFine extends TestDriverActions {

    @Test(priority=0,description="Test_001_Login the page and go to Part Master Screen",enabled=true)
    @Description("Test Description = Login the page and go to Part Master Screen")
    public void Test_001_gotoPartMaster() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        nonIcCompletedAndWorkFine.gotoPartMaster();
    }

    @Test(priority=1,description="Test_002_Click on the Part present in Part column",enabled=true)
    @Description("Test Description = Click on the Part present in Part column")
    public void Test_002_clickOnPart() throws InterruptedException {
        nonIcCompletedAndWorkFine.clickOnPart();
    }

    @Test(priority=2,description="Test_003_Verify the onHand values",enabled=true)
    @Description("Test Description = Verify the onHand values")
    public void Test_003_verifyOnHandValue() throws InterruptedException {
        nonIcCompletedAndWorkFine.verifyOnHand();
    }

    @Test(priority=3,description="Test_004_Click On Update button",enabled=true)
    @Description("Test Description = Click On Update button")
    public void Test_004_clickOnCancle() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnUpdate();
    }

    @Test(priority=4,description="Test_005_Verify Update Onhand pop up",enabled=true)
    @Description("Test Description = Verify Update Onhand pop up")
    public void Test_005_verifyUpdateOnhandPopUp() throws InterruptedException {
        nonIcCompletedAndWorkFine.verifyUpdateOnHands();
    }

    @Test(priority=5,description="Test_006_Changed/Updated onhand value with 00",enabled=true)
    @Description("Test Description = Changed/Updated onhand value with 00")
    public void Test_006_changedOnHandValue() throws InterruptedException {
      nonIcCompletedAndWorkFine.updateOnhandValue();
    }

    @Test(priority=6,description="Test_007_Click On Update",enabled=true)
    @Description("Test Description = Click On Update")
    public void Test_007_clickOnUpdate() throws InterruptedException {
        nonIcCompletedAndWorkFine.clickOnUpdateButton();
    }
    @Test(priority=7,description="Test_008_Click On Save and Exit",enabled=true)
    @Description("Test Description = Click On Save and Exit")
    public void Test_008_clickOnSaveExit() throws InterruptedException {
        nonIcCompletedAndWorkFine.clickOnSaveExitBtn();
    }
    @Test(priority=8,description="Test_009_Go to service Board Screen",enabled=true)
    @Description("Test Description = Go to service Board Screen")
    public void Test_009_gotoServiceBoard() throws FileNotFoundException, InterruptedException {
         nonIcCompletedAndWorkFine.gotoServiceBoardScreen();
    }

    @Test(priority=9,description="T_010_Click on Quick Estimate",enabled=true)
    @Description("Test Description = Click on Quick Estimate ")
    public void T_010_ClickonQuickEstimate() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnQuickEstimate();
    }

    @Test(priority=10,description="T_011_Select any unit",enabled=true)
    @Description("Test Description = Select any unit ")
    public void T_011_selectAnyUnit() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnSelect();
    }

    @Test(priority=11,description="T_012_Click on Add Labour",enabled=true)
    @Description("Test Description = Click on Add Labour")
    public void T_012_clickOnAddLabour() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnAddlabour();
    }
    @Test(priority=12,description="T_013_Click on VMRS",enabled=true)
    @Description("Test Description = Click on VMRS")
    public void T_013_ClickOnVMRS() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnVMRS();
    }

    @Test(priority=13,description="T_014_Search first labor",enabled=true)
    @Description("Test Description = Search first labor")
    public void T_014_searchFirstLabour() throws InterruptedException {
        nonIcCompletedAndWorkFine.searchFirstLabour();
    }
    @Test(priority=14,description="T_015_Click on First Labour image",enabled=true)
    @Description("Test Description = Click on First Labour image")
    public void T_015_ClickonFirstLabourimage() throws InterruptedException {
        nonIcCompletedAndWorkFine.clickOnFirstLabourImg();
    }

    @Test(priority=15,description="T_016_click on plus",enabled=true)
    @Description("Test Description = click on plus")
    public void T_016_clickOnPlus() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnPlus();
    }
    @Test(priority=16,description="T_017_click on Add button",enabled=true)
    @Description("Test Description = click on Add button")
    public void T_017_clickOnAdd() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnAdd();
    }

    @Test(priority=17,description="T_018_click on submit button",enabled=true)
    @Description("Test Description = click on submit button")
    public void T_018_clickOnSubmit() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnSubmit();
    }
    @Test(priority=18,description="T_019_click on Repair Estimates In Progress",enabled=true)
    @Description("Test Description = click on Repair Estimates In Progress")
    public void T_019_repairEstimateInProgress() throws InterruptedException {
        nonIcCompletedAndWorkFine.repairEstimateInProgress();
    }

    @Test(priority=19,description="T_020_Click on Clear Location Filter",enabled=true)
    @Description("Test Description = Click on Clear Location Filter")
    public void ClickonClearLocationFilter() throws InterruptedException {
        nonIcCompletedAndWorkFine.clickOnClearLocationFilter();
    }

    @Test(priority=20,description="T_021_Verify Pending Estimate",enabled=true)
    @Description("Test Description = Verify Pending Estimate")
    public void T_021_verifyPendingEstimate() throws InterruptedException {
 //         nonIcCompletedAndWorkFine.verifyPendingEstimate();
    }
    @Test(priority=21,description="T_022_click on Estimate Status dropdown",enabled=true)
    @Description("Test Description = click on Estimate Status dropdown")
    public void T_022_clickEstimateStatusDropdown() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnEstimateStatusDropdown();
    }
    @Test(priority=22,description="T_023_click on Pending approval checkbox",enabled=true)
    @Description("Test Description = click on Pending approval checkbox")
    public void T_023_clickPendingApprovalCheckbox() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnPendingApprovalCheckbox();
    }
    @Test(priority=23,description="T_024_click on search button",enabled=true)
    @Description("Test Description = click on search button")
    public void T_024_clickOnSearchBtn() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnSearch();
    }
    @Test(priority=24,description="T_025_click on estimate number",enabled=true)
    @Description("Test Description = click on estimate number")
    public void T_025_clickOnEstimateNumber() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnEstimatenumber();
    }
    @Test(priority=25,description="T_026_Click on Approve button",enabled=true)
    @Description("Test Description = Click on Approve button")
    public void T_026_clickApproveButton() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickonApproveButton();
    }
    @Test(priority=26,description="T_027_click on approve an estimate button",enabled=true)
    @Description("Test Description = click on approve an estimate button")
    public void T_027_clickonApproveEstimate() throws InterruptedException {
          nonIcCompletedAndWorkFine.approveAnEstimate();
    }

    @Test(priority=27,description="T_028_Click on Sign Out",enabled=true)
    @Description("Test Description = Click on Sign Out")
    public void T_028_ClickonSignOut() throws InterruptedException {
            nonIcCompletedAndWorkFine.clickOnSignOut();
    }

    @Test(priority=28,description="T_029_Login the page and go to TechRo Screen",enabled=true)
    @Description("Test Description = Login the page and go to TechRo Screen")
    public void T_029_gotoTechROScreen() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username_Tech"),appProp.getProperty("password_Tech"));
    }

    @Test(priority=29,description="T_030_Enter TechBadge",enabled=true)
    @Description("Test Description = Enter TechBadge ")
    public void T_030_enterTechBadge() throws InterruptedException {
         nonIcCompletedAndWorkFine.enterTechbadge();
    }
    @Test(priority=30,description="T_031_click on Go button",enabled=true)
    @Description("Test Description = click on Go button")
    public void T_031_clickonGobutton() throws InterruptedException {
         nonIcCompletedAndWorkFine.clickOnGo();
    }
    @Test(priority=31,description="T_032_Click on More Unit",enabled=true)
    @Description("Test Description = Click on More Unit")
    public void T_032_ClickonMoreUnit() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickMoreUnit();
    }
    @Test(priority=32,description="T_033_Enter unit in search box",enabled=true)
    @Description("Test Description = Enter unit in search box")
    public void T_033_enterUnitinSearchBox() throws InterruptedException {
          nonIcCompletedAndWorkFine.enterUnit();
    }
    @Test(priority=33,description="T_034_click on select",enabled=true)
    @Description("Test Description = click on select")
    public void T_034_clickonSelect() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnSelectButtton();
    }
    @Test(priority=34,description="T_035_Check labour present on screen and click on part tab",enabled=true)
    @Description("Test Description = Check labour present on screen and click on part tab")
    public void T_035_clickOnPartTab() throws InterruptedException {
        nonIcCompletedAndWorkFine.addWorkRequired();
        nonIcCompletedAndWorkFine.clickWorkRequired();
        nonIcCompletedAndWorkFine.clickOnPartsTab();

    }
    @Test(priority=35,description="T_036_Enter Part Number",enabled=true)
    @Description("Test Description = Enter Part Number")
    public void T_036_enterPartNumber() throws InterruptedException {
          nonIcCompletedAndWorkFine.enterPartnumber();
    }
    @Test(priority=36,description="T_037_Click on Issue Part",enabled=true)
    @Description("Test Description = Click on Issue Part")
    public void T_037_clickOnIssuePart() throws InterruptedException {
          nonIcCompletedAndWorkFine.clickOnIssuePart();
    }
/*    @Test(priority=22,description="",enabled=true)
    @Description("Test Description = ")
    public void c(){

    }
    @Test(priority=23,description="",enabled=true)
    @Description("Test Description = ")
    public void d(){

    }
    @Test(priority=22,description="",enabled=true)
    @Description("Test Description = ")
    public void c(){

    }
    @Test(priority=23,description="",enabled=true)
    @Description("Test Description = ")
    public void d(){

    }
    @Test(priority=22,description="",enabled=true)
    @Description("Test Description = ")
    public void c(){

    }
    @Test(priority=23,description="",enabled=true)
    @Description("Test Description = ")
    public void d(){

    }
    @Test(priority=22,description="",enabled=true)
    @Description("Test Description = ")
    public void c(){

    }
    @Test(priority=23,description="",enabled=true)
    @Description("Test Description = ")
    public void d(){

    }
    @Test(priority=22,description="",enabled=true)
    @Description("Test Description = ")
    public void c(){

    }
    @Test(priority=23,description="",enabled=true)
    @Description("Test Description = ")
    public void d(){

    }  */



}
