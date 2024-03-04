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
@Epic("Regression test")
@Feature("CustomerProofNotesIssue")

public class CustomerProofNotesIssue extends TestDriverActions {

    @Test(priority=0, description="T_001_Login the page and go to complete Ro screen",enabled = true)
    @Description("Test Description = Login the page and go to complete Ro screen")
    public void T_001_gotoCompleteRo() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        customerProofNotesIssue.gotoCompleteRoScreen();
    }

    @Test(priority=1, description="T_002_Click on New Ro",enabled=true)
    @Description("Test Description = Click on New Ro")
    public void T_002_clickOnNewRo() throws InterruptedException {
         customerProofNotesIssue.clickOnNewRo();
    }

    @Test(priority=2, description="T_003_Click on first unit i.e select button",enabled=true)
    @Description("Test Description = Click on first unit i.e select button")
    public void T_003_clickonFirstUnit() throws InterruptedException {
        customerProofNotesIssue.verifyRepairOrderLocation();
        customerProofNotesIssue.clickOnSelectButton();
    }

    @Test(priority=3, description="T_004_Verify the Repair Order Screen",enabled=true)
    @Description("Test Description = Verify the Repair Order Screen")
    public void T_004_verifyRepairOrder() throws InterruptedException {
  //         customerProofNotesIssue.verifyRepairOrder();
    }

    @Test(priority=4, description="T_005_Add First Labour",enabled=true)
    @Description("Test Description =Add First Labour")
    public void T_005_addFirstLabour() throws InterruptedException {
          customerProofNotesIssue.clickOnAddLabour();
    }

    @Test(priority=5, description="T_006_Click on VMRS",enabled=true)
    @Description("Test Description = Click on VMRS")
    public void T_006_clickOnVMRS() throws InterruptedException {
           customerProofNotesIssue.clickOnVMRS();
    }

    @Test(priority=6, description="T_007_Search First labour",enabled=true)
    @Description("Test Description = Search First labour")
    public void T_007_searchLabour() throws InterruptedException {
            customerProofNotesIssue.searchLabour();
    }
    @Test(priority=7, description="T_008_Click on First Labour Image",enabled=true)
    @Description("Test Description = Click on First Labour Image")
    public void T_008_clickonFirstlabourimg() throws InterruptedException {
          customerProofNotesIssue.clickonFirstlabourimg();
    }

    @Test(priority=8, description="T_009_Click on plus Icon",enabled=true)
    @Description("Test Description = Click on plus Icon")
    public void T_009_clickonPlusIcon() throws InterruptedException {
           customerProofNotesIssue.clickonPlusIcon();
    }

    @Test(priority=9, description="T_010_Click on Add ",enabled=true)
    @Description("Test Description = Click on Add")
    public void T_010_clickOnAdd() throws InterruptedException {
           customerProofNotesIssue.clickOnAdd();
    }

    @Test(priority=10, description="T_011_Click On Notes",enabled=true)
    @Description("Test Description = Click On Notes")
    public void T_011_clickOnNotes() throws InterruptedException {
            customerProofNotesIssue.clickOnNotes();
    }

    @Test(priority=11, description="T_012_Add notes in textarea",enabled=true)
    @Description("Test Description = Add notes in textarea")
    public void T_012_addNotesInTextarea() throws InterruptedException {
             customerProofNotesIssue.verifyNotesElement();
             customerProofNotesIssue.addNotesInTextarea();
    }

    @Test(priority=12, description="T_013_click on save and exit button",enabled=true)
    @Description("Test Description = click on save and exit button")
    public void T_013_clickon_Save_Exit() throws InterruptedException {
             customerProofNotesIssue.clickon_Save_Exit();
    }

    @Test(priority=13, description="T_014_click on Customer Proof",enabled=true)
    @Description("Test Description = click on Customer Proof")
    public void T_014_clickonCustomerProof() throws InterruptedException, FileNotFoundException {
           customerProofNotesIssue.clickonCustomerProof();
    }

    @Test(priority=14, description="T_015_Verify Repair Order customer proof",enabled=true)
    @Description("Test Description = Verify Repair Order customer proof")
    public void T_015_VerifyRepairOrderCustomerProof() throws IOException, InterruptedException {
           customerProofNotesIssue.VerifyRepairOrderCustomerProof();
    }

    @Test(priority=15, description="Test_016 Click on Sign Out and Verify Username",enabled = true)
    @Description("Test Description : Click on Sign Out and Verify Username")
    public void T_016ClickOnSignOutAndVerify() throws InterruptedException {
        customerProofNotesIssue.clickOnSignOutAndVerifyName();
    }

}
