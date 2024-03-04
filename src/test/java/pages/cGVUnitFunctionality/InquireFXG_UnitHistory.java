package pages.cGVUnitFunctionality;

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

public class InquireFXG_UnitHistory extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Complete RO'])[1]")
    public WebElement label_CompleteRo;

    @FindBy(xpath = "(//a[text()='FedEx Fleet History']/parent::Div)[1]")
    public WebElement label_FleetHistory;

    @FindBy(xpath = "//label[text()='Unit Number:']/preceding-sibling::span")
    public WebElement  label_RequiredUnitNumber;

    @FindBy(xpath = "//label[text()='Unit Number:']")
    public WebElement label_UnitNumber;

    @FindBy(xpath = "//a[text()='Select Unit']")
    public  WebElement label_SelectUnit;


    @FindBy(xpath = "//div[text()='Search Unit']")
    public WebElement txt_SearchUnit;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]")
    public WebElement text_SearchUnit;

    @FindBy(xpath = "//label[text()='Result:']")
    public WebElement txt_Result;

    @FindBy(xpath = "//td[text()='25']")
    public WebElement txt_Number;

    @FindBy(xpath = "//img[contains(@id,':0:sSEquQ:s6')]//following::td[text()='of']")
    public  WebElement txt_Of;

    @FindBy(xpath = "(//img[contains(@id,':r1:0:sSEquQ:s9')]//following::td)[1]")
    public WebElement txt_TotalCountNumber;

    @FindBy(xpath = "//td[text()='units']")
    public WebElement txt_Unit;

    @FindBy(xpath = "//div[contains(@id,':rFXGH:0:cbMoreWoact')]/a//span[contains(.,'Load')]")
    public WebElement btn_LoadMore;


    @FindBy(xpath = "(//span[text()='Owner'])[1]")
    public WebElement txt_Owner;

    @FindBy(xpath = "(//span[text()='Unit Number'])[1]")
    public WebElement txt_UnitNumber;

    @FindBy(xpath = "//table[contains(@id,'c:ctinterDesc::afrSI')]//following::Div/child::span[text()='Description']")
    public WebElement txt_Description;

    @FindBy(xpath = "//span[text()='License Plate']")
    public WebElement txt_LicensePlate;

    @FindBy(xpath = "(//span[text()='VIN'])[1]")
    public WebElement txt_Vin;

    @FindBy(xpath = "//span[text()='Domicile Location']")
    public WebElement txt_DomicileLocation;

    @FindBy(xpath = "//span[text()='Current Location']")
    public WebElement txt_CurrentLocation;

    @FindBy(xpath ="//span[text()='Priority']" )
    public WebElement txt_Priority;



    @FindBy(xpath = "//th[contains(@id,'tinterc:cSLEquI')]/div")
    public WebElement txt_SelectButtonHeader;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement btn_Select;

    @FindBy(xpath = "//span[contains(@id,':sSEquQ:sqSu:dc_it1')]//input[contains(@id,'::content')]")
    public  WebElement input_SearchTextArea;

    @FindBy(xpath = "//span[text()='Select']")
    public WebElement btn_SelectButton;

    @FindBy(xpath = "//td[contains(@id,'ph1::_afrTtxt')]/div/h2")
    public WebElement label_SpecifitionForValue;

    @FindBy(xpath = "(//label[text()='VIN #:']/following::div)[1]")
    public  WebElement label_VINValue;

    @FindBy(xpath = "//h1[contains(.,'History Search')]")
    public WebElement label_HistorySearch;

    @FindBy(xpath = "//label[text()='Unit Number:']/preceding-sibling::span")
    public WebElement label_Required;

    @FindBy(xpath = "//label[text()='Unit Number:']")
    public WebElement  label_SearchUnitNumber;

    @FindBy(xpath = "//a[contains(@id,'clUnit')]")
    public WebElement label_UnitNumberLabel;

    @FindBy(xpath = "//label[text()='From Date:']/preceding-sibling::span")
    public WebElement label_FromDateRequired;

    @FindBy(xpath = "//label[text()='From Date:']")
    public WebElement label_FromDate;

    @FindBy(xpath = "//tr[contains(@id,'id1')]//following-sibling::td/child::input")
    public WebElement label_FromDateTextArea;

    @FindBy(xpath = "//a[contains(@id,'id1::glyph')]")
    public WebElement label_ToPresent;

    @FindBy(xpath = "//label[text()='To Date:']/preceding-sibling::span")
    public WebElement label_ToDateRequired;

    @FindBy(xpath = "//label[text()='To Date:']")
    public WebElement label_ToDateDate;


    @FindBy(xpath = "//input[contains(@id,':id2::content')]")
    public WebElement label_ToDateTextArea;

    @FindBy(xpath = "//a[contains(@id,'id2::glyph')]")
    public WebElement label_ToDatePicker;

    @FindBy(xpath = "//tr[contains(@id,':rFXGH:0:it')]/td/label")
    public WebElement label_DescText;

    @FindBy(xpath = "//input[contains(@id,':it4::content')]")
    public WebElement txt_TextArea;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement btn_Search;

    @FindBy(xpath = "//label[text()='Description:']")
    public WebElement txt_DescriptionText;

    @FindBy(xpath = "(//label[text()='Description:']//following::div)[1]")
    public WebElement txt_DescriptionValue;

    @FindBy(xpath = "//label[text()='License #:']")
    public WebElement txt_License;

    @FindBy(xpath = "(//label[text()='License #:']/following::div)[1]")
    public WebElement txt_LicenseValue;

    @FindBy(xpath = "//label[text()='Year:']")
    public WebElement txt_Year;

    @FindBy(xpath = "(//label[text()='Year:']/following::div)[1]")
    public WebElement txt_YearValue;

    @FindBy(xpath = "//label[text()='Make:']")
    public WebElement txt_Make;

    @FindBy(xpath = "(//label[text()='Make:']/following::div)[1]")
    public  WebElement txt_MakeValue;


    @FindBy(xpath = "//label[text()='Model:']")
    public  WebElement txt_Model;

    @FindBy(xpath = "(//label[text()='Model:']/following::div)[1]")
    public  WebElement txt_ModelValue;

    @FindBy(xpath = "//label[text()='Equipment Type:']")
    public  WebElement txt_EquipmentType;

    @FindBy(xpath = "(//label[text()='Equipment Type:'])[1]")
    public WebElement txt_EquipmentTypeValue;

    @FindBy(xpath = "//label[text()='SRT Group:']")
    public WebElement txt_SRTGroup;

    @FindBy(xpath = "(//label[text()='SRT Group:']/following::div)[1]")
    public WebElement txt_SRTGroupValue;

    @FindBy(xpath = "//label[text()='In Service Date:']")
    public WebElement txt_ServiceDate;

    @FindBy(xpath = "(//label[text()='In Service Date:']/following::div)[1]")
    public WebElement txt_ServiceDateValue;

    @FindBy(xpath = "//label[text()='Netbook Value:']")
    public WebElement txt_NetBook;

    @FindBy(xpath = "(//label[text()='Netbook Value:']/following::div)[1]")
    public  WebElement txt_NetBookValue;

    @FindBy(xpath = "//label[text()='As of:']")
    public WebElement txt_AsOf;

    @FindBy(xpath = "//label[text()='Status:']")
    public  WebElement label_Status;

    @FindBy(xpath = "(//label[text()='Status:']/following::div)[1]")
    public WebElement label_StatusValue;

    @FindBy(xpath = "//span[text()='Red Tag']")
    public WebElement btn_RedTag;

    @FindBy(xpath = "//span[text()='Feature']")
    public WebElement txt_Feature;

    @FindBy(xpath = "//span[text()='Value']")
    public WebElement txt_Value;


    @FindBy(xpath = "//h1[contains(.,'Lab')]")
    public WebElement txt_Labor;

    @FindBy(xpath =" (//td[text()='0'])[1]")
    public WebElement txt_ZeroText;

    @FindBy(xpath = "//td[text()='of']")
    public WebElement txt_OfText;

    @FindBy(xpath = "//td[text()='of']/following::td[text()='0']")
    public WebElement txt_AfterOfZero;

    @FindBy(xpath = "//img[contains(@id,':rFXGH:0:s20')]/following::td[contains(.,'Lab')]")
    public WebElement txt_LaborLines;


    @FindBy(xpath = "//a[contains(@id,':clUnit')]")
    public WebElement num_UnitNumber;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitInterCorp')]/a/span")
    public WebElement Bt_SelectUnitButton;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement btn_SearchButton;

    @FindBy(xpath = "//span[text()='RO Date']")
    public WebElement txt_RoDate;

    @FindBy(xpath = "//span[text()='VMRS']")
    public WebElement txt_VMRS;

    @FindBy(xpath = "(//span[text()='Description'])[1]")
    public WebElement txt_DescriptionLabel;

    @FindBy(xpath = "//h1[text()='Repair Details']")
    public WebElement txt_RepairDetails;

    @FindBy(xpath = "//h1[contains(.,'Parts')]")
    public WebElement txt_Parts;

    @FindBy(xpath = "//span[text()='Part Number']")
    public WebElement txt_PartNumber;

    @FindBy(xpath = "//th[contains(@id,':partDescription')]//div/child::span")
    public WebElement Text_Description;

    @FindBy(xpath = "//span[text()='Qty']")
    public WebElement txt_Qty;

    @FindBy(xpath = "//span[text()='UOM']")
    public  WebElement txt_UOM;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement txt_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    /**go to complete RO Screen */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);

    }
    /**click FedExFleet History*/
    public void clickFedExFleetHistory () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_FleetHistory);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_FleetHistory);
        WebElementActions.getActions().clickElement(label_FleetHistory);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify Required Text */
    public void verifyRequiredText () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_RequiredUnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredUnitNumber);
        Assert.assertTrue(label_RequiredUnitNumber.isDisplayed());

    }
    /**verify Text Unit Number */
    public void verifyTextUnitNumber () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_UnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitNumber);
        Assert.assertTrue(label_UnitNumber.isDisplayed());

    }
    /** click On Select Unit */
    public void  clickOnSelectUnit  () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_SelectUnit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SelectUnit);
        WebElementActions.getActions().clickElement(label_SelectUnit);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /** verify Text Search Unit */
    public void verifyTextSearchUnit () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(text_SearchUnit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(text_SearchUnit);
        Assert.assertTrue(text_SearchUnit.isDisplayed());

    }
    /** verify Text Result */
    public void verifyTextResult () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Result);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Result);
        Assert.assertTrue(txt_Result.isDisplayed());

    }
    /** verify value */
    public void verifyValue () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Number);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Number);
        Assert.assertTrue(txt_Number.isDisplayed());

    }
    /** verify Text Of*/
    public void verifyTextOf () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Of);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Of);
        Assert.assertTrue(txt_Of.isDisplayed());

    }
    /** verify Units */
    public void  verifyUnits () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Unit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Unit);
        Assert.assertTrue(txt_Unit.isDisplayed());

    }
    /**verify Total Count Unit Number */
    public void  verifyTotalCountUnitNumber () throws InterruptedException {

        //WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_TotalCountNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_TotalCountNumber);
        Assert.assertTrue(txt_TotalCountNumber.isDisplayed());


    }

    /**verify Owner Text*/

    public void verifyOwner () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Owner);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Owner);
        Assert.assertTrue(txt_Owner.isDisplayed());

    }
    /** verify Unit Number */
    public void  verifyUnitNumber () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_UnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_UnitNumber);
        Assert.assertTrue(txt_UnitNumber.isDisplayed());

    }
    /** verify Description Text*/
    public void verifyDescription () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Description);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Description);
        Assert.assertTrue(txt_Description.isDisplayed());

    }
    /**verify License Plate Text*/
    public void verifyLicensePlate () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_LicensePlate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_LicensePlate);
        Assert.assertTrue(txt_LicensePlate.isDisplayed());

    }
    /** verify Vin Text*/
    public void verifyVin () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Vin);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Vin);
        Assert.assertTrue(txt_Vin.isDisplayed());

    }
    /** verify Domicile Location Text*/
    public void verifyDomicileLocation () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_DomicileLocation);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_DomicileLocation);
        Assert.assertTrue(txt_DomicileLocation.isDisplayed());

    }
    /** verify Current Location  Text */
    public void verifyCurrentLocation () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_CurrentLocation);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_CurrentLocation);
        Assert.assertTrue(txt_CurrentLocation.isDisplayed());

    }
    /** verify Priority */
    public void verifyPriority () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Priority);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Priority);
        Assert.assertTrue(txt_Priority.isDisplayed());

    }
    /** verify Select Button Header*/
    public void verifySelectButtonHeader () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_SelectButtonHeader);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SelectButtonHeader);
        Assert.assertTrue(txt_SelectButtonHeader.isDisplayed());

    }
    /** verify Select Button */
    public void verifySelectButton() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Select);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Select);
        Assert.assertTrue(btn_Select.isDisplayed());

    }
    /** enter Unit Number Text*/
    public void  enterUnitNumber  () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(input_SearchTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_SearchTextArea);
        WebElementActions.getActions().inputText(input_SearchTextArea,prop.getProperty("StoreNumber"));
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On Select Button */
    public void clickOnSelectButton () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_SelectButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SelectButton);
        WebElementActions.getActions().clickElement(btn_SelectButton);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify Sepecification For Unit Number*/
    public void  verifySepecificationForUnitNumber () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_SpecifitionForValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SpecifitionForValue);
        Assert.assertTrue(label_SpecifitionForValue.isDisplayed());

    }
    /** verify Text VIN */
    public void verifyTextVIN () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_VINValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VINValue);
        Assert.assertTrue(label_VINValue.isDisplayed());

    }
    /** verify History Search Text */
    public void verifyHistorySearch () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_HistorySearch);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_HistorySearch);
        Assert.assertTrue(label_HistorySearch.isDisplayed());

    }
    /** verify Required Unit Number */
    public void verifyRequiredUnitNumber () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Required);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Required);
        Assert.assertTrue(label_Required.isDisplayed());
    }
    /** verify Unit Number Label */
    public void verifyUnitNumberLabel() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_SearchUnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SearchUnitNumber);
        Assert.assertTrue(label_SearchUnitNumber.isDisplayed());

    }
    /** verify Unit Number Search History*/
    public void  verifyUnitNumberSearchHistory () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_UnitNumberLabel);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitNumberLabel);

        Assert.assertTrue(label_UnitNumberLabel.isDisplayed());


    }
    /** verify From Date Required */
    public void verifyFromDateRequired () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_FromDateRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_FromDateRequired);
        Assert.assertTrue(label_FromDateRequired.isDisplayed());

    }
    /** verify From Date*/
    public void verifyFromDate () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(label_FromDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_FromDate);
        Assert.assertTrue(label_FromDate.isDisplayed());

    }
    /** verify From Date Present */
    public void verifyFromDatePresent () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_FromDateTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_FromDateTextArea);
        Assert.assertTrue(label_FromDateTextArea.isDisplayed());


    }
    /** verify Date Picker */
    public void verifyDatePicker () throws InterruptedException {

        //WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToPresent);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToPresent);
        Assert.assertTrue(label_ToPresent.isDisplayed());

    }

    /** verify To Date Required */
    public void verifyTODateRequired () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToDateRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToDateRequired);
        Assert.assertTrue(label_ToDateRequired.isDisplayed());

    }
    /** verify To Date Text*/
    public void verifyToDate () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToDateDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToDateDate);
        Assert.assertTrue(label_ToDateDate.isDisplayed());

    }
    /** verify To Date TextArea*/
    public void verifyToDateTextArea () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToDateTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToDateTextArea);
        Assert.assertTrue(label_ToDateTextArea.isDisplayed());
    }
    /** verify ToDays Date */
    public void verifyToDaysDate () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToDatePicker);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToDatePicker);
        Assert.assertTrue(label_ToDatePicker.isDisplayed());
        TestListener.saveScreenshotPNG(driver);


    }
    /** verify Desc Text */
    public void verifyDescText () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_DescText);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_DescText);
        Assert.assertTrue(label_DescText.isDisplayed());

    }
    /** verify Text Area */
    public void verifyTextArea () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_TextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_TextArea);
        Assert.assertTrue(txt_TextArea.isDisplayed());
    }
    /** verify Search Button Text */
    public void verifySearchButton () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Search);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Search);
        Assert.assertTrue(btn_Search.isDisplayed());

    }
    /** verify Description Text */
    public void verifyDescriptionText () throws InterruptedException {

        // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_DescriptionText);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_DescriptionText);
        Assert.assertTrue(txt_DescriptionText.isDisplayed());

    }
    /** verify Description Contains Text */
    public void verifyDescriptionContains () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_DescriptionValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_DescriptionValue);
        Assert.assertTrue(txt_DescriptionValue.isDisplayed());

    }
    /** verify License Text */
    public  void verifyLicense () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_License);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_License);
        Assert.assertTrue(txt_License.isDisplayed());

    }
    /**verify License To */
    public void verifyLicenseValue () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_LicenseValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_LicenseValue);
        Assert.assertTrue(txt_LicenseValue.isDisplayed());

    }
    /** verify Year Text */
    public void verifyYearText () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Year);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Year);
        Assert.assertTrue(txt_Year.isDisplayed());

    }
    /**verify Year  TO */
    public void  verifyYearValue () throws InterruptedException {

        //WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_YearValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_YearValue);
        Assert.assertTrue(txt_YearValue.isDisplayed());

    }
    /** verify Text Make */
    public  void verifyTextMake () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Make);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Make);
        Assert.assertTrue(txt_Make.isDisplayed());
    }
    /** verify Make Name Present */
    public void verifyMakeNamePresent () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_MakeValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_MakeValue);
        Assert.assertTrue(txt_MakeValue.isDisplayed());
    }
    /**verify Text Model */
    public void verifyTextModel () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Model);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Model);
        Assert.assertTrue(txt_Model.isDisplayed());
    }
    /** verify  model Text Name */
    public void verifyModelTextName () throws InterruptedException {
        //WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_ModelValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ModelValue);
        Assert.assertTrue(txt_ModelValue.isDisplayed());

    }
    /** verify Text Equipment Type */
    public void verifyTextEquipmentType () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_EquipmentType);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_EquipmentType);
        Assert.assertTrue(txt_EquipmentType.isDisplayed());

    }
    /** verify Text Equipment Type To */
    public void verifyTextEquipmentTypeTo () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_EquipmentTypeValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_EquipmentTypeValue);

        Assert.assertTrue(txt_EquipmentTypeValue.isDisplayed());
    }
    /** verify SRT Group Text*/
    public void verifySRTGroup () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_SRTGroup);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SRTGroup);
        Assert.assertTrue(txt_SRTGroup.isDisplayed());

    }
    /** verify SRT Group To  */
    public void verifySRTGroupTo () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_SRTGroupValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_SRTGroupValue);
        Assert.assertTrue(txt_SRTGroupValue.isDisplayed());

    }
    /** verify In Service Date*/
    public void verifyInServiceDate () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_ServiceDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ServiceDate);
        Assert.assertTrue(txt_ServiceDate.isDisplayed());

    }
    /** verify Service Date To */
    public void verifyServiceDateTo () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_ServiceDateValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ServiceDateValue);
        Assert.assertTrue(txt_ServiceDateValue.isDisplayed());

    }
    /** verify NetBook Value */
    public void verifyNetBookValue () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_NetBook);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_NetBook);
        Assert.assertTrue(txt_NetBook.isDisplayed());
    }
    /** verify Net Book Value To */
    public void verifyNetBookValueTo () throws InterruptedException {

     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_NetBookValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_NetBookValue);
        Assert.assertTrue(txt_NetBookValue.isDisplayed());

    }
    /** verify Of Text  */
    public void verifyASOfText () throws InterruptedException {
        //WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_AsOf);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_AsOf);
        Assert.assertTrue(txt_AsOf.isDisplayed());
    }
    /** verify Status Text*/
    public void verifyStatusText () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Status);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Status);
        Assert.assertTrue(label_Status.isDisplayed());
    }
    /** verify Status To */
    public void verifyStatusTo () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_StatusValue);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_StatusValue);
        Assert.assertTrue(label_StatusValue.isDisplayed());

    }
    /** verify Red Tag Present */
    public void verifyRedTagPresent () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_RedTag);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_RedTag);
        Assert.assertTrue(btn_RedTag.isDisplayed());

    }
    /** verify Text Feature */
    public void verifyTextFeature () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Feature);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Feature);
        Assert.assertTrue(txt_Feature.isDisplayed());
    }
    /** verify Text Value */
    public void verifyTextValue () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Value);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Value);
        Assert.assertTrue(txt_Value.isDisplayed());
    }
    /** verify Text Labor */
    public void verifyTextLabor () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Labor);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Labor);
        Assert.assertTrue(txt_Labor.isDisplayed());
    }
    /** verify Zero Text*/
    public void verifyZeroText () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_ZeroText);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_ZeroText);
        Assert.assertTrue(txt_ZeroText.isDisplayed());

    }
    /** verify Of Text */
    public void verifyOfText () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_OfText);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_OfText);
        Assert.assertTrue(txt_OfText.isDisplayed());

    }
    /** verify Zero Text */
    public void  verifyTextZero () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_AfterOfZero);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_AfterOfZero);
        Assert.assertTrue(txt_AfterOfZero.isDisplayed());
    }
    /** verify Labor Lines*/
    public void verifyLaborLines () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_LaborLines);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_LaborLines);
        Assert.assertTrue(txt_LaborLines.isDisplayed());

    }
    /**click On Unit Hyperlink */
    public void clickOnUnitNumberHyperlink () throws InterruptedException {

       // WaitActions.getWaits().waitForElementTobeClickable(num_UnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(num_UnitNumber);
        WebElementActions.getActions().clickElement(num_UnitNumber);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** enter ContextArea */
    public void enterConTextArea () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(input_SearchTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
        WebElementActions.getActions().inputText(input_SearchTextArea,prop.getProperty("UnitNumber"));
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** select Button */
    public void SelectButton () throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(Bt_SelectUnitButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Bt_SelectUnitButton);
        WebElementActions.getActions().clickElement(Bt_SelectUnitButton);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click on Search Button Link */
    public void clickOnSearchButtonLink () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(btn_SearchButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SearchButton);
        WebElementActions.getActions().clickElement(btn_SearchButton);
        TestListener.saveScreenshotPNG(driver);

    }
    /** verify Description Part */
    public void verifyDescriptionPart () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(Text_Description);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Text_Description);
        Assert.assertTrue(Text_Description.isDisplayed());

    }
    /** verify Ro Date*/
    public void verifyRoDate () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_RoDate);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_RoDate);
        Assert.assertTrue(txt_RoDate.isDisplayed());

    }
    /** verify VMRS */
    public void verifyVMRS () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_VMRS);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_VMRS);
        Assert.assertTrue(txt_VMRS.isDisplayed());
    }
    /** verify Description Label*/
    public void verifyDescriptionLabel () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_DescriptionLabel);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_DescriptionLabel);
        Assert.assertTrue(txt_DescriptionLabel.isDisplayed());
    }
    /** verify Repair Details */
    public void verifyRepairDetails () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_RepairDetails);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_RepairDetails);
        Assert.assertTrue(txt_RepairDetails.isDisplayed());
    }
    /** verify Parts */
    public void verifyParts () throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Parts);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Parts);
        Assert.assertTrue(txt_Parts.isDisplayed());
    }
    /** verify Part Number */
    public void verifyPartNumber () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PartNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_PartNumber);
        Assert.assertTrue(txt_PartNumber.isDisplayed());
    }
    /** verify QTY */
    public void verifyQTY () throws InterruptedException {

        //WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_Qty);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_Qty);
        Assert.assertTrue(txt_Qty.isDisplayed());
    }
    /**verify UOM */
    public void verifyUOM () throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_UOM);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_UOM);
        Assert.assertTrue(txt_UOM.isDisplayed());

    }
    /**verify sign Out */
    public void verifySignOut () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(txt_SignOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_SignOut);
        WebElementActions.getActions().clickElement(txt_SignOut);
    }

}


