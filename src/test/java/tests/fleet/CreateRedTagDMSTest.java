package tests.fleet;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class CreateRedTagDMSTest extends TestDriverActions {


    @Test(priority=0, description = "Test_001_Login the page and go to create unit screen",enabled = true)
    @Description("Test Description: Login the page and go to create unit screen")
    public void Test_001_gotoUnitMasterScreen() throws InterruptedException, FileNotFoundException {
        driver.get(prop.getProperty("url"));
      loginPage.loginWithValidCredentials(prop.getProperty("fedex_one_username"),prop.getProperty("fedex_one_password"));
      redtag.gotoUnitMasterScreen();

    }

    @Test(priority=1, description = "Test_002_Enter unit number",enabled = true)
    @Description("Test Description: Enter unit number")
    public void Test_002_enterUnitNumber() throws InterruptedException {
        redtag.enterUnitNumber();
     //   Log.error("");

    }

    @Test(priority=2, description = "Test_003_click on unit number",enabled = true)
    @Description("Test Description: Click on unit number")
    public void Test_003_clickUnitNumber() throws InterruptedException {
        redtag.clickOnUnitNumber();
    }

    @Test(priority=3, description = "Test_004_Verify element Red Tag",enabled = true)
    @Description("Test Description: Verify element present Red Tag")
    public void Test_004_verifyRedTag() throws InterruptedException {
         redtag.verifyRedTag();
    }

    @Test(priority=4, description = "Test_005_click on Red Tag button",enabled = true)
    @Description("Test Description : click on Red Tag button")
    public void Test_005_clickonRedTagbutton() throws InterruptedException {
         redtag.clickonRedTag();
    }

    @Test(priority=5, description = "Test_006_Verify text Red Tag",enabled = true)
    @Description("Test Description : Verify text Red Tag")
    public void Test_006_VerifytextRedTag() throws InterruptedException {
        redtag.verifyRedTag1();
    }

    @Test(priority=6, description = "Test_007_Verify element present Work Required list",enabled = true)
    @Description("Test Description :Verify element present Work Required list")
    public void Test_007_VerifyelementpresentWorkRequiredlist() throws InterruptedException {
         redtag.verifyworkRequiredList();
    }

    @Test(priority=7, description = "Test_008_verify text *",enabled = true)
    @Description("Test Description :verify text *")
    public void Test_008_verifytextAsterisk() throws InterruptedException {
        redtag.verifyAsterisk();
    }

    @Test(priority=8, description = "Test_009_Verify text Status:",enabled = true)
    @Description("Test Description :Verify text Status:")
    public void Test_009_verifytextStatus() throws InterruptedException {
        redtag.verifyStatus();
    }

    @Test(priority=9, description = "Test_010_Verify element present=Status Drop-down",enabled = true)
    @Description("Test Description :Verify element present=Status Drop-down")
    public void Test_010_verifyelementpresentStatusDrop_Down() throws InterruptedException {
        redtag.verifyDropDown();
    }

    @Test(priority=10, description = "Test_011_Verify text *",enabled = true)
    @Description("Test Description :Verify text *")
    public void Test_011_verifyAstrisk() throws InterruptedException {
       redtag.verifyAsterisk1();
    }

    @Test(priority=11, description = "Test_012_Verify text Notes",enabled = true)
    @Description("Test Description :Verify text Notes")
    public void Test_012_verifytextNotes() throws InterruptedException {
        redtag.verifyNotes();
    }

    @Test(priority=12, description = "Test_013_Verify element present Text Area of Notes",enabled = true)
    @Description("Test Description :Verify element present Text Area of Notes")
    public void Test_013_verifyElementPresentTextAreaofNotes() throws InterruptedException {
        redtag.verifyAreaOfNotes();
    }

    @Test(priority=13, description = "Test_014_Verify element present Cancel",enabled = true)
    @Description("Test Description :Verify element present Cancel")
    public void Test_014_verifyelementpresentCancel() throws InterruptedException {
         redtag.verifyCancle();
    }

    @Test(priority=14, description = "Test_015_verify element present Save/Exit",enabled = true)
    @Description("Test Description :verify element present Save/Exit")
    public void Test_015_verifyelementpresentSave_Exit() throws InterruptedException {
       redtag.verifySaveExit();
    }

    @Test(priority=15, description = "Test_016_type Work required note(In notes text area)",enabled = true)
    @Description("Test Description :type Work required note(In notes text area)")
    public void Test_016typeWorkrequirednoteInNotesTextArea() throws InterruptedException {
       redtag.enterWorkRequired();
    }

    @Test(priority=16, description = "Test_017_click on Save/Exit",enabled = true)
    @Description("Test Description :click on Save_Exit")
    public void Test_017_clickonSave_Exit() throws InterruptedException {
        redtag.clickSaveExit();
    }

    @Test(priority=17, description = "Test_018_verify element present Unavailable",enabled = true)
    @Description("Test Description :verify element present Unavailable")
    public void Test_018_verifyelementpresentUnavailable() throws InterruptedException {
       redtag.verifyUnavailable();
    }

    @Test(priority=18, description = "Test_019_verify element present 'Update unit status to available' button",enabled = true)
    @Description("Test Description :verify element present 'Update unit status to available' button")
    public void Test_019_verifyelementpresentUpdateunitstatustoavailablebutton() throws InterruptedException {
       redtag.verifyUpdateunitStatus();
    }

    @Test(priority=19, description = "Test_020_click on 'Update unit status to available' button",enabled = true)
    @Description("Test Description :click on 'Update unit status to available' button")
    public void Test_019_clickonUpdateunitstatustoavailablebutton() throws InterruptedException {
       redtag.clickUpdateunitstatus();
    }

    @Test(priority=20, description = "Test_021_verify text Work required note",enabled = true)
    @Description("Test Description :verify text Work required note")
    public void Test_021_verifytextWorkrequirednote() throws InterruptedException {
       redtag.verifyWorkRequired();
    }

    @Test(priority=21, description = "Test_022_verify text Created Date:",enabled = true)
    @Description("Test Description :verify text Created Date:")
    public void Test_022_verifytextCreatedDate() throws InterruptedException {
        redtag.verifyCreatedDate();
    }

    @Test(priority=22, description = "Test_023_verify text Created by:",enabled = true)
    @Description("Test Description :verify text Created by:")
    public void Test_023_verifytextCreatedby() throws InterruptedException {
       redtag.verifyCreatedBy();
    }

    @Test(priority=23, description = "Test_024_verify text DMSName(Kevin Ingram Kevin Ingram)",enabled = true)
    @Description("Test Description :verify text DMSName(Kevin Ingram Kevin Ingram)")
    public void Test_024_verifytextDMSName_Kevin_Ingram_Kevin_Ingram() throws InterruptedException {
       redtag.verifyDMSName();
    }

    @Test(priority=24, description = "Test_025_verify text Available [AVAIL]",enabled = true)
    @Description("Test Description :verify text Available [AVAIL]")
    public void Test_025_verifytextAvailable_AVAIL() throws InterruptedException {
       redtag.verifyAvailable();
    }

    @Test(priority=25, description = "Test_026_type Un-red-tag notes",enabled = true)
    @Description("Test Description :type Un-red-tag notes")
    public void Test_026_typeUn_red_tag_notes() throws InterruptedException {
       redtag.enterUnredTag();
    }

    @Test(priority=26, description = "Test_027_click on Save/Exit",enabled = true)
    @Description("Test Description :click on Save/Exit")
    public void Test_027_click_on_Save_Exit() throws InterruptedException {
        redtag.clickSaveExitBtn();
    }

    @Test(priority=27, description = "Test_028_verify element present Red Tag ",enabled = true)
    @Description("Test Description :verify element present Red Tag ")
    public void Test_028_verifyelementpresentRed_Tag() throws InterruptedException {
       redtag.verifyRedTagbtn();
    }

    @Test(priority=28, description = "Test_029_click on Sign Out",enabled = true)
    @Description("Test Description :click on Sign Out")
    public void Test_029_clickonSignOut() throws InterruptedException {
       redtag.clickOnSignOut ();
    }



}

