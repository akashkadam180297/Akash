package tests.pmWorkFlow;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class cGVTechPerformPM extends TestDriverActions {

    @Test(priority = 0, description = "verify and using Login and password credentials")
    @Description("Test Description -verify and using Login and password credentials ")
    public void T_001gotoTechRo() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        pmworkorderworkflowpage.enterTechBadge();
        pmworkorderworkflowpage.clickOnGo();

    }
    @Test(priority = 1, description = "click verify the Select Work  ")
    @Description("Test Description -clickverify the Select Work  ")
    public void T_002clickMoreUnit() throws InterruptedException, IOException {
        pmworkorderworkflowpage.verifySelectWork();
        pmworkorderworkflowpage.verifyTechnicianPortal ();

    }

    @Test(priority = 2, description = "click On More Unit ")
    @Description("Test Description -click On More Unit")
    public void T_003clickOnMoreLinks() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnMoreLinks();
        pmworkorderworkflowpage.clickOnSearchTextArea();


        pmworkorderworkflowpage.clickOnInspectionImage();
        pmworkorderworkflowpage.clickOnAddIcon();
        pmworkorderworkflowpage.clickOnAddButton();
        pmworkorderworkflowpage.clickOnImage();

    }

    @Test(priority = 3, description = "click On Hyperlink  ")
    @Description("Test Description -click On Hyperlink ")
    public void T_005clickOnHyperLink() throws InterruptedException, IOException {
        pmworkorderworkflowpage.clickOnHyperLink();
        pmworkorderworkflowpage.verifyData();
        pmworkorderworkflowpage.selectCheckingAndInspectionMounting();
        pmworkorderworkflowpage.EnterGPSSeriesNumber();
        pmworkorderworkflowpage.clickEnterTheGPSTransmitDate();
        pmworkorderworkflowpage.selectEnterConfirmTrailer();
        pmworkorderworkflowpage.selectConfirmTrailerLicensePlate();
        pmworkorderworkflowpage.selectConfirmTrailerValid();
        pmworkorderworkflowpage.selectScanBarCode();
        pmworkorderworkflowpage.selectCheckAllFedEx();
        pmworkorderworkflowpage.clickOnDoneValidate();


    }

    @Test(priority = 4, description = "click On More Unit ")
    @Description("Test Description -click On More Unit")
    public void T_006clickOnSaveAndExit() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnSaveAndExit();
        pmworkorderworkflowpage.verifyNumberOfQuestionsAnsweredSub();
        pmworkorderworkflowpage.clickWalkaroundExteriorInspectionBox();
        pmworkorderworkflowpage.clickOnShowErrorOnly();
        pmworkorderworkflowpage.selectCheckAllLights();
        pmworkorderworkflowpage.selectInspectGland();
        pmworkorderworkflowpage.selectCheckingBreakingSystem();
        pmworkorderworkflowpage.selectCheckABSFunction();
        pmworkorderworkflowpage.enterCheckABSFunctionTextArea();
        pmworkorderworkflowpage.selectInspectFront();
        pmworkorderworkflowpage.selectInspectBack();
        pmworkorderworkflowpage.clickOnDoneValidate();
        pmworkorderworkflowpage.selectCheckBodyForDamage();
        pmworkorderworkflowpage.selectInspectMudFlag();
        pmworkorderworkflowpage.selectInspectCondition();
        pmworkorderworkflowpage.selectInspectDrop();
        pmworkorderworkflowpage.selectInspectSafety();
        pmworkorderworkflowpage.selectCheckAndOperate();
        pmworkorderworkflowpage.selectInspectCracks();
        pmworkorderworkflowpage.selectCheckAndLubricate();
        pmworkorderworkflowpage.clickOnDoneValidateButton();


    }

    @Test(priority = 5, description = "click On Inspect Rear Impact Guard ")
    @Description("Test Description -click OnInspect Rear Impact Guard")
    public void T_007clickOnInspectRearImpactGuard() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnInspectRearImpactGuard();
        pmworkorderworkflowpage.selectMissingGuard();
        pmworkorderworkflowpage.selectGuardNotSecurely();
        pmworkorderworkflowpage.selectGuardHorizontalMemberNotExtend();
        pmworkorderworkflowpage.selectGuardHorizontalMemberMore();
        pmworkorderworkflowpage.selectGuardHorizontalMemberMoreThan();
        pmworkorderworkflowpage.selectGuardHorizontalMember();
        pmworkorderworkflowpage.selectInspectRearImpactGuard();
        pmworkorderworkflowpage.clickDoneValidateButton();


    }

    @Test(priority = 6, description = "click On Under Vehicle  ")
    @Description("Test Description -click On Under Vehicle ")
    public void T_008clickUnderVehicleBox() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickUnderVehicle();
        pmworkorderworkflowpage.selectInspectKingPin();
        pmworkorderworkflowpage.selectInspectLandingGear();
        pmworkorderworkflowpage.selectOperateLAndLandingGear();
        pmworkorderworkflowpage.selectInspectCrossMember();
        pmworkorderworkflowpage.selectInspectFrameCracks();
        pmworkorderworkflowpage.clickInspectRearImpactGuardButton();

    }

    @Test(priority = 7, description = "click On Foundation Brake Inspection Box")
    @Description("Test Description -click On Foundation Brake Inspection Box ")
    public void T_009clickFoundationBrakeInspection() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickFoundationBrakeInspection();
        pmworkorderworkflowpage.selectCheckAndLubricateSlack();
        pmworkorderworkflowpage.selectCheckANdLubricateInboard();
        pmworkorderworkflowpage.selectCheckAndLubricateSlackAdjuster();
        pmworkorderworkflowpage.selectInspectConditionBrake();
        pmworkorderworkflowpage.selectInspectBrakeChamber();
        pmworkorderworkflowpage.selectInspectConditionOfBrakeLining();
        pmworkorderworkflowpage.selectCheckBrakeLiningToDrum();
        pmworkorderworkflowpage.selectChargeAirSystem();
        pmworkorderworkflowpage.clickOnDoneValidateLabel();
        pmworkorderworkflowpage.selectReleaseParkingBreak();



    }

    @Test(priority = 8, description = " Select apply Service  ")
    @Description("Test Description -Select apply Service")
    public void T_009enterRecordLf() throws InterruptedException, IOException {
        pmworkorderworkflowpage.enterRecordLf();
        pmworkorderworkflowpage.enterRecordRf();
        pmworkorderworkflowpage.enterRecordLr();
        pmworkorderworkflowpage.enterRecordRr();
        pmworkorderworkflowpage.selectApplyService();
        pmworkorderworkflowpage.enterRecordLfPushRod();
        pmworkorderworkflowpage.enterRecordRfPushRod();
        pmworkorderworkflowpage.clickOnDoneValidateLabel();
        pmworkorderworkflowpage.enterLfPushRodTravel();
        pmworkorderworkflowpage.enterRfPushRodTravel();
        pmworkorderworkflowpage.selectAdjustManualSlack();
        pmworkorderworkflowpage.clickDoneValidateLabel();

    }

    @Test(priority = 9, description = "click On Suspension System ")
    @Description("Test Description -click On Suspension System")
    public void T_010clickOnBoxSuspensionSystem() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnBoxSuspensionSystem();
        pmworkorderworkflowpage.selectInspectTheTandem();
        pmworkorderworkflowpage.selectCheckWheelBearing();
        pmworkorderworkflowpage.selectCheckUBolt();
        pmworkorderworkflowpage.selectInspectTorqueRod();
        pmworkorderworkflowpage.selectInspectAirSpring();
        pmworkorderworkflowpage.selectCheckRideHeight();
        pmworkorderworkflowpage.selectInspectAirRide();
        pmworkorderworkflowpage.selectCheckSuspensionDumpValue();
        pmworkorderworkflowpage.clickValidate();
    }

    @Test(priority = 10, description = "click On Wheel Tire ")
    @Description("Test Description -click On Wheel Tire")
    public void T_011clickWheelTire() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickWheelTire();
        pmworkorderworkflowpage.selectInspectWheels();
        pmworkorderworkflowpage.selectCheckForMissing();
        pmworkorderworkflowpage.enterDualMetingLf();
        pmworkorderworkflowpage.enterDualMetingRf();
        pmworkorderworkflowpage.enterDualMetingLr();
        pmworkorderworkflowpage.enterDualMetingRr();
        pmworkorderworkflowpage.selectForTireDamage();
        pmworkorderworkflowpage.selectPSIInflationSystem();
        pmworkorderworkflowpage.clickOnValidateButton();
        pmworkorderworkflowpage.selectValveStemFlow();
        pmworkorderworkflowpage.enterRecordLFOTreadDepth();
        pmworkorderworkflowpage.enterRecordLFOTirePressure();
        pmworkorderworkflowpage.enterRecordLfiTreadDepth();
        pmworkorderworkflowpage.enterRecordLfiTirePressure();
        pmworkorderworkflowpage.enterRecordLroTreadDepth();
        pmworkorderworkflowpage.enterRecordLroTirePressure();
        pmworkorderworkflowpage.enterRecordLriTreadDepth();
        pmworkorderworkflowpage.clickOnValidateButton();
        pmworkorderworkflowpage.enterRecordLriTirePressure();
        pmworkorderworkflowpage.enterRROTreadDepth();
        pmworkorderworkflowpage.enterRROTirePressure();
        pmworkorderworkflowpage. enterRRITreadDepth ();
        pmworkorderworkflowpage.enterRRITirePressure();
        pmworkorderworkflowpage.enterRFOTreadDepth();
        pmworkorderworkflowpage.scrollEndTo ();
        pmworkorderworkflowpage.enterRFOTirePressure();
        pmworkorderworkflowpage.enterRFITreadDepth();
        pmworkorderworkflowpage.enterRFITirePressure();
        pmworkorderworkflowpage.clickOnValidateButton();

    }

    @Test(priority = 11, description = "click On Roll Up Door Box  ")
    @Description("Test Description -click On Roll Up Door Box ")
    public void T_012clickOnRollUpDoorBox() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnRollUpDoorBox();
        pmworkorderworkflowpage.selectCheckCondition();
        pmworkorderworkflowpage.selectLubricateDoor();
        pmworkorderworkflowpage.selectInspectRoller();
        pmworkorderworkflowpage.selectInspectDoorPull();
        pmworkorderworkflowpage.selectCheckAndVerify();
        pmworkorderworkflowpage.selectInspectCables();
        pmworkorderworkflowpage.selectInspectOperator();
        pmworkorderworkflowpage.selectInspectLubricate();
        pmworkorderworkflowpage.clickRollUpDoorButton();
        pmworkorderworkflowpage.selectInspectTrack();
        pmworkorderworkflowpage.selectInspectSill();
        pmworkorderworkflowpage.clickRollUpDoorButton();
    }

    @Test(priority = 12, description = "click On Swing Door  ")
    @Description("Test Description -click On Swing Door ")
    public void T_013clickSwingDoor() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickSwingDoor();
        pmworkorderworkflowpage.selectConditionDoor();
        pmworkorderworkflowpage.selectOperateAndLubricate();
        pmworkorderworkflowpage.selectCheckAndVerifyProper();
        pmworkorderworkflowpage.selectInspectAllDoor();
        pmworkorderworkflowpage.clickOnSwingDoorButton();

    }

    @Test(priority = 13, description = "click Interior Box  ")
    @Description("Test Description -click Interior Box ")
    public void T_014clickOnInteriorBox() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnInteriorBox();
        pmworkorderworkflowpage.selectCargoNetTrack();
        pmworkorderworkflowpage.selectInspectInteriorWall();
        pmworkorderworkflowpage.selectCheckFloor();
        pmworkorderworkflowpage.selectInspectConditionOfConvey();
        pmworkorderworkflowpage.selectInspectLoadDecks();
        pmworkorderworkflowpage.selectInspectRoofBlows();
        pmworkorderworkflowpage.selectConductLightCheck();
        pmworkorderworkflowpage.clickInteriorButton();
    }

    @Test(priority = 14, description = "click On Defect Summary Button ")
    @Description("Test Description -click On Defect Summary Button ")
    public void T_015clickOnDefectSummary() throws InterruptedException, IOException {


        pmworkorderworkflowpage.clickOnDefectSummary();
        pmworkorderworkflowpage.verifyInspectionNotes();
        pmworkorderworkflowpage.verifyTextDescription();
        pmworkorderworkflowpage.verifyNotes();
        pmworkorderworkflowpage.clickOnSignIn();

    }

    @Test(priority = 15, description = "click On  cancel Button ")
    @Description("Test Description -click On  cancel Button")
    public void T_016verifyCancelButton() throws InterruptedException, IOException {
        pmworkorderworkflowpage.verifyCancelButton();
        pmworkorderworkflowpage.verifyClearButton();
        pmworkorderworkflowpage.verifyContinueButton();
        pmworkorderworkflowpage.handleCanvas();
        pmworkorderworkflowpage.clickToContinue();
        pmworkorderworkflowpage.ClickSummaryTab();
    }

    @Test(priority = 16, description = "click On Unit Ready")
    @Description("Test Description -click On Unit Ready")
    public void T_017clickOnUnitReady() throws InterruptedException, IOException {

        pmworkorderworkflowpage.clickOnUnitReady();
        pmworkorderworkflowpage.clickOnUnitReadyOk ();
        pmworkorderworkflowpage.clickOnSinIn();
        pmworkorderworkflowpage.labelCanvas();
        pmworkorderworkflowpage.clickOnOkButton();
        pmworkorderworkflowpage.clickOnLabor ();
        pmworkorderworkflowpage.cancelHyperLink();
        pmworkorderworkflowpage.clickSaveAndExitButton();
        pmworkorderworkflowpage.selectHyperLink();
        pmworkorderworkflowpage.clickOnAssignWork();
        pmworkorderworkflowpage.clickOnSignOut();

    }

}