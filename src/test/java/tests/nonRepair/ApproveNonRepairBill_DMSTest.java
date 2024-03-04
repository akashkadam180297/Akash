package tests.nonRepair;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class ApproveNonRepairBill_DMSTest extends TestDriverActions {



    @Test(priority=0, description = "Login the Page and go to Approval Screen",enabled = true)
    @Description("Test Description - Login the Page and go to Approval Screen")
    public void gotoApprovals() throws FileNotFoundException, InterruptedException {
        driver.get(prop.getProperty("URL"));
       loginPage.loginWithValidCredentials(prop.getProperty("fedex_one_username"),prop.getProperty("fedex_one_password"));
       approveNonRepairBill.gotoApprovalScreen();
    }
    @Test(priority=1, description = "Click on radio button Complete Repair and All", enabled = true)
    @Description("Test Description - T_002 Click on radio button Complete Repair and All ")
    public void clickOnRedioButton() throws InterruptedException {
        approveNonRepairBill.clickOnCompleteRepair();
        approveNonRepairBill.clickOnAll();
    }

    @Test(priority=2, description = "Click Reference Number and Verify Element",enabled = true)
    @Description("Test Description - T_003 Click on reference Number and Verify Element")
    public void clickOnReference() throws InterruptedException {
        approveNonRepairBill.clickOnReferenceNumber();
        approveNonRepairBill.verifyReferenceNumber();
    }

     @Test(priority=3, description = "Click reject button and verify element",enabled = true)
    @Description("Test Description - T_004 Click on reject button and verify element ")
    public void clickOnReject() throws InterruptedException {
        approveNonRepairBill.clickOnRejectBtn();
        approveNonRepairBill.verifyRejectbuttonElement();
        approveNonRepairBill.clickOnCancle();
    }

     @Test(priority=4, description = "Click To be Revised and verify element",enabled = true)
    @Description("Test Description - T_005 Click To be Revised and verify element")
    public void clickOnToBeRevised() throws InterruptedException {
         approveNonRepairBill.clickOnTobeRevised();
         approveNonRepairBill.verifyElementsToBeRevised();
         approveNonRepairBill.clickOnCancleButton();
    }
     @Test(priority=5, description = "Click on Approve and verify",enabled = true)
    @Description("Test Description - T_006 Click on Approve and verify")
    public void clickOnApprove() throws InterruptedException {
         approveNonRepairBill.clickOnApprove();
         approveNonRepairBill.verifyApproveElement();
    }
     @Test(priority=6, description = "Sign out and verify username",enabled = true)
    @Description("Test Description - T_007 Sign out and verify username ")
    public void SignOut() throws InterruptedException {
            approveNonRepairBill.clickOnSignOut();
    }
























}
