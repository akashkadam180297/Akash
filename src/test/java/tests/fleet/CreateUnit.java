package tests.fleet;

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
@Feature("Create Unit Test")

public class CreateUnit extends TestDriverActions {


    @Test(priority = 0, description = "Test_001_Login the page and Go to create unit Screen",enabled = true)
    @Description("Test Description: Login the page and Go to create unit Screen")
    public void Test_001_gotoUnitMasterScreen() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        createUnitPage.gotoUnitMasterScreen();
        createUnitPage.clickNewUnit();
    }

    @Test(priority = 1, description = "Test_002_Search and select owner", enabled = true)
    @Description("Test Description: Search and select owner")
    public void Test_002_clickAddNewROAndSelectUnit() throws InterruptedException {
        createUnitPage.searchOwner();
        createRoPage.selectFirstUnit();
    }


    @Test(priority = 2, description = "Test_003_verify all element present in New Unit ", enabled = true)
    @Description("Test Description:verify all element present in New Unit")
    public void Test_003_verifyAllFormFields() throws InterruptedException {

        createUnitPage.newUnitmandotaryFieldsDisplay();
        createUnitPage.dotRequirementDisplay();
        createUnitPage.initialServiceDisplay();
        createUnitPage.makeAndModelDisplay();
        createUnitPage.groupDisplay();
    }

    @Test(priority = 3, description = "Test_004_Enter unit, description, VIN number and click on Save/Exit", enabled = true)
    @Description("Test Description: Enter unit, description, VIN number and click on Save/Exit")
    public void Test_004_enterFieldsAndClickOnSave() throws FileNotFoundException, InterruptedException {
        createUnitPage.enterUnit();
        createUnitPage.enterDescription();
        createUnitPage.enterVIN();
        createUnitPage.typeYear ();
        createUnitPage.clickOnSearchImage ();
        createUnitPage.clickOnSelectButton ();
        createUnitPage.clickOnSaveAndExit();
    }


    @Test(priority = 4, description = "Test_005_Verify unit created and Signout", enabled = true)
    @Description("Test Description: Verify unit created and Signout")
    public void Test_005_Verify_unit_created() throws InterruptedException {
        createUnitPage.clickOnUnitNumberhyperlink();
        createUnitPage.verify_unit_created();
        createUnitPage.clickOnSignOut();


    }



}
