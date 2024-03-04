package tests.Ticket;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("TransitonedPaccar")

public class TransitonedPaccar extends TestDriverActions {
    @Test(priority = 0, description = "Test_001_Login the page and Go to Standard Codes Screen")
    @Description("Test Description: Login the page and Go to Standard Codes Screen")
    public void Test_001_gotoStandardCodesScrren() throws InterruptedException, IOException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        location.gotoStandardCodesScrren();

    }
    @Test(priority = 1, description = "Test_002_click on Equipment ")
    @Description("Test Description: click on Equipment")
    public void Test_002_clickonEquipment () throws InterruptedException, IOException, FileNotFoundException {
        location.clickonEquipment ();
        location.clickOnPartPosition ();

    }
    @Test(priority = 2, description = "Test_003_verify New On Part Position  ")
    @Description("Test Description: verify New On Part Position ")
    public void Test_003_verifyNewOnPartPosition ()throws InterruptedException, IOException, FileNotFoundException {
        location.verifyNewOnPartPosition();
        location.verifyCodevalue ();

    }
    @Test(priority = 3, description = "Test_004_go To Complete RO Screen")
    @Description("Test Description: go To Complete RO Screen ")
    public void Test_004_goToCompleteROScreen()throws InterruptedException, IOException, FileNotFoundException {
        location.goToCompleteROScreen();
        location.clickOnInvoice ();
        location.clickOnRefresh ();

    }
    @Test(priority = 4, description = "Test_005_click On Referece")
    @Description("Test Description: click On Referece")
    public void Test_005_clickOnReferece () throws InterruptedException, IOException, FileNotFoundException {
        location.clickOnReferece();
        location.verifyDeleteCustomerInvoice ();
        location.clickOnPartNumber ();
    }
    @Test(priority = 5, description = "Test_006_verify Part")
    @Description("Test Description: verify Part")
    public void Test_006_verifyPart() throws InterruptedException, IOException, FileNotFoundException {
        location.verifyPart();
        location.verifyPartTextArea();
        location.verifyPartDescription();
        location.verifyPartDescriptionTextArea();
        location.verifyLaborRequired();
        location.verifyLabor();
        location.verifyLaborDropDown();
    }
    @Test(priority = 6, description = "Test_007_verify Part Failure Required")
    @Description("Test Description: verify Part Failure Required")
    public void Test_007_verifyPartFailureRequired() throws InterruptedException, IOException, FileNotFoundException {
        location.verifyPartFailureRequired();
        location.verifyPartFailure();
        location.verifyPartFailureDropDown();
        location.verifyChargeQuantityRequired();
        location.verifyChargeQuantity();
        location.verifyChargeQuantityTextArea();
        location.verifyUnitCharge();
    }
    @Test(priority = 8, description = "Test_009_verify Part Failure Required")
    @Description("Test Dscription: verify Part Failure Required")
    public void Test_009_vifyTotalCharge()  throws InterruptedException, IOException, FileNotFoundException {
        location.verifyTotalCharge();
        location.verifyTotalChargeValue();
        location.clickoncancel ();
        location. clickOnSignOut ();
        location.clickOnUsername ();
    }

}