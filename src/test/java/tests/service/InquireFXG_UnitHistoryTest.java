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
@Feature("Unit Functionality Test")

public class InquireFXG_UnitHistoryTest extends TestDriverActions {

    @Test(priority=0 , description="T_001Login the page and go to the CompleteRo",enabled = true)
    @Description("Test Description : Login the page and go to the CompleteRo")
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(prop.getProperty("gmail_one_username"),prop.getProperty("gmail_one_password"));
        unit.gotoCompleteRo();
    }

    @Test(priority=1 , description="T_002 click FedEx Fleet History and click on select Unit",enabled = true)
    @Description("Test Description : click FedEx Fleet History and click on select Unit")
    public void click_FedExFleetHistory_select_Unit() throws InterruptedException {
        unit.fedFxFleetHistory();
        unit.clickOnSelectUnit();
 //       unit.verifySearchUnitElement();
        unit.verifySearchHeaderColumnElement();
    }

    @Test(priority=2,description="T_003 Enter Unit Number and verify history screen",enabled = true)
    @Description("Test Description : Enter Unit Number and verify history screen")
    public void enterUnitNumber() throws InterruptedException {
       unit.enterOnUnitNumber();
       unit.clickOnSelectButton();
       unit.verifyUnitNumber_VIN();
       unit.verifyElementUnderlyingHistoryScreen();
       unit.verifyLabourPaneElement();

    }

    @Test(priority=3, description="T_004 Enter Unit Number and Click on Search Button",enabled = true)
    @Description("Test Description: Enter Unit Number and Click on Search Button")
    public void searchNumber() throws InterruptedException {
        unit.clickOnUnitNumberHyperlink();
        unit.enterNumber();
        unit.clickOnSelectButton();
        unit.clickOnLinktextSearch();

    }

    @Test(priority=4, description="T_005 Verify the element of actual data area_Repair Detail Pane",enabled = true)
    @Description("Test Description: Verify the element of actual data area_Repair Detail Pane")
    public void verifyElement_SignOut() throws InterruptedException {
        unit.actualDataArea();
//        unit.verifyRepairDetails();
        unit.verifyPartsPanel();
        unit.clickOnSignOut ();


    }







}
