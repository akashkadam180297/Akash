package tests.tech;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("WoParts Test")


public class TechWoParts extends TestDriverActions {


        @Test(priority = 0 ,description = "T_001 Sign in the page and Go to the Tech RO",enabled = true )
        @Description("Test Description - Sign in the page and Go to the Tech RO")
        public void gotoTechRo() throws InterruptedException {
            loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
            part.enterTechBadge();
            part.clickOnGoBtn();

        }
        @Test(priority=1, description = "T_002 Verify Unit Number and Click on Parts ",enabled = true)
        @Description("Test Description - Verify Unit Number and Click on Parts")
        public void verifyUnitNumber_ClickOnParts() throws InterruptedException {
              part.clickMoreUnit();
              part.enterUnitNumber();
              part.clickSelect();
              part.addWorkRequired();
              part.clickWorkRequired();
              part.clickOnPartsTab();
              part.clickOnKeyboardImg();

        }

        @Test(priority=2, description = "T_003 Check the Generic setup of the screen and enter Part number",enabled = true)
        @Description("Test Description - Check the Generic setup of the screen and enter Part number")
        public void verifyElement_EnterPartNumber() throws InterruptedException {
            part.verifyElementOfPart();
  //          part.verifyLabourPresent();
            part.verifyPartListArea();
            part.enterPart();
        }


        @Test(priority=3, description = "T_004 verify the part pannel and click on issue part",enabled = true)
        @Description("Test Description - verify the part pannel and click on issue part")
        public void verifyPartPannel_ClickOnIssuePart() throws InterruptedException {
            part.verifyPartDetailsPannel();
            part.clickOnIssuePart();
        }

        @Test(priority=4, description = "T_005 Verify part added , click on cross button and delete the part",enabled = true)
        @Description("Test Description - Verify part added , click on cross button and delete the part")
        public void verifyPartadded_deletePart() throws InterruptedException {
            part.verifyPartAdded();
            part.clickOnCrossBtn();
            part.clickOnDeleteBtn();
        }

        @Test(priority=5, description = "T_006 Enter CorePart and click on search icon",enabled = true)
        @Description("Test Description - Enter CorePart and click on search icon")
        public void verifyPartadded_() throws InterruptedException {
            part.enterCorePart();
            part.clickOnSearchIcon();
            part.typeCorePart();
            part.clickOnSearchBtn();
            part.selectButton();
        }

        @Test(priority=6, description = "T_007 Click on CoreReturn and delete core part",enabled = true)
        @Description("Test Description - Click on CoreReturn and delete core part")
        public void clickOnCoreReturn_deleteCorePart() throws InterruptedException {
            part.clickOnCoreReturn();
            part.clickOnCrossBtnCore();
            part.clickOnDeleteBtnCore();

        }


        @Test(priority=7, description = "T_008 click on Non-Catalog Part and enter the value",enabled = true)
        @Description("Test Description - click on Non-Catalog Part and enter the value")
        public void clickOnNonCatalogPart_enterValue() throws InterruptedException {
            part.clickOnNonCatalogPart();
            part.verifyNonCatalogPartElement();
            part.typeNCPartName();
            part.typeNCPartDescription();
            part.typeUnitcost();
            part.clickOnIssuePart2();
            part.verifyNonCatalogPartAdded();

        }


        @Test(priority=8, description = "T_009 enter Part number and click on Issue part",enabled = true)
        @Description("Test Description - enter Part number and click on Issue part")
        public void EnterPartNumber_clickIssuePart() throws InterruptedException {
            part.enterPart();
            part.clickOnIssuePart();

        }
        @Test(priority=9, description = "T_010 click on Labour and click on VMRS",enabled = true)
        @Description("Test Description - click on Labour and click on VMRS")
        public void clickOnLabour_clickOnVMRS() throws InterruptedException {
            part.clickOnLabour();
            part.clickOnVMRSName();
            part.typeNotes();
            part.click_Cause_Reason();
            part.clickOnSelect();
    //        part.clickOnCancle();
            part.clickOnTask();
            part.clickOnSelect();
  //          part.clickOnCancle();
            part.clickOk();
// part.typeComplaintNote1();
// part.typeCause_Reason();
// part.typeCorrection_Task();

        }
        @Test(priority=10, description = "T_011 Click on MoisesOlivas and Select and ok button",enabled = true)
        @Description("Test Description -Click on MoisesOlivas and Select and ok button")
        public void ClickOnMoisesOlivas_Select_OkButton() throws InterruptedException {
            // part.clickOnMoisesOlivashyperlink();
           // part.cause_reason_hyperlink();
           // part.clickOnSelectbutton();
           // part.clickOkbutton();

        }


        @Test(priority=10, description = "T_012 Click on FirstLaborItem and Select and Ok button",enabled = true)
        @Description("Test Description - Click on FirstLaborItem and Select and Ok button")
        public void ClickOnMoisesOlivas_Select_OkButton1() throws InterruptedException {
            part.clickOnFirstLaborItem();
            part.typeNotes();
            part.click_Cause_Reason();
            part.clickOnSelect();
            part.clickOnTask();
            part.clickOnSelect2();
            part.clickOk();
        }

        @Test(priority=11, description = "T_013 Click on Summary and pause and select button",enabled = true)
        @Description("Test Description - Click on Summary and pause and select button")
        public void ClickOnSummary_pause_selectbutton() throws InterruptedException {
            part.clickOkSummaryTab();
            part.verifySummaryTabElement();
            part.clickOnPauseButton();
           // part.clickOnClearButton();
            part.enterTechBadge();
            part.clickOnGoBtn();


        }


        @Test(priority=12, description = "T_014 click on UnitReady and Ok and signout button",enabled = true)
        @Description("Test Description - click on UnitReady and Ok and signout button")
        public void clickOnUnitReady_Ok_signoutbutton() throws InterruptedException {
            part.enterUnitNumber();
            part.clickSelect();
  //          part.clickOnAccessoriesGroup();
            part.clickOkSummaryTab();
        /*    part.clickOnAccessoriesLink();
            part.typeComplaintNote1();
            part.typeCause_Reason();
            part.typeCorrection_Task();
            part.clickOkbutton();   */
            part.clickOnUnitReadyButton();


         //   part.clickOnOkButton();
            //   part.inputDeferReason();
            //   part.clickOnDefere();
    //        part.clickOnCancleBtn1();
        //    part.clickOnUnPause_Pause_Button();
            part. clickOnSignOut();

        }
    }
