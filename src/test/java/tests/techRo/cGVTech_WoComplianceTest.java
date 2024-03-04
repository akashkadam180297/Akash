package tests.techRo;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;


public class cGVTech_WoComplianceTest extends TestDriverActions {

    @Test(priority = 0, description = "verify and using Login and password credentials")
    @Description("Test Description -verify and using Login and password credentials ")
    public void Test_001_gotoTechRo()  throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(prop.getProperty("tech_two_username"), prop.getProperty("tech_two_password"));
        wocompliance.enterTechBadge();
        wocompliance.clickOnGo();
    }

    @Test(priority = 1, description = " verify Select Work ")
    @Description("Test Description - verify Select Work ")
    public void Test_002_verifySelectWork () throws InterruptedException {

         wocompliance. verifySelectWork ();
     //   wocompliance. verifyHyperlink ();
        wocompliance.clickOnHyperLink();

    }
    @Test(priority = 2, description = " verify  Text VMRS ")
    @Description("Test Description - verify  Text VMRS ")
    public void Test_003_verifyTextVMRS() throws InterruptedException {
        wocompliance.verifyTextVMRS();
       // wocompliance.verifyTextOther();
        wocompliance.verifyAttachmentIcon();
        wocompliance.verifyTextDescriptionRequired();
        wocompliance.verifyTextDescription();
        wocompliance.verifyTextRequiredVMRS();
        wocompliance.verifyTextVMRSLabel();
        wocompliance.verifyNoteValue();
        wocompliance.verifyTextActualHours();


    }
    @Test(priority = 3, description = "verify Text  Complaint")
    @Description("Test Description - verify Text  Complaint")
    public void Test_004_verifyTextComplaint() throws InterruptedException {

        wocompliance.verifyTextComplaint();
        wocompliance.verifyComplaintTextArea();
        wocompliance.verifyTextRequiredCauseReason();
        wocompliance.verifyTextCauseReason();
        wocompliance.verifyRequiredCorrectionTask();
        wocompliance.verifyTextCorrectionTask();
        wocompliance.verifyTextClean();

    }


    @Test(priority = 4, description = "verify Correction Task Area Text")
    @Description("Test Description -verify Correction Task Area Text")
    public void Test_005_VerifyCorrectionTaskArea() throws InterruptedException {

        wocompliance.verifyRequiredCorrectionTaskAnswer();
        wocompliance.verifyCancelButton();
        wocompliance.verifyOKButton();
        wocompliance.clickOnOkButton();
        wocompliance.clickOnAlertButton ();



    }
    @Test(priority = 5, description = "verify Alert 3cs presentText")
    @Description("Test Description - verify Alert 3cs presentText")
    public void Test_006_VerifyAlertPresent3CS() throws InterruptedException {

        wocompliance.verifyCharltonRepairInc();

    }
    @Test(priority = 6, description = "verify Enter data in text And Enter ok Button")
    @Description("Test Description - verify Enter data in text And Enter ok Button")
    public void Test_007_enterTheComplaintsText () throws InterruptedException {


        wocompliance.enterTheComplaintsText ();
        wocompliance.enterTheCauseReasonOfTextArea () ;
        wocompliance.enterTheCorrectionTaskArea ();
        wocompliance.clickOKButton();

    }


    @Test(priority = 7, description = "click On Summary Tab after that click Unit Ready button verify text ")
    @Description("Test Description - click On Summary Tab after that click Unit Ready button verify text")
    public void Test_008_VerifySummaryTab()  throws InterruptedException, IOException  {

        wocompliance.clickOnSummaryTabButton();
        wocompliance.clickOnUnitReadyButton();
        wocompliance.verifyTheTextPleaseSelectFollowingJob3cs();
        wocompliance.clickOnUnitReadyOKButton();
    }

    @Test(priority = 8, description = " click the labor button and verify text ,Button")
    @Description("Test Description -click the labor button and verify text ,Button")
    public void Test_009_clickOnCleanABSConnection ()   throws InterruptedException, IOException {

        wocompliance.clickOnCleanABSConnection ();
        wocompliance.CorrectionTextarea ();
        wocompliance.CauseTextarea ();
        wocompliance.ComplaintsTextarea () ;
        wocompliance.cleanComplaintTextArea();
        wocompliance.cleanCauseReasonOfTextArea () ;
        wocompliance.cleanCorrectionTaskArea ();
        wocompliance.clickOnOkButtonSummaryTab ();


    }
    @Test(priority = 9, description = " click on Assign work and Click OnSign Out")
    @Description("Test Description -click on Assign work and Click onSign Out")
    public void Test_0010_clickOnAssignWorkClickSignOutButton()  throws InterruptedException, IOException  {

        wocompliance.clickAssignWorkButtonTopText();
        wocompliance.clickOnSignOut();



    }

}

