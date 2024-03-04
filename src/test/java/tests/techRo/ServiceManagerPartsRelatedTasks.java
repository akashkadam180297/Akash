package tests.techRo;

import io.qameta.allure.Description;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class ServiceManagerPartsRelatedTasks extends TestDriverActions {
    @Test(priority = 0, description = "Test_001_Login the page and Go to CompleteRo Screen")
    @Description("Test Description: Login the page and Go to CompleteRo Screen")
    public void Test_001_gotoCompleteRo() throws InterruptedException, IOException, FileNotFoundException {

        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        servicemanagerpartsrelatedtasks.goToCompleteROScreen();
        servicemanagerpartsrelatedtasks.clickOnReferenceNumber();
        servicemanagerpartsrelatedtasks.clickOnAddLabour();
        servicemanagerpartsrelatedtasks.clickOnAddLabour1();

    }

    @Test(priority = 1, description = "Test_002_click On Reference Number")
    @Description("Test Description: click On Reference Number")
    public void Test_002_clickOnReference() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.clickOnAddParts ();
        servicemanagerpartsrelatedtasks.clickImageCrossIcon();
        servicemanagerpartsrelatedtasks.clickImageDeleteIcon();

        servicemanagerpartsrelatedtasks.clickOnAddLabourSrNo();

    }

    @Test(priority = 2, description = "Test_003_click On part Number")
    @Description("Test Description: click On part Number")
    public void Test_003_clickOnPart() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.clickOnPartName();
        servicemanagerpartsrelatedtasks.verifyWareHouse();
        servicemanagerpartsrelatedtasks.verifyOnHand();
        servicemanagerpartsrelatedtasks.verifyStoreRoom();
        servicemanagerpartsrelatedtasks.verifyRowNumber();
        servicemanagerpartsrelatedtasks.verifyShelf();
        servicemanagerpartsrelatedtasks.verifyBinNumber();
        servicemanagerpartsrelatedtasks.verifyPartRequired();
        servicemanagerpartsrelatedtasks.verifyPart();
        servicemanagerpartsrelatedtasks.verifyPartTextArea();
        servicemanagerpartsrelatedtasks.verifyPartDescription();
        servicemanagerpartsrelatedtasks.verifyPartDescriptionTextArea();
        servicemanagerpartsrelatedtasks.verifyLaborRequired();

    }

    @Test(priority = 3, description = "Test_004_verify Labor Text ")
    @Description("Test Description: verify Labor Text ")
    public void Test_004_verifyLabor() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.verifyLabor();
        servicemanagerpartsrelatedtasks.verifyLaborDropDown();
        servicemanagerpartsrelatedtasks.verifyPartFailureRequired();
        servicemanagerpartsrelatedtasks.verifyPartFailure();
        servicemanagerpartsrelatedtasks.verifyPartFailureDropDown();
        servicemanagerpartsrelatedtasks.verifyChargeQuantityRequired();
        servicemanagerpartsrelatedtasks.verifyChargeQuantity();
        servicemanagerpartsrelatedtasks.verifyChargeQuantityTextArea();
        servicemanagerpartsrelatedtasks.verifyUnitCharge();
        servicemanagerpartsrelatedtasks.verifyUnitChargeTextBox();
        servicemanagerpartsrelatedtasks.verifyTotalCharge();


        servicemanagerpartsrelatedtasks.verifyTotalChargeValue();
        servicemanagerpartsrelatedtasks.verifyCancelButton();
        servicemanagerpartsrelatedtasks.verifyOkButton();

    }

    @Test(priority = 4, description = "Test_005_verify Charge Quantity Editable  ")
    @Description("Test Description: verify Charge Quantity Editable  ")
    public void Test_005_verifyChargeQuantityEditable() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.verifyChargeQuantityEditable();
        servicemanagerpartsrelatedtasks.verifyUnitChargeTextArea();
        servicemanagerpartsrelatedtasks.verifyChargeQuantityEditable();
        servicemanagerpartsrelatedtasks.verifyUnitChargeTextArea();
        servicemanagerpartsrelatedtasks.editChargeQuantity();
        servicemanagerpartsrelatedtasks.verifyOldTotalCharge();
        servicemanagerpartsrelatedtasks.verifyOldTotalCharge();
        servicemanagerpartsrelatedtasks.newTotalCharges();
        servicemanagerpartsrelatedtasks.typeUnitChargeValue();
        servicemanagerpartsrelatedtasks.clickOnChargeQuantity();
        servicemanagerpartsrelatedtasks.verifyNewTotalCharge();
        servicemanagerpartsrelatedtasks.verifyChargeQuantityEditable2();
        servicemanagerpartsrelatedtasks. verifyUnitChargeTextArea2();
        servicemanagerpartsrelatedtasks. clickOnOk();


    }

    @Test(priority = 5, description = "Test_006_click On Add Part ")
    @Description("Test Description: click On Add Part   ")
    public void Test_006_clickOnAddPart() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.clickOnAddPart();
        servicemanagerpartsrelatedtasks.clickOnImg();
        servicemanagerpartsrelatedtasks.verifyPartName();
        servicemanagerpartsrelatedtasks.verifyTextPartTextArea();
        servicemanagerpartsrelatedtasks.clickOnPartNumber();
        servicemanagerpartsrelatedtasks.clickOnIssuePart();
        servicemanagerpartsrelatedtasks.verifyPartNameTwo();
        servicemanagerpartsrelatedtasks.clickTextPartNumber();
        servicemanagerpartsrelatedtasks.clickOnPartNumberTwo();
        servicemanagerpartsrelatedtasks.clickOnIssuePartButton();
        servicemanagerpartsrelatedtasks.verifyChargeQuantityTwo();

    }

    @Test(priority = 6, description = "Test_007_click On Non-Catalog Part ")
    @Description("Test Description: click On Non-Catalog Part ")
    public void Test_007_clickOnNonCatalogPart() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.clickOnNonCatalogPart();
        servicemanagerpartsrelatedtasks.inputPartTextArea();
        servicemanagerpartsrelatedtasks.inputUnitTextArea();
        servicemanagerpartsrelatedtasks.clickIssuePart();
        servicemanagerpartsrelatedtasks.verifyPartOnHand();
        servicemanagerpartsrelatedtasks.clickOncancelicon ();
        servicemanagerpartsrelatedtasks.clickOnDelete ();
     //   servicemanagerpartsrelatedtasks.clickImageCrossIcon();
     //   servicemanagerpartsrelatedtasks.clickImageDeleteIcon();

    }

    @Test(priority = 7, description = "Test_008_click On Close Button ")
    @Description("Test Description: click On Close Button  ")
    public void Test_008_clickOnCloseButton() throws InterruptedException, IOException {
        servicemanagerpartsrelatedtasks.clickOnCloseButton ();
        servicemanagerpartsrelatedtasks. clickOnSignOut ();
        servicemanagerpartsrelatedtasks.clickOnUsername ();

    }

}
