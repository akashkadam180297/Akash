package tests.Estimate;

import tests.TestDriverActions;
import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


import java.io.FileNotFoundException;

public class SubmitAnEstimateServiceManager extends TestDriverActions {
    @Test(priority = 0, description = "Test_001_Go to Service Board  Screen")
    @Description("Test Description: Go to Go to Service Board Screen")
    public void Test_001_gotoServiceBoardScreen() throws InterruptedException, FileNotFoundException {

        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        submitanestimateservicemanager.gotoServiceBoardScreen();
        submitanestimateservicemanager.scrollElementTillView();
    }

    @Test(priority = 1, description = "Test_002_click On Estimate")
    @Description("Test Description: Go to Go to Service Board Screen")
    public void Test_002_clickOnEstimate() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.clickOnEstimate();
        submitanestimateservicemanager.clickOnYes();
        submitanestimateservicemanager.storeEstimateNumber();

    }

    @Test(priority = 2, description = "Test_003_verify Required Location ,Location ,Location value")
    @Description("Test Description: veverifyTotalChargeTwo () rify Required Location ,Location ,Location value")
    public void Test_003_RequiredLocation() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.RequiredLocation();
        submitanestimateservicemanager.verifyOwner();
        submitanestimateservicemanager.verifyUnitHash();
        submitanestimateservicemanager.verifyYear();
        submitanestimateservicemanager.verifyMakeandModel();
        submitanestimateservicemanager.verifyNotes();

    }

    @Test(priority = 3, description = "Test_004_verify Required Date ,Date ,Todays Date")
    @Description("Test Description: verify Required Date ,Date ,Todays Date")
    public void Test_004_verifyRequiredDate() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.verifyRequiredDate();
        submitanestimateservicemanager.verifyInternalRef();
        submitanestimateservicemanager.verifyInternalNotes();
        submitanestimateservicemanager.verifyzero();
        submitanestimateservicemanager.verifyRepairEstimate();
        submitanestimateservicemanager.verifyLabor();

    }

    @Test(priority = 4, description = "Test_005_verify part")
    @Description("Test Description: verify part")
    public void Test_005_verifyPart() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.verifyPart();
        submitanestimateservicemanager.verifyShopCharges();
        submitanestimateservicemanager.verifySurcharge();
        submitanestimateservicemanager.verifysubTotal();
        submitanestimateservicemanager.verifyTax();
        submitanestimateservicemanager.verifyTotal();

    }

    @Test(priority = 5, description = "Test_006_verify Labor")
    @Description("Test Description: verify  Labour ")
    public void Test_006_verifyLabour() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.verifyLabour();
        submitanestimateservicemanager.verifyHash();
        submitanestimateservicemanager.verifyDescription();
        submitanestimateservicemanager.verifyEstimatedHours();
        submitanestimateservicemanager.verifyHourlyCharge();
        submitanestimateservicemanager.verifyTotalCharge();
        submitanestimateservicemanager.verifyElement();
        submitanestimateservicemanager.verifyNoDataDisplay();
    }

    @Test(priority = 6, description = "Test_007_verify Add Parts")
    @Description("Test Description: verify  Add Parts")
    public void Test_007_verifyAddParts() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.verifyAddParts();
        submitanestimateservicemanager.verifyHashTwo();
        submitanestimateservicemanager.verifyEstimatedQuantity();
        submitanestimateservicemanager.verifiyUnitCharges();
        submitanestimateservicemanager.verifyTotalChargeTwo();
        submitanestimateservicemanager.verifyDeleteImg();
        submitanestimateservicemanager.verifyDeleteTwo();
        //  submitanestimateservicemanager.verifyDraft();
        submitanestimateservicemanager.ExternalNotes();

    }

    @Test(priority = 7, description = "Test_008_click on add Labour")
    @Description("Test Description: click on add Labour")
    public void Test_008_clickonAddLabour() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.clickonAddLabour();
        submitanestimateservicemanager.clickOnVMRS();
        submitanestimateservicemanager.clickonAcessoriesGroup();
        submitanestimateservicemanager.verifyLaborItem();
        submitanestimateservicemanager.clickOnPlusImg();
        submitanestimateservicemanager.typeEstimateNote();
        submitanestimateservicemanager.clickOnOkButton();
        submitanestimateservicemanager.clickOnDeleteIcon();
        submitanestimateservicemanager.clickOnTrashButton();
        submitanestimateservicemanager.verifyNoDataToDisplay();

    }

    @Test(priority = 8, description = "Test_009_click on add Labour")
    @Description("Test Description: click on add Labour ")
    public void Test_009_clickonAddLabour() throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.clickonAddLabour();
        submitanestimateservicemanager.clickOnVMRS();
        submitanestimateservicemanager.clickonAcessoriesGroup();
        submitanestimateservicemanager.clickOnAddVmrs();
        submitanestimateservicemanager.typeEstimateNote();
        submitanestimateservicemanager.clickOnOkButton();

    }

    @Test(priority = 9, description = "Test_010_click on add Parts")
    @Description("Test Description: click on add Parts")
    public void Test_010_clickOnAddParts () throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.clickOnAddParts();
        submitanestimateservicemanager.typePartNumber();
        submitanestimateservicemanager.clickOnPart();
        submitanestimateservicemanager.clickOnIssueButton();
        submitanestimateservicemanager.clickOnClose();
        submitanestimateservicemanager.storeLaborCost();
    }
    @Test(priority = 10, description = "Test_011_store LaborCost Header ()")
    @Description("Test Description: store Labor CostHeader ()")
    public void Test_011_storeLaborCostHeader () throws InterruptedException, FileNotFoundException {
        submitanestimateservicemanager.storeLaborCostHeader ();
        submitanestimateservicemanager.storeparttext ();
        submitanestimateservicemanager.storeshopchargesheader ();
        submitanestimateservicemanager.TotalChargesHeader ();
        submitanestimateservicemanager.clickOnSubmit ();
        submitanestimateservicemanager.verifyPendingApprovals ();
        submitanestimateservicemanager. clikOnSignOut ();
        submitanestimateservicemanager. clickUsername ();



    }
}


