package tests.parts;

import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReceiveParts extends TestDriverActions{

        @Test(priority = 0, description = "Test_001 Login to the page and go to Receive Part screen ")
        @Description("Test Description: Login to the page and go to Receive Part screen  ")
        public void Test_001_gotoReceiveParts() throws IOException, InterruptedException {
            loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
            receivepart.gotoReceiveParts();

        }

        @Test(priority = 1, description = "Test002: click on PO number and verify Link/DeLink Labor")
        @Description("Test Description : Click on PO number and Verify Link/DeLink Labor")
        public void Test_002_clickOnPoNumber() throws FileNotFoundException, InterruptedException {
            receivepart.clickOnPONumber();
            receivepart.verifyLinkDelinkLabor();
        }

        @Test(priority = 2, description = "Test003: verify Purches Order ")
        @Description("Test Description :  verify Purches Order ")
        public void Test_003_verifyPurchesOrder() throws FileNotFoundException, InterruptedException {
            receivepart.verifyPurchesOrder();
            receivepart.verifyReuiredLocation();
            receivepart.verifyLocation();
            receivepart.verifyLocationValue();
            receivepart.verifyRequiredVendor();
            receivepart.verifyVendor();
            receivepart.verifyVendorValue();
            receivepart.verifyPO();
            receivepart.verifyPOValue();
            receivepart.verifyRefernce();
            receivepart.verifyPODateText();
            receivepart.verifyTranspotPriority();

        }

        @Test(priority = 3, description = "Test004: verify Notes ")
        @Description("Test Description :verify Notes ")
        public void Test_004_verifyNotes() throws FileNotFoundException, InterruptedException {
            receivepart.verifyNotes();
            receivepart.verifyIcon();
            receivepart.verifyImgValue();
            receivepart.verifyShipFrom();
            receivepart.verifyShipFrom();
            receivepart.verifyShipTo();
            receivepart.verifySubmittedDate();
            receivepart.verifyReceivingInfo();
            receivepart.verifyReceivingInfoValue();

        }

        @Test(priority = 4, description = "Test005: verify Voided Date  ")
        @Description("Test Description :verify Voided Date ")
        public void Test_005_verifyvoidedDate() throws FileNotFoundException, InterruptedException {
            receivepart.verifyvoidedDate();
            receivepart.verifyClosedDate();
            receivepart.verifyPartsPO();
            receivepart.verifyParts();
            receivepart.verifyPartsPrice();
            receivepart.verifyAddedCost();
            receivepart.verifyAddedCostValue();
            receivepart.verifySubTotal();
            receivepart.verifyTaxes();
            receivepart.verifyTotal();
            receivepart.verifyPartsHash();

        }

        @Test(priority = 5, description = "Test006: verify Vendor Part   ")
        @Description("Test Description :verify Vendor Part  ")
        public void Test_006_verifyVendorPart() throws FileNotFoundException, InterruptedException {
            receivepart.verifyVendorPart();
            receivepart.verifyDescription();
            receivepart.verifyOrderQuantity();
            receivepart.verifyUOM();
            receivepart.verifyStockUOM();
            receivepart.verifyConv();
            receivepart.verifyUnitCost();
            receivepart.verifyCore();
            receivepart.verifyExtendedCost();
            receivepart.verifyLinkDeLink();
            receivepart.verifyCancel();
            receivepart.verifyButtonCancel();

        }

        @Test(priority = 6, description = "Test007: verify Link   ")
        @Description("Test Description :verify Vendor Link   ")
        public void Test_007_verifyLink() throws FileNotFoundException, InterruptedException {
            receivepart.verifyLink();
            receivepart.clickOnLinkButton();
            receivepart.verifyLinkPartToRO();
            receivepart.verifyPartTwo();
            receivepart.verifyFullPartNumber();
            receivepart.verifyRepairOrderAct();
            receivepart.verifyCountersale();
            receivepart.verifySearch();
            receivepart.verifyRoNumber();
            receivepart.verifyRoDate();
            receivepart.verifyUnit();
            receivepart.verifyDescriptionone();
            receivepart.verifyCustomerName();
        }

        @Test(priority = 7, description = "Test008: verify Hash ")
        @Description("Test Description :verify Vendor Hash  ")
        public void Test_008_verifyHash () throws FileNotFoundException, InterruptedException {
            receivepart.verifyHash();
            receivepart.verifyVMRS();
            receivepart.verifyDescriptionThree();
            receivepart.verifySelectColumnOne();
            receivepart.verifySelectOne();
            receivepart.clickOnCounterSaleRadio();
            receivepart.verifyOpenCounterSale();
            receivepart.verifyDateTwo();
            receivepart.verifyCustomer();
            receivepart.verifySelectTwo();
        }
        @Test(priority = 8, description = "Test009: click On Cancel Button ")
        @Description("Test Description : click On Cancel Button ")
        public void Test_009_clickOnCancelButton () throws FileNotFoundException, InterruptedException {
            receivepart.clickOnCancelButton ();
            receivepart. clickOnReceiveParts ();
            receivepart.clickOnChangePreferredVendor ();
            receivepart. clickOnSelectAll ();
            receivepart. clickOnChangeSelected ();
            receivepart.clickOnReceivePartsButton ();
    //        receivepart.clickOnInvoiceNumber ();
            receivepart.clickOnReceivePartsTwo ();
            receivepart. clickCancelButton ();
            receivepart.clickOnsignOut ();
            receivepart.clickOnUserName ();


        }
    }





