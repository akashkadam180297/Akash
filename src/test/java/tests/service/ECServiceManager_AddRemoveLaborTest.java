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
@Feature("Add/Remove Labour Test")

public class ECServiceManager_AddRemoveLaborTest extends TestDriverActions {


    @Test(priority=0, description="T_001 Login the page and go to the complete Ro",enabled = true)
    @Description("Test Description -  Login the page and go to the complete Ro ")
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(prop.getProperty("service_one_username"),prop.getProperty("service_one_password"));
        addRemove.gotoCompleteRo();

    }

    @Test(priority=1, description="T_002 Check that click on the reference number and Add Labour button",enabled = true)
    @Description("Test Description -  click on the reference number and Add Labour button")
    public void clickOnReferenceNum_AddLabourBtn() throws InterruptedException {
        addRemove.clickOnReferenceNumber();
        addRemove.clickOnAddLabour();
    }

    @Test(priority=2, description="T_003 Check that click on VMRS, Automatic/Manual Chassis Lubricator, plus icon and add button",enabled = true)
    @Description("Test Description -  click on VMRS, Automatic/Manual Chassis Lubricator, plus icon and add button")
    public void clickOnVMRS_img_AddButton() throws InterruptedException {
         addRemove.clickOnVMRStab();
         addRemove.clickOnAutomatic_ManualChassisLubricator();
         addRemove.clickOnPlusIcon();
         addRemove.clickOnAddbutton();
    }

    @Test(priority=3, description="T_004 check that click on cross icon, trash icon and again click on Add Labour",enabled = true)
    @Description("Test Description -  click on cross icon, trash icon and again click on Add Labour")
    public void clickOnDeletebutton() throws InterruptedException {
         addRemove.clickOnCrossIcon();
         addRemove.clickOnDeleteIcon();
         addRemove.clickOnAddLabour();
         addRemove.clickOnVMRStab();
    }

    @Test(priority=4, description="T_005 check that click on img, plus icon and enter text into textarea field",enabled = true)
    @Description("Test Description -  check that click on img, plus icon and enter text into textarea field")
    public void checkImg_enterText() throws InterruptedException {
        addRemove.clickOnImg();
        addRemove.clickOnPlusbtn();
//        addRemove.enterThirdComplaint();
//        addRemove.enterThirdCause();
//        addRemove.enterThirdCorrection();


    }

    @Test(priority=5, description="T_006 check that click on Ok and Sign out the page",enabled = true)
    @Description("Test Description -  check that click on Ok and Sign out the page")
    public void clickOnOk_SignOut() throws InterruptedException {
        addRemove.clickOnAddbutton();
        addRemove.clickOnSignOut();
    }








}
