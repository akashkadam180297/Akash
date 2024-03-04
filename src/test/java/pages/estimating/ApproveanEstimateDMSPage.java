package pages.estimating;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ApproveanEstimateDMSPage extends TestDriverActions {
    @FindBy(xpath = "(//span/a[contains(@id,':0:c')])[1]")
    public WebElement EstimationNumber;

    @FindBy(xpath = "//label[text()='Location:']/preceding-sibling::span")
    public WebElement label_RequiredLocation;

    @FindBy(xpath = "//label[text()='Location:']")
    public WebElement label_Location;

    @FindBy(xpath = "//a[contains(@id,'clFacName')]")
    public  WebElement label_LocationValue;

    @FindBy(xpath = "//label[text()='Unit #:']")
    public WebElement label_Unit;


    @FindBy(xpath = "(//label[text()='Unit #:']//following::div)[1]")
    public WebElement label_UnitNumber;

    @FindBy(xpath = "//label[text()='Year:']")
    public WebElement label_Year;

    @FindBy(xpath = "(//label[text()='Year:']//following::div)[1]")
    public WebElement label_YearValue;

    @FindBy(xpath = "//label[text()='Make & Model:']")
    public WebElement label_MakeAndModel;

    @FindBy(xpath = "//div[contains(@id,'pgl90')]//div[2]")
    public WebElement label_MakeAndModelValue;

    @FindBy(xpath = "//label[text()='Notes:']" )
    public WebElement label_Notes;

    @FindBy(xpath="//textarea[contains(@id,'::content')]")
    public WebElement label_NotesValue;

    @FindBy(xpath = "//label[text()='VIN:']")
    public WebElement label_VIN;

    @FindBy(xpath = "(//label[text()='VIN:']/following::div)[1]")
    public WebElement label_VINValue;

    @FindBy(xpath = "//label[text()='NBV:']")
    public WebElement label_NBV;

    @FindBy(xpath = "(//label[text()='NBV:']//following::div)[1]")
    public WebElement label_NBVValue;

    @FindBy(xpath = "//label[text()='Date:']")
    public  WebElement label_Date;

    @FindBy(xpath = "//span[contains(@id,'::content')]")
    public WebElement label_ToDate;


    @FindBy(xpath = "//label[text()='Vendor:']")
    public  WebElement label_vendor;

    @FindBy(xpath = "//label[text()='Vendor:']/parent::span/following::span[contains(@id,':dc_otCus2')]")
    public  WebElement label_vendorValue;

    @FindBy(xpath = "//label[contains(.,'Lab')]")
    public WebElement label_Labor;

    @FindBy(xpath = "(//label[text()='Labor:']/following::td//table//td[2])[1]")
    public WebElement txt_LaborValue;


    @FindBy(xpath = "//label[text()='Parts:']")
    public WebElement label_Parts;

    @FindBy(xpath = "(//label[text()='Parts:']//following::table//td[2])[1]")
    public WebElement txt_PartsValue;

    @FindBy(xpath = "//label[text()='Shop Charges:']")
    public WebElement txt_ShopCharges;

    @FindBy(xpath = "(//label[text()='Shop Charges:']//following::table//td[2])[1]")
    public  WebElement txt_shopChargesValue;


    @FindBy(xpath = "//label[text()='Surcharge:']")
    public WebElement txt_SurCharge;

    @FindBy(xpath = "//table[contains(@id,':pglSurcharge')]")
    public WebElement txt_SurchargeValue;

    @FindBy(xpath = "//label[text()='Sub Total:']")
    public WebElement label_SubTotal;


    @FindBy(xpath = "//table[contains(@id,':pgl50')]//tr")
    public WebElement txt_SubTotalValue;


    @FindBy(xpath = "//label[text()='Tax:']")
    public WebElement label_Tax;

    @FindBy(xpath = "//table[contains(@id,':pgl55')]")
    public WebElement label_TaxValue;


    @FindBy(xpath = "//label[text()='Total:']")
    public WebElement label_Total;


    @FindBy(xpath = "//table[contains(@id,':pgl56')]")
    public WebElement txt_TotalValue;

    @FindBy(xpath = "//a[contains(@id,':0:cl10')]//span[2]")
    public WebElement txt_EngineTitle;


    @FindBy(xpath = "//table[contains(@id,'pgl52')]/tbody/tr/td[2]")
    public WebElement txt_LaborCostHeader;


    @FindBy(xpath = "//table[contains(@id,'pgl53')]/tbody/tr/td[2]")
    public WebElement txt_PartCostHeader;

    @FindBy(xpath = "//table[contains(@id,'pgl54')]/tbody/tr/td[2]")
    public WebElement txt_ShopChargesCostHeader;


    @FindBy(xpath = "//table[contains(@id,':pgl56')]")
    public WebElement txt_TotalHeader;

    @FindBy(xpath = "//table[contains(@id,'pgl57')]/tbody/tr/td[2]")
    public WebElement txt_NBVBody;

    @FindBy(xpath ="(//div[contains(@id,'pgl88')]//following-sibling::div[3])[1]")
    public WebElement txt_NBVHeader;

    @FindBy(xpath = "//div[contains(@id,':cbPEST')]")
    public  WebElement btn_PrinterButton;

    @FindBy(xpath = "//img[contains(@id,':cil6::icon')]")
    public WebElement icon_Arrow;


    @FindBy(xpath = "//div[contains(@id,':0:cbToBeReviseD')]//a//span")
    public WebElement btn_ToBeRevised;


    @FindBy(xpath = "//label[text()='Please enter your reason']/preceding-sibling::span")
    public WebElement txt_RequiredPleaseEnterYourReason;

    @FindBy(xpath = "//label[text()='Please enter your reason']")
    public WebElement txt_PleaseEnterYourReason;

    @FindBy(xpath = "//textarea[contains(@id,':itNotes::content')]")
    public WebElement txt_TextArea;

    @FindBy(xpath = "//label[text()='Internal Notes']")
    public WebElement txt_InternalNotes;

    @FindBy(xpath = "//textarea[contains(@id,':itINotes::content')]")
    public WebElement txt_InternalNotesTextArea;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    public WebElement btn_SaveExit;


    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    public WebElement btn_Cancel;



    @FindBy(xpath = "//span[text()='Reject']")
    public WebElement btn_Reject;

    @FindBy(xpath = "//label[text()='Please enter your reason']/preceding-sibling::span")
    public WebElement label_RequiredPleaseEnterYourReason;

    @FindBy(xpath = "//label[text()='Please enter your reason']")
    public WebElement label_PleaseEnterReason;


    @FindBy(xpath = "//textarea[contains(@id,':itNotes::content')]")
    public WebElement text_TextArea;


    @FindBy(xpath = "//label[text ()='Internal Notes']")
    public WebElement label_InternalNotes;


    @FindBy(xpath = "//textarea[contains(@id,':itINotes::content')]")
    public WebElement text_InternalNotesTextArea;


    @FindBy(xpath = "//span[text()='Save / Exit']")
    public WebElement btn_SaveExitButton;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    public WebElement btn_CancelButton;

    @FindBy(xpath = "(//span[text()='Back to Approvals'])[1]")
    public WebElement txt_BackToApprovals;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement txt_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement txt_UserNameContent;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;







    /**go to complete RO Screen */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);
    }


    /**click FXG Estimate Number*/
    public void clickFXGEstimationNumber () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(EstimationNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(EstimationNumber);
        WebElementActions.getActions().clickElement(EstimationNumber);
        TestListener.saveScreenshotPNG(driver);


    }
    /**verify Required */
    public void verifyRequiredLocation () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_RequiredLocation);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredLocation);
        Assert.assertTrue(label_RequiredLocation.isDisplayed());

    }
    /** verify location */
    public void verifyLocation () throws InterruptedException {
    //    WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Location);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Location);
        Assert.assertTrue(label_Location.isDisplayed());

    }
    /** verify Location Value*/
    public void verifyLocationValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_LocationValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LocationValue);
        Assert.assertTrue(label_LocationValue.isDisplayed());

    }
    /**verify Unit*/
    public void verifyUnit () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Unit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Unit);
        Assert.assertTrue(label_Unit.isDisplayed());

    }
    /** verify Unit Number */
    public void verifyUnitNumber () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_UnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitNumber);
        Assert.assertTrue(label_UnitNumber.isDisplayed());
    }
    /** verify Year Text*/
    public void verifyYear () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Year);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Year);
        Assert.assertTrue(label_Year.isDisplayed());
    }
    /**verify Year Value*/
    public void verifyYearValue  () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_YearValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_YearValue);
        Assert.assertTrue(label_YearValue.isDisplayed());

    }
    /** verify MAke And Model Text*/
    public void verifyMakeAndModel () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_MakeAndModel);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_MakeAndModel) ;
        Assert.assertTrue(label_MakeAndModel.isDisplayed());

    }
    /** verify MAke And Model Value*/
    public  void verifyMakeAndModelValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_MakeAndModelValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_MakeAndModelValue);
        Assert.assertTrue(label_MakeAndModelValue.isDisplayed());

    }
    /** verify Notes*/
    public void verifyNotes () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Notes);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Notes);
        Assert.assertTrue(label_Notes.isDisplayed());
    }
    /** verify Notes Value*/
    public void verifyNotesValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_NotesValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NotesValue);
        Assert.assertTrue(label_NotesValue.isDisplayed());
    }
    /**verify VIN */
    public void verifyVIN () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VIN);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VIN);
        Assert.assertTrue(label_VIN.isDisplayed());
    }
    /**verify VIN value*/
    public void verifyVINValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VINValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VINValue);
        Assert.assertTrue(label_VINValue.isDisplayed());
    }
    /**verify NBV*/
    public void verifyNBV () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_NBV);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NBV);
        Assert.assertTrue(label_NBV.isDisplayed());
    }
    /**verify NBV value */
    public void verifyNBVValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_NBVValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NBVValue);
        Assert.assertTrue(label_NBVValue.isDisplayed());
    }
    /** verify Date Text */
    public void verifyDateText () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Date);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Date);
        Assert.assertTrue(label_Date.isDisplayed());
    }
    /** verify To Date */
    public void verifyToDate () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToDate);
        System.out.println("Todays date is :"+ ReusableActions.todaysdate());
        Assert.assertTrue(label_ToDate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /** verify Vendor Text */
    public void verifyVendor () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_vendor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_vendor);
        Assert.assertTrue(label_vendor.isDisplayed());

    }
    /** verify Vendor Value */
    public void verifyVendorValue () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(label_vendorValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_vendorValue);
        Assert.assertTrue(label_vendorValue.isDisplayed());
    }
    /** verify  Labor Text */
    public void  verifyLabor () throws InterruptedException {
        WebElementActions.getActions().moveOnTargetElement(txt_SurchargeValue);
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Labor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labor);
        Assert.assertTrue(label_Labor.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /** verify Labor Value */
    public  void verifyLaborValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_LaborValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_LaborValue);
        Assert.assertTrue(txt_LaborValue.isDisplayed());
    }
    /** verify Parts Text */
    public void verifyParts () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Parts);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Parts);
        Assert.assertTrue(label_Parts.isDisplayed());
    }
    /** verify PArts Value */
    public void verifyPartsValue () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PartsValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartsValue);
        Assert.assertTrue(txt_PartsValue.isDisplayed());
    }
    /** verify ShopCharge Text */
    public void verifyShopCharges () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_ShopCharges);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ShopCharges);
        Assert.assertTrue(txt_ShopCharges.isDisplayed());
    }
    /** verify ShopCharges value */
    public void verifyShopChargesValue () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_shopChargesValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_shopChargesValue);
        Assert.assertTrue(txt_shopChargesValue.isDisplayed());
    }
    /** verify SurCharge Text */
    public void verifySurCharge () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_SurCharge);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SurCharge);
        Assert.assertTrue(txt_SurCharge.isDisplayed());
    }
    /** verify SurCharge value*/
    public void verifySurchargeValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_SurchargeValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SurchargeValue) ;
        Assert.assertTrue(txt_SurchargeValue.isDisplayed());
    }
    /** verify SubTotal Text */
    public void verifySubTotal () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_SubTotal);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SubTotal);
        Assert.assertTrue(label_SubTotal.isDisplayed());
    }
    /** verify SubTotal Value */
    public void verifySubTotalValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_SubTotalValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SubTotalValue);
        Assert.assertTrue(txt_SubTotalValue.isDisplayed());
    }
    /** verify Tax  */
    public void verifyTax () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Tax);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Tax);
        Assert.assertTrue(label_Tax.isDisplayed());
    }
    /** verify Tax Value */
    public void verifyTaxValue () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_TaxValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TaxValue);
        Assert.assertTrue(label_TaxValue.isDisplayed());
    }
    /** verify Total  Text */
    public void verifyTotal () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Total);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Total);
        Assert.assertTrue(label_Total.isDisplayed());
    }
    /** verify Total value */
    public void verifyTotalValue () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_TotalValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_TotalValue);
        Assert.assertTrue(txt_TotalValue.isDisplayed());
    }
    /** verify Title Text */
    public  void verifyTitle () throws InterruptedException {
        //WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_EngineTitle);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_EngineTitle);
        Assert.assertTrue(txt_EngineTitle.isDisplayed());
    }
    /**verify Labor Cost Header */
    public void verifyLaborCostHeader () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_LaborCostHeader);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_LaborCostHeader);
        Assert.assertTrue(txt_LaborCostHeader.isDisplayed());
    }
    /** verify Part Cost Header */
    public void verifyPartCostHeader () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PartCostHeader);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartCostHeader);
        Assert.assertTrue(txt_PartCostHeader.isDisplayed());
    }
    /** verify Shop Charges Header */
    public void verifyShopChargesCostHeader () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_ShopChargesCostHeader);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ShopChargesCostHeader);
        Assert.assertTrue(txt_ShopChargesCostHeader.isDisplayed());
    }
    /** verify Total Header */
    public void verifyTotalHeader () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_TotalHeader);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_TotalHeader);
        Assert.assertTrue(txt_TotalHeader.isDisplayed());
    }
    /** verify NBV body */
    public void  verifyNBVBody () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_NBVBody);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_NBVBody);
        Assert.assertTrue(txt_NBVBody.isDisplayed());
    }
    /** verify NBV Header  */
    public void verifyNBVHeader () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_NBVHeader);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_NBVHeader);
        Assert.assertTrue(txt_NBVHeader.isDisplayed());
    }
    /** verify Printer Button */
    public void verifyPrinterButton () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_PrinterButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_PrinterButton);
        Assert.assertTrue(btn_PrinterButton.isDisplayed());
    }
    /**click On Top Arrow */
    public void clickOnArrow () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(icon_Arrow);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_Arrow);
        WebElementActions.getActions().clickElement(icon_Arrow);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify To Be Revised*/
    public void verifyToBeRevised () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_ToBeRevised);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_ToBeRevised);
        Assert.assertTrue(btn_ToBeRevised.isDisplayed());
    }
    /**click To Be Revised*/
    public void clickToBeRevised () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_ToBeRevised);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ToBeRevised);
        WebElementActions.getActions().clickElement(btn_ToBeRevised);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify Required Please Enter Your Reason  */
    public void verifyRequiredPleaseEnterYourReason () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_RequiredPleaseEnterYourReason);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_RequiredPleaseEnterYourReason);
        Assert.assertTrue(txt_RequiredPleaseEnterYourReason.isDisplayed());

    }
    /** verify Please Enter your Reason */
    public void verifyPleaseEnterYourReason() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PleaseEnterYourReason);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PleaseEnterYourReason);
        Assert.assertTrue(txt_PleaseEnterYourReason.isDisplayed());
    }
    /** verify Test Area */
    public void verifyTextArea () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_TextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_TextArea);
        Assert.assertTrue(txt_TextArea.isDisplayed());

    }
    /**verify Internal Notes Text */
    public void verifyInternalNotesText () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_InternalNotes);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_InternalNotes);
        Assert.assertTrue(txt_InternalNotes.isDisplayed());
    }
    /** verify Internal Notes TextArea */
    public void verifyInternalNotesTextArea () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_InternalNotesTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_InternalNotesTextArea);
        Assert.assertTrue(txt_InternalNotesTextArea.isDisplayed());
    }
    /** verify Save Exit */
    public void verifySaveExit () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_SaveExit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveExit);
        Assert.assertTrue(btn_SaveExit.isDisplayed());
    }
    /**click On Cancel */
    public void clickCancel () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(btn_Cancel);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Cancel);
        WebElementActions.getActions().clickElement(btn_Cancel);
    }
    /**click On Reject Button */
    public void clickOnRejectButton () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(btn_Reject);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Reject);
        WebElementActions.getActions().clickElement(btn_Reject);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify On Required Please Enter Your Reason*/
    public void verifyOnRequiredPleaseEnterYourReason () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_RequiredPleaseEnterYourReason);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredPleaseEnterYourReason);
        Assert.assertTrue(label_RequiredPleaseEnterYourReason.isDisplayed());
    }
    /** verify Please Enter Reason Text */
    public void  verifyPleaseEnterReasonText () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PleaseEnterReason);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PleaseEnterReason);
        Assert.assertTrue(label_PleaseEnterReason.isDisplayed());
    }
    /** verify On TextArea  Please Enter Reason */
    public void verifyOnTextAreaPleaseEnterReason () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(text_TextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(text_TextArea);
        Assert.assertTrue(text_TextArea.isDisplayed());
    }
    /** verify On Internal Notes Text */
    public void verifyOnInternalNotesText () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_InternalNotes);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_InternalNotes);
        Assert.assertTrue(label_InternalNotes.isDisplayed());
    }
    /** verify On Internal Notes TextArea */
    public void verifyOnInternalNotesTextArea () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(text_InternalNotesTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(text_InternalNotesTextArea);
        Assert.assertTrue(text_InternalNotesTextArea.isDisplayed());
    }
    /** verify Save And Exit Button */
    public void verifySaveExitButton () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_SaveExitButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveExitButton);
        Assert.assertTrue(btn_SaveExitButton.isDisplayed());
    }
    /** click On Cancel Button */
    public void clickOnCancelButton () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(btn_CancelButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_CancelButton);
        WebElementActions.getActions().clickElement(btn_CancelButton);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click on Back TO Approvals */
    public void clickOnBackToApprovals  () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(txt_BackToApprovals);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_BackToApprovals);
        WebElementActions.getActions().clickElement(txt_BackToApprovals);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On Sign Out */
    public void clickOnSignOut () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(txt_SignOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_SignOut);
        WebElementActions.getActions().clickElement(txt_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On UserName*/
    public void clickOnUserName () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(txt_UserNameContent);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_UserNameContent);
        WebElementActions.getActions().clickElement(txt_UserNameContent);
        TestListener.saveScreenshotPNG(driver);


    }

}
