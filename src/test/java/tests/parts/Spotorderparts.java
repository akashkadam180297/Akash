package tests.parts;


import constants.SheetConstants;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.apache.log4j.spi.LocationInfo.NA;
import static org.apache.poi.util.LocaleID.EU;
import static org.apache.xalan.xsltc.runtime.CallFunction.className;


public class Spotorderparts extends TestDriverActions {

    @Test(priority = 0, description = "Test_001 Login to the page and go to Order Part screen ")
    @Description("Test Description:  Login to the page and go to Order Part screen  ")
    public void Test_001_gotoOrderPartsScreen () throws IOException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
         spotorderparts.gotoOrderPartsScreen ();

    }

    @Test(priority = 1, description = "Test_002 click On The Spot order Tab ")
    @Description("Test Description:   click On The Spot order Tab  ")
    public void Test_002_clickOnSpotOrder() throws FileNotFoundException, InterruptedException {
        spotorderparts.clickOnSpotOrder();
        spotorderparts. verifySearchTextArea();
        spotorderparts.verifyNewPart ();
        spotorderparts. verifyOrderPart();
        spotorderparts.verifyOrderList();
        spotorderparts.verifyWarehouse();
        spotorderparts.verifyTotalText ();
        spotorderparts.verifyRefreshText();
        spotorderparts.verifyTextPart ();
        spotorderparts.verifyTextUOM ();
        spotorderparts.verifyQuantity ();
        spotorderparts.verifyExtended ();
        spotorderparts. verifyPleaseAddPart();

    }
    @Test(priority = 2, description = "Test_003  input Partial Part Number ")
    @Description("Test Description:verify input Partial Part Number ")
    public void Test_003_inputPartialPartNumber() throws FileNotFoundException, InterruptedException {

        spotorderparts.inputPartialPartNumber();
        spotorderparts.verifyFullPartNumber();
        spotorderparts.verifyOrderPArtDescription ();
        spotorderparts. verifyPartText ();
        spotorderparts. verifyPrice ();
        spotorderparts.verifyInStock ();
        spotorderparts.verifyNotes ();
        spotorderparts.verifyValue ();

    }

    @Test(priority = 3, description = "Test_004 click On Add Button ")
    @Description("Test Description:  click On Add Button ")
    public void Test_004_clickOnAddButton() throws FileNotFoundException, InterruptedException {
        spotorderparts.clickOnAddButton();
        spotorderparts.verifyOrderpartDescription();
        spotorderparts.verifyFuLLPartNumber ();
        spotorderparts. verifyQauntityValue ();
        spotorderparts.verifyorderprice();
        spotorderparts. verifyTotalOrder ();
        spotorderparts.inputPartNameWrenchWheelbrace();
        spotorderparts.selectPartDescriptionDropdown();
        spotorderparts.clickOnAdd();
    }

    @Test(priority = 4, description = "Test_005 verify Search Part Description ")
    @Description("Test Description:  verify Search Part Description  ")
    public void Test_005_verifySearchPartDescription() throws FileNotFoundException, InterruptedException {
        spotorderparts.verifySearchPartDescription();
        spotorderparts.verifySearchPartDescriptionNumber ();
        spotorderparts.verifypriceOrder ();
        spotorderparts.verifyPartPrice ();
        spotorderparts.verifyTotalOrderPrice ();
        spotorderparts. verifyPartPriceTwo ();
        spotorderparts.verifypriceOrder();
        spotorderparts.SelectExactPart();
        spotorderparts.InputFullPartNumber();
        spotorderparts. verifyValueTwo();
        spotorderparts.inputQuantityValue();
        spotorderparts. clickOnIncerement ();
        spotorderparts.clickOnDecrement ();
        spotorderparts. clickOnAddbutton ();
        spotorderparts.verifyOnValueThree ();
        spotorderparts.verifyCalculatedOrderTotal ();
        spotorderparts.clickOnlabelPartQuantity ();
    }

    @Test(priority = 5, description = "Test_006 input Core Parent Part and sign out  ")
    @Description("Test Description: input Core Parent Part and sign out ")
    public void Test_006_inputCoreParentPart() throws FileNotFoundException, InterruptedException {
        spotorderparts.inputCoreParentPart();
        spotorderparts.verifyAddButton();
        spotorderparts.verifyCoreParentpart();
        spotorderparts.verifyChildPart();
        spotorderparts.verifyStoreTextOrderTotal();
        spotorderparts.clickOnIssuePO();
        spotorderparts.verifyOnIssuePO();
        spotorderparts.verifyVendorName();
        spotorderparts.verifyAmout();
        spotorderparts.verifyCancelElement();
        spotorderparts.verifyPartVendorName();
        spotorderparts.verifyOrderTotal();
        spotorderparts.clickOnIssuePOButton();
        spotorderparts.verifyPurchesOrder();
        spotorderparts.RequiredLocation();
        spotorderparts.verifyRequiredVendor();
    }
        @Test(priority = 6, description = "Test_007 verify PO  ")
        @Description("Test Description: verify PO ")
        public void Test_007_verifyPO () throws FileNotFoundException, InterruptedException {
            spotorderparts.verifyPO();
            spotorderparts.verifyReferance();
            spotorderparts.verifyPODate();
            spotorderparts.verifyTransPOrtPriority();
            spotorderparts.verifyNotesTextArea();
            spotorderparts.verifyShipForm();
            spotorderparts.verifyShipTo();
            spotorderparts.verifySubmittedDate();
            spotorderparts.verifyReceivingInfo();
            spotorderparts.verifyImageIcon();
            spotorderparts.verifyVoidDate();
            spotorderparts.verifyClosedDate();
            spotorderparts.verifyPart();
            spotorderparts.verifyAddCost();
            spotorderparts.verifySubTotal();
            spotorderparts.verifyTaxes();
            spotorderparts.verifyTotal();
        }
    @Test(priority = 7, description = "Test_008 verify Required Part  ")
    @Description("Test Description: verify Required Part ")
    public void Test_008_verifyRequiredPart () throws FileNotFoundException, InterruptedException {
        spotorderparts.verifyRequiredPart();
        spotorderparts.verifySearchIcon();
        spotorderparts.verifyQTY();
        spotorderparts.verifyAddPart();
        spotorderparts.verifyPartHash();
        spotorderparts.verifyVendorPart();
        spotorderparts.verifyDescription();
        spotorderparts.verifyOrderQuantity();
        spotorderparts.verifyUOM();
        spotorderparts.verifyConv();
        spotorderparts.verifyUnitCost();
        spotorderparts.verifyCore();
        spotorderparts.verifyExtendedCost();
        spotorderparts.verifyCancelIcon();
        spotorderparts.verifyLinkDeLinkLabor();
        spotorderparts.verifyOrderPartDescription();
        spotorderparts.verifyInputValue();
        spotorderparts.verifyDeleteIcon();
        spotorderparts.verifyLinkButton();
        spotorderparts.verifyCOpyPO();
        spotorderparts.verifyVoidButton();
        spotorderparts.verifyOKButton();
        spotorderparts.verifySubmitPrintPO();
        spotorderparts.clickOnOKButton();
        spotorderparts.clickOnWIPPOs();
        spotorderparts.verifyWIPPOs();

    }
    @Test(priority = 8, description = "Test_009 verify Warehouse Text ")
    @Description("Test Description: verify Warehouse Text () ")
    public void Test_009_verifyWarehouseText () throws FileNotFoundException, InterruptedException {
        spotorderparts.verifyWarehouseText ();
        spotorderparts.verifySearch ();
        spotorderparts. verifyRefreshButton ();
        spotorderparts.  verifyOrder ();
        spotorderparts.verifyDate ();
        spotorderparts.verifyVendorText ();
        spotorderparts. verifyTextWarehouse ();
        spotorderparts.verifyTextReferance  ();
        spotorderparts. verifyTextStatus ();
        spotorderparts.  verifyPONumbewr ();
        spotorderparts. verifyTextVendorName ();
        spotorderparts. verifyOpen ();
        spotorderparts.verifyOrderSummary ();
        spotorderparts.verifyVendorvalue  ();
        spotorderparts. verifyAddress ();
        spotorderparts. verifyPoDate ();
        spotorderparts.clickOnPoNumber();
        spotorderparts.verifyPONumber ();
        spotorderparts.clickOnSumbmitPrintPOButton();
        spotorderparts.clickOnSignOut();
        spotorderparts.clickOnUserNameTextArea();

    }
}