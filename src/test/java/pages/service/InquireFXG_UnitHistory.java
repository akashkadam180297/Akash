package pages.service;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("Unit Functionality Test")


public class InquireFXG_UnitHistory extends TestDriverActions {

      @FindBy(xpath = "(//a[text()='FedEx Fleet History'])[1]")
      WebElement label_FedExFleetHistory;

      @FindBy(xpath = "//h1[text()='History Search']/following::span[1]")
      WebElement asterisk_unitNum;

      @FindBy(xpath = "//label[text()='Unit Number:']")
      WebElement label_unitNumber;

      @FindBy(xpath = "//h1[text()='History Search']/following::a[1]")
      WebElement hyperlink_selectUnit;

  //    @FindBy(xpath = "//div[contains(text(),'Search Unit')]")
      @FindBy(xpath = "//div[contains(@id,'rFXGH:0:pw4::_ttxt')]")
      WebElement label_searchunit;

      @FindBy(xpath = "//span[contains(@id,'rFXGH:0:r1:0:sSEquQ:ol22')]")
      WebElement label_SearchUNIT;

      @FindBy(xpath = "(//label[text()='Result:'])[1]")
      WebElement label_result;

      @FindBy(xpath = "//td[text()='25']")
      WebElement label_25;

      @FindBy(xpath = "(//td[text()='of'])[2]")
      WebElement label_of;

      @FindBy(xpath = "//td[text()='units']")
      WebElement label_units;

      @FindBy(xpath = "(//span[text()='Load more...'])[2]")
      WebElement label_LoadMore;

      @FindBy(xpath = "(//span[text()='Owner'])[1]")
      WebElement label_owner;

      @FindBy(xpath = "(//span[text()='Unit Number'])[1]")
      WebElement label_unitNumber1;

      @FindBy(xpath = "(//span[text()='Description'])[3]")
      WebElement label_description;

      @FindBy(xpath = "//span[text()='License Plate']")
      WebElement label_Licenseplate;

      @FindBy(xpath = "(//span[text()='VIN'])[1]")
      WebElement label_VIN;

      @FindBy(xpath = "(//span[text()='Domicile Location'])[1]")
      WebElement label_domicileLocation;

      @FindBy(xpath = "(//span[text()='Current Location'])[1]")
      WebElement label_currentLocation;

      @FindBy(xpath = "(//span[text()='Priority'])[1]")
      WebElement label_priority;

      @FindBy(xpath = "//span[text()='Priority']/following::div[1]")
      WebElement search_column;

      @FindBy(xpath = "(//span[text()='Select'])[1]")
      WebElement selectBtn;

      @FindBy(xpath = "(//label[text()='Search Unit:']/following::input)[1]")
      WebElement txt_search;

      @FindBy(xpath = "//span[text()='Select']")
      WebElement btn_select;

      @FindBy(xpath = "//label[text()='Unit Number:']")
      WebElement label_unitNumber2;

      @FindBy(xpath = "//label[text()='Unit Number:']/following::a[1]")
      WebElement hyperlink_unitNumber;

      @FindBy(xpath = "//label[text()='Description:']/following::label[1]")
      WebElement label_VIN1;

      @FindBy(xpath = "//h1[text()='History Search']")
      WebElement label_HistorySearch;

      @FindBy(xpath = "//h1[text()='History Search']/following::span[1]")
      WebElement asterisk_unitNumber2;

      @FindBy(xpath = "//label[text()='Unit Number:']/following::span[1]")
      WebElement asterisk_fromDate;

      @FindBy(xpath = "//label[text()='From Date:']")
      WebElement label_fromDate;

      @FindBy(xpath = "//label[text()='From Date:']/following::input[1]")
      WebElement txt_fromdate;

      @FindBy(xpath = "//label[text()='From Date:']/following::a[1]")
      WebElement datepicker1;

      @FindBy(xpath = "//label[text()='From Date:']/following::span[2]")
      WebElement asterisk_todate;

      @FindBy(xpath = "//label[text()='To Date:']")
      WebElement label_toDate;

      @FindBy(xpath = "//label[text()='To Date:']/following::input[1]")
      WebElement txt_toDate;

      @FindBy(xpath = "//label[text()='To Date:']/following::a[1]")
      WebElement datepicker_2;

      @FindBy(xpath = "//label[text()='Sys, Asm, Desc:']")
      WebElement label_Sys_Asm_Desc;

      @FindBy(xpath = "//label[text()='Sys, Asm, Desc:']/following::input[1]")
      WebElement txt_Sys_ASM_Desc;

      @FindBy(xpath = "//span[text()='Search']")
      WebElement btn_search ;

      @FindBy(xpath = "//label[text()='Description:']")
      WebElement description;

      @FindBy(xpath = "//label[text()='Description:']/following::div[1]")
      WebElement txt_description;

      @FindBy(xpath = "//label[text()='License #:']")
      WebElement label_License;

      @FindBy(xpath = "//label[text()='License #:']/following::div[1]")
      WebElement txt_License;

      @FindBy(xpath = "//label[text()='Year:']")
      WebElement label_year;

      @FindBy(xpath = "//label[text()='Year:']/following::div[1]")
      WebElement txt_year;

      @FindBy(xpath = "//label[text()='Make:']")
      WebElement label_make;

      @FindBy(xpath = "//label[text()='Make:']/following::div[1]")
      WebElement txt_make;

      @FindBy(xpath = "//label[text()='Model:']")
      WebElement label_model;

      @FindBy(xpath = "//label[text()='Model:']/following::div[1]")
      WebElement txt_model;

      @FindBy(xpath = "//label[text()='Equipment Type:']")
      WebElement label_EquipmentType;

      @FindBy(xpath = "//label[text()='Equipment Type:']/following::div[1]")
      WebElement txt_equipmentType;

      @FindBy(xpath = "//label[text()='SRT Group:']")
      WebElement label_SRT_Group;

      @FindBy(xpath = "//label[text()='SRT Group:']/following::div[1]")
      WebElement txt_SRT_Group;

      @FindBy(xpath = "//label[text()='In Service Date:']")
      WebElement label_serviceDate;

      @FindBy(xpath = "//label[text()='In Service Date:']/following::div[1]")
      WebElement txt_serviceDate;

      @FindBy(xpath = "//label[text()='Netbook Value:']")
      WebElement label_Netbook_value;

      @FindBy(xpath = "//label[text()='Netbook Value:']/following::td[2]")
      WebElement value_Netbook_value;

      @FindBy(xpath = "//label[text()='Netbook Value:']/following::label[1]")
      WebElement value_Netbook;

      @FindBy(xpath = "//label[text()='Netbook Value:']/following::td[7]")
      WebElement Netbook_Date;

      @FindBy(xpath = "//label[text()='Status:']")
      WebElement label_status;

      @FindBy(xpath = "//label[text()='Status:']/following::div[1]")
      WebElement status_txt;

      @FindBy(xpath = "//span[text()='Red Tag']")
      WebElement btn_Red_Tag;

      @FindBy(xpath = "//h1[text()='Labour for  824014']")
      WebElement label_Labour_for;

      @FindBy(xpath = "//td[text()='Labour Lines']/preceding::td[6]")
      WebElement label_zero_1;

      @FindBy(xpath = "//td[text()='Labour Lines']/preceding::td[4]")
      WebElement label_Of;

      @FindBy(xpath = "//td[text()='Labour Lines']/preceding::td[2]")
      WebElement label_zero_2;

      @FindBy(xpath = "//td[text()='Labour Lines']")
      WebElement label_Labour_lines;

      @FindBy(xpath = "//span[text()='RO Date']")
      WebElement label_Ro_date;

      @FindBy(xpath = "//span[text()='VMRS']")
      WebElement label_VMRS;

      @FindBy(xpath = "(//span[text()='Description'])[1]")
      WebElement label_description2;

      @FindBy(xpath = "//h1[text()='Repair Details']")
      WebElement label_repairDetails;

      @FindBy(xpath = "//label[text()='Complaint:']")
      WebElement label_complaunt;

      @FindBy(xpath = "//label[text()='Cause/Reason:']")
      WebElement label_cause_reason;

      @FindBy(xpath = "//label[text()='Correction/Task:']")
      WebElement label_correction_task;

      @FindBy(xpath = "//h1[text()='Parts']")
      WebElement label_parts;

      @FindBy(xpath = "//span[text()='Part Number']")
      WebElement label_part_Number;

      @FindBy(xpath = "(//span[text()='Description'])[2]")
      WebElement label_description3;

      @FindBy(xpath = "//span[text()='Qty']")
      WebElement label_Qty;

      @FindBy(xpath = "//span[text()='UOM']")
      WebElement label_UOM;

      @FindBy(xpath = "//a[text()='Sign Out']")
      WebElement btn_signOut;

      @FindBy(xpath = "//input[@name='username']")
      public WebElement inputbox_Username;

      @FindBy(xpath = "//h1[text()='Working...Please Wait']")
      List<WebElement> loder;



      /**
       * Go to Complete Ro
       */
      public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
          ReusableActions.getActions().clickParentMenu("Service");
          ReusableActions.getActions().clickChildMenu("Complete RO");
          TestListener.saveScreenshotPNG(driver);
      }
      /**
       * click on FedEx Fleet History
       */
      public void fedFxFleetHistory() throws InterruptedException {
//         WaitActions.getWaits().waitForElementTobeClickable(label_FedExFleetHistory);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_FedExFleetHistory);
         WebElementActions.getActions().clickElement(label_FedExFleetHistory);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * click on select Unit
       */
      public void clickOnSelectUnit() throws InterruptedException {
 //           WaitActions.getWaits().WaitUntilWebElementIsVisible(asterisk_unitNum);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(asterisk_unitNum);
            Assert.assertTrue(asterisk_unitNum.isDisplayed());
            Assert.assertTrue(label_unitNumber.isDisplayed());

 //           WaitActions.getWaits().waitForElementTobeClickable(hyperlink_selectUnit);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_selectUnit);
            WebElementActions.getActions().clickUsingJS(hyperlink_selectUnit);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * verify Search Unit POP Up  elements
       */
      public void verifySearchUnitElement() throws InterruptedException {
//           Thread.sleep(5000);
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_searchunit);
//            Assert.assertTrue(label_searchunit.isDisplayed());
//            Thread.sleep(3000);
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_SearchUNIT);
//            Assert.assertTrue(label_SearchUNIT.isDisplayed());
 //           WaitActions.getWaits().WaitUntilWebElementIsVisible(label_result);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_result);
            Assert.assertTrue(label_result.isDisplayed());
            Assert.assertTrue(label_25.isDisplayed());
            Assert.assertTrue(label_of.isDisplayed());
            Assert.assertTrue(label_units.isDisplayed());
            Assert.assertTrue(label_LoadMore.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * Verify Serach Header Column ELement
        */
        public void verifySearchHeaderColumnElement()
        {
            Assert.assertTrue(label_owner.isDisplayed());
            Assert.assertTrue(label_unitNumber1.isDisplayed());
            Assert.assertTrue(label_description.isDisplayed());
            Assert.assertTrue(label_Licenseplate.isDisplayed());
            Assert.assertTrue(label_VIN.isDisplayed());
            Assert.assertTrue(label_domicileLocation.isDisplayed());
            Assert.assertTrue(label_currentLocation.isDisplayed());
            Assert.assertTrue(label_priority.isDisplayed());
            Assert.assertTrue(search_column.isDisplayed());
            Assert.assertTrue(selectBtn.isDisplayed());
              TestListener.saveScreenshotPNG(driver);
      }
      /**
       * Enter on Unit Number
       */
      public void enterOnUnitNumber() throws InterruptedException {
//            WaitActions.getWaits().waitForElementTobeClickable(txt_search);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_search);
            WebElementActions.getActions().inputText(txt_search,prop.getProperty("UnitNumber"));
  //          Thread.sleep(3000);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * Click on select button
       */
        public void clickOnSelectButton() throws InterruptedException {
//              Thread.sleep(3000);
//              WaitActions.getWaits().waitForElementTobeClickable(btn_select);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select);
              WebElementActions.getActions().clickElement(btn_select);

              WaitActions.getWaits().loadingWait(loder);
              TestListener.saveScreenshotPNG(driver);
        }
      /**
       * verify UnitNumber and VIN
       */
      public void verifyUnitNumber_VIN() throws InterruptedException {
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_unitNumber2);
 //           Thread.sleep(3000);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_unitNumber2);
            Assert.assertTrue(label_unitNumber2.isDisplayed());
            Assert.assertTrue(label_VIN1.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * Verify Element underlying History Screen
       */
        public void verifyElementUnderlyingHistoryScreen() throws InterruptedException {
//              WaitActions.getWaits().WaitUntilWebElementIsVisible(label_HistorySearch);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_HistorySearch);
              Assert.assertTrue(label_HistorySearch.isDisplayed());
              Assert.assertTrue(asterisk_unitNumber2.isDisplayed());
              Assert.assertTrue(label_unitNumber2.isDisplayed());
              Assert.assertTrue(hyperlink_unitNumber.isDisplayed());
              Assert.assertTrue(asterisk_fromDate.isDisplayed());
              Assert.assertTrue(label_fromDate.isDisplayed());
              Assert.assertTrue(txt_fromdate.isDisplayed());
              Assert.assertTrue(datepicker1.isDisplayed());
              Assert.assertTrue(asterisk_todate.isDisplayed());
              Assert.assertTrue(label_toDate.isDisplayed());
              Assert.assertTrue(txt_toDate.isDisplayed());
              Assert.assertTrue(datepicker_2.isDisplayed());
              Assert.assertTrue(label_Sys_Asm_Desc.isDisplayed());
              Assert.assertTrue(txt_Sys_ASM_Desc.isDisplayed());
              Assert.assertTrue(btn_search.isDisplayed());
              Assert.assertTrue(description.isDisplayed());
              Assert.assertTrue(txt_description.isDisplayed());
              Assert.assertTrue(label_License.isDisplayed());
              Assert.assertTrue(txt_License.isDisplayed());
              Assert.assertTrue(label_year.isDisplayed());
              Assert.assertTrue(txt_year.isDisplayed());
              Assert.assertTrue(label_make.isDisplayed());
              Assert.assertTrue(txt_make.isDisplayed());
              Assert.assertTrue(label_model.isDisplayed());
              Assert.assertTrue(txt_model.isDisplayed());
              Assert.assertTrue(label_EquipmentType.isDisplayed());
              Assert.assertTrue(txt_equipmentType.isDisplayed());
              Assert.assertTrue(label_SRT_Group.isDisplayed());
              Assert.assertTrue(txt_SRT_Group.isDisplayed());
              Assert.assertTrue(label_serviceDate.isDisplayed());
              Assert.assertTrue(txt_serviceDate.isDisplayed());
              Assert.assertTrue(label_Netbook_value.isDisplayed());
              Assert.assertTrue(value_Netbook_value.isDisplayed());
              Assert.assertTrue(value_Netbook.isDisplayed());
              Assert.assertTrue(Netbook_Date.isDisplayed());
              Assert.assertTrue(label_status.isDisplayed());
              Assert.assertTrue(status_txt.isDisplayed());
              Assert.assertTrue(btn_Red_Tag.isDisplayed());
              TestListener.saveScreenshotPNG(driver);

        }
      /**
       * Verify Element of Labour Pane
        */
        public void verifyLabourPaneElement() throws InterruptedException {
//              WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Labour_for);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labour_for);
              Assert.assertTrue(label_Labour_for.isDisplayed());
              Assert.assertTrue(label_zero_1.isDisplayed());
              Assert.assertTrue(label_Of.isDisplayed());
              Assert.assertTrue(label_zero_2.isDisplayed());
              Assert.assertTrue(label_Labour_lines.isDisplayed());
              TestListener.saveScreenshotPNG(driver);
        }
      /**
       * click on Unit Number Hyperlink
       */
      public void clickOnUnitNumberHyperlink() throws InterruptedException {
 //           WaitActions.getWaits().waitForElementTobeClickable(hyperlink_unitNumber);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_unitNumber);
            WebElementActions.getActions().clickElement(hyperlink_unitNumber);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * Enter number
       */
        public void enterNumber() throws InterruptedException {
//              WaitActions.getWaits().waitForElementTobeClickable(txt_search);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_search);
              WebElementActions.getActions().inputText(txt_search,prop.getProperty("SearchUnit"));
  //            Thread.sleep(3000);
              WaitActions.getWaits().loadingWait(loder);
              TestListener.saveScreenshotPNG(driver);
        }
      /**
       *click on link text Search
       */
      public void clickOnLinktextSearch() throws InterruptedException {
 //           WaitActions.getWaits().waitForElementTobeClickable(btn_search);
  //          Thread.sleep(3000);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_search);
            WebElementActions.getActions().clickElement(btn_search);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * verify RO Date, VMRS, Description
       */
      public void actualDataArea() throws InterruptedException {
  //          Thread.sleep(3000);
 //           WaitActions.getWaits().WaitUntilWebElementIsVisible(label_Ro_date);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Ro_date);
            Assert.assertTrue(label_Ro_date.isDisplayed());
            Assert.assertTrue(label_VMRS.isDisplayed());
            Assert.assertTrue(label_description2.isDisplayed());
            TestListener.saveScreenshotPNG(driver);

      }
      /**
       * verify repair details
       */
      public void verifyRepairDetails() throws InterruptedException {
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_repairDetails);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_repairDetails);
            Assert.assertTrue(label_repairDetails.isDisplayed());
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_complaunt);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_complaunt);
            Assert.assertTrue(label_complaunt.isDisplayed());
            Assert.assertTrue(label_cause_reason.isDisplayed());
            Assert.assertTrue(label_correction_task.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * Parts Panel
       */
      public void verifyPartsPanel() throws InterruptedException {
//            WaitActions.getWaits().WaitUntilWebElementIsVisible(label_parts);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_parts);
            Assert.assertTrue(label_part_Number.isDisplayed());
            Assert.assertTrue(label_description3.isDisplayed());
            Assert.assertTrue(label_Qty.isDisplayed());
            Assert.assertTrue(label_UOM.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
      }
      /**
       * click on sign out button
       * verify username
       */
      public void clickOnSignOut () throws InterruptedException {
 //           WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
            Thread.sleep(3000);
            WebElementActions.getActions().clickUsingJS(btn_signOut);


//            WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
            Assert.assertTrue(inputbox_Username.isDisplayed());
            TestListener.saveScreenshotPNG(driver);
      }






}

