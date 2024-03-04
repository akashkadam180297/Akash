package tests.cGVUnitFunctionalityTest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class InquireFXG_UnitHistoryTest extends TestDriverActions {
    @Test(priority = 0, description = "verify and using Login and password credentials")
    @Description("Test Description -verify and using Login and password credentials ")
    public void gotoFedExFleetHistory() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(prop.getProperty("gmail_one_username"), prop.getProperty("gmail_one_password"));
        unithistorypage.goToCompleteROScreen();
        unithistorypage.clickFedExFleetHistory ();

    }
    @Test(priority = 1, description = "verify Require Test & TextUnit Number ")
    @Description("Test Description -verify Require Test & TextUnit Number  ")
    public void  verifyRequiredText () throws InterruptedException, IOException {
        unithistorypage.verifyRequiredText ();
        unithistorypage. verifyTextUnitNumber ();
    }
    @Test(priority = 2, description = "click On Select Unit")
    @Description("Test Description -click On Select Unit ")
    public void  clickOnSelectUnit ()  throws InterruptedException, IOException {
        unithistorypage.clickOnSelectUnit ();

    }
    @Test(priority = 3, description = "verify Search Unit ")
    @Description("Test Description -verify verify Search Unit ")
    public void verifySearchUnit ()   throws InterruptedException, IOException {

        unithistorypage.verifyTextSearchUnit ();
        unithistorypage. verifyTextResult ();
        unithistorypage.verifyValue ();
        unithistorypage.verifyTextOf ();
        unithistorypage.verifyUnits ();
        unithistorypage.verifyTotalCountUnitNumber ();
        unithistorypage.verifyOwner ();
        unithistorypage. verifyUnitNumber ();
        unithistorypage.verifyDescription ();

    }
    @Test(priority = 4, description = "verify License Plate ")
    @Description("Test Description -verify License Plate ")
    public void  verifyLicensePlate ()   throws InterruptedException, IOException {
        unithistorypage.verifyLicensePlate ();
        unithistorypage. verifyVin ();
        unithistorypage.verifyDomicileLocation ();
        unithistorypage.verifyCurrentLocation ();
        unithistorypage. verifyPriority ();
        unithistorypage.verifySelectButtonHeader ();
        unithistorypage.verifySelectButton();

    }
    @Test(priority = 5, description = "Enter the Unit Number And verify Text")
    @Description("Test Description -Enter the Unit Number And verify Text ")
    public void  enterUnitNumber  ()   throws InterruptedException, IOException {
        unithistorypage.enterUnitNumber  ();
        unithistorypage. clickOnSelectButton ();
        unithistorypage.verifySepecificationForUnitNumber ();
        unithistorypage. verifyTextVIN ();
        unithistorypage. verifyHistorySearch ();
        unithistorypage.verifyRequiredUnitNumber ();
        unithistorypage.verifyUnitNumberLabel();
        unithistorypage. verifyUnitNumberSearchHistory ();
        unithistorypage. verifyFromDateRequired ();
        unithistorypage.verifyFromDate ();
        unithistorypage.verifyFromDatePresent ();
    }
    @Test(priority = 6, description = "verify The text and its value ")
    @Description("Test Description -verify The text and its value ")
    public void  verifyDatePicker ()  throws InterruptedException, IOException {
        unithistorypage.verifyDatePicker ();
        unithistorypage.verifyTODateRequired ();
        unithistorypage.verifyToDate ();
        unithistorypage.verifyToDateTextArea ();
        unithistorypage.verifyToDaysDate ();
        unithistorypage.verifyDescText ();
        unithistorypage.verifyTextArea ();
        unithistorypage. verifySearchButton ();
        unithistorypage. verifyDescriptionText ();
        unithistorypage. verifyDescriptionContains ();
        unithistorypage.verifyLicense ();
        unithistorypage.verifyLicenseValue ();
        unithistorypage. verifyYearText ();
        unithistorypage. verifyYearValue ();

    }
    @Test(priority = 7, description = "verify Text Make and verify TO Text")
    @Description("Test Description -verify Text Make and verify TO Text ")
    public void verifyTextMake ()  throws InterruptedException, IOException {

        unithistorypage.verifyTextMake();
        unithistorypage.verifyMakeNamePresent();
        unithistorypage.verifyTextModel();
        unithistorypage.verifyModelTextName();
        unithistorypage.verifyTextEquipmentType();
        unithistorypage.verifyTextEquipmentTypeTo();
        unithistorypage.verifySRTGroup();
        unithistorypage.verifySRTGroupTo();
        unithistorypage.verifyInServiceDate();
        unithistorypage.verifyServiceDateTo();
        unithistorypage.verifyNetBookValue();
    }
    @Test(priority = 8, description = "verify Net Book Value to ")
    @Description("Test Description -verify Net Book Value to ")
    public void  verifyNetBookValueTo () throws InterruptedException, IOException {

        unithistorypage.verifyNetBookValueTo ();
        unithistorypage. verifyASOfText ();
        unithistorypage.verifyStatusText ();
        unithistorypage.verifyStatusTo ();
        unithistorypage.verifyRedTagPresent ();
        unithistorypage.verifyTextFeature ();
        unithistorypage.verifyTextValue ();
    }

    @Test(priority = 9, description = "verify Text Labor")
    @Description("Test Description -verify Text Labor ")
    public void  verifyTextLabor () throws InterruptedException, IOException {
        unithistorypage.verifyTextLabor();
        unithistorypage.verifyZeroText();
        unithistorypage.verifyOfText();
        unithistorypage.verifyTextZero();
        unithistorypage.verifyLaborLines();
    }
    @Test(priority = 10, description = "click On Unit Number HyperLink ")
    @Description("Test Description -click On Unit Number HyperLink  ")
    public void  clickOnUnitNumberHyperlink () throws InterruptedException, IOException {
        unithistorypage.clickOnUnitNumberHyperlink ();
        unithistorypage.enterConTextArea ();
        unithistorypage. SelectButton ();
        unithistorypage.clickOnSearchButtonLink ();
        unithistorypage.verifyDescriptionPart ();
        unithistorypage.verifyRoDate ();
        unithistorypage. verifyVMRS ();
        unithistorypage. verifyDescriptionLabel ();
        unithistorypage.verifyRepairDetails ();
        unithistorypage. verifyParts ();
        unithistorypage. verifyPartNumber ();
        unithistorypage.verifyQTY ();
        unithistorypage.verifyUOM ();
        unithistorypage.verifySignOut ();

    }

    }