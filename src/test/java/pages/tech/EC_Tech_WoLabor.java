package pages.tech;

import actions.LoginActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.util.List;

public class EC_Tech_WoLabor extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txt_scanEmployeeBadge;

    @FindBy(xpath = "//span[text()='Go']")
    WebElement btn_Go;

    @FindBy(xpath = "//span[contains(text(),'More Units')]")
    WebElement tab_moreUnits;

    @FindBy(xpath = "//span[text()='Moises Olivas']")
    WebElement label_MoisesOlivas;

    @FindBy(xpath = "//span[contains(.,'Brian O')]")
    WebElement label_BrianOC;

    @FindBy(xpath = "//span[contains(text(),'Rusty Adam')]")
    WebElement label_RustyAdam;

    @FindBy(xpath = "//span[text()='Rusty-boy Adams']")
    WebElement label_Rusty_boyAdam;

    @FindBy(xpath = "//span[text()='Clear Screen']")
    WebElement btn_clearScreen;

    @FindBy(xpath = "//span[text()='End Shift']")
    WebElement btn_endShift;

    @FindBy(xpath = "//span[text()='Lunch / Break']")
    WebElement btn_Lunch;

    @FindBy(xpath = "//span[contains(text(),'Assigned Work')]")
    List<WebElement> btn_assignedWork;

    @FindBy(xpath = "//span[text()='Service Board']")
    WebElement btn_serviceBoard;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]")
    WebElement label_searchUnit;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]/following::input[1]")
    WebElement txt_searchUnit;

    @FindBy(xpath = "(//span[text()='Owner'])[1]")
    WebElement label_owner;

    @FindBy(xpath = "(//span[text()='Unit Number'])[1]")
    WebElement label_unitNumber;

    @FindBy(xpath = "(//span[text()='VIN / Description'])[1]")
    WebElement label_VIN_Description;

    @FindBy(xpath = "//span[text()='Serial Number']")
    WebElement label_serialNumber;

    @FindBy(xpath = "//span[text()='License Plate']")
    WebElement label_LicensePlate;

    @FindBy(xpath = "//span[text()='Type']")
    WebElement  label_type;

    @FindBy(xpath = "//span[text()='Current Location']")
    WebElement label_currentLocation;

    @FindBy(xpath = "//span[text()='Current Location']/following::th[1]/div")
    WebElement label_column;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement btn_select;

    @FindBy(xpath = "(//a[text()='Tech RO'])[2]/following::span[1]")
    WebElement label_technicianPortal;

    @FindBy(xpath = "//span[text()='Technician Portal']/following::td[7]")
    WebElement label_Welcome;

    @FindBy(xpath = "//span[text()='Moises Olivas']")
    WebElement label_moisesOlivas;

    @FindBy(xpath = "//label[text()='Owner:']")
    WebElement label_Owner2;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement label_unit2;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
    WebElement  hyperlink_unit;

    @FindBy(xpath = "//label[text()='Address:']")
    WebElement label_address;

    @FindBy(xpath = "//td[text()='18298 SLOVER AVE']")
    WebElement label_18298Slover;

    @FindBy(xpath = "//td[text()='Ashford OXF TN236TT']")
    public WebElement label_TN236TT;

    @FindBy(xpath = "//td[text()='BLOOMINGTON CA 92316']")
    WebElement label_Blooming;

    @FindBy(xpath = "//div[contains(@id,'pgl33')]")
    WebElement label_123KingStreet;


    @FindBy(xpath = "(//td[text()='Canada Goose Service'])[2]")
    WebElement Canade_Goose_Service;

    @FindBy(xpath = "(//a[contains(text(),'Summary')])[1]/following::a[1]")
    WebElement btn_labor;

    @FindBy(xpath = "(//a[text()='Unit History'])[1]")
    WebElement btn_UnitHistory;

    @FindBy(xpath = "//h1[text()='Work Required']")
    WebElement label_WorkRequired;

    @FindBy(xpath = "//span[text()='More Work ...']")
    WebElement btn_moreWork;

    @FindBy(xpath = "(//a[contains(text(),'Summary')]/following::a[1])[1]")
    public WebElement btn_Labour;

    @FindBy(xpath = "//span[contains(text(),'Show Labour Details')]/preceding::h1[1]")
    WebElement subtitle_Labor_ASAP;

    @FindBy(xpath = "//span[text()='Show Labour Details']")
    WebElement btn_showLaborDetails;

    @FindBy(xpath = "//span[text()='#']")
    WebElement hash_asap_Shop;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description;

    @FindBy(xpath = "(//span[text()='*'])[2]")
    WebElement asterisk_asap_Shop;

    @FindBy(xpath = "//span[text()='Estimated Hours']")
    WebElement label_estimatedHours;

    @FindBy(xpath = "//span[text()='Actual Hours']")
    WebElement label_ActualHours;

    @FindBy(xpath = "//span[text()='Start']")
    WebElement label_start;

    @FindBy(xpath = "//div[text()='No data to display']")
    WebElement  label_noDataToDisplay;

    @FindBy(xpath = "//td[text()='Total Hours:']")
    WebElement label_TotalHours;

    @FindBy(xpath = "//span[text()='0']")
    WebElement label_zaro;

    @FindBy(xpath = "(//label[text()='Search:'])[1]")
    WebElement label_search;

    @FindBy(xpath = "//span[text()='Date']")
    WebElement label_date;

    @FindBy(xpath = "//span[text()='VMRS']")
    WebElement label_VMRS;

    @FindBy(xpath = "//span[text()='P']")
    WebElement label_p;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description2;

    @FindBy(xpath = "//span[text()='Actual Hours']")
    WebElement label_actualHrs;

    @FindBy(xpath = "//span[text()='Charge Hours']")
    WebElement label_ChargeHours;
    @FindBy(xpath = "//span[text()='Copy']")
    WebElement label_copy;

    @FindBy(xpath = "(//h2[text()='Parts'])[2]")
    WebElement subtitle_parts;

    @FindBy(xpath = "(//span[text()='Part Number'])[2]")
    WebElement label_partNumber;

    @FindBy(xpath = "(//span[text()='Charge Quantity'])[2]")
    WebElement label_chargeQuantity;

    @FindBy(xpath = "(//span[text()='UOM'])[2]")
    WebElement label_UOM;

    @FindBy(xpath = "//div[text()='Labour Guide']")
    WebElement subtitle_LabourGuide;

    @FindBy(xpath = "//div[contains(text(),'Guide')]/following::label[2]")
    WebElement label_unit;

    @FindBy(xpath = "//div[contains(text(),'Guide')]/following::td[6]/span")
    WebElement label_unit_value;

    @FindBy(xpath = "(//a[contains(@id,'sdiVmrs::disAcr')])[1]")
    WebElement tab_VMRS;

    //(//a[contains(@id,'sdiROH::disAcr')])[1]
    @FindBy(xpath = "(//a[text()='Unit History'])[3]")
    WebElement tab_UnitHistory;

    @FindBy(xpath = "(//label[text()='Search:'])[1]")
    WebElement label_search2;

    @FindBy(xpath = "(//label[text()='Search:'])[1]/following::select[1]")
    WebElement txt_search;

    @FindBy(xpath = "//h2[text()='Labour']")
    WebElement label_labour;

    @FindBy(xpath = "//span[text()='Date']")
    WebElement label_date1;

    @FindBy(xpath = "//span[text()='VMRS']")
    WebElement label_VMRS1;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description3;

    @FindBy(xpath = "//span[text()='Charge Hours']")
    WebElement label_ChargeHr;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    WebElement label_add;

    @FindBy(xpath = "(//h2[text()='Parts'])[1]")
    WebElement label_parts;

    @FindBy(xpath = "(//span[text()='Part Number'])[1]")
    WebElement label_partNumber2;

    @FindBy(xpath = "(//span[text()='Charge Quantity'])[1]")
    WebElement label_chargeQty;

    @FindBy(xpath = "(//span[text()='UOM'])[1]")
    WebElement label_UOM1;

    @FindBy(xpath = "//h1[text()='Selected']")
    WebElement label_selected;

    @FindBy(xpath = "(//span[text()='Description'])[3]")
    WebElement label_description4;

    @FindBy(xpath = "(//span[text()='Qty'])[1]")
    WebElement label_qty;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[2]")
    WebElement label_estimateHrs;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[2]/following::div[1]")
    WebElement column_1;

    @FindBy(xpath = "(//span[text()='Estimated Hours'])[2]/following::div[2]")
    WebElement column_2;

    @FindBy(xpath = "(//div[text()='No data to display'])[4]")
    WebElement label_nodatadisplay;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']")
    WebElement subtitle_clickicondrilldown;

    @FindBy(xpath = "//label[text()='Search:']")
    WebElement label_search3;

    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement search_txt;

    @FindBy(xpath = "//input[contains(@id,'searchServiceId:dc_it1::content')]")
    WebElement search_EU;
    @FindBy(xpath = "//label[text()='Search:']/following::a[1]/img")
    WebElement img_aeroDynamic;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_1;
    @FindBy(xpath = "//div[text()='Labour Guide']/following::span[text()='Aerodynamic Devices'][1]")
    WebElement hyperlink_aeroDynamic;

    @FindBy(xpath = "//a[contains(@id,'ciBackToVmrsys')]//img")
    public WebElement backArrow_labour;

    @FindBy(xpath="//a[contains(@id,'ciBackToVmrsys')]/img")
    public WebElement hyperlink_Clutch;

    @FindBy(xpath = "//label[text()='Search:']")
    WebElement search;

    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txtfield_search;

    @FindBy(xpath = "//label[text()='Search:']/following::td[2]/img")
    WebElement search_icon;

    @FindBy(xpath = "(//span[text()='Description'])[2]")
    WebElement description5;

    @FindBy(xpath = "//label[text()='Search:']/preceding::span[2]")
    WebElement deviceAero;

    @FindBy(xpath = "//div[text()='Labour Guide']/following::span[text()='004 000']")
    WebElement label_aero004;

    @FindBy(xpath = "//label[text()='Search:']/following::a[3]/img")
    WebElement plus_icon;

    @FindBy(xpath = "(//span[text()='Description'])[1]")
    public WebElement label_DescriptionThree;

    @FindBy(xpath = "//textarea[contains(@id,'itdesc::content')]")
    WebElement txt_aeroDynamic;

    @FindBy(xpath = "//span[text()='1']")
    WebElement value1;

    @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
    WebElement field_complaint;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    WebElement btn_add;

    @FindBy(xpath = "//h1[text()='Work Required']/following::a[7]/img")
    WebElement cross_icon;

    @FindBy(xpath = "//span[text()='More Work ...']/following::a[1]/img")
    WebElement delete_icon;

    @FindBy(xpath = "(//span[text()='Aerodynamic Devices']/following::textarea[1])[1]")
    WebElement nodatadisplay_txtarea;

   @FindBy(xpath = "//h1[text()='Selected']/following::th[7]")
    WebElement label_selected_column;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement btn_LabourDetails_VMRS ;

    @FindBy(xpath = "//a[contains(@id,'ciWorkRequired')]/img")
    WebElement img_workRequired_AeroDynamic;

 //   @FindBy(xpath = "//h1[text()='Labour - ASAP SHOP']/following::img[7]")
    @FindBy(xpath = "//img[contains(@id,'ciDWoAct1::icon')]")
    List<WebElement> crossIcon_LabourAsapShop1;

   @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement but_cancle;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[4]/img")
    WebElement img_Accessories_Group;

    @FindBy(xpath = "//img[contains(@id,':cilvmrsys::icon')]")
    public WebElement img_Accessories_Groupone;

   @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]")
    WebElement plusIcon_LabourDetails;

    @FindBy(xpath = "//img[contains(@id,'ciAddVmrs::icon')]")
    public WebElement label_Plus;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement btn_add2;

    @FindBy(xpath = "//span[text()='Part Number']/preceding::div[1]")
    WebElement label_DeleteAerodynamicDevice;

    @FindBy(xpath = "//span[text()='Part Number']/following::span[1]")
    WebElement label_Description;

    @FindBy(xpath = "//span[text()='Part Number']")
    WebElement label_PartNumber;

    @FindBy(xpath="//span[contains(text(),'Yes, delete labour and parts')]")
    public List<WebElement> yes_delete_labour_and_parts;
//    public WebElement yes_delete_labour_and_parts;

    @FindBy(xpath = "//div[contains(text(),'Delete')]")
    WebElement label_DeleteAero;

    @FindBy(xpath = "//label[text()='Search Work In Progress:']/preceding::h1[1]")
    WebElement label_description_MoveTech;

    @FindBy(xpath = "(//span[text()='Description'])[2]")
    WebElement label_description1;

    @FindBy(xpath = "//span[text()='Hours']")
    WebElement label_hrs;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement btn_select1 ;

    @FindBy(xpath = "//div[contains(@id,'cbSelectWoact')]")
    WebElement select_btn;
    @FindBy(xpath = "//span[text()='Hours']/following::th")
    WebElement select_column;

    @FindBy(xpath = "//a[contains(@id,'ciWoactStartId')]/img")
    List<WebElement> clockIcon;

    @FindBy(xpath = "//h1[text()='Labour - ASAP SHOP']/following::td[5]")
    WebElement column_before_hash;

    @FindBy(xpath = "//span[text()='Start']/following::tr[1]/td[9]")
    WebElement row_one;

    @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
    List<WebElement> loder;


    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

//    @FindBy(xpath = "//img[contains(@id,'ciDWoAct1::icon')]")
//    List<WebElement> crossIcon_All ;

    @FindBy(xpath = "//a[contains(@id,'clPopupWoact')]")
    List<WebElement>  all_Labour;
    @FindBy(xpath ="//a[text()='Accessories Group']")
    public List<WebElement> accessories1accessories_All ;

    //@FindBy(xpath = "//a[contains(@id,'clPopupWoact')]/following::span[text()='Accessories Group']")
    @FindBy(xpath = "//a[contains(@id,'clPopupWoact')]")
    List<WebElement> accessories1;

    @FindBy(xpath = "//a[contains(@id,'ciDWoAct1')]")
    List<WebElement> crossIcon_All;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_AeroDynamic;

    @FindBy(xpath= "//span[contains(@id,'ot7')]")
    WebElement name_AeroDynamicDevice;

    @FindBy(xpath = "//td[text()='Total Hours:']")
    List<WebElement> totalHours;

    @FindBy(xpath = "//h2[contains(text(),'Top Used Services')]")
    WebElement subtitle_TopUsedServices;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_Accessories;

    @FindBy(xpath = "//a[contains(@id,'j_id2087508152_1d3400e3_1')]/img")
    WebElement img_Aerodynamic;
    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plus_sign;
    @FindBy(xpath = "//a[contains(@id,'ciWorkRequired')]/img")
    WebElement img_workRequired;

    @FindBy(xpath = "//h1[text()='Work Required']/following::div[10][contains(text(),'No data to display')]")
    List<WebElement> LabourRequired;

    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement search_text;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement FirstLabour_img;

    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plusIcon;

    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement btnAdd;

    /**
     * Enter TechBadge
     */
    public void enterTechBadge() throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_scanEmployeeBadge);
            WebElementActions.getActions().inputText(txt_scanEmployeeBadge,appProp.getProperty("TechBadge"));

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }

    /**
     * click on Go
     */
    public void clickOnGo() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Go);
        WebElementActions.getActions().clickElement(btn_Go);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on assigned work button
     */
    public void clickOnAssignedWork() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
        WebElementActions.getActions().clickElement(btn_assignedWork.get(0));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on MoreUnit tab
     */
    public void clickOnMoreUnit() throws InterruptedException {

            Thread.sleep(10000);
            if (btn_assignedWork.size() > 0) {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
                WebElementActions.getActions().clickElement(btn_assignedWork.get(0));

                WaitActions.getWaits().loadingWait(loder);
                TestListener.saveScreenshotPNG(driver);
            }
            Thread.sleep(2000);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_moreUnits);
            WebElementActions.getActions().clickElement(tab_moreUnits);

            WaitActions.getWaits().loadingWait(loder);

            TestListener.saveScreenshotPNG(driver);

        }

    /**
     * Verify element present in header
     */
    public void verifyHeaderElement() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_MoisesOlivas);
            Assert.assertTrue(label_MoisesOlivas.isDisplayed());
        }else
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_BrianOC);
            Assert.assertTrue(label_BrianOC.isDisplayed());
        }
    /*    else
            if(LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Rusty_boyAdam);
            Assert.assertTrue(label_Rusty_boyAdam.isDisplayed());
        }  */
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_clearScreen);
        Assert.assertTrue(btn_clearScreen.isDisplayed());
        Assert.assertTrue(btn_endShift.isDisplayed());
        Assert.assertTrue(btn_Lunch.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_searchUnit);
        Assert.assertTrue(label_searchUnit.isDisplayed());
        Assert.assertTrue(txt_searchUnit.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify Element present in table
     */
    public void verifyTableElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_owner);
        Assert.assertTrue(label_owner.isDisplayed());
        Assert.assertTrue(label_unitNumber.isDisplayed());
        Assert.assertTrue(label_VIN_Description.isDisplayed());
        Assert.assertTrue(label_serialNumber.isDisplayed());
        Assert.assertTrue(label_LicensePlate.isDisplayed());
        Assert.assertTrue(label_type.isDisplayed());
        Assert.assertTrue(label_currentLocation.isDisplayed());
        Assert.assertTrue(label_column.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Enter Unit Number
     */
    public void enterUnitNumber() throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_searchUnit);
            WebElementActions.getActions().inputText(txt_searchUnit, appProp.getProperty("UnitNumber"));

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }

    /**
     * Click on select button
     */
    public void clickOnSelectBtn() throws InterruptedException {

 //       if (LoginActions.environmentName.contains("QA")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions().clickElement(btn_select);
 /*   }
    if (LoginActions.environmentName.contains("EU")) {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select1);
        WebElementActions.getActions().clickElement(btn_select1);
    }  */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify Technician Portal Page Element
     */
    public void verifyTecnicianPortalPage() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_technicianPortal);
        Assert.assertTrue(label_technicianPortal.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Welcome);
        Assert.assertTrue(label_Welcome.isDisplayed());
        if (LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_moisesOlivas);
            Assert.assertTrue(label_moisesOlivas.isDisplayed());
        }else
        if (LoginActions.environmentName.contains("EU")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_BrianOC);
            Assert.assertTrue(label_BrianOC.isDisplayed());
        }else
        if (LoginActions.environmentName.contains("NA")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RustyAdam);
            Assert.assertTrue(label_RustyAdam.isDisplayed());
        }
        else
        if(LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Rusty_boyAdam);
            Assert.assertTrue(label_Rusty_boyAdam.isDisplayed());
        }
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Owner2);
        Assert.assertTrue(label_Owner2.isDisplayed());
        Assert.assertTrue(label_unit2.isDisplayed());
        Assert.assertTrue(hyperlink_unit.isDisplayed());
        Assert.assertTrue(label_address.isDisplayed());
        if(LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_18298Slover);
            Assert.assertTrue(label_18298Slover.isDisplayed());
            Assert.assertTrue(label_Blooming.isDisplayed());
        }else
        if(LoginActions.environmentName.contains("EU")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TN236TT);
            Assert.assertTrue(label_TN236TT.isDisplayed());
        }else
        if(LoginActions.environmentName.contains("NA")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_123KingStreet);
            Assert.assertTrue(label_123KingStreet.isDisplayed());
        }
        else
        if(LoginActions.environmentName.contains("EC")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Canade_Goose_Service);
            Assert.assertTrue(Canade_Goose_Service.isDisplayed());
        }

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify element of Labour Tab
     */
    public void LabourtabElement() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
            || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_labor);
            Assert.assertTrue(btn_labor.isDisplayed());
            Assert.assertTrue(label_WorkRequired.isDisplayed());
            Assert.assertTrue(btn_moreWork.isDisplayed());
            Assert.assertTrue(btn_Labour.isDisplayed());
            Assert.assertTrue(btn_UnitHistory.isDisplayed());
            Assert.assertTrue(subtitle_Labor_ASAP.isDisplayed());
            Assert.assertTrue(btn_showLaborDetails.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * Verify Labour - Asap shop element
     */
    public void labourAsapShopElement() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA") ||
        LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hash_asap_Shop);
            Assert.assertTrue(hash_asap_Shop.isDisplayed());
            Assert.assertTrue(label_description.isDisplayed());
            Assert.assertTrue(asterisk_asap_Shop.isDisplayed());
            Assert.assertTrue(label_estimatedHours.isDisplayed());
            Assert.assertTrue(label_ActualHours.isDisplayed());
            Assert.assertTrue(label_start.isDisplayed());
            Assert.assertTrue(label_TotalHours.isDisplayed());

            TestListener.saveScreenshotPNG(driver);

        }
    }
    /**
     * click on Unit History tab
     */
    public void clickOnUnitHistorytab() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_UnitHistory);
        WebElementActions.getActions().clickElement(btn_UnitHistory);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify Unit Number tab Element
     */
    public void verifyUnitNumberTabElement() throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_search);
        Assert.assertTrue(label_search.isDisplayed());
        Assert.assertTrue(label_date.isDisplayed());
        Assert.assertTrue(label_VMRS.isDisplayed());
        Assert.assertTrue(label_p.isDisplayed());
        Assert.assertTrue(label_description2.isDisplayed());
        if (LoginActions.environmentName.contains("NA")) {
            Assert.assertTrue(label_actualHrs.isDisplayed());
        }
        if (LoginActions.environmentName.contains("EC")){
            Assert.assertTrue(label_ChargeHours.isDisplayed());
        }
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_copy);
        Assert.assertTrue(label_copy.isDisplayed());
        Assert.assertTrue(subtitle_parts.isDisplayed());
        Assert.assertTrue(label_partNumber.isDisplayed());
        Assert.assertTrue(label_chargeQuantity.isDisplayed());
        Assert.assertTrue(label_UOM.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on Labour tab
     */
    public void clickOnLabourTab() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_labor);
        WebElementActions.getActions().clickElement(btn_labor);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Extra Step
     */
    public void addWorkRequired() throws InterruptedException {
        Thread.sleep(15000);
        if(LabourRequired.size()>0){

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_moreWork);
            WebElementActions.getActions().clickElement(btn_moreWork);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_VMRS);
            WebElementActions.getActions().clickElement(tab_VMRS);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_text);
            WebElementActions.getActions().inputText(search_text,appProp.getProperty("FirstLaborItem"));

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FirstLabour_img);
            WebElementActions.getActions().clickElement(FirstLabour_img);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plusIcon);
            WebElementActions.getActions().clickElement(plusIcon);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btnAdd);
            WebElementActions.getActions().clickElement(btnAdd);

        }
    }
    /**
     * Extra Step
     */
    public void clickWorkRequired() throws InterruptedException {
        Thread.sleep(5000);
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA") ||
//                LoginActions.environmentName.contains("EC")) {
 /*       if (totalHours.size() > 0) {
            Thread.sleep(3000);
            if (LoginActions.environmentName.contains("EU")) {
                WebElementActions.getActions().moveOnTargetElement(subtitle_TopUsedServices);

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_Accessories);
                WebElementActions.getActions().clickElement(img_Accessories);

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_sign);
                WebElementActions.getActions().clickElement(plus_sign);
            } else {   */
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_workRequired);
                WebElementActions.getActions().clickElement(img_workRequired);
            }
 //       }
 //       }
 //   }
    /**
     * click on MoreWork tab
     */
    public void clickOnMoreWorkTab() throws InterruptedException {

//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                ||LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_moreWork);
            WebElementActions.getActions().clickElement(btn_moreWork);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * verify more work tab element
     */
    public void verifyMoreWorktabElement() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                ||LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_unit);
            Assert.assertTrue(label_unit.isDisplayed());
            Assert.assertTrue(label_unit_value.isDisplayed());
            Assert.assertTrue(tab_VMRS.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on VMRS tab
     */
    public void clickOnVMRStab() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//            || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_VMRS);
            WebElementActions.getActions().clickElement(tab_VMRS);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on Unit History tab
     */
    public void clickOnUnitHistoryTab() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_UnitHistory);
            WebElementActions.getActions().clickElement(tab_UnitHistory);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * verify Unit History tab element
     */
    public void verifyUnitHistoryTabElement() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_search2);
            Assert.assertTrue(label_search2.isDisplayed());
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_search);
            Assert.assertTrue(txt_search.isDisplayed());
            Assert.assertTrue(label_labour.isDisplayed());
            Assert.assertTrue(label_date1.isDisplayed());
            Assert.assertTrue(label_VMRS1.isDisplayed());
            Assert.assertTrue(label_description3.isDisplayed());
//            Assert.assertTrue(label_ChargeHr.isDisplayed());
            Assert.assertTrue(label_add.isDisplayed());
            Assert.assertTrue(label_parts.isDisplayed());
            Assert.assertTrue(label_partNumber2.isDisplayed());
            Assert.assertTrue(label_chargeQty.isDisplayed());
            Assert.assertTrue(label_UOM1.isDisplayed());
            Assert.assertTrue(label_selected.isDisplayed());
            Assert.assertTrue(label_description4.isDisplayed());
            Assert.assertTrue(label_qty.isDisplayed());
            Assert.assertTrue(label_estimateHrs.isDisplayed());
            Assert.assertTrue(column_1.isDisplayed());
            Assert.assertTrue(column_2.isDisplayed());
// Assert.assertTrue(label_nodatadisplay.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click on (Labour Details Page) VMRS tab
     */
    public void clickOnLabourDetailsVMRStab() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_LabourDetails_VMRS);
            WebElementActions.getActions().clickElement(btn_LabourDetails_VMRS);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * verify vmrs Element
     */
    public void verifyElementofVMRS() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//            || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(subtitle_clickicondrilldown);
            Assert.assertTrue(subtitle_clickicondrilldown.isDisplayed());
            Assert.assertTrue(label_search3.isDisplayed());
            Assert.assertTrue(search_txt.isDisplayed());
            TestListener.saveScreenshotPNG(driver);

        }
 //   }
    /**
     * Enter Aerodynamic Devices    img_AeroDynamic
     */
    public void enterAreodynamicDevices() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EC")
//        || LoginActions.environmentName.contains("NA") ) {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_txt);
            WebElementActions.getActions().inputText(search_txt, appProp.getProperty("FirstLaborItem"));

 /*       }

            if(LoginActions.environmentName.contains("EU")){
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_EU);
                WebElementActions.getActions().inputText(search_EU,appProp.getProperty("FirstLaborItem"));

            }  */
        WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }

    /**
     * click on AeroDynamic devices Img
     */
    public void clickOnAeroDynamicDevicesImg() throws InterruptedException {

//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//            || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_aeroDynamic);
            WebElementActions.getActions().clickElement(img_aeroDynamic);
 /*       }
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_1);
            WebElementActions.getActions().clickElement(img_1);
        }  */
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify Aerodunamic device element
     */
    public void verifyAeroDynamicDeviceElement() throws InterruptedException {
        if(LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_Clutch);
            Assert.assertTrue(hyperlink_Clutch.isDisplayed());
            Assert.assertTrue(search.isDisplayed());
            Assert.assertTrue(txtfield_search.isDisplayed());
            Assert.assertTrue(search_icon.isDisplayed());
            Assert.assertTrue(description5.isDisplayed());
            WaitActions.getWaits().WaitUntilWebElementIsVisible(deviceAero);
            Assert.assertTrue(deviceAero.isDisplayed());
            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_aero004);
            Assert.assertTrue(label_aero004.isDisplayed());
            Assert.assertTrue(plus_icon.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
        }
/*        if(LoginActions.environmentName.contains("EU")){
            Assert.assertTrue(label_DescriptionThree.isDisplayed());
            Assert.assertTrue(plus_icon.isDisplayed());*/
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on hyperlink AeroDynamic Devices
     */
    public void clickOnAeroDynamicsDeviceshyperlink() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA") ||
//           LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_Clutch);
            WebElementActions.getActions().clickElement(hyperlink_Clutch);
/*        }
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(backArrow_labour);
            WebElementActions.getActions().clickElement(backArrow_labour);
        }   */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify search text field
     */
    public void verifySearchTextField() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txtfield_search);
        Assert.assertTrue(txtfield_search.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on plus button
     */
    public void clickOnPlusButton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_icon);
        WebElementActions.getActions().clickElement(plus_icon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify Aerodynamic Devices - Selected element
     */
    public void verifyAeroDynamicSelectedElement() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_selected);
            Assert.assertTrue(label_selected.isDisplayed());
            Assert.assertTrue(label_selected_column.isDisplayed());
            Assert.assertTrue(label_description4.isDisplayed());
            Assert.assertTrue(label_qty.isDisplayed());
            Assert.assertTrue(label_estimateHrs.isDisplayed());
// Assert.assertTrue( value1.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * Enter This is the complaint text in textarea
     */
    public void enterText() throws InterruptedException {

        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA") ) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(field_complaint);
            WebElementActions.getActions().inputText(field_complaint, appProp.getProperty("enterText"));

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * verify Labour Guide Page Element cancle , Add , This is the Complaint
     */
    public void verifyCancleAddComplaintText() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(field_complaint);
        Assert.assertTrue(field_complaint.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_add.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add button
     */
    public void clickOnAddButton() throws InterruptedException {

//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add);
            WebElementActions.getActions().clickElement(btn_add);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on cross icon
     */
    public void clickOnCrossIcon() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//            ||  LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cross_icon);
            WebElementActions.getActions().clickElement(cross_icon);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on Delete icon
     */
    public void clickOnDeleteIcon() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(delete_icon);
            WebElementActions.getActions().clickElement(delete_icon);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * verify Add Element
     */
    public void verifyAddElement() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_add);
            Assert.assertTrue(btn_add.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * click on img Aerodynamic
     */
    public void clickOnWorkRequired() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_workRequired_AeroDynamic);
            WebElementActions.getActions().clickElement(img_workRequired_AeroDynamic);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * verify Element AeroDynamic Devices
     */
    public void verifyAerodynamicDevices004() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_Clutch);
            Assert.assertTrue(hyperlink_Clutch.isDisplayed());
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(deviceAero);
            Assert.assertTrue(deviceAero.isDisplayed());
            // Assert.assertTrue(label_aero004.isDisplayed());
            Assert.assertTrue(plus_icon.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * verify Aerodynamic Devices Element
     */
    public void verifyAerodynamicDeviceHyperlink() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_Clutch);
            Assert.assertTrue(hyperlink_Clutch.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
//    }
    /**
     * verify Aerodynamic Devices textarea Element
     */
    public void verifyAerodynamicDeviceTextarea() throws InterruptedException {
//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_aeroDynamic);
            Assert.assertTrue(txt_aeroDynamic.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
//    }
/**
 * verify 'X' icon
 */
/* public void verifyXicon() throws InterruptedException {
// Thread.sleep(2000);

// ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

//row_one
// WebElementActions.getActions().moveOnTargetElement(row_one);

// Thread.sleep(3000);
// WaitActions.getWaits().WaitUntilWebElementIsVisible(crossIcon_LabourAsapShop);
WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(crossIcon_LabourAsapShop.get(0));
Assert.assertTrue(crossIcon_LabourAsapShop.size()>0);

TestListener.saveScreenshotPNG(driver);
} */
    /**
     * click on cross icon
     */
    public void clickOnCrossIconAsapShop() throws InterruptedException {

//        if (LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("EU")
//                || LoginActions.environmentName.contains("NA")) {

            //      WebElementActions.getActions().moveOnTargetElement(row_one);

// WaitActions.getWaits().waitForElementTobeClickable(crossIcon_LabourAsapShop);
            Thread.sleep(2000);
            //       WaitActions.getWaits().scrollElementTillView(crossIcon_All.get(0));
            //       WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(0));
            //       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(55));
            //      Thread.sleep(2000);  //crossIcon_All
            System.out.println("Size is" + crossIcon_All.size());
//        WebElementActions.getActions().clickElement(crossIcon_All.get(55));

            Thread.sleep(10000);
            //      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(crossIcon_All.get(0));


            if (crossIcon_All.size() > 12) {
                WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(0));

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(0));
                //           Thread.sleep(5000);
                WebElementActions.getActions().clickElement(crossIcon_All.get(0));

                Thread.sleep(3000);

                if(yes_delete_labour_and_parts.size()>0)
                {
                    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(yes_delete_labour_and_parts.get(0));
                    WebElementActions.getActions().clickElement(yes_delete_labour_and_parts.get(0));

                    WaitActions.getWaits().loadingWait(loder);
                }

//                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(yes_delete_labour_and_parts);
//                WebElementActions.getActions().clickElement(yes_delete_labour_and_parts);

            } else {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crossIcon_All.get(0));
                WebElementActions.getActions().clickElement(crossIcon_All.get(0));

                Thread.sleep(3000);

                if(yes_delete_labour_and_parts.size() > 0)
                {
                    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(yes_delete_labour_and_parts.get(0));
                    WebElementActions.getActions().clickElement(yes_delete_labour_and_parts.get(0));

                    WaitActions.getWaits().loadingWait(loder);
                }

//                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(yes_delete_labour_and_parts);
//                WebElementActions.getActions().clickElement(yes_delete_labour_and_parts);

            }
  //      }

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on cancle button
     */
    public void clickOnCancleButton() throws InterruptedException {

//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(but_cancle);
            WebElementActions.getActions().clickElement(but_cancle);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
 //   }
/**
 * verify Accessories group
 */
/* public void verifyAccessoriesGroup()
{
WaitActions.getWaits().WaitUntilWebElementIsVisible();
Assert.assertTrue(.isDisplayed());
} */
    /**
     * click on Accessories Group Img
     */
    public void clickOnAccessoriesGroupImg() throws InterruptedException {


//        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_Accessories_Group);
            WebElementActions.getActions().clickElement(img_Accessories_Group);
 /*       }
        if(LoginActions.environmentName.contains("EU")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_Accessories_Groupone);
            WebElementActions.getActions().clickElement(img_Accessories_Groupone);
        }   */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on plus icon Labour Details
     */
    public void clickOnPlusIcon_LabourDetails() throws InterruptedException {
//        if(LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
//                || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plusIcon_LabourDetails);
            WebElementActions.getActions().clickElement(plusIcon_LabourDetails);
 /*       }
        if(LoginActions.environmentName.contains("EU")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Plus);
            WebElementActions.getActions().clickElement(label_Plus);
        }  */

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add button
     */
    public void clickOnAddButton2() throws InterruptedException {
 //       if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
 //               || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add2);
            WebElementActions.getActions().clickElement(btn_add2);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
  //  }
    /**
     * verify clock icon
     */
    public void verifyClockIcon() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(clockIcon.get(0));
        Assert.assertTrue(clockIcon.size()>=0);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on select button     select_btn
     */
    public void clickOnSelectButton2() throws InterruptedException {
  /*      if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select1);
            WebElementActions.getActions().clickElement(btn_select1);
        }

        if (LoginActions.environmentName.contains("EU")) {   */
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_btn);
            WebElementActions.getActions().clickElement(select_btn);
  //      }


            WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on cross icon
     */
    public void clickOnCrossIconAsapShop2() throws InterruptedException {

// WebElementActions.getActions().moveOnTargetElement(row_one);
 //       if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("EU")) {
            Thread.sleep(10000);

            WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(0));
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(accessories1.get(0));
            String assessories = accessories1.get(0).getAttribute("title");

            Thread.sleep(3000);

            System.out.println("Size of labour is :" + all_Labour.size());

            for (int i = 0; i < all_Labour.size(); i++) {
                System.out.println(all_Labour.get(i).getAttribute("title"));
                Thread.sleep(2000);
                if (all_Labour.get(i).getAttribute("title").contains(assessories)) {
                    Thread.sleep(2000);
                    if(crossIcon_All.size()>18) {
                        WebElementActions.getActions().moveOnTargetElement(crossIcon_All.get(i));
                    }
                    //           Thread.sleep(15000);
                    WebElementActions.getActions().clickUsingJS(crossIcon_All.get(i));
                    break;
                }
            }
             Thread.sleep(3000);
            if(yes_delete_labour_and_parts.size()>0) {
                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(yes_delete_labour_and_parts.get(0));
                WebElementActions.getActions().clickElement(yes_delete_labour_and_parts.get(0));
            }


        }
 //   }
    /**
     * verify Delete Aerodynamic Device Page
     */
    public void verifyDeleteAerodynamicDevice() throws InterruptedException {

 //       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_DeleteAero);
 //       Assert.assertTrue(label_DeleteAero.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_description_MoveTech);
        Assert.assertTrue(label_description_MoveTech.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_description1);
        Assert.assertTrue(label_description1.isDisplayed());
        Assert.assertTrue(label_hrs.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }


    /**
     * click on signOut btn
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
}

