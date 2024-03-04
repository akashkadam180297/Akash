package tests.estimating;

import tests.TestDriverActions;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class ApproveanEstimateDMSTest extends TestDriverActions {


    @Test(priority = 0, description = "verify and using Login and password credentials")
    @Description("Test Description -verify and using Login and password credentials ")
    public void T_001clickFXGEstimationNumber () throws InterruptedException, IOException {
        driver.get(prop.getProperty("URL"));
        loginPage.loginWithValidCredentials(prop.getProperty("fedex_one_username"), prop.getProperty("fedex_one_password"));
        approveanestimatedmspage.clickFXGEstimationNumber ();

    }

    @Test(priority = 1, description = "verify Required Location ")
    @Description("Test Description -verify Required Location ")
    public void T_002verifyRequiredLocation () throws InterruptedException, IOException {
        approveanestimatedmspage.verifyRequiredLocation ();
        approveanestimatedmspage.verifyLocation ();
        approveanestimatedmspage.verifyLocationValue ();
        approveanestimatedmspage.verifyUnit ();
        approveanestimatedmspage.verifyUnitNumber ();
        approveanestimatedmspage.verifyYear ();

    }
    @Test(priority = 2, description = "verify year value ")
    @Description("Test Description -verify year value ")
    public void T_003verifyYearValue  () throws InterruptedException, IOException {
        approveanestimatedmspage.verifyYearValue  ();
        approveanestimatedmspage.verifyMakeAndModel ();
        approveanestimatedmspage.verifyMakeAndModelValue ();
        approveanestimatedmspage.verifyNotes ();
        approveanestimatedmspage.verifyNotesValue ();
        approveanestimatedmspage.verifyVIN ();
        approveanestimatedmspage.verifyVINValue ();
        approveanestimatedmspage.verifyNBV ();
        approveanestimatedmspage. verifyNBVValue ();
        approveanestimatedmspage.verifyDateText ();
    }
    @Test(priority = 3, description = "verify  To Date")
    @Description("Test Description -verify  To Date ")
    public void T_003verifyToDate () throws InterruptedException, IOException {
        approveanestimatedmspage.verifyToDate();
        approveanestimatedmspage.verifyVendor ();
        approveanestimatedmspage.verifyVendorValue ();
        approveanestimatedmspage. verifyLabor ();
       approveanestimatedmspage.verifyLaborValue ();
        approveanestimatedmspage.verifyParts ();
        approveanestimatedmspage. verifyPartsValue ();
        approveanestimatedmspage. verifyShopCharges ();
        approveanestimatedmspage. verifyShopChargesValue ();
        approveanestimatedmspage.  verifySurCharge ();
        approveanestimatedmspage. verifySurchargeValue ();
        approveanestimatedmspage. verifySubTotal ();
        approveanestimatedmspage. verifySubTotalValue ();


    }
    @Test(priority = 4, description = "verify Tax Text ")
    @Description("Test Description -vverify Tax Text  ")
    public void T_004verifyTax () throws InterruptedException, IOException {
        approveanestimatedmspage. verifyTax ();
        approveanestimatedmspage.verifyTaxValue ();
        approveanestimatedmspage.verifyTotal ();
        approveanestimatedmspage.verifyTotalValue ();
        approveanestimatedmspage. verifyTitle ();
        approveanestimatedmspage. verifyLaborCostHeader ();
        approveanestimatedmspage.verifyPartCostHeader ();
        approveanestimatedmspage.verifyShopChargesCostHeader ();
        approveanestimatedmspage.verifyTotalHeader ();
        approveanestimatedmspage.verifyNBVBody ();
        approveanestimatedmspage.verifyNBVHeader ();
        approveanestimatedmspage.verifyPrinterButton ();


    }
    @Test(priority = 5, description = "verify  To Be Reversed ")
    @Description("Test Description -verify  To Be Reversed  ")
    public void T_005verifyToBeRevised ()throws InterruptedException, IOException {
        approveanestimatedmspage.clickOnArrow ();
        approveanestimatedmspage.verifyToBeRevised ();
        approveanestimatedmspage. clickToBeRevised ();
        approveanestimatedmspage.verifyRequiredPleaseEnterYourReason ();
        approveanestimatedmspage. verifyPleaseEnterYourReason();
        approveanestimatedmspage.verifyTextArea ();
        approveanestimatedmspage.verifyInternalNotesText ();
        approveanestimatedmspage.verifyInternalNotesTextArea ();
        approveanestimatedmspage. verifySaveExit ();
        approveanestimatedmspage. clickCancel ();

    }
    @Test(priority = 6, description = "click On Rejection Button ")
    @Description("Test Description -click On Rejection Button ")
    public void T_005clickOnRejectButton () throws InterruptedException, IOException {
        approveanestimatedmspage.clickOnRejectButton ();
        approveanestimatedmspage.verifyOnRequiredPleaseEnterYourReason ();
        approveanestimatedmspage.verifyPleaseEnterReasonText ();
        approveanestimatedmspage.verifyOnTextAreaPleaseEnterReason ();
        approveanestimatedmspage.verifyOnInternalNotesText ();
        approveanestimatedmspage.verifyOnInternalNotesTextArea ();
        approveanestimatedmspage.verifySaveExitButton ();
        approveanestimatedmspage. clickOnCancelButton ();

    }
    @Test(priority = 7, description = "click On Back To Approvals ")
    @Description("Test Description -click On Back To Approvals ")
    public void T_006clickOnBackToApprovals  () throws InterruptedException, IOException {
        approveanestimatedmspage.clickOnBackToApprovals();
        approveanestimatedmspage.clickOnSignOut ();
        approveanestimatedmspage.clickOnUserName ();
}
}
