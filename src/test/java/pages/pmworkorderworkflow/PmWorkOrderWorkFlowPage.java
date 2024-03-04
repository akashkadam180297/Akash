package pages.pmworkorderworkflow;

import tests.TestDriverActions;

import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.TestListener;

import java.util.List;


public class PmWorkOrderWorkFlowPage extends TestDriverActions {
    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txt_scanEmployeeBadge;

    @FindBy(xpath = "//span[text()='Go']")
    public WebElement btn_GO;

    @FindBy(xpath = "//a[contains(.,'ASAP SHOP')]")
    public List<WebElement> txt_AsapShop;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement btn_Select;


    @FindBy(xpath = "//span[contains(.,'Technician Portal')]")
    public WebElement label_TechnicianPortal;


    @FindBy(xpath = "//td[contains(.,'ASAP SHOP')]")
    public List<WebElement> label_LabourAsapShop;


    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    public WebElement img_Add;


    @FindBy(xpath = "//img[contains(@id,':1:ciWorkRequired::icon')]")
    public WebElement img_AccessoriesGroup;


    @FindBy(xpath = "//label[text()='Select assigned work.']")
    public List<WebElement> txt_SelectAssignedWork;

    @FindBy(linkText = "More Work ...")
    public WebElement label_MoreWork;


    @FindBy(xpath = "//img[contains(@id,':cilvmrsys::icon')]")
    public WebElement label_AccseriesGroup;


    @FindBy(xpath = "//span[text()='More Units']")
    public WebElement btn_MoreUnits;


    @FindBy(xpath = "//input[contains(@id,':sqSu:dc_it1::content')]")
    public WebElement label_SearchTextArea;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement btn_Button;

    @FindBy(xpath = "//textarea[contains(@id,'::content')]")
    public WebElement input_DomiclieLocationTextArea;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    public WebElement btn_SaveExit;

    @FindBy(linkText = "More Work ...")
    public WebElement txt_MoreLinkText;
    @FindBy(xpath = "//input[contains(@id,'it1::content')]")
    public WebElement input_SearchTextArea;

    @FindBy(xpath = "//div[contains(@id,':phSerproIC::content')]//child::td//a/child::img")
    public WebElement img_PMInspection;


    @FindBy(xpath = "  //img[contains(@id,':0:ciAddSerproactIC::icon')]")
    public WebElement txt_PMInspection;


    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    public WebElement img_ADD;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement btn_Add;

    @FindBy(xpath = "(//img[contains(@id,':ciWorkRequiredIC::icon')])[1]")
    public WebElement img_Images;

    @FindBy(xpath = "(//a[contains(.,'PM inspection.')])[1]")
    public WebElement txt_Hyperlink;


    @FindBy(xpath = "(//span[text()='Completed'])[1]")
    public List<WebElement> txt_Completed;


    @FindBy(xpath = "//span[text()='Close']")
    public WebElement btn_Close;

    @FindBy(xpath = "(//a[contains(.,'drop frame trailer')])[2]")
    public List< WebElement> txt_DropDrainFrameTrailer;


    @FindBy(xpath = "//span[text()='Area 100 Walkaround Exterior Inspection']")
    public WebElement box_WalkAroundExteriorInspectionBox;

    @FindBy(xpath = "(//label[contains(.,'Pass')]//..//input)[1]")
    public WebElement txt_CheckingAndInspectionMounting;

    @FindBy(xpath = "//input[contains(@id,':itValueText::content')]")
    public WebElement txt_ListTHeGPS;

    @FindBy(xpath = "(//span[contains(.,'List GPS')]//parent::td//following::table//span/input)[1]")
    public WebElement txt_TransmitTosDate;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_ConfirmTrailer;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_ConfirmTrailerLicensePlate;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_ConfirmTrailerValid;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_ScanBarCode;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_CheckAllFedEx;

    @FindBy(xpath = "//span[text()='Save and Exit']")
    public WebElement btn_SaveAndExit;


    @FindBy(xpath = "//span[text()='Work In Progress']/parent::div/following-sibling::div/span")
    public WebElement txt_NumberOfQuestionsAnswerResult;

    @FindBy(xpath = "//span[contains(.,'Show Error Only')]")
    public WebElement txt_ShowErrorOnly;

    @FindBy(xpath = "//div[contains(@id,':tequins::scroller')]")
    public WebElement txt_ScrollBar;

    @FindBy(xpath = "//span[text()='Check & lubricate pintle hook snubber & gauge wear']")
    public WebElement txt_CheckLastRowText;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_CheckAllLights;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':9:sorValueCheck:')]")
    public WebElement txt_InspectGland;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':10:sorValueCheck:')]")
    public WebElement txt_CheckingBreakingSystem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':11:sorValueCheck:')]")
    public WebElement txt_CheckABSFunction;

    @FindBy(xpath = "//textarea[contains(@id,':tequins:11:it3::content')]")
    public WebElement input_CheckABSFunctionTextArea;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':12:sorValueCheck:')]")
    public WebElement txt_InspectFront;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':13:sorValueCheck:')]")
    public WebElement txt_InspectBack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':14:sorValueCheck:')]")
    public WebElement txt_CheckBodyForDamage;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':15:sorValueCheck:')]")
    public WebElement txt_InspectMudFlag;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':16:sorValueCheck:')]")
    public WebElement txt_InspectCondition;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':17:sorValueCheck:')]")
    public WebElement txt_InspectDrop;


    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':18:sorValueCheck:')]")
    public WebElement txt_InspectSafety;


    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':19:sorValueCheck:')]")
    public WebElement txt_CheckAndOperate;


    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':20:sorValueCheck:')]")
    public WebElement txt_InspectCracks;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':21:sorValueCheck:')]")
    public WebElement txt_CheckAndLubricate;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_DoneValidate;



    @FindBy(xpath = "//span[contains(.,'Inspect Rear Impact Guard in accordance')]")
    public WebElement box_InspectRearImpactGuard;

    @FindBy(xpath = "(//label[contains(.,'Pass')]//..//input)[1]")
    public WebElement txt_MissingGuard;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_GuardNotSecurely;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMemberNotExtend;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMemberMore;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMemberMoreThan;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_GuardHorizontalMember;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_InspectRearImpactGuard;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_DoneValidateButton;

    @FindBy(xpath = "//span[contains(.,'Under Vehicle Inspection')]")
    public WebElement box_UnderVehicle;

    @FindBy(xpath = "(//label[contains(.,'Pass')]//..//input)[1]")
    public WebElement txt_InspectKingPin;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_InspectLandingGear;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_OperateLAndLandingGear;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectCrossMember;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectFrameCracks;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_UnderTheVehicleButton;

    @FindBy(xpath = "//span[contains(.,'Foundation Brake Inspection ')]")
    public WebElement box_FoundationBrakeInspection;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_CheckAndLubricateSlack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_CheckANdLubricateInboard;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckAndLubricateSlackAdjuster;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectConditionBrake;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectBrakeChamber;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_InspectConditionOfBrakeLining;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_CheckBrakeLiningToDrum;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_ChargeAirSystem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_ReleaseParkingBreak;

    @FindBy(xpath = "//input[contains(@id,':9:itValueNumeric::content')]")
    public WebElement txt_RecordLf;

    @FindBy(xpath = "//input[contains(@id,':10:itValueNumeric::content')]")
    public WebElement txt_RecordRf;

    @FindBy(xpath = "//input[contains(@id,':11:itValueNumeric::content')]")
    public WebElement txt_RecordLr;

    @FindBy(xpath = "//input[contains(@id,':12:itValueNumeric::content')]")
    public WebElement txt_RecordRr;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':13:sorValueCheck:')]")
    public WebElement txt_ApplyService;

    @FindBy(xpath = "//input[contains(@id,':14:itValueNumeric::content')]")
    public WebElement txt_RecordLfPushRod;

    @FindBy(xpath = "//input[contains(@id,':15:itValueNumeric::content')]")
    public WebElement txt_RecordRfPushRod;

    @FindBy(xpath = "//span[text()='Adjust manual slack adjusters (if applicable)']")
    public WebElement txt_AdjustersScroll;

    @FindBy(xpath = "//input[contains(@id,':16:itValueNumeric::content')]")
    public WebElement txt_LfPushRodTravel;

    @FindBy(xpath = "//input[contains(@id,':17:itValueNumeric::content')]")
    public WebElement txt_RfPushRodTravel;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':18:sorValueCheck:')]")
    public WebElement txt_AdjustManualSlack;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_DoneValidateLabel;

    @FindBy(xpath = "//span[contains(.,' Suspension System')]")
    public WebElement box_SuspensionSystem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_InspectTheTandem;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_CheckWheelBearing;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckUBolt;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectTorqueRod;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectAirSpring;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_CheckRideHeight;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_InspectAirRide;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_CheckSuspensionDumpValue;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_Validate;

    @FindBy(xpath = "//span[contains(.,'Wheel & Tire')]")
    public WebElement box_WheelTire;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_InspectWheels;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_CheckForMissing;

    @FindBy(xpath = "//input[contains(@id,':2:itValueNumeric::content')]")
    public WebElement txt_DualMetingLf;

    @FindBy(xpath = "//input[contains(@id,':3:itValueNumeric::content')]")
    public WebElement txt_DualMetingRf;

    @FindBy(xpath = "//input[contains(@id,':4:itValueNumeric::content')]")
    public WebElement txt_DualMetingLr;


    @FindBy(xpath = "//input[contains(@id,':5:itValueNumeric::content')]")
    public WebElement txt_DualMetingRr;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_TiresForDamage;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_PSIInflation;

    @FindBy(xpath = "//span[text()='Record RFI tire pressure (psi)']")
    public WebElement txt_ScrollSlider;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_ValveStem;

    @FindBy(xpath = "//input[contains(@id,':9:itValueNumeric::content')]")
    public WebElement txt_TreadDepth;

    @FindBy(xpath = "//input[contains(@id,':10:itValueNumeric::content')]")
    public WebElement txt_TreadPressure;

    @FindBy(xpath = "//input[contains(@id,':11:itValueNumeric::content')]")
    public WebElement txt_RecordLfiTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':12:itValueNumeric::content')]")
    public WebElement txt_RecordLfiTirePressure;

    @FindBy(xpath = "//input[contains(@id,':13:itValueNumeric::content')]")
    public WebElement txt_RecordLroTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':14:itValueNumeric::content')]")
    public WebElement txt_RecordLroTirePressure;

    @FindBy(xpath = "//input[contains(@id,':15:itValueNumeric::content')]")
    public WebElement txt_RecordLriTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':16:itValueNumeric::content')]")
    public WebElement txt_RecordLriTirePressure;

    @FindBy(xpath = "//input[contains(@id,':17:itValueNumeric::content')]")
    public WebElement txt_RROTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':18:itValueNumeric::content')]")
    public WebElement txt_RROTirePressure;

    @FindBy(xpath = "//input[contains(@id,':19:itValueNumeric::content')]")
    public WebElement Txt_RRITreadDepth;

    @FindBy(xpath = "//input[contains(@id,':20:itValueNumeric::content')]")
    public WebElement txt_RRITirePressure;

    @FindBy(xpath = "//input[contains(@id,':21:itValueNumeric::content')]")
    public WebElement txt_RFOTreadDepth;

    @FindBy(xpath = "//input[contains(@id,':22:itValueNumeric::content')]")
    public WebElement txt_RFOTirePressure;

    @FindBy(xpath = "//input[contains(@id,':23:itValueNumeric::content')]")
    public WebElement txt_RFITreadDepth;

    @FindBy(xpath = "//input[contains(@id,':24:itValueNumeric::content')]")
    public WebElement txt_RFITirePressure;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement txt_ValidateButtonWheelAndTire;

    @FindBy(xpath = "//span[contains(.,'Roll Up Door')]  ")
    public WebElement box_RollUpDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_CheckCondition;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_lubricateDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_InspectRoller;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectDoorPull;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_checkAndVerify;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_InspectCables;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_InspectOperator;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':7:sorValueCheck:')]")
    public WebElement txt_InspectLubricate;

    @FindBy(xpath ="//span[text()='ROLL UP DOOR - Inspect sill, upright & header door seals']")
    public WebElement txt_ScrollDown;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':8:sorValueCheck:')]")
    public WebElement txt_InspectTrack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':9:sorValueCheck:')]")
    public WebElement txt_InspectSill;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_RollUpDoorButton;

    @FindBy(xpath = "//span[contains(.,'Swing Door')]")
    public WebElement box_SwingDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_ConditionDoor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_OperateAndLubricate;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckAndVerifyProper;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectAllDoor;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_SwingDoorButton;


    @FindBy(xpath = "//span[contains(.,'Interior')]")
    public WebElement box_InteriorBox;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':0:sorValueCheck:')]")
    public WebElement txt_CargoNetTrack;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':1:sorValueCheck:')]")
    public WebElement txt_InspectInteriorWall;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':2:sorValueCheck:')]")
    public WebElement txt_CheckFloor;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':3:sorValueCheck:')]")
    public WebElement txt_InspectConditionOfConvey;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':4:sorValueCheck:')]")
    public WebElement txt_InspectLoadDecks;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':5:sorValueCheck:')]")
    public WebElement txt_InspectRoofBlows;

    @FindBy(xpath = "//label[contains(.,'Pass')]//..//input[contains(@id,':6:sorValueCheck:')]")
    public WebElement txt_ConductLightCheck;

    @FindBy(xpath = "//span[text()='Done / Validate']")
    public WebElement btn_InteriorButton;

    @FindBy(xpath = "//span[text()='Defect Summary']")
    public WebElement btn_DefectSummary;

    @FindBy(xpath = "//label[text()='Inspection Notes:']")
    public WebElement txt_InspectionNotes;

    @FindBy(xpath = "//th[contains(@id,':cDesc')]//div/child::span")
    public WebElement txt_Description;

    @FindBy(xpath = "//span[text()='Notes']")
    public WebElement txt_Notes;

    @FindBy(xpath = "(//td[contains(@id,':cDesc')])[1]")
    public WebElement txt_DefectCategory;

    @FindBy(xpath = "//td[contains(@id,':1:cDesc')]")
    public WebElement txt_DefectDescription;

    @FindBy(xpath = " //span[text()='Sign']")
    public WebElement btn_SignButton;

    @FindBy(xpath = "//div[contains(@id,':rEquIns:3:cb6')]//a//span")
    public WebElement btn_CancelButton;

    @FindBy(xpath = "(//span[text()='Clear'])[1]")
    public WebElement txt_Clear;

    @FindBy(xpath = "(//span[text()='Continue'])[1]")
    public WebElement txt_Continue;
    @FindBy(xpath = "//div[contains(@id,':j_idt')]/child::canvas")
    public WebElement label_Signature ;

    @FindBy(xpath = "(//a[contains(.,'Su')])[1]")
    public WebElement btn_Summary;

    @FindBy(xpath = " //span[text()='Unit Ready']")
    public WebElement txt_UnitReady;

    @FindBy(xpath = "//div[contains(@id,':cbErrOK')]//span")
    public  WebElement btn_UnitReadyOkButton;



    @FindBy(xpath = "//span[text()='Re-Sign']")
    public WebElement btn_SignIn;

    @FindBy(xpath = "//div[contains(@id,':j_idt70')]/child::canvas")
    public WebElement label_canvas;

    @FindBy(xpath = "//div[contains(@id,':s9:cb')]//span[text()='OK']")
    public WebElement btn_Ok;


    @FindBy(xpath = "(//a[contains(.,'Lab')])[1]")
    public WebElement label_labor;

    @FindBy(xpath = "//img[contains(@id,':1:ciDWoAct1::icon')]")
    public WebElement img_cancel;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    public WebElement btn_SaveExitDeleteButton;

    @FindBy(xpath = "(//div[contains(@id,':0:cbSelectWoact')]//a//span)[1]")
    public WebElement btn_SelectButton;

    @FindBy(xpath = "//span[text()='Assigned Work']")
    public WebElement btn_AssignWork;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement Label_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;





    /*** Enter the Tech Badge data*/
    public void enterTechBadge() throws InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_scanEmployeeBadge);
        WebElementActions.getActions().inputText(txt_scanEmployeeBadge, prop.getProperty("Tech"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*** Click on Go*/
    public void clickOnGo() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GO);
        WebElementActions.getActions().clickElement(btn_GO);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }



    /** verify Select Work*/
    public void verifySelectWork() throws InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(5000);
        if (txt_SelectAssignedWork.size()>0) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_MoreUnits);
            WebElementActions.getActions().clickElement(btn_MoreUnits);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SearchTextArea);
            WebElementActions.getActions().inputText(label_SearchTextArea,prop.getProperty("UnitNumber"));
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Select);
            WebElementActions.getActions().clickElement(btn_Select);
            WaitActions.getWaits().loadingWait(loder);


        } else {

        }

    }

    /**verify Technician Portal */
    public void verifyTechnicianPortal () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TechnicianPortal);
        Assert.assertTrue(label_TechnicianPortal.isDisplayed());
    }

    /**click On More links */
    public void clickOnMoreLinks() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_MoreLinkText);
        WebElementActions.getActions().clickElement(txt_MoreLinkText);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on search Text Area */
    public void clickOnSearchTextArea() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_SearchTextArea);
        WebElementActions.getActions().inputText(input_SearchTextArea, prop.getProperty("Enter"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On image */
    public void clickOnInspectionImage() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_PMInspection);
        WebElementActions.getActions().clickElement(img_PMInspection);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);



    }
    /**click On Add Icon */
    public void clickOnAddIcon() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PMInspection);
        WebElementActions.getActions().clickElement(txt_PMInspection);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);




    }
    /**click on Add Button */
    public void clickOnAddButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Add);
        WebElementActions.getActions().clickElement(btn_Add);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**click on image */
    public void clickOnImage() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_Images);
        WebElementActions.getActions().clickUsingJS(img_Images);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /**click on Hyperlink  */
    public void clickOnHyperLink() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_Hyperlink);
        WebElementActions.getActions().clickElement(txt_Hyperlink);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify data and click On  Walkaround Exterior Inspection*/
    public void verifyData () throws InterruptedException {

        System.out.println(txt_Completed.size());
        Thread.sleep(3000);
        if(txt_Completed.size()>0){
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Close);
            WebElementActions.getActions().clickElement(btn_Close);
            WaitActions.getWaits().loadingWait(loder);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_cancel);
            WebElementActions.getActions().clickElement(img_cancel);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExitDeleteButton);
            WebElementActions.getActions().clickElement(btn_SaveExitDeleteButton);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SelectButton);
            WebElementActions.getActions().clickElement(btn_SelectButton);
            WaitActions.getWaits().loadingWait(loder);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_Hyperlink);
            WebElementActions.getActions().clickElement(txt_Hyperlink);
            TestListener.saveScreenshotPNG(driver);

        }else {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_WalkAroundExteriorInspectionBox);
            WebElementActions.getActions().clickElement(box_WalkAroundExteriorInspectionBox);
            TestListener.saveScreenshotPNG(driver);

        }
    }


    /**select checking And Inspection Mounting Text Boolean pass */
    public void selectCheckingAndInspectionMounting() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckingAndInspectionMounting);
        WebElementActions.getActions().clickElement(txt_CheckingAndInspectionMounting);

    }
    /**enter GPS series Number Textarea value  */
    public void EnterGPSSeriesNumber() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ListTHeGPS);
        WebElementActions.getActions().inputText(txt_ListTHeGPS, prop.getProperty("GPSSeriesNumber"));

    }
    /**enter  The GPS Transmit Date TextArea  value */
    public void clickEnterTheGPSTransmitDate() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_TransmitTosDate);
        WebElementActions.getActions().inputText(txt_TransmitTosDate,prop.getProperty("GPSTransmitDate"));

    }
    /**select Enter Confirm Trailer Text Boolean pass */
    public void selectEnterConfirmTrailer() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ConfirmTrailer);
        WebElementActions.getActions().clickElement(txt_ConfirmTrailer);

    }
    /**select confirm Trailer License Plate Text Boolean pass */
    public void selectConfirmTrailerLicensePlate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ConfirmTrailerLicensePlate);
        WebElementActions.getActions().clickElement(txt_ConfirmTrailerLicensePlate);
    }
    /**select confirm Trailer valid  Text Boolean pass */
    public void selectConfirmTrailerValid() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ConfirmTrailerValid);
        WebElementActions.getActions().clickElement(txt_ConfirmTrailerValid);

    }
    /** select scan Barcode Text Boolean pass */
    public void selectScanBarCode() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ScanBarCode);
        WebElementActions.getActions().clickElement(txt_ScanBarCode);

    }
    /**select check All FedEx Text Boolean pass */
    public void selectCheckAllFedEx() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_CheckAllFedEx);
        WebElementActions.getActions().clickElement(txt_CheckAllFedEx);

    }
    /**click on Done validate Button*/
    public void clickOnDoneValidate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_DoneValidate);
        WebElementActions.getActions().clickElement(btn_DoneValidate);
        WaitActions.getWaits().loadingWait(loder);



    }
    /**click on save And Exit Button  */
    public void clickOnSaveAndExit () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveAndExit);
        WebElementActions.getActions().clickElement(btn_SaveAndExit);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**verify number of Questions Answered sub Text */
    public void verifyNumberOfQuestionsAnsweredSub () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_NumberOfQuestionsAnswerResult);
        Assert.assertTrue(txt_NumberOfQuestionsAnswerResult.isDisplayed());

    }
    /**click walk Around Exterior Inspection Box */
    public void clickWalkaroundExteriorInspectionBox() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(box_WalkAroundExteriorInspectionBox);
        WebElementActions.getActions().clickElement(box_WalkAroundExteriorInspectionBox);


    }
    /** click on Show Error Only Button  */
    public void clickOnShowErrorOnly () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ShowErrorOnly);
        WebElementActions.getActions().clickElement(txt_ShowErrorOnly);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**select check All Lights Text boolean pass*/
    public void selectCheckAllLights () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_CheckAllLights);
        WebElementActions.getActions().clickElement(txt_CheckAllLights);

    }
    /**select Inspect Gland Text Boolean pass */
    public void  selectInspectGland () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_InspectGland);
        WebElementActions.getActions().clickElement(txt_InspectGland);

    }
    /**select checking  Breaking System Text Boolean pass */
    public void selectCheckingBreakingSystem () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_CheckingBreakingSystem);
        WebElementActions.getActions().clickElement(txt_CheckingBreakingSystem);

    }
    /**select check ABS Function Text Boolean pass  */
    public void selectCheckABSFunction () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_CheckABSFunction);
        WebElementActions.getActions().clickElement(txt_CheckABSFunction);

    }
    /**enter Check ABS Function Textarea value */
    public void enterCheckABSFunctionTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_CheckABSFunctionTextArea);
        WebElementActions.getActions().inputText(input_CheckABSFunctionTextArea,prop.getProperty("CheckABSFunctionTextArea"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**select Inspect Front Text boolean pass  */
    public void selectInspectFront () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectFront);
        WebElementActions.getActions().clickElement(txt_InspectFront);
        TestListener.saveScreenshotPNG(driver);
    }
    /**select Inspect Back Text Boolean pass*/
    public void selectInspectBack () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectBack);
        WebElementActions.getActions().clickElement(txt_InspectBack);
        TestListener.saveScreenshotPNG(driver);
    }
    /**select CheckBody For Damage Text Boolean pass  */
    public void selectCheckBodyForDamage () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckBodyForDamage);
        WebElementActions.getActions().clickElement(txt_CheckBodyForDamage);
        TestListener.saveScreenshotPNG(driver);

    }

    /**select Inspect MudFlag Text Boolean pass */
    public  void selectInspectMudFlag () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectMudFlag);
        WebElementActions.getActions().clickElement(txt_InspectMudFlag);

    }
    /**select Inspect condition Text Boolean pass */
    public void selectInspectCondition () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectCondition);
        WebElementActions.getActions().clickElement(txt_InspectCondition);

    }
    /**select Inspect Drop Text Boolean pass  */
    public void selectInspectDrop () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectDrop);
        WebElementActions.getActions().clickElement(txt_InspectDrop);

    }
    /**select Inspect Safety  Text Boolean pass */
    public void selectInspectSafety () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectSafety);
        WebElementActions.getActions().clickElement(txt_InspectSafety);

    }
    /**select Check And Operate Text Boolean pass  */
    public void selectCheckAndOperate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckAndOperate);
        WebElementActions.getActions().clickElement(txt_CheckAndOperate);

    }


    /**select Inspect cracks Text Boolean pass */
    public void selectInspectCracks () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectCracks);
        WebElementActions.getActions().clickElement(txt_InspectCracks);

    }
    /**select check And Lubricate Text Boolean pass  */
    public void selectCheckAndLubricate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckAndLubricate);
        WebElementActions.getActions().clickElement(txt_CheckAndLubricate);
    }
    /** click On Done validate Button  Text Boolean Pass */
    public void clickOnDoneValidateButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DoneValidate);
        WebElementActions.getActions().clickElement(btn_DoneValidate);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Inspect Rear Impact Guard  Text Boolean pass */
    public void clickOnInspectRearImpactGuard () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_InspectRearImpactGuard);
        WebElementActions.getActions().clickElement(box_InspectRearImpactGuard);
        TestListener.saveScreenshotPNG(driver);


    }
    /**select Missing Guard Text Boolean pass */
    public void selectMissingGuard () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_MissingGuard);
        WebElementActions.getActions().clickElement(txt_MissingGuard);

    }
    /**select Guard Not Securely Text Boolean pass  */
    public void selectGuardNotSecurely () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_GuardNotSecurely);
        WebElementActions.getActions().clickElement(txt_GuardNotSecurely);

    }
    /**select Guard Horizontal member Text Boolean pass */
    public void selectGuardHorizontalMemberNotExtend () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMemberNotExtend);
        WebElementActions.getActions().clickElement(txt_GuardHorizontalMemberNotExtend);

    }
    /**select Guard Horizontal member more Text Boolean pass */
    public void selectGuardHorizontalMemberMore () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMemberMore);
        WebElementActions.getActions().clickElement(txt_GuardHorizontalMemberMore);

    }
    /**Select Guard Horizontal Member More Than  Text Boolean pass*/
    public void selectGuardHorizontalMemberMoreThan () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMemberMoreThan);
        WebElementActions.getActions().clickElement(txt_GuardHorizontalMemberMoreThan);

    }
    /**select Guard Horizontal Member Text  Boolean pass */
    public void selectGuardHorizontalMember () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_GuardHorizontalMember);
        WebElementActions.getActions().clickElement(txt_GuardHorizontalMember);

    }
    /**select Inspect Rear Imapct Guard Text Boolean pass*/
    public void selectInspectRearImpactGuard () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectRearImpactGuard);
        WebElementActions.getActions().clickElement(txt_InspectRearImpactGuard);
    }
    /**click Done Validate Button */
    public void clickDoneValidateButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DoneValidateButton);
        WebElementActions.getActions().clickElement(btn_DoneValidateButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click Under Vehicle Box */
    public void clickUnderVehicle () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_UnderVehicle);
        WebElementActions.getActions().clickElement(box_UnderVehicle);
        TestListener.saveScreenshotPNG(driver);
    }
    /** select Inspecting pin Text Boolean pass  */
    public void selectInspectKingPin () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectKingPin);
        WebElementActions.getActions().clickElement(txt_InspectKingPin);

    }
    /** select Inspect Landing Gear Text Boolean pass  */
    public void selectInspectLandingGear () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectLandingGear);
        WebElementActions.getActions().clickElement(txt_InspectLandingGear);

    }
    /** select Operate ANd Landing Gear Text Boolean pass  */
    public void selectOperateLAndLandingGear () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_OperateLAndLandingGear);
        WebElementActions.getActions().clickElement(txt_OperateLAndLandingGear);

    }
    /**select Inspect Cross Member  Text Boolean pass */
    public void selectInspectCrossMember () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectCrossMember);
        WebElementActions.getActions().clickElement(txt_InspectCrossMember);

    }
    /**select Inspect Frame Cracks Text Boolean pass */
    public void selectInspectFrameCracks () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectFrameCracks);
        WebElementActions.getActions().clickElement(txt_InspectFrameCracks);

    }
    /**click Inspect Rear Impact Guard Button */
    public void clickInspectRearImpactGuardButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_UnderTheVehicleButton);
        WebElementActions.getActions().clickElement(btn_UnderTheVehicleButton);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click Foundation Brake Inspection Text Boolean pass */
    public void clickFoundationBrakeInspection () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_FoundationBrakeInspection);
        WebElementActions.getActions().clickElement(box_FoundationBrakeInspection);
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Check and Lubricate Slack Text Boolean passs*/
    public void  selectCheckAndLubricateSlack () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckAndLubricateSlack);
        WebElementActions.getActions().clickElement(txt_CheckAndLubricateSlack);

    }
    /**select Check And Lubricate Inboard Text Boolean pass */
    public void selectCheckANdLubricateInboard () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckANdLubricateInboard);
        WebElementActions.getActions().clickElement(txt_CheckANdLubricateInboard);

    }
    /**select check And Lubricate Slacks Adjuster Text Boolean pass */
    public void selectCheckAndLubricateSlackAdjuster () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckAndLubricateSlackAdjuster);
        WebElementActions.getActions().clickElement(txt_CheckAndLubricateSlackAdjuster);

    }
    /**select Inspect Condition Text Boolean Pass  */
    public void selectInspectConditionBrake () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectConditionBrake);
        WebElementActions.getActions().clickElement(txt_InspectConditionBrake);

    }
    /**select Inspect Brake Chamber Text Boolean pass */
    public void selectInspectBrakeChamber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectBrakeChamber);
        WebElementActions.getActions().clickElement(txt_InspectBrakeChamber);

    }
    /**select Inspect condition Of Break Lining Text Boolean pass */
    public  void  selectInspectConditionOfBrakeLining () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectConditionOfBrakeLining);
        WebElementActions.getActions().clickElement(txt_InspectConditionOfBrakeLining);
    }
    /**select Check Brake Lining To Drum Text Boolean pass */
    public void selectCheckBrakeLiningToDrum () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckBrakeLiningToDrum);
        WebElementActions.getActions().clickElement(txt_CheckBrakeLiningToDrum);

    }
    /** select charge Air System Text Boolean pass */
    public void selectChargeAirSystem () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ChargeAirSystem);
        WebElementActions.getActions().clickElement(txt_ChargeAirSystem);
    }
    /** select Release parking Break*/
    public void selectReleaseParkingBreak () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ReleaseParkingBreak);
        WebElementActions.getActions().clickElement(txt_ReleaseParkingBreak);
    }



    /** click On Done Validate Label*/
    public void clickOnDoneValidateLabel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DoneValidateLabel);
        WebElementActions.getActions().clickElement(btn_DoneValidateLabel);
        WaitActions.getWaits().loadingWait(loder);
    }

    /**enter Record Lf*/
    public void enterRecordLf () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLf);
        WebElementActions.getActions().inputText(txt_RecordLf, prop.getProperty("column"));
    }
    /** enter Record Rf*/
    public void enterRecordRf () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordRf);
        WebElementActions.getActions().inputText(txt_RecordRf, prop.getProperty("column"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter Record Lr*/
    public void enterRecordLr () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLr);
        WebElementActions.getActions().inputText(txt_RecordLr, prop.getProperty("column"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter the RecordRr*/
    public void enterRecordRr () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordRr);
        WebElementActions.getActions().inputText(txt_RecordRr, prop.getProperty("column"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**select Apply Service*/
    public void selectApplyService () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ApplyService);
        WebElementActions.getActions().clickElement(txt_ApplyService);

    }
    /**enter Record Lf PushRod */
    public void enterRecordLfPushRod () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLfPushRod);
        WebElementActions.getActions().inputText(txt_RecordLfPushRod,prop.getProperty("value"));

    }
    /**enter Record Rf Push Rod */
    public void enterRecordRfPushRod () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordRfPushRod);
        WebElementActions.getActions().inputText(txt_RecordRfPushRod,prop.getProperty("value"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Lf Push Rod Travel */
    public void enterLfPushRodTravel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_LfPushRodTravel);
        WebElementActions.getActions().inputText(txt_LfPushRodTravel,prop.getProperty("value"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**enter Rf Push Rod Travel */
    public void enterRfPushRodTravel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RfPushRodTravel);
        WebElementActions.getActions().inputText(txt_RfPushRodTravel,prop.getProperty("value"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Adjust Manual Slack */
    public void selectAdjustManualSlack () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_AdjustManualSlack);
        WebElementActions.getActions().clickElement(txt_AdjustManualSlack);


    }
    /**click Done Validate label*/
    public void clickDoneValidateLabel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DoneValidateLabel);
        WebElementActions.getActions().clickElement(btn_DoneValidateLabel);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Box Suspension System*/
    public void clickOnBoxSuspensionSystem () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_SuspensionSystem);
        WebElementActions.getActions().clickElement(box_SuspensionSystem);
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Inspect  The Tandem Boolean */
    public void selectInspectTheTandem () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectTheTandem);
        WebElementActions.getActions().clickElement(txt_InspectTheTandem);

    }
    /** select Checking Wheel Bearing Boolean*/
    public void selectCheckWheelBearing () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckWheelBearing);
        WebElementActions.getActions().clickElement(txt_CheckWheelBearing);

    }
    /** select Check u  bolt Text Boolean*/
    public void selectCheckUBolt () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckUBolt);
        WebElementActions.getActions().clickElement(txt_CheckUBolt);
    }
    /** select Inspect Torque Rod Text Boolean */
    public void selectInspectTorqueRod () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectTorqueRod);
        WebElementActions.getActions().clickElement(txt_InspectTorqueRod);

    }
    /** select Inspect Air Spring TExt Boolean */
    public void selectInspectAirSpring () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectAirSpring);
        WebElementActions.getActions().clickElement(txt_InspectAirSpring);
    }
    /**select Check Ride Height Text Boolean */
    public void selectCheckRideHeight () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckRideHeight);
        WebElementActions.getActions().clickElement(txt_CheckRideHeight);

    }
    /**select Inspect Air Ride TExt Boolean*/
    public void selectInspectAirRide () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectAirRide);
        WebElementActions.getActions().clickElement(txt_InspectAirRide);

    }
    /** select Check Suspension Dump value Text Boolean */
    public void selectCheckSuspensionDumpValue () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckSuspensionDumpValue);
        WebElementActions.getActions().clickElement(txt_CheckSuspensionDumpValue);

    }
    /** click On Validate Button */
    public  void clickValidate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Validate);
        WebElementActions.getActions().clickElement(btn_Validate);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Wheel Tire  Text Box */
    public void clickWheelTire () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_WheelTire);
        WebElementActions.getActions().clickElement(box_WheelTire);
        TestListener.saveScreenshotPNG(driver);

    }
    /** select Inspect Wheel Text Box */
    public void selectInspectWheels () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectWheels);
        WebElementActions.getActions().clickElement(txt_InspectWheels);

    }
    /** select Check For Missing Text Box */
    public void selectCheckForMissing () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckForMissing);
        WebElementActions.getActions().clickElement(txt_CheckForMissing);

    }
    /**enter Dual Meting  Lf TextArea value */
    public void enterDualMetingLf () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_DualMetingLf);
        WebElementActions.getActions().inputText(txt_DualMetingLf,prop.getProperty("RecordOffset"));

    }
    /**enter Dual Meting Rf TextArea Value */
    public void enterDualMetingRf () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_DualMetingRf);
        WebElementActions.getActions().inputText(txt_DualMetingRf,prop.getProperty("RecordOffset"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Dual Meting Lr TextArea Value */
    public void enterDualMetingLr () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_DualMetingLr);
        WebElementActions.getActions().inputText(txt_DualMetingLr,prop.getProperty("RecordOffset"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Dual Meting Rr TextArea Value */
    public void enterDualMetingRr () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_DualMetingRr);
        WebElementActions.getActions().inputText(txt_DualMetingRr,prop.getProperty("RecordOffset"));
        TestListener.saveScreenshotPNG(driver);

    }
    /**select for Tire Damage Text Boolean Pass */
    public void selectForTireDamage () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_TiresForDamage);
        WebElementActions.getActions().clickElement(txt_TiresForDamage);
    }
    /**select PSI Inflation System  Text Boolean Pass */
    public void selectPSIInflationSystem () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_PSIInflation);
        WebElementActions.getActions().clickElement(txt_PSIInflation);
    }
    /**click On Validate Button */
    public void clickOnValidateButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ValidateButtonWheelAndTire);
        WebElementActions.getActions().clickElement(txt_ValidateButtonWheelAndTire);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**select valve Stem flow Text Boolean Pass */
    public void selectValveStemFlow() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ValveStem);
        WebElementActions.getActions().clickElement(txt_ValveStem) ;
    }
    /** enter Record LFO Tread Depth Texteara */
    public void enterRecordLFOTreadDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_TreadDepth);
        WebElementActions.getActions().inputText(txt_TreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);


    }
    /**enter Recore LFO Tire Pressure Textarea */
    public void enterRecordLFOTirePressure () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_TreadPressure);
        WebElementActions.getActions().inputText(txt_TreadPressure,prop.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);

    }
    /**enter Record LFI TRead Depth Textarea  value */
    public void enterRecordLfiTreadDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLfiTreadDepth);
        WebElementActions.getActions().inputText(txt_RecordLfiTreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** enter Record LFI Pressure Textarea Value */
    public void enterRecordLfiTirePressure  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLfiTirePressure);
        WebElementActions.getActions().inputText(txt_RecordLfiTirePressure,prop.getProperty("TirePressure"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter Record LRO Tread Depth TextArea Value  */
    public  void enterRecordLroTreadDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLroTreadDepth);
        WebElementActions.getActions().inputText(txt_RecordLroTreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter Record  Lor Tire Pressure Textarea Value */
    public void enterRecordLroTirePressure() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLroTirePressure);
        WebElementActions.getActions().inputText(txt_RecordLroTirePressure,prop.getProperty("TirePressure"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter Record LRI Tread Depth TextArea Value */
    public void enterRecordLriTreadDepth() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLriTreadDepth);
        WebElementActions.getActions().inputText(txt_RecordLriTreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }

    /** scroll End To Bar */
    public void scrollEndTo () {
        WebElementActions.getActions().moveOnTargetElement(txt_ScrollSlider);

    }

    /**enter Record LRI Tire Pressure Textarea value */
    public void enterRecordLriTirePressure () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RecordLriTirePressure);
        WebElementActions.getActions().inputText(txt_RecordLriTirePressure,prop.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RRP Tread Depth Textarea Value */
    public void enterRROTreadDepth() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RROTreadDepth);
        WebElementActions.getActions().inputText(txt_RROTreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter RRO Tire Pressure Textarea Value */
    public void enterRROTirePressure () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RROTirePressure);
        WebElementActions.getActions().inputText(txt_RROTirePressure,prop.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter  RRI Tread Depth Textarea value*/
    public void enterRRITreadDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Txt_RRITreadDepth);
        WebElementActions.getActions().inputText(Txt_RRITreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /**enter RRI Tire Pressure Textarea value */
    public void enterRRITirePressure () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RRITirePressure);
        WebElementActions.getActions().inputText(txt_RRITirePressure,prop.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFO Tread Depth Textarea Value */
    public void enterRFOTreadDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RFOTreadDepth);
        WebElementActions.getActions().inputText(txt_RFOTreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFO Tire Pressure */
    public void enterRFOTirePressure() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RFOTirePressure);
        WebElementActions.getActions().inputText(txt_RFOTirePressure,prop.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFI Tread Depth */
    public void enterRFITreadDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RFITreadDepth);
        WebElementActions.getActions().inputText(txt_RFITreadDepth,prop.getProperty("TreadDepth"));
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter RFI Tire Pressure */
    public void enterRFITirePressure() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_RFITirePressure);
        WebElementActions.getActions().inputText(txt_RFITirePressure,prop.getProperty("TirePressure")) ;
        TestListener.saveScreenshotPNG(driver);
    }


    /**click On Roll Up Door Box */
    public void clickOnRollUpDoorBox () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_RollUpDoor);
        WebElementActions.getActions().clickElement(box_RollUpDoor);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Check Condition Boolean pass  */
    public void selectCheckCondition () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckCondition);
        WebElementActions.getActions().clickElement(txt_CheckCondition);
    }
    /**select Lubricate Door Boolean Pass */
    public void selectLubricateDoor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_lubricateDoor);
        WebElementActions.getActions().clickElement(txt_lubricateDoor);
    }
    /** select Inspect Roller  Boolean pass */
    public void selectInspectRoller () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectRoller);
        WebElementActions.getActions().clickElement(txt_InspectRoller);
    }
    /** select Inspect Door pull Boolean pass */
    public void selectInspectDoorPull () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectDoorPull);
        WebElementActions.getActions().clickElement(txt_InspectDoorPull);
    }
    /**select check and  verify Boolean pass */
    public void selectCheckAndVerify () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_checkAndVerify);
        WebElementActions.getActions().clickElement(txt_checkAndVerify);
    }
    /** select  Inspect Cables Boolean Pass */
    public void selectInspectCables () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectCables);
        WebElementActions.getActions().clickElement(txt_InspectCables);
    }
    /** select Inspect Operator Boolean pass */
    public void selectInspectOperator () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectOperator);
        WebElementActions.getActions().clickElement(txt_InspectOperator);
    }
    /** select Inspect Lubricate Boolean pass */
    public void selectInspectLubricate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectLubricate);
        WebElementActions.getActions().clickElement(txt_InspectLubricate);
    }

    /** select Inspect Track Text Boolean pass */
    public void selectInspectTrack () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectTrack);
        WebElementActions.getActions().clickElement(txt_InspectTrack);
    }
    /** select Inspect Still Text Boolean pass */
    public void selectInspectSill () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectSill);
        WebElementActions.getActions().clickElement(txt_InspectSill);
    }
    /** click On  Roll Up Door Validate Button */

    public void clickRollUpDoorButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RollUpDoorButton);
        WebElementActions.getActions().clickElement(btn_RollUpDoorButton);


    }
    /** click on swing  Door Box  */
    public void clickSwingDoor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_SwingDoor);
        WebElementActions.getActions().clickElement(box_SwingDoor);
        TestListener.saveScreenshotPNG(driver);
    }
    /** select condition Door Text Boolean pass */
    public void selectConditionDoor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ConditionDoor);
        WebElementActions.getActions().clickElement(txt_ConditionDoor);
    }
    /** select Operate And Lubricate Text Boolean pass */
    public void selectOperateAndLubricate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_OperateAndLubricate);
        WebElementActions.getActions().clickElement(txt_OperateAndLubricate);
    }
    /** select Check And verify Proper Text Boolean pass */
    public void selectCheckAndVerifyProper () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckAndVerifyProper);
        WebElementActions.getActions().clickElement(txt_CheckAndVerifyProper);
    }
    /** select Inspect All Door Text Boolean pass */
    public void selectInspectAllDoor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectAllDoor);
        WebElementActions.getActions().clickElement(txt_InspectAllDoor);
    }
    /**click on Swing  Door validate Button */
    public void  clickOnSwingDoorButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SwingDoorButton);
        WebElementActions.getActions().clickElement(btn_SwingDoorButton);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Interior Box */
    public void clickOnInteriorBox () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(box_InteriorBox);
        WebElementActions.getActions().clickElement(box_InteriorBox);

    }
    /**select Cargo Net Track Text Boolean pass */
    public void selectCargoNetTrack () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CargoNetTrack);
        WebElementActions.getActions().clickElement(txt_CargoNetTrack);

    }
    /**select Inspect Interior Wall Text Boolean pass */
    public void selectInspectInteriorWall () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectInteriorWall);
        WebElementActions.getActions().clickElement(txt_InspectInteriorWall);

    }
    /**select check Floor Text Boolean pass */
    public void selectCheckFloor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_CheckFloor);
        WebElementActions.getActions().clickElement(txt_CheckFloor);
    }
    /**select Inspect Condition Of convey Text Boolean pass */
    public  void selectInspectConditionOfConvey() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectConditionOfConvey);
        WebElementActions.getActions().clickElement(txt_InspectConditionOfConvey);
    }
    /** select inspect Load Decks Text Boolean pass */
    public void selectInspectLoadDecks () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectLoadDecks);
        WebElementActions.getActions().clickElement(txt_InspectLoadDecks);
    }
    /** select Inspect Roof Blows Text Boolean pass */
    public void selectInspectRoofBlows  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_InspectRoofBlows);
        WebElementActions.getActions().clickElement(txt_InspectRoofBlows);
    }
    /**select Conduct Light check Text Boolean pass */
    public void selectConductLightCheck () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_ConductLightCheck);
        WebElementActions.getActions().clickElement(txt_ConductLightCheck);

    }
    /**click Interior validate button */
    public void clickInteriorButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_InteriorButton);
        WebElementActions.getActions().clickElement(btn_InteriorButton);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Defect Summary Button */
    public void clickOnDefectSummary () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DefectSummary);
        WebElementActions.getActions().clickElement(btn_DefectSummary);
        TestListener.saveScreenshotPNG(driver);
    }


    /** verify Inspection Notes */
    public void verifyInspectionNotes () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_InspectionNotes);
        Assert.assertTrue(txt_InspectionNotes.isDisplayed());

    }

    /**verify Text Description */
    public void  verifyTextDescription () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Description);
        Assert.assertTrue(txt_Description.isDisplayed());

    }
    /** verify Text Notes */
    public void  verifyNotes () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Notes);
        Assert.assertTrue(txt_Notes.isDisplayed());

    }

    /**click on SignIn */
    public void clickOnSignIn () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SignButton);
        WebElementActions.getActions().clickElement(btn_SignButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Cancel Button */
    public void verifyCancelButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_CancelButton);
        Assert.assertTrue(btn_CancelButton.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }
    /** verify Clear Button  */
    public void  verifyClearButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Clear);
        Assert.assertTrue(txt_Clear.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }
    /**verify Continue Button */
    public void verifyContinueButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Continue);
        Assert.assertTrue(txt_Continue.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
    }
    /**handle canvas */
    public void handleCanvas () {

        int canvas_Width = label_Signature.getSize().getWidth();
        int canvas_Height = label_Signature.getSize().getHeight();
        int canvas_Center_X = canvas_Width/2;
        int canvas_Center_Y = canvas_Height/2;
        int y_Offset = (canvas_Center_Y/5)*4;
        System.out.println(canvas_Center_X);
        System.out.println(canvas_Center_Y);
        System.out.println(y_Offset);
        Actions action = new Actions(driver);
        action.dragAndDropBy(label_Signature, 617,276).build().perform();
        action.dragAndDropBy(label_Signature, -517,200).build().perform();
        action.moveToElement(label_Signature,-517,200).build().perform();
        action.moveToElement(label_Signature).click();
        TestListener.saveScreenshotPNG(driver);

    }


    /**click On Continue Button */
    public void clickToContinue () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_Continue);
        WebElementActions.getActions().clickUsingJS(txt_Continue);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On Summary Tab */
    public void ClickSummaryTab () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Summary);
        WebElementActions.getActions().clickElement(btn_Summary);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**click On Unit Ready */
    public void  clickOnUnitReady () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_UnitReady);
        WebElementActions.getActions().clickElement(txt_UnitReady);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On Unit Ready Ok Button */
    public void clickOnUnitReadyOk () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_UnitReadyOkButton);
        WebElementActions.getActions().clickElement(btn_UnitReadyOkButton);
        TestListener.saveScreenshotPNG(driver);

    }


    /** click on SignIn  */
    public void clickOnSinIn () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SignIn);
        WebElementActions.getActions().clickElement(btn_SignIn);
        TestListener.saveScreenshotPNG(driver);


    }
    /** handel Canvas */
    public void labelCanvas () {

        int canvas_Width = label_canvas.getSize().getWidth();
        int canvas_Height = label_canvas.getSize().getHeight();
        int canvas_Center_X = canvas_Width/2;
        int canvas_Center_Y = canvas_Height/2;
        int y_Offset = (canvas_Center_Y/5)*4;
        System.out.println(canvas_Center_X);
        System.out.println(canvas_Center_Y);
        System.out.println(y_Offset);
        Actions action = new Actions(driver);
        action.dragAndDropBy(label_canvas, 547,260).build().perform();
        action.dragAndDropBy(label_canvas, -647,200).build().perform();
        action.moveToElement(label_canvas,-647,200).build().perform();
        action.moveToElement(label_canvas).click();
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Ok Button */
    public void clickOnOkButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Ok);
        WebElementActions.getActions().clickElement(btn_Ok);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click on labor */
    public void clickOnLabor () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_labor);
        WebElementActions.getActions().clickElement(label_labor);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /** click On Hyperlink */
    public void cancelHyperLink () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_cancel);
        WebElementActions.getActions().clickElement(img_cancel);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click Save And Exit Button */
    public void  clickSaveAndExitButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExitDeleteButton);
        WebElementActions.getActions().clickElement(btn_SaveExitDeleteButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**Select Hyperlink  */
    public void selectHyperLink () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SelectButton);
        WebElementActions.getActions().clickElement(btn_SelectButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Assign  Work  label */
    public void clickOnAssignWork () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AssignWork);
        WebElementActions.getActions().clickElement(btn_AssignWork);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Sign Out */
    public void clickOnSignOut () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Label_SignOut);
        WebElementActions.getActions().clickElement(Label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }

}


