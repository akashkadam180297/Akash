package pages.Estimate;

import actions.LoginActions;
import org.openqa.selenium.Keys;
import tests.TestDriverActions;
import org.openqa.selenium.JavascriptExecutor;
import tests.TestDriverActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

import static actions.WaitActions.waitForElementToBeRefreshedAndClickable;

public class SubmitAnEstimateServiceManager extends TestDriverActions {
    @FindBy(xpath = "//a[contains(text(),'Service Board')]")
    public WebElement label_ServiceBoard;


    @FindBy(xpath = "(//span[text()='Estimate'])[1]")
    public WebElement label_ScrollBar;

    @FindBy(xpath = "//div[contains(@id,':0:sSBQM:tArr::hscroller')]")
    public WebElement label_Icon;

    @FindBy(linkText = "//img[contains(@id,':0:ctbNewEstimate::icon')]/following-sibling::span")
    public WebElement label_Estimate;


    @FindBy(xpath = "//img[contains(@id,':0:ctbNewEstimate::icon')]")
    public WebElement icon_Plus;


    @FindBy(xpath = "//span[contains(.,'Yes')]")
    public WebElement btn_Yes;

    @FindBy(xpath = "//div[contains(@id,':0:phRE::content')]//div[6]//div[2]")
    public WebElement label_EstimateNumber;

    @FindBy(xpath = "//label[text()='Location:']//preceding-sibling::span")
    public WebElement label_RequiredLocation;

    @FindBy(xpath = "//label[text()='Location:']")
    public WebElement label_Locaion;

    @FindBy(xpath = "//a[contains(@id,'clFacName')]")
    public WebElement label_ThemeTwo;

    @FindBy(xpath = "//label[text()='Owner:']")
    public WebElement label_Owner;

    @FindBy(xpath = "//table[contains(@id,':rRE:0:ci1:')]")
    public WebElement label_OwnerName;

    @FindBy(xpath = "//label[text()='Unit #:']")
    public WebElement label_Unit;

    @FindBy(xpath = "(//div[contains(@id,':0:phRE::content')]//div[3]//div[2])[1]")
    public WebElement label_UnitValue;

    @FindBy(xpath = "//label[text()='Year:']")
    public WebElement label_Year;

    @FindBy(xpath = "(//div[contains(@id,':0:phRE::content')]//div[3]//div[2])[1]")
    public WebElement label_YearValue;

    @FindBy(xpath = "//label[text()='Make & Model:']")
    public WebElement label_MakeAndModel;

    @FindBy(xpath = "//div[contains(@id,':0:phRE::content')]//div[5]//div[2]")
    public WebElement label_MakeandModelValue;

    @FindBy(xpath = "//label[text()='Notes:']")
    public WebElement label_Notes;

    @FindBy(xpath = "//textarea[contains(@id,'itEstuniNotes::content')]")
    public WebElement label_NoteTextArea;

    @FindBy(xpath = "//label[text()='Date:']/preceding-sibling::span")
    public WebElement label_ReqiredDate;

    @FindBy(xpath = "//label[text()='Date:']")
    public WebElement label_Date;

    @FindBy(xpath = "//span[contains(@id,'idEstimateDateStz::content')]")
    public WebElement label_TODate;

    @FindBy(xpath = "(//label[text()='Internal Ref#:'])[1]")
    public WebElement label_InternalRef;

    @FindBy(xpath = "//input[contains(@id,'it12::content')]")
    public WebElement label_InternalRefTextArea;

    @FindBy(xpath = "(//label[text()='Internal Notes:'])[1]")
    public WebElement label_InternalNotes;

    @FindBy(xpath = "//textarea[contains(@id,':0:it1::content')]")
    public WebElement label_InternalNotesTextArea;

    @FindBy(xpath = "//a[contains(.,'(0)')]")
    public WebElement label_ZeroImg;

    @FindBy(xpath = "//img[contains(@id,':0:cbPEST::icon')]//following-sibling::span")
    public WebElement label_RepairEstimate;

    @FindBy(xpath = "//label[contains(.,'Lab')]")
    public WebElement label_Labour;

    @FindBy(xpath = "//table[contains(@id,'E:0:pgl9')]")
    public WebElement label_LabourValue;

    @FindBy(xpath = "//label[text()='Parts:']")
    public WebElement label_Parts;

    @FindBy(xpath = "//table[contains(@id,':0:pgl7')]")
    public WebElement label_PartsValue;

    @FindBy(xpath = "//label[text()='Shop Charges:']")
    public WebElement label_ShopCharges;

    @FindBy(xpath = "(//table[contains(@id,':0:pgl11')])[2]")
    public WebElement label_ShopChargesValue;

    @FindBy(xpath = "//label[text()='Surcharge:']")
    public WebElement label_Surcharges;

    @FindBy(xpath = "//table[contains(@id,':0:pgl17')]")
    public WebElement label_SuchargesValue;

    @FindBy(xpath = "//label[text()='Sub Total:']")
    public WebElement txt_SubTotal;

    @FindBy(xpath = "(//table[contains(@id,':0:pgl10')])[1]")
    public WebElement label_SubTotalValue;


    @FindBy(xpath = "//label[text()='Tax:']")
    public WebElement label_Tax;

    @FindBy(xpath = "//table[contains(@id,':0:pgl18')]")
    public WebElement label_TaxValue;

    @FindBy(xpath = "//label[text()='Total:']")
    public WebElement label_Total;
    @FindBy(xpath = "//table[contains(@id,':0:pgl21')]")
    public WebElement label_TotalValue;

    @FindBy(xpath = "//h2[contains(.,'Lab')]")
    public WebElement label_Labor;

    @FindBy(xpath = "//img[contains(@id,'ctbAddLabor::icon')]")
    public WebElement label_AddLabor;

    @FindBy(xpath = "(//span[text()='#'])[1]")
    public WebElement label_Hash;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement label_Description;

    @FindBy(xpath = "//span[text()='Estimated Hours']")
    public WebElement label_EstimatedHours;

    @FindBy(xpath = "//span[text()='Hourly Charge']")
    public WebElement label_HourlyCharge;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]")
    public WebElement label_TotalCharge;

    @FindBy(xpath = "//th[contains(@id,'tEstact:c11')]/div")
    public WebElement label_Element;

    @FindBy(xpath = "//th[contains(@id,'tEstact:cActDelete')]/div")
    public WebElement label_Delete;

    @FindBy(xpath = "//div[contains(@id,'tEstact::db')]")
    public WebElement label_NoDataDisplay;

    @FindBy(xpath = "//span[text()='Add Parts']")
    public WebElement label_AddParts;

    @FindBy(xpath = "//th[contains(@id,'tEstpar:c5')]/div")
    public WebElement label_HashTwo;

    @FindBy(xpath = "//span[text()='Part #']")
    public WebElement label_Part2;

    @FindBy(xpath = "//span[text()='Core']")
    public WebElement label_Core;

    @FindBy(xpath = "//span[text()='Estimated Quantity']")
    public WebElement label_EstimatedQuantity;

    @FindBy(xpath = "//span[text()='Unit Charge']")
    public WebElement label_UnitCharge;

    @FindBy(xpath = "//th[contains(@id,'ctEstparTotalChargeCurrency')]/div")
    public WebElement label_TotalChargeTwo;

    @FindBy(xpath = "//th[contains(@id,'tEstpar:c1')]/div")
    public WebElement label_IMG;


    @FindBy(xpath = "//th[contains(@id,'tEstpar:ctEstparDelete')]/div")
    public WebElement label_DeleteTwo;

    @FindBy(xpath = "//span[contains(.,'Draft')]")
    public WebElement label_Draft;


    @FindBy(xpath = "//textarea[contains(@id,'itEstuniNotes::content')]")
    public WebElement label_ExternalNotes;

    @FindBy(xpath = "//span[contains(.,'Add Lab')]")
    public WebElement btn_AddLabour;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public WebElement label_VMRS;


    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    public WebElement label_AcessoriesGroup;


    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    public WebElement label_AddVmrs;

    @FindBy(xpath = "(//td/span/span)[1]")
    public WebElement label_LaborItem;

    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    public WebElement label_Plusimg;


    @FindBy(xpath = "//textarea[contains(@id,'itComplaint::content')]")
    public WebElement label_EstimateNote;

    @FindBy(xpath = "//div[contains(@id,'ctbOk')]/a/span")
    public WebElement label_OkButton;

    @FindBy(xpath = "//a[contains(@id,'ciDAct1')]/img")
    public WebElement label_Deleteimg;

    @FindBy(xpath = "//a[contains(@id,'trashButtonActId:dc_cil1')]/img")
    public WebElement label_Trashimg;

    @FindBy(xpath = "//div[contains(@id,'tEstact::db')]")
    public WebElement label_NoDataToDisplay;

    @FindBy(xpath = "//div[contains(@id,'ctbAddParts')]/a/span")
    public WebElement label_AddPart;

    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    public WebElement label_PartNumber;

    @FindBy(xpath = "//li[contains(@id,':0:itSearchPartSelect::su0')]")
    public WebElement label_PartName;

    @FindBy(xpath = "//span[text()='Add Part']")
    public WebElement label_Part;

    @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]/a/span")
    public WebElement label_IssueButton;

    @FindBy(xpath = "//span[contains(.,'Close')]")
    public WebElement btn_close;

    @FindBy(xpath = "//td[contains(@id,'c2')]/span/span")
    public WebElement label_LaborCost;

    @FindBy(xpath = "//table[contains(@id,'pgl9')]/tbody/tr/td[2]")
    public WebElement label_LaborCostHeader;

    @FindBy(xpath = "//td[contains(@id,'ctEstparTotalChargeCurrency')]/span/span")
    public WebElement label_PartCost;

    @FindBy(xpath = "//table[contains(@id,'pgl7')]/tbody/tr/td[2]")
    public WebElement label_PartCostHeader;

    @FindBy(xpath = "//table[contains(@id,'pgl11')]/tbody/tr/td[2]")
    public WebElement label_SHopChargesHeader;

    @FindBy(xpath = "//div[3]/div/div[6]/table/tbody/tr/td[2]")
    public WebElement label_TotalHeader;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement btn_Submit;

    @FindBy(xpath = "(//span[text()='Estimate'])[2]")
    WebElement btn_estimate;

    @FindBy(xpath = "//span[text()='Location']")
    WebElement ele_Location;

    @FindBy(xpath = "(//table[contains(@id,'pgles01')]/tbody/tr/td[3])[1]")
    public WebElement label_PendingApprovals;


    @FindBy(xpath = "//a[text()='Sign Out']")
    public  WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    /**goto Service Borad*/

    public  void gotoServiceBoardScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Service Board");

        TestListener.saveScreenshotPNG(driver);
    }
    /**Scroll Horizontal */
    public void scrollElementTillView () throws InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",label_ScrollBar);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -400)");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Estimate*/
    public void clickOnEstimate () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_Plus);
        WebElementActions.getActions().clickUsingJS(icon_Plus);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**clickOnYes*/
    public void clickOnYes () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Yes);
        WebElementActions.getActions().clickUsingJS(btn_Yes);
        TestListener.saveScreenshotPNG(driver);
    }
    /**StoreEstimateNumber */
    public void storeEstimateNumber () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_EstimateNumber);
        Assert.assertTrue(label_EstimateNumber.isDisplayed());
    }
    /**verify RequiredLocation, Location ,Location Value */
    public void RequiredLocation () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredLocation);
        Assert.assertTrue(label_RequiredLocation.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Locaion);
        Assert.assertTrue(label_Locaion.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ThemeTwo);
        Assert.assertTrue(label_ThemeTwo.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Owner And OwnerName*/
    public void verifyOwner () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Owner);
        Assert.assertTrue(label_Owner.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_OwnerName);
        Assert.assertTrue(label_OwnerName.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Unit#,Unit Number */
    public void verifyUnitHash () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Unit);
        Assert.assertTrue(label_Unit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitValue);
        Assert.assertTrue(label_UnitValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Year ,Yearvalue*/
    public void verifyYear () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Year);
        Assert.assertTrue(label_Year.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_YearValue);
        Assert.assertTrue(label_YearValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Make&Model ,Make&Model value */
    public void verifyMakeandModel () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_MakeAndModel);
        Assert.assertTrue(label_MakeAndModel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_MakeandModelValue);
        Assert.assertTrue(label_MakeandModelValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Notes ,NoteTextArea*/
    public void verifyNotes () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Notes);
        Assert.assertTrue(label_Notes.isDisplayed());


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NoteTextArea);
        Assert.assertTrue(label_NoteTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify ReqiredDate, Date,Todays Date */
    public void verifyRequiredDate () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ReqiredDate);
        Assert.assertTrue(label_ReqiredDate.isDisplayed());


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Date);
        Assert.assertTrue(label_Date.isDisplayed());


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TODate);
        System.out.println("Todays date is :"+ReusableActions.todaysdate());
        Assert.assertTrue(label_TODate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify InternalRef#, Internal RefValue */
    public void verifyInternalRef () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_InternalRef);
        Assert.assertTrue(label_InternalRef.isDisplayed());


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_InternalRefTextArea);
        Assert.assertTrue(label_InternalRefTextArea.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /** verify InternalNotes ,InternalNotes TestArea */
    public void verifyInternalNotes () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_InternalNotes);
        Assert.assertTrue(label_InternalNotes.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_InternalNotesTextArea);
        Assert.assertTrue(label_InternalNotesTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify image (0)*/
    public void  verifyzero() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ZeroImg);
        Assert.assertTrue(label_ZeroImg.isDisplayed());
    }
    /**verify Repair Estimate */
    public void verifyRepairEstimate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RepairEstimate);
        Assert.assertTrue(label_RepairEstimate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Labor ,LaborValue */
    public void verifyLabor () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labour);
        Assert.assertTrue(label_Labour.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LabourValue);
        Assert.assertTrue(label_LabourValue.isDisplayed());
    }
    /** verify Part ,PartValue*/
    public void verifyPart () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Parts);
        Assert.assertTrue(label_Parts.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartsValue);
        Assert.assertTrue(label_PartsValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Shop Charges:, Shop ChargesValue */
    public void verifyShopCharges () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ShopCharges);
        Assert.assertTrue(label_ShopCharges.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ShopChargesValue);
        Assert.assertTrue(label_ShopChargesValue.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Surcharge: and SurchargeValue */
    public void verifySurcharge () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Surcharges);
        Assert.assertTrue(label_Surcharges.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SuchargesValue);
        Assert.assertTrue(label_SuchargesValue.isDisplayed());
    }
    /**verify SubTotal ,SubTotal Value */
    public void verifysubTotal () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SubTotal);
        Assert.assertTrue(txt_SubTotal.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SubTotalValue);
        Assert.assertTrue(label_SubTotalValue.isDisplayed());
    }
    /**verify Tax ,TaxValue */
    public void verifyTax () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Tax);
        Assert.assertTrue(label_Tax.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TaxValue);
        Assert.assertTrue(label_TaxValue.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Total ,TotalValue */
    public void  verifyTotal () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Total);
        Assert.assertTrue(label_Total.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalValue);
        Assert.assertTrue(label_TotalValue.isDisplayed());
    }
    /**verify Labour ,Add Labour */
    public void verifyLabour () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labor);
        Assert.assertTrue(label_Labor.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        Assert.assertTrue(label_AddLabor.isDisplayed());

    }
    /**verify # */
    public void verifyHash () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Hash);
        Assert.assertTrue(label_Hash.isDisplayed());
    }
    /**verify Description */
    public void verifyDescription () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());
    }
    /**verify EstimatedHours */
    public void verifyEstimatedHours () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_EstimatedHours);
        Assert.assertTrue(label_EstimatedHours.isDisplayed());
    }
    /**verify HourlyCharge */
    public void verifyHourlyCharge () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_HourlyCharge);
        Assert.assertTrue(label_HourlyCharge.isDisplayed());
    }
    /**verify Total Charge  */
    public void verifyTotalCharge () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalCharge);
        Assert.assertTrue(label_TotalCharge.isDisplayed());
    }
    /**verify Element,verify Delete */
    public void verifyElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Element);
        Assert.assertTrue(label_Element.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Delete);
        Assert.assertTrue(label_Delete.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**verify No Data Display */
    public void verifyNoDataDisplay () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NoDataDisplay);
        Assert.assertTrue(label_NoDataDisplay.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify Add Parts */
    public void verifyAddParts () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddParts);
        Assert.assertTrue(label_AddParts.isDisplayed());

    }
    /**verify #,Part#,Core */
    public void verifyHashTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_HashTwo);
        Assert.assertTrue(label_HashTwo.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Part2);
        Assert.assertTrue(label_Part2.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Core);
        Assert.assertTrue(label_Core.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**verify EstimatedQuantity */
    public void verifyEstimatedQuantity () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_EstimatedQuantity);
        Assert.assertTrue(label_EstimatedQuantity.isDisplayed());
    }
    /**verify Unit Charges */
    public void verifiyUnitCharges () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitCharge);
        Assert.assertTrue(label_UnitCharge.isDisplayed());

    }
    /**verify Total Charge  */
    public void verifyTotalChargeTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalChargeTwo);
        Assert.assertTrue(label_TotalChargeTwo.isDisplayed());

    }
    /**verify Delete Img */
    public void verifyDeleteImg () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_IMG);
        Assert.assertTrue(label_IMG.isDisplayed());
    }

    /**verify DeleteTwo*/
    public void verifyDeleteTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_DeleteTwo);
        Assert.assertTrue(label_DeleteTwo.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /** type External Notes  */
    public void ExternalNotes () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ExternalNotes);
        WebElementActions.getActions().inputText(label_ExternalNotes, appProp.getProperty("ExternalNotes"));
    }
    /**click On Add Labour*/
    public void clickonAddLabour () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AddLabour);
        WebElementActions.getActions().clickElement(btn_AddLabour);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**click on VMRS*/
    public void clickOnVMRS () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions().clickUsingJS(label_VMRS);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On AcessoriesGroup */
    public void clickonAcessoriesGroup() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AcessoriesGroup);
        WebElementActions.getActions().clickElement(label_AcessoriesGroup);
        TestListener.saveScreenshotPNG(driver);
    }
    public void clickOnAddVmrs () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddVmrs);
        WebElementActions.getActions().clickElement(label_AddVmrs);
        TestListener.saveScreenshotPNG(driver);
    }

    /**store LaborItem */
    public void verifyLaborItem () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborItem);
        Assert.assertTrue(label_LaborItem.isDisplayed());

    }
    /** click On Plus image  */
    public void clickOnPlusImg() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Plusimg);
        WebElementActions.getActions().clickElement(label_Plusimg);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**type Estimate Note */
    public void typeEstimateNote () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_EstimateNote);
        WebElementActions.getActions().inputText(label_EstimateNote,appProp.getProperty("ExternalNotes"));
        WaitActions.getWaits().loadingWait(loder);

    }
    /** click On OK Button */
    public void clickOnOkButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_OkButton);
        WebElementActions.getActions().clickElement(label_OkButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Delete Button */
    public void clickOnDeleteIcon () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Deleteimg);
        WebElementActions.getActions().clickElement(label_Deleteimg);
    }
    /**clickOnTrashButton */
    public void clickOnTrashButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Trashimg);
        WebElementActions.getActions().clickElement(label_Trashimg);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**verify No Data to Display */
    public void verifyNoDataToDisplay () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NoDataToDisplay);
        Assert.assertTrue(label_NoDataToDisplay.isDisplayed());
    }
    /**click On Add Parts */
    public void clickOnAddParts () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddPart);
        WebElementActions.getActions().clickElement(label_AddPart);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**type Part Number */
    public void typePartNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_PartNumber);
        WebElementActions.getActions().inputText(label_PartNumber, appProp.getProperty("PartNumber"));
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**click On part */
    public void  clickOnPart () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_PartName);
        WebElementActions.getActions().clickElement(label_PartName);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }
    /**clickOnIssueButton*/
    public void clickOnIssueButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_IssueButton);
        WebElementActions.getActions().clickUsingJS(label_IssueButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /**click On Close */
    public void clickOnClose () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions().clickElement(btn_close);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**store text*/
    public void  storeLaborCost () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborCost);
        Assert.assertTrue(label_LaborCost.isDisplayed());

    }
    /**store LaborCost Header*/
    public void storeLaborCostHeader () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborCostHeader);
        Assert.assertTrue(label_LaborCostHeader.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborCostHeader);
        Assert.assertTrue(label_LaborCostHeader.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**storePart text,Part cost Header */
    public void storeparttext () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartCost);
        Assert.assertTrue(label_PartCost.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartCostHeader);
        Assert.assertTrue(label_PartCostHeader.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartCostHeader);
        Assert.assertTrue(label_PartCostHeader.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**Store ShopCharges Header*/
    public void storeshopchargesheader () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SHopChargesHeader);
        Assert.assertTrue(label_SHopChargesHeader.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**Store Total Charges Header*/
    public void TotalChargesHeader () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalHeader);
        Assert.assertTrue(label_TotalHeader.isDisplayed());
        String originalWindow=driver.getWindowHandle () ;
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Submit */
    public void clickOnSubmit () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Submit);
        WebElementActions.getActions().clickElement(btn_Submit);
        String originalWindow=driver.getWindowHandle () ;
        TestListener.saveScreenshotPNG(driver);
    }
    /**verify Pending Approvals*/
    public void verifyPendingApprovals () throws InterruptedException {

        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -500)");
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        WebElementActions.getActions().moveOnTargetElement(btn_estimate);
        Thread.sleep(1000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PendingApprovals);
        Assert.assertTrue(label_PendingApprovals.isDisplayed());
        TestListener.saveScreenshotPNG(driver);


    }
    /** click On Sign Out*/
    public void  clikOnSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickUsingJS(btn_signOut);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click on USername Testarea*/
    public void clickUsername () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);
        TestListener.saveScreenshotPNG(driver);
    }

}
