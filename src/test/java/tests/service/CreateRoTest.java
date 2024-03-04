package tests.service;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("Create RO Test")

public class CreateRoTest extends TestDriverActions {


    @Test(priority = 0, description = "Test_001_Login the page and go to the CompleteRo",enabled = true)
    @Description("Test Description: Login the page and go to the CompleteRo")
    public void Test_001_gotoCompleteROScreen() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(prop.getProperty("manager_one_username"), prop.getProperty("manager_one_password") );
        createRoPage.goToCompleteROScreen();
    }

    @Test(priority = 1, description = "Test_002_Click on Add new RO and select Unit", enabled = true)
    @Description("Test Description: Click on Add new RO and select Unit")
    public void Test_002_clickAddNewROAndSelectUnit() throws InterruptedException {
        createRoPage.clickNewRo();
        createRoPage.selectFirstUnit();
    }

    @Test(priority = 2, description = "Test_003_Click on Add labor", enabled = true)
    @Description("Test Description: Click on Add labor")
    public void Test_003_clickAddLabor() throws InterruptedException {
        createRoPage.clickAddLabor();
    }



    @Test(priority = 3, description = "Test_004_Select service program and add", enabled = true)
    @Description("Test Description: Select service program and add")
    public void Test_004_selectServiceProgramAndAdd() throws InterruptedException {
        createRoPage.selectVMRS();
        createRoPage.clickIcon();
        createRoPage.addServiceProgram();

        createRoPage.addLaborFinal();

        createRoPage.verify_labor_added();

    }

    @Test(priority = 4, description = "Test_005_Add Part", enabled = true)
    @Description("Test Description: Add Part")
    public void Test_005_AddPart() throws InterruptedException {

        createRoPage.clickAddPart();
        createRoPage.clickSearchAndPart();
        createRoPage.clickIssuePart();
        createRoPage.clickCloseButton();
        createRoPage.verify_part_added();

    }

    @Test(priority = 5, description = "Test_006_Remove Part", enabled = true)
    @Description("Test Description: Remove Part")
    public void Test_006_removePart() throws InterruptedException {

        createRoPage.clickOnAddedPart();
        createRoPage.clickOnPartDeleteIcon();

 //       createRoPage.verifyPartDeleted();

    }

    @Test(priority = 6, description = "Test_007_Remove labor", enabled = true)
    @Description("Test Description: Remove labor")
    public void Test_007_removeLabor() throws InterruptedException {

        createRoPage.clickOnAddedLabor();
        createRoPage.clickOnLaborDeleteIcon();


//        createRoPage.verifyLaborDeleted();
    }



    /**
     *
     */
    public void Test_006_CheckIfSystemAllowsToDeleteJustAddedLabor() {


    }

    /**
     *
     */
    public void Test_007_techCopyLaborFromUnitHistory() {


    }


    public void techDeleteLaborWhenhasBegunGraterThanone() {


    }


    public void techDeleteLabotandTransferTime() {

    }


    public void checkLaborLineSequenceOnAddPartsPopup() {


    }


    public void addPartViaAdvanceSearch() {


    }

    public void removePart() {

    }

    public void addNonCatalogPart() {

    }
}
