package pages.service;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ServiceManagerWoLabor extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Complete RO']/following::td[7]")
    WebElement subtitle_msg;

    @FindBy(xpath = "//h1[text()='Things To Do']")
    WebElement label_ThingsToDo;

    @FindBy(xpath = "//a[text()='Manage Invoices']")
    WebElement label_manageInvoices;

    @FindBy(xpath = "(//a[text()='Time Sheet'])[1]")
    WebElement label_TimeSheet;

    @FindBy(xpath = "(//a[text()='Process PO Invoices'])[1]")
    WebElement label_ProcessPoInvoice;

    @FindBy(xpath = "(//a[text()='Update Customer PO Number'])[1]")
    WebElement label_UpdateCustomerPoNum;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement label_Location;

    @FindBy(xpath = "//label[text()='Location:']/following::a[1]/img")
    WebElement location_SearchIcon;

    @FindBy(xpath = "//label[text()='Status:']")
    WebElement label_Status;

    @FindBy(xpath = "//label[text()='Status:']/following::input[1]")
    WebElement radio_ReadyToSubmit;

    @FindBy(xpath = "//label[text()='Ready to Submit']")
    WebElement label_ReadyToSubmit;

    @FindBy(xpath = "//label[text()='Ready to Submit']/following::input[1]")
    WebElement radio_submitted;

    @FindBy(xpath = "//label[text()='Submitted']")
    WebElement label_submitted;

    @FindBy(xpath = "//label[text()='Submitted']/following::input[1]")
    WebElement radio_invoiced;

    @FindBy(xpath = "//label[text()='Invoiced']")
    WebElement label_invoiced;

    @FindBy(xpath = "//label[text()='Invoiced']/following::input[1]")
    WebElement radio_closed;

    @FindBy(xpath = "//label[text()='Closed']")
    WebElement label_closed;

    @FindBy(xpath = "//label[text()='Closed']/following::input[1]")
    WebElement radio_rejected;

    @FindBy(xpath = "//label[text()='Rejected']")
    WebElement label_rejected;

    @FindBy(xpath = "(//label[text()='Search:'])[1]")
    WebElement label_search;

    @FindBy(xpath = "(//label[text()='Search:'])[1]/following::input[1]")
    WebElement txtfield_search;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//h1[text()='Ready to Submit']")
    WebElement subtitle_ReadyToSubmit;

    @FindBy(xpath = "//span[text()='Reference']")
    WebElement label_reference;

    @FindBy(xpath = "//span[text()='Total Charge']")
    WebElement label_TotalCharge;

    @FindBy(xpath = "//span[text()='Status']")
    WebElement label_status;

    @FindBy(xpath = "//h1[text()='Summary']")
    WebElement label_summary;

    @FindBy(xpath = "//span[text()='Return to Technician']")
    WebElement btn_returnToTechnician;

    @FindBy(xpath = "//span[text()='Close RO']")
    WebElement btn_closeRO;

    @FindBy(xpath = "//span[text()='Invoice']")
    WebElement btn_invoice;

    @FindBy(xpath = "//span[text()='Cost Proof']/preceding::img[1]")
    WebElement img_costProof;

    @FindBy(xpath = "//span[text()='Cost Proof']")
    WebElement label_costProof;

    @FindBy(xpath = "//span[text()='Customer Proof']/preceding::img[1]")
    WebElement img_customerProof;

    @FindBy(xpath = "//span[text()='Customer Proof']")
    WebElement label_customerProof;

    @FindBy(xpath = "//label[text()='Repair Date:']")
    WebElement label_RepairDate;

    @FindBy(xpath = "//label[text()='Labour:']")
    WebElement label_Labour;

    @FindBy(xpath = "//label[text()='Labour:']/following::td[3]")
    WebElement labour_value;

    @FindBy(xpath = "//label[text()='Parts:']")
    WebElement label_parts;

    @FindBy(xpath = "//label[text()='Parts:']/following::td[3]")
    WebElement parts_value;

    @FindBy(xpath = "//label[text()='Shop Supplies:']")
    WebElement label_shopSupplies;

    @FindBy(xpath = "//label[text()='Shop Supplies:']/following::td[3]")
    WebElement shopSupplies_value;

    @FindBy(xpath = "//label[text()='Surcharges:']")
    WebElement label_surcharges;

    @FindBy(xpath = "//label[text()='Surcharges:']/following::td[3]")
    WebElement surcharges_value;

    @FindBy(xpath = "//label[text()='Taxes:']")
    WebElement label_Taxes;

    @FindBy(xpath = "//label[text()='Taxes:']/following::td[3]")
    WebElement taxes_value;

    @FindBy(xpath = "//label[text()='Total Charge:']")
    WebElement label_TotalCharges;

    @FindBy(xpath = "//label[text()='Total Charge:']/following::td[3]")
    WebElement TotalCharges_value;

   @FindBy(xpath = "//span[text()='Status']/following::a[1]")
    WebElement hyperlink_RoNumber;

   @FindBy(xpath = "//span[text()='Back to Complete RO']/preceding::img[1]")
    WebElement back_icon;

    @FindBy(xpath = "//span[text()='Back to Complete RO']")
    WebElement label_backtoCompleteRo;

    @FindBy(xpath = "//span[text()='Back to Complete RO']/following::img[2]")
    WebElement upArrow_icon;

    @FindBy(xpath = "//span[text()='Back to Complete RO']/following::img[4]")
    WebElement downArrow_icon;

    @FindBy(xpath = "//span[text()='Back to Complete RO']/following::td[7]")
    WebElement pageNumber_start;

    @FindBy(xpath = "//span[text()='Back to Complete RO']/following::td[11]")
    WebElement pageNumber_end;

    @FindBy(xpath = "//span[text()='Void RO']")
    WebElement tab_voidRo;

    @FindBy(xpath = "//span[text()='Return to Technician']")
    WebElement tab_returnToTechnician;

    @FindBy(xpath = "//span[text()='Split RO']")
    WebElement tab_splitRo;

    @FindBy(xpath = "//span[text()='Close RO']")
    WebElement tab_closeRo;

    @FindBy(xpath = "//span[text()='Invoice']")
    WebElement tab_invoice;

    @FindBy(xpath = "//h1[text()='Repair Order']/following::a[1]")
    WebElement email_icon;

    @FindBy(xpath = "//h1[text()='Repair Order']/following::a[2]")
    WebElement email_size;

    @FindBy(xpath = "//h1[text()='Repair Order']/following::a[3]")
    WebElement attachment_icon;

    @FindBy(xpath = "//h1[text()='Repair Order']/following::a[4]")
    WebElement attachment_size;

    @FindBy(xpath = "//span[text()='Cost Proof']")
    WebElement label_cost_Proof;

    @FindBy(xpath = "//span[text()='Pick List']")
    WebElement label_pick_list;

    @FindBy(xpath = "//span[text()='Repair Order']")
    WebElement label_Repair_Order;

    @FindBy(xpath = "//h1[text()='Repair Order']")
    WebElement title_RepairOrder;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement label_location;

    @FindBy(xpath = "//label[text()='Owner:']")
    WebElement label_Owner;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement label_unit;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[1]")
    WebElement label_unitNumber;

    @FindBy(xpath = "//label[text()='Unit #:']/following::a[2]/img")
    WebElement change_Unit_icon;

    @FindBy(xpath = "//label[text()='RO#:']")
    WebElement label_RO_hash;

    @FindBy(xpath = "//label[text()='RO#:']/following::div[1]")
    WebElement label_RO_Number;

    @FindBy(xpath = "//label[text()='Internal RO:']")
    WebElement label_InternalRo;

    @FindBy(xpath = "//label[text()='Internal RO:']/following::input[1]")
    WebElement txt_InternalRo;

    @FindBy(xpath = "//label[text()='Type:']")
    WebElement label_type;

    @FindBy(xpath = "//label[text()='Type:']/following::a[1]")
    WebElement type_hyperlink;

    @FindBy(xpath = "//label[text()='RO Status:']")
    WebElement label_Ro_Status;

    @FindBy(xpath = "//label[text()='RO Status:']/following::a[1]")
    WebElement hyperlink_RoStatus;

    @FindBy(xpath = "//label[text()='WIP Status:']")
    WebElement label_WIPStatus;

    @FindBy(xpath = "//label[text()='WIP Status:']/following::a[1]")
    WebElement hyperlink_wipStatus;

    @FindBy(xpath = "//label[text()='Internal Notes:']")
    WebElement label_InternalNotes;

    @FindBy(xpath = "//label[text()='Internal Notes:']/following::a[1]")
    WebElement hyperlink_InternalNotes;

    @FindBy(xpath = "//label[text()='Notes:']")
    WebElement label_notes;

    @FindBy(xpath = "//label[text()='Notes:']/following::a[1]")
    WebElement hyperlink_notes;

    @FindBy(xpath = "//label[text()='RO Date:']/preceding::span[1]")
    WebElement asterisk_RoDate;

    @FindBy(xpath = "//label[text()='RO Date:']")
    WebElement label_RoDate;

    @FindBy(xpath = "//label[text()='RO Date:']/following::input[1]")
    WebElement txtfield_RoDate;

    @FindBy(xpath = "//label[text()='RO Date:']/following::a[1]")
    WebElement RoDate_img;

    @FindBy(xpath = "//span[text()='Reading Type']")
    WebElement btn_ReadingType;

    @FindBy(xpath = "//label[text()='Invoice To:']")
    WebElement label_InvoiceTo;

    @FindBy(xpath="//label[text()='Invoice To:']/following::a[1]")
    WebElement hyperlink_InvoiceTo;

    @FindBy(xpath = "//label[text()='Customer PO#:']")
    WebElement label_CustomerPo;

    @FindBy(xpath = "//label[text()='Customer PO#:']/following::input[1]")
    WebElement txtfield_CustomerPo;

    @FindBy(xpath = "//div[text()='Internal Notes']")
    WebElement subtitle_InternalNotes;

    @FindBy(xpath = "//div[text()='Internal Notes']/following::textarea")
    WebElement textarea_internalNotes;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_saveExit;

    @FindBy(xpath = "//div[text()='Notes']")
    WebElement label_notes2;

    @FindBy(xpath = "//div[text()='Notes']/following::textarea")
    WebElement txtfield_notes;

   @FindBy(xpath = "//label[text()='Authorized By:']")
    WebElement label_authorizedBy;

    @FindBy(xpath = "//label[text()='Authorized By:']/following::a[1]")
    WebElement hyperlink_authorizedBy;

    @FindBy(xpath = "//label[text()='Search and Select Contact:']")
    WebElement label_SearchSelectContact;

    @FindBy(xpath = "//h1[text()='Authorized By']")
    WebElement label_AuthorizedBy;

    @FindBy(xpath = "//span[text()='Add Contact']")
    WebElement btn_AddContact;

    @FindBy(xpath = "//span[text()='First Name']")
    WebElement label_FirstName;

    @FindBy(xpath = "//span[text()='Last Name']")
    WebElement label_LastName;

    @FindBy(xpath = "//span[text()='Last Name']/following::th/div")
    WebElement label_selectColumn;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;
    @FindBy(xpath = "//label[text()='First Name:']/following::input[1]")
    WebElement txtfield_FirstName;

    @FindBy(xpath = "//label[text()='Last Name:']/following::input[1]")
    WebElement txtfield_LastName;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_SaveExit;

    @FindBy(xpath = "//label[text()='Search and Select Contact:']/following::input[1]")
    WebElement txtfield_SearchSelectContact;

    @FindBy(xpath = "//span[text()='Last Name']/following::a[1]")
    WebElement cell_firstname;

    @FindBy(xpath = "//span[text()='Last Name']/following::a[2]")
    WebElement cell_lastname;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_select;

    @FindBy(xpath = "//a[contains(@id,'cl12')]/span")
    WebElement label_UpdateRates;

    @FindBy(xpath = "//label[contains(text(),'Lab')]")
    WebElement label_Labor;

    @FindBy(xpath = "(//label[contains(text(),'Lab')]//following::td)[2]")
    WebElement labor_value;

    @FindBy(xpath = "//label[text()='Parts:']")
    WebElement label_Parts;
    @FindBy(xpath = "//label[text()='Parts:']/following::td[2]")
    WebElement  parts_value1;

    @FindBy(xpath = "//label[text()='Shop Charges:']")
    WebElement shopCharges;

    @FindBy(xpath = "//label[text()='Shop Charges:']/following::td[2]")
    WebElement shopCharges_value;

    @FindBy(xpath = "//label[text()='Shop Charges:']/following::a[2]")
    WebElement shopCharges_cross;

    @FindBy(xpath = "//label[text()='Surcharge:']")
    WebElement surcharge;

    @FindBy(xpath = "//label[text()='Surcharge:']/following::a[1]")
    WebElement surcharge_value;

    @FindBy(xpath = "//label[text()='Tax:']")
    WebElement tax;
    @FindBy(xpath = "//label[text()='Tax:']/following::a[1]")
    WebElement tax_value;

    @FindBy(xpath = "//label[text()='RO Total:']")
    WebElement RoTotal;

    @FindBy(xpath = "//label[text()='RO Total:']/following::span[1]")
    WebElement RoTotal_value;

    @FindBy(xpath = "(//label[contains(text(),'RO Total:')]//following::div)[2]")
    WebElement label_Currency;

    @FindBy(xpath = "//a[contains(@id,'clVROPL')]/span")
    WebElement viewProfitLoss;

    @FindBy(xpath = "//a[contains(text(),'Purchasing')]/preceding::a[1]")
    WebElement label_LaborParts;

    @FindBy(xpath = "(//a[contains(text(),'Purchasing')])[1]/following::h2[1]")
    WebElement label_labor;

    @FindBy(xpath = "//span[text()='Re-Sequence']/following::span[1]")
    WebElement label_ShowLaborDetails;

    @FindBy(xpath = "//span[text()='Re-Sequence']/following::span[2]")
    WebElement label_AddLabor;

    @FindBy(xpath = "//span[text()='Re-Sequence']/following::a[3]/img")
    WebElement delete_icon;

    @FindBy(xpath = "//span[text()='Add Labor']/following::th[15]")
    WebElement expandColumn;

    @FindBy(xpath = "//span[text()='Add Labor']/following::span[1]")
    WebElement hash;

    @FindBy(xpath = "//span[text()='P']")
    WebElement p;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_Description;

    @FindBy(xpath = "//span[text()='Estimated Hours']")
    WebElement label_estimatedHrs;

    @FindBy(xpath = "//span[text()='Actual Hours']")
    WebElement label_actualHrs;

    @FindBy(xpath = "//span[text()='Hourly Cost']")
    WebElement label_hourlyCost;

    @FindBy(xpath = "(//span[text()='Total Cost'])[1]")
    WebElement TotalCost;

    @FindBy(xpath = "(//span[text()='Charge Hours'])[1]")
    WebElement label_ChargeHrs;

    @FindBy(xpath = "(//span[text()='Hourly Charge'])[1]")
    WebElement label_HourlyCharge;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]")
    WebElement label_TotalCharge2;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::th/div")
    WebElement attachment_column;

    @FindBy(xpath = "//td[text()='Total:']")
    WebElement label_Total;

    @FindBy(xpath = "//td[text()='Total:']/following::span[1]")
    WebElement EstimateTotalHrs;

    @FindBy(xpath = "//td[text()='Total:']/following::span[2]")
    WebElement ActualTotalHrs;

    @FindBy(xpath = "//td[text()='Total:']/following::span[3]")
    WebElement TotalCostHrs;

    @FindBy(xpath = "//td[text()='Total:']/following::span[4]")
    WebElement HourlyChargeTotal;

    @FindBy(xpath = "//td[text()='Total:']/following::span[5]")
    WebElement TotalChargesTotal;

    @FindBy(xpath = "(//span[text()='#'])[2]")
    WebElement label_hash;

    @FindBy(xpath = "//span[text()='Part Number']")
    WebElement label_PartNumber;

    @FindBy(xpath = "//span[text()='Core']")
    WebElement label_core;

    @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement label_UnitCost;

    @FindBy(xpath = "(//span[text()='Total Cost'])[2]")
    WebElement label_Total_Cost;

    @FindBy(xpath = "//span[text()='Show Parts Details']")
    WebElement label_ShowPartsDetails;

    @FindBy(xpath = "//span[text()='Add Parts']")
    WebElement label_addParts;

    @FindBy(xpath = "//span[text()='Add Parts']/following::a[1]/img")
    WebElement label_deleteIcon;

    @FindBy(xpath = "//span[text()='Add Parts']/following::th[12]")
    WebElement column_expand;

    @FindBy(xpath = "//div[contains(text(),'Unit #:')]")
    WebElement label_Unit;

    @FindBy(xpath = "//span[text()='Date']/preceding::h1[1]")
    WebElement Ro_Number;

    @FindBy(xpath = "//span[text()='Date']")
    WebElement label_date;

    @FindBy(xpath = "//span[text()='Username']")
    WebElement label_username;

    @FindBy(xpath = "//span[text()='Employee']")
    WebElement label_employee;

    @FindBy(xpath = "//span[text()='RO Status']")
    WebElement label_RoStatus;

    @FindBy(xpath = "//h1[text()='Notes:']")
    WebElement label_notes1;

    @FindBy(xpath = "(//div[contains(@id,'ctbClose')])[2]")
    WebElement close_btn;

    @FindBy(xpath = "//label[text()='Search and Select WIP Status:']/preceding::div[1]")
    WebElement roNumber;

    @FindBy(xpath = "//label[text()='Search and Select WIP Status:']")
    WebElement label_searchSelectWIP;

    @FindBy(xpath = "//label[text()='Search and Select WIP Status:']/following::input[1]")
    WebElement txt_searchSelectWIP;

    @FindBy(xpath = "//label[text()='Search and Select WIP Status:']/following::span[1]")
    WebElement label_description;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement label_code;

    @FindBy(xpath = "//span[text()='Code']/following::div[1]")
    WebElement code_column;

    @FindBy(xpath = "//td[contains(@id,'cDescription')]")
    WebElement Description_Column;

    @FindBy(xpath = "(//td[contains(@id,'cDescription')]/following::a)[1]")
    WebElement select_btn;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement cancle_btn;

    @FindBy(xpath = "//label[text()='Search and Select RO Type:']/preceding::div[1]")
    WebElement labe_Ro;

    @FindBy(xpath = "//label[text()='Search and Select RO Type:']")
    WebElement SearchSelectRo;

    @FindBy(xpath = "//label[text()='Search and Select RO Type:']/following::input[1]")
    WebElement txt_searchSelectRO;

    @FindBy(xpath = "//label[text()='Search and Select RO Type:']/following::span[2]")
    WebElement description_type;

    @FindBy(xpath = "//label[text()='Search and Select RO Type:']/following::span[3]")
    WebElement type_code;

    @FindBy(xpath = "//span[text()='Code']/following::div[1]")
    WebElement type_column;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement type_select;

    @FindBy(xpath = "//div[text()='Invoice To']")
    WebElement label_Incoice_To;

    @FindBy(xpath = "//label[text()='Search and Select Customer']")
    WebElement invoiceTo_SearchSelectCustomer;

    @FindBy(xpath = "//label[text()='Search and Select Customer']/following::input[1]")
    WebElement txt_invoice_search;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement label_name;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement label_code_invoice;

    @FindBy(xpath = "//span[text()='Address']")
    WebElement label_address;

    @FindBy(xpath = "//span[text()='Phone']")
    WebElement label_phone;

    @FindBy(xpath = "//span[text()='Contact']")
    WebElement label_contact;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement select_btn_invoice;
    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement invoice_canclebtn;

    @FindBy(xpath = "//h1[text()='Profit & Loss']/preceding::div[1]")
    WebElement profitLoss_RoNumber;

    @FindBy(xpath = "//h1[text()='Profit & Loss']")
    WebElement subtitle_proftLoss;

    @FindBy(xpath = "//label[text()='Charge']")
    WebElement label_charge;

    @FindBy(xpath = "//label[text()='Cost Including Sublet']")
    WebElement label_costIncludingSublet;

    @FindBy(xpath = "(//label[text()='Parts:'])[2]/preceding::label[1]")
    WebElement profitLoss_Labor;

    @FindBy(xpath = "(//label[text()='Parts:'])[2]")
    WebElement proftLoss_parts;

    @FindBy(xpath = "(//label[text()='Shop Charges:'])[2]")
    WebElement profitLoss_shopCharges;

    @FindBy(xpath = "(//label[text()='Surcharge:'])[2]")
    WebElement profitLoss_Surcharge;

    @FindBy(xpath = "//label[text()='Total Revenue:']")
    WebElement label_totalRevenue;

    @FindBy(xpath = "//label[text()='Gross Profit:']")
    WebElement label_grossProfit;

    @FindBy(xpath = "//label[text()='Net Profit Margin:']")
    WebElement label_netProfitMargin;

    @FindBy(xpath = "(//label[text()='Parts:'])[2]/following::td[2]")
    WebElement profit_parts_value;

    @FindBy(xpath = "(//label[text()='Shop Charges:'])[2]/following::td[2]")
    WebElement shopCharge_value;
    @FindBy(xpath = "(//label[text()='Surcharge:'])[2]/following::td[2]")
    WebElement Surcharge_value;

    @FindBy(xpath = "//label[text()='Gross Profit:']/following::td[2]")
    WebElement grossProfit_value;

    @FindBy(xpath = "//label[text()='Net Profit Margin:']/following::td[2]")
    WebElement netProfitMargin_value;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    WebElement btn_ok;

    @FindBy(xpath = "(//div[contains(@id,'pgltWAIDX')])")
    WebElement number_2row;

    @FindBy(xpath = "//span[text()='Status']/following::a[1]")
    WebElement reference_number;

    @FindBy(xpath = "//div[text()='Update Rates']")
    WebElement UpdateRates;

    @FindBy(xpath = "//div[text()='Update Rates']/following::h1[1]")
    WebElement laborCharge;

    @FindBy(xpath = "//label[text()='Set Hourly Charge To:']")
    WebElement setHourlyChargeTo;

    @FindBy(xpath = "//label[text()='Set Hourly Charge To:']/following::input[1]")
    WebElement txt_setHourlyChargeTo;

    @FindBy(xpath = "(//span[text()='Set'])[1]")
    WebElement set_btn;

    @FindBy(xpath = "(//span[text()='Set hourly charge to default'])[1]")
    WebElement Sethourlychargetodefault;

    @FindBy(xpath = "//h1[text()='Parts Charge']")
    WebElement partCharge;

    @FindBy(xpath = "//label[text()='Set Parts Charge To:']")
    WebElement SetPartsChargeTo;

    @FindBy(xpath = "//label[text()='Set Parts Charge To:']/following::input[1]")
    WebElement txt_SetPartsChargeTo;

    @FindBy(xpath = "(//span[text()='Set'])[2]")
    WebElement btn_set;

    @FindBy(xpath = "//span[text()='Set parts charge to default']")
    WebElement Setpartschargetodefault;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle2;


    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * click on completeRo
     */
      public void clickOnCompleteRo() throws FileNotFoundException, InterruptedException {
          ReusableActions.getActions().clickParentMenu("Service");
          ReusableActions.getActions().clickChildMenu("Complete RO");
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify element present in Complete Ro Subtitle
     */
      public void verifyCompleteRoElement() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(subtitle_msg);
          Assert.assertTrue(subtitle_msg.isDisplayed());
          Assert.assertTrue(label_ThingsToDo.isDisplayed());
          Assert.assertTrue(label_manageInvoices.isDisplayed());
          Assert.assertTrue(label_TimeSheet.isDisplayed());
          Assert.assertTrue(label_ProcessPoInvoice.isDisplayed());
          Assert.assertTrue(label_UpdateCustomerPoNum.isDisplayed());
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify radio buttons and labels present in the header section
     */
      public void verifyRadioButtonsLabels() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Location);
          Assert.assertTrue(label_Location.isDisplayed());
          Assert.assertTrue(location_SearchIcon.isDisplayed());
          Assert.assertTrue(label_Status.isDisplayed());
          Assert.assertTrue(radio_ReadyToSubmit.isDisplayed());
          Assert.assertTrue(label_ReadyToSubmit.isDisplayed());
          Assert.assertTrue(radio_submitted.isDisplayed());
          Assert.assertTrue(label_submitted.isDisplayed());
          Assert.assertTrue(radio_invoiced.isDisplayed());
          Assert.assertTrue(label_invoiced.isDisplayed());
          Assert.assertTrue(radio_closed.isDisplayed());
          Assert.assertTrue(label_closed.isDisplayed());
          Assert.assertTrue(radio_rejected.isDisplayed());
          Assert.assertTrue(label_rejected.isDisplayed());
          Assert.assertTrue(label_search.isDisplayed());
          Assert.assertTrue(txtfield_search.isDisplayed());
          Assert.assertTrue(btn_refresh.isDisplayed());
          Assert.assertTrue(subtitle_ReadyToSubmit.isDisplayed());
          Assert.assertTrue(label_reference.isDisplayed());
          Assert.assertTrue(label_TotalCharge.isDisplayed());
          Assert.assertTrue(label_status.isDisplayed());
          TestListener.saveScreenshotPNG(driver);

      }
    /**
     *  Verify Summary Elements
     */
      public void verifySummaryElements() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_summary);
          Assert.assertTrue(label_summary.isDisplayed());
          Assert.assertTrue(btn_returnToTechnician.isDisplayed());
          Assert.assertTrue(btn_closeRO.isDisplayed());
          Assert.assertTrue(btn_invoice.isDisplayed());
          Assert.assertTrue(img_costProof.isDisplayed());
          Assert.assertTrue(label_costProof.isDisplayed());
          Assert.assertTrue(img_customerProof.isDisplayed());
          Assert.assertTrue(label_customerProof.isDisplayed());
          Assert.assertTrue(label_RepairDate.isDisplayed());
          Assert.assertTrue(label_Labour.isDisplayed());
          Assert.assertTrue(labour_value.isDisplayed());
          Assert.assertTrue(label_parts.isDisplayed());
          Assert.assertTrue(parts_value.isDisplayed());
          Assert.assertTrue(label_shopSupplies.isDisplayed());
          Assert.assertTrue(shopSupplies_value.isDisplayed());
          Assert.assertTrue(label_surcharges.isDisplayed());
          Assert.assertTrue(surcharges_value.isDisplayed());
          Assert.assertTrue(label_Taxes.isDisplayed());
          Assert.assertTrue(taxes_value.isDisplayed());
          Assert.assertTrue(label_TotalCharges.isDisplayed());
          Assert.assertTrue(TotalCharges_value.isDisplayed());
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on RONumber
     */
      public void clickOnRoNumber() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_RoNumber);
          WebElementActions.getActions().clickElement(hyperlink_RoNumber);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify Header element of Repair Order page
     */
      public void verifyHeaderElementRepairOrderPage() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(back_icon);
          Assert.assertTrue(back_icon.isDisplayed());
          Assert.assertTrue(label_backtoCompleteRo.isDisplayed());
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(upArrow_icon);
          Assert.assertTrue(upArrow_icon.isDisplayed());
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(downArrow_icon);
          Assert.assertTrue(downArrow_icon.isDisplayed());
          Assert.assertTrue(pageNumber_start.isDisplayed());
          Assert.assertTrue(pageNumber_end.isDisplayed());
          Assert.assertTrue(tab_voidRo.isDisplayed());
          Assert.assertTrue(tab_returnToTechnician.isDisplayed());
          Assert.assertTrue(tab_splitRo.isDisplayed());
          Assert.assertTrue(tab_closeRo.isDisplayed());
          Assert.assertTrue(tab_invoice.isDisplayed());
          TestListener.saveScreenshotPNG(driver);

      }
    /**
     *  Verify element present on the header
     */
      public void verifyHeaderElement() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(email_icon);
          Assert.assertTrue(email_icon.isDisplayed());
          Assert.assertTrue(email_size.isDisplayed());
          Assert.assertTrue(attachment_icon.isDisplayed());
          Assert.assertTrue(attachment_size.isDisplayed());
          Assert.assertTrue(label_cost_Proof.isDisplayed());
          Assert.assertTrue(label_pick_list.isDisplayed());
          Assert.assertTrue(label_Repair_Order.isDisplayed());
          TestListener.saveScreenshotPNG(driver);

      }
    /**
     * verify Repair Order SubElement
     */
      public void verifyRepairOrderSubElement() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_RepairOrder);
          Assert.assertTrue(title_RepairOrder.isDisplayed());
          Assert.assertTrue(label_location.isDisplayed());
          Assert.assertTrue(label_Owner.isDisplayed());
          Assert.assertTrue(label_unit.isDisplayed());
          Assert.assertTrue(label_unitNumber.isDisplayed());
          Assert.assertTrue(change_Unit_icon.isDisplayed());
          Assert.assertTrue(label_RO_hash.isDisplayed());
          Assert.assertTrue(label_RO_Number.isDisplayed());
          Assert.assertTrue(label_InternalRo.isDisplayed());
          Assert.assertTrue(txt_InternalRo.isDisplayed());
          Assert.assertTrue(label_type.isDisplayed());
          Assert.assertTrue(type_hyperlink.isDisplayed());
          Assert.assertTrue(label_Ro_Status.isDisplayed());
          Assert.assertTrue(hyperlink_RoStatus.isDisplayed());
          Assert.assertTrue(label_WIPStatus.isDisplayed());
          Assert.assertTrue(hyperlink_wipStatus.isDisplayed());
          Assert.assertTrue(label_InternalNotes.isDisplayed());
          Assert.assertTrue(hyperlink_InternalNotes.isDisplayed());
          Assert.assertTrue(label_notes.isDisplayed());
          Assert.assertTrue(hyperlink_notes.isDisplayed());
          Assert.assertTrue(asterisk_RoDate.isDisplayed());
          Assert.assertTrue(label_RoDate.isDisplayed());
          Assert.assertTrue(txtfield_RoDate.isDisplayed());
          Assert.assertTrue(RoDate_img.isDisplayed());
          Assert.assertTrue(btn_ReadingType.isDisplayed());
          Assert.assertTrue(label_InvoiceTo.isDisplayed());
          Assert.assertTrue(label_CustomerPo.isDisplayed());
          Assert.assertTrue(txtfield_CustomerPo.isDisplayed());
          TestListener.saveScreenshotPNG(driver);

      }
    /**
     * click on internal note link
     */
      public void clickOnInternalNoteLink() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_InternalNotes);
          WebElementActions.getActions().clickElement(hyperlink_InternalNotes);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * verify element Internal notes
     */
      public void verifyInternalNotes() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(subtitle_InternalNotes);
          Assert.assertTrue(subtitle_InternalNotes.isDisplayed());
          Assert.assertTrue(textarea_internalNotes.isDisplayed());
          TestListener.saveScreenshotPNG(driver);

      }
    /**
     * enter text This is a standard note
     */
     public void enterThisIsStandardNote() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(textarea_internalNotes);
         WebElementActions.getActions().inputText(textarea_internalNotes,appProp.getProperty("InternalNote"));

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on save/exit button
     */
     public void clickOnSaveExitbtn() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_saveExit);
         WebElementActions.getActions().clickElement(btn_saveExit);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on This is a standard note
     */
     public void clickOnThisIsStandardNote() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_InternalNotes);
             WebElementActions.getActions().clickElement(hyperlink_InternalNotes);


         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * enter text checking notes contain
     */
    public void entercheckingnotescontain() throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(textarea_internalNotes);
            WebElementActions.getActions().inputText(textarea_internalNotes, appProp.getProperty("InternalNote1"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Notes contain hyperlink
     */
    public void clickOnNoteshyperLink() throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_notes);
        Thread.sleep(3000);
            WebElementActions.getActions().clickElement(hyperlink_notes);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify notes textbox
     */
    public void verifyNotestextbox() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_notes2);
        Assert.assertTrue(label_notes2.isDisplayed());
        Assert.assertTrue(txtfield_notes.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Enter This is a standard note in Note field
     */
    public void entertextNoteField() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(txtfield_notes);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_notes);
        WebElementActions.getActions().inputText(txtfield_notes,appProp.getProperty("notes"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify text Authorized By:
     */
    public void verifyAuthorizedBy() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_authorizedBy);
        Assert.assertTrue(label_authorizedBy.isDisplayed());
        Assert.assertTrue(hyperlink_authorizedBy.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Authorized By: content
     */
    public void clickOnAuthorizedBy() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_authorizedBy);
        WebElementActions.getActions().clickElement(hyperlink_authorizedBy);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verified (Ro to present in header)authorized by hyperlink element
     */
     public void verifiedAuthorizedByHyperlinkElements() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SearchSelectContact);
         Assert.assertTrue(label_SearchSelectContact.isDisplayed());
         Assert.assertTrue(label_AuthorizedBy.isDisplayed());
         Assert.assertTrue(btn_AddContact.isDisplayed());
         Assert.assertTrue(label_FirstName.isDisplayed());
         Assert.assertTrue(label_LastName.isDisplayed());
         Assert.assertTrue(label_selectColumn.isDisplayed());
         Assert.assertTrue(btn_cancle.isDisplayed());

         TestListener.saveScreenshotPNG(driver);

     }
    /**
     *   click on add contact
     */
      public void clickOnAddContact() throws InterruptedException {

          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AddContact);
          WebElementActions.getActions().clickElement(btn_AddContact);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }

      String randomName = WebElementActions.getActions().randomAlphaNumeric(10);
    /**
     * enter ContactFirstName
     */
    public void enterContactFirstName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_FirstName);
        WebElementActions.getActions().inputText(txtfield_FirstName, randomName);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter ContactLastName
     */
    public void enterContactLastName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_LastName);
        WebElementActions.getActions().inputText(txtfield_LastName, randomName);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Save / Exit
     */
    public void clickOnSaveExitBtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExit);
        WebElementActions.getActions().clickElement(btn_SaveExit);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter ContactLastName in search and Select Contact
     */
    public void enterLastName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txtfield_SearchSelectContact);
        WebElementActions.getActions().inputText(txtfield_SearchSelectContact, randomName);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verified firstname and LastName
     */
    public void verifiedFirstnameLastName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(cell_firstname);
        Assert.assertTrue(cell_firstname.isDisplayed());
        Assert.assertTrue(cell_lastname.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on select button
     */
    public void clickOnSelectBtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_select);
        WebElementActions.getActions().clickElement(btn_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verifed firstname Lastname
     */
    public void verifiedFirstAndLastName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_authorizedBy);
        Assert.assertTrue(hyperlink_authorizedBy.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Subtotals and totals area in header
     */
    public void verifySubtotals() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UpdateRates);
        Assert.assertTrue(label_UpdateRates.isDisplayed());
        Assert.assertTrue(label_Labor.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(labor_value);
        Assert.assertTrue(labor_value.isDisplayed());
        Assert.assertTrue(label_Parts.isDisplayed());
        Assert.assertTrue(parts_value1.isDisplayed());
        Assert.assertTrue(shopCharges.isDisplayed());
        Assert.assertTrue(shopCharges_value.isDisplayed());
        Assert.assertTrue(shopCharges_cross.isDisplayed());
        Assert.assertTrue(surcharge.isDisplayed());
        Assert.assertTrue(surcharge_value.isDisplayed());
        Assert.assertTrue(tax.isDisplayed());
        Assert.assertTrue(tax_value.isDisplayed());
        Assert.assertTrue(RoTotal.isDisplayed());
        Assert.assertTrue(RoTotal_value.isDisplayed());
        Assert.assertTrue(label_Currency.isDisplayed());
        Assert.assertTrue(viewProfitLoss.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verifed Labor Pane
     */
    public void verifiedLaborPane() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborParts);
        Assert.assertTrue(label_LaborParts.isDisplayed());
        Assert.assertTrue(label_labor.isDisplayed());
        Assert.assertTrue(label_ShowLaborDetails.isDisplayed());
        Assert.assertTrue(label_AddLabor.isDisplayed());
        Assert.assertTrue(delete_icon.isDisplayed());
//        Assert.assertTrue(expandColumn.isDisplayed());
//        Assert.assertTrue(hash.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(p);
        Assert.assertTrue(p.isDisplayed());
        Assert.assertTrue(label_Description.isDisplayed());
        Assert.assertTrue(label_estimatedHrs.isDisplayed());
        if(LoginActions.environmentName.contains("QA")) {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_actualHrs);
        Assert.assertTrue(label_actualHrs.isDisplayed());
        Assert.assertTrue(label_hourlyCost.isDisplayed());
        }
        Assert.assertTrue(TotalCost.isDisplayed());
        Assert.assertTrue(label_ChargeHrs.isDisplayed());
        Assert.assertTrue(label_HourlyCharge.isDisplayed());
        Assert.assertTrue(label_TotalCharge2.isDisplayed());
        Assert.assertTrue(attachment_column.isDisplayed());
 /*       Assert.assertTrue(label_Total.isDisplayed());
        Assert.assertTrue(EstimateTotalHrs.isDisplayed());
        Assert.assertTrue(ActualTotalHrs.isDisplayed());
        Assert.assertTrue(TotalCostHrs.isDisplayed());
        Assert.assertTrue(HourlyChargeTotal.isDisplayed());
        Assert.assertTrue(TotalChargesTotal.isDisplayed());   */
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verified Parts panel
     */
    public void verifiedPartspanel() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ShowPartsDetails);
        Assert.assertTrue(label_ShowPartsDetails.isDisplayed());
        Assert.assertTrue(label_addParts.isDisplayed());
        Assert.assertTrue(label_deleteIcon.isDisplayed());
//        Assert.assertTrue(column_expand.isDisplayed());
//        Assert.assertTrue(label_hash.isDisplayed());
        Assert.assertTrue(label_PartNumber.isDisplayed());
        Assert.assertTrue(label_core.isDisplayed());
        Assert.assertTrue(label_UnitCost.isDisplayed());
        if (LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Total_Cost);
            Assert.assertTrue(label_Total_Cost.isDisplayed());
        }
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on RO Status hyperlink
     */
    public void clickOnRoStatusHyperlink() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_RoStatus);
        WebElementActions.getActions().clickElement(hyperlink_RoStatus);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * afetr clicking Rotatus Hyperling verify the element
     */
    public void verifiedRostatuElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Unit);
        Assert.assertTrue(label_Unit.isDisplayed());
        Assert.assertTrue(Ro_Number.isDisplayed());
        Assert.assertTrue(label_date.isDisplayed());
        Assert.assertTrue(label_username.isDisplayed());
        Assert.assertTrue(label_employee.isDisplayed());
        Assert.assertTrue(label_RoStatus.isDisplayed());
        Assert.assertTrue(close_btn.isDisplayed());
        if(LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("NA")) {
            Assert.assertTrue(label_notes1.isDisplayed());
        }
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Close button
     */
    public void clickOnCloseBtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(close_btn);
        Thread.sleep(2000);
        WebElementActions.getActions().clickElement(close_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on WIP Status: hyperlink
     */
    public void clickOnWipStatusHyperlink() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_wipStatus);
        WebElementActions.getActions().clickElement(hyperlink_wipStatus);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify WIP Status: hyperlink
     * "
     */
    public void verifyWIPStatusElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(roNumber);
        Assert.assertTrue(roNumber.isDisplayed());
        Assert.assertTrue(label_searchSelectWIP.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_searchSelectWIP);
        Assert.assertTrue(txt_searchSelectWIP.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(label_code.isDisplayed());
        Assert.assertTrue(code_column.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description_Column);
        Assert.assertTrue(Description_Column.isDisplayed());
        Assert.assertTrue(select_btn.isDisplayed());
        Assert.assertTrue(cancle_btn.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on Cancle button
     */
    public void clickOnCancleBtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancle_btn);
        WebElementActions.getActions().clickElement(cancle_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Type hyperlink
     */
    public void clickOnTypeHyperlink() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(type_hyperlink);
        WebElementActions.getActions().clickElement(type_hyperlink);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify type hyperlink element
     */
    public void verifyTypeHyperlinkElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(labe_Ro);
        Assert.assertTrue(labe_Ro.isDisplayed());
        Assert.assertTrue(SearchSelectRo.isDisplayed());
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txt_searchSelectRO);
        Assert.assertTrue(txt_searchSelectRO.isDisplayed());
        Assert.assertTrue(description_type.isDisplayed());
        Assert.assertTrue(type_code.isDisplayed());
        Assert.assertTrue(type_column.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on select button
     */
    public void clickOnTypeSelectBtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(type_select);
        WebElementActions.getActions().clickElement(type_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify text=(Emergency) which is selected in pop-up should display on screen
     */
    public void verifiedEmergencyElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(type_hyperlink);
        Assert.assertTrue(type_hyperlink.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Invoice To hyperlink
     */
    public void clickOnInvoiceToHyperlink() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_InvoiceTo);

        Actions action = new Actions(driver);
        action.moveToElement(hyperlink_InvoiceTo).perform();

        Thread.sleep(3000);

        WebElementActions.getActions().clickElement(hyperlink_InvoiceTo);
        Thread.sleep(1000);

        Actions action1 = new Actions(driver);
        action1.click().perform();

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * wait for element visible=Invoice To
     */
    public void verifyInvoiceHyperlinkElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Incoice_To);
        Assert.assertTrue(label_Incoice_To.isDisplayed());
        Assert.assertTrue(invoiceTo_SearchSelectCustomer.isDisplayed());
        Assert.assertTrue(txt_invoice_search.isDisplayed());
        Assert.assertTrue(label_name.isDisplayed());
        Assert.assertTrue(label_code_invoice.isDisplayed());
        Assert.assertTrue(label_address.isDisplayed());
        Assert.assertTrue(label_phone.isDisplayed());
        Assert.assertTrue(label_contact.isDisplayed());
//        Assert.assertTrue(select_btn_invoice.isDisplayed());
        Assert.assertTrue(invoice_canclebtn.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Cancel' button
     */
    public void clickOnInvoiceCancleBtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(invoice_canclebtn);
        WebElementActions.getActions().clickElement(invoice_canclebtn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on View Profit and Loss hyperlink
     */
    public void clickOnViewProfitLoss() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(viewProfitLoss);
        WebElementActions.getActions().clickElement(viewProfitLoss);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verified profit and loss element
     */
    public void verifyProfitLossElement() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(profitLoss_RoNumber);
        Assert.assertTrue(profitLoss_RoNumber.isDisplayed());
        Assert.assertTrue(subtitle_proftLoss.isDisplayed());
        Assert.assertTrue(label_charge.isDisplayed());
        Assert.assertTrue(label_costIncludingSublet.isDisplayed());
        Assert.assertTrue(profitLoss_Labor.isDisplayed());
        Assert.assertTrue(proftLoss_parts.isDisplayed());
        Assert.assertTrue(profitLoss_shopCharges.isDisplayed());
        Assert.assertTrue(profitLoss_Surcharge.isDisplayed());
        Assert.assertTrue(label_totalRevenue.isDisplayed());
        Assert.assertTrue(label_grossProfit.isDisplayed());
        Assert.assertTrue(label_netProfitMargin.isDisplayed());
        Assert.assertTrue(profit_parts_value.isDisplayed());
        Assert.assertTrue(shopCharge_value.isDisplayed());
        Assert.assertTrue(Surcharge_value.isDisplayed());
        Assert.assertTrue(grossProfit_value.isDisplayed());
        Assert.assertTrue(netProfitMargin_value.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on OK button
     */
     public void clickOnOKbtn() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ok);
         WebElementActions.getActions().clickElement(btn_ok);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on Show labour Details
     */
    public void clickOnShowLabourbtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ShowLaborDetails);
        WebElementActions.getActions().clickElement(label_ShowLaborDetails);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Number
     */
    public void clickOnNumber() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA")) {
            //      Thread.sleep(3000);
//       WaitActions.getWaits().scrollElementTillView(number_2row); moveOnTargetElement
//        WebElementActions.getActions().moveOnTargetElement(number_2row);

//       WaitActions.getWaits().waitForElementTobeClickable(number_2row);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(number_2row);
//        Thread.sleep(2000);
            WebElementActions.getActions().clickElement(number_2row);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * click on Show parts Details
     */
    public void clickOnShowPartsDetails() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ShowPartsDetails);
        WebElementActions.getActions().clickElement(label_ShowPartsDetails);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Back to Complete RO
     */
    public void clickOnBacktoCompleteRO() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_backtoCompleteRo);
        WebElementActions.getActions().clickElement(label_backtoCompleteRo);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on one reference number
     */
    public void clickOnReferenceNumber() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reference_number);
        WebElementActions.getActions().clickElement(reference_number);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on update Rates hyperlink
     */
    public void clickOnUpdatedRates() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UpdateRates);
        WebElementActions.getActions().clickElement(label_UpdateRates);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verified profit and loss element
     */
    public void verifyUpdateRates() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UpdateRates);
        Assert.assertTrue(UpdateRates.isDisplayed());
        Assert.assertTrue(laborCharge.isDisplayed());
        Assert.assertTrue(setHourlyChargeTo.isDisplayed());
        Assert.assertTrue(txt_setHourlyChargeTo.isDisplayed());
        Assert.assertTrue(set_btn.isDisplayed());
        Assert.assertTrue(Sethourlychargetodefault.isDisplayed());
        Assert.assertTrue(partCharge.isDisplayed());
        Assert.assertTrue(SetPartsChargeTo.isDisplayed());
        Assert.assertTrue(txt_SetPartsChargeTo.isDisplayed());
        Assert.assertTrue(btn_set.isDisplayed());
        Assert.assertTrue(Setpartschargetodefault.isDisplayed());
        Assert.assertTrue(btn_cancle2.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cancle button
     */
    public void clickOnCanclebutton2() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_cancle2);
        WebElementActions.getActions().clickElement(btn_cancle2);

        TestListener.saveScreenshotPNG(driver);
    }
        /**
         * click on sign out button
         * verify username
         */
    public void clickOnSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickElement(btn_signOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


}

