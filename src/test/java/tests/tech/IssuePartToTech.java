package tests.tech;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class IssuePartToTech extends TestDriverActions {


    @Test(priority = 0 , description ="Login the page ",enabled=true)
    @Description("Test_description : Login the page")
    public void Test_001_Login_gotoTechRo() throws InterruptedException, FileNotFoundException {

        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        issueparttotech.gotoCounterSaleManagerScreen();
    }

    @Test(priority = 1 , description ="Enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Enter TechBadge and click on go")
    public void Test_002_Enter_TechBadge_ClickGo() throws InterruptedException, FileNotFoundException {
        issueparttotech.enterTechBadge();
        issueparttotech.clickOnGo();
    }

    @Test(priority = 2 , description ="Verify Back to Scan Employee Badge",enabled=true)
    @Description("Test_description : Verify Back to Scan Employee Badge")
    public void Test_003_Verify_BacktoScanEmployeeBadge() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_BacktoScanEmployeeBadge();
    }

    @Test(priority = 3 , description ="Verify Employee:",enabled=true)
    @Description("Test_description : Verify Employee:")
    public void Test_004_Verify_Employee() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Employee();
    }

    @Test(priority = 4 , description ="Verify Location assigned to employee:",enabled=true)
    @Description("Test_description : Verify Location assigned to employee:")
    public void Test_005_Verify_LocationAssignedtoEmployee() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_LocationAssignedtoEmployee();
    }

    @Test(priority = 5 , description ="Verify Search Work In Progress:",enabled=true)
    @Description("Test_description : Verify Search Work In Progress:")
    public void Test_006_Verify_SearchWorkInProgress() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_SearchWorkInProgress();
    }

    @Test(priority = 6 , description ="Verify Location",enabled=true)
    @Description("Test_description : Verify Location")
    public void Test_007_Verify_Location() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Location();
    }

    @Test(priority = 7 , description ="Verify Unit Number ",enabled=true)
    @Description("Test_description : Verify Unit Number")
    public void Test_008_Verify_UnitNumber() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_UnitNumber();
    }

    @Test(priority = 8 , description ="Verify Owner",enabled=true)
    @Description("Test_description : Verify Owner")
    public void Test_009_click_PlusButton() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Owner();
    }

    @Test(priority = 9 , description ="Verify RO#",enabled=true)
    @Description("Test_description : Verify RO#")
    public void Test_010_Verify_RO() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_RO();
    }

    @Test(priority = 10 , description ="Verify Date",enabled=true)
    @Description("Test_description : Verify Date")
    public void Test_011_Verify_Date() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Date();
    }

    @Test(priority = 11 , description ="Verify Description",enabled=true)
    @Description("Test_description : Verify Description")
    public void Test_012_Verify_Description() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_Description();
    }

    @Test(priority = 12 , description ="Verify VMRS",enabled=true)
    @Description("Test_description : Verify VMRS")
    public void Test_013_Verify_VMRS() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_VMRS();
    }

    @Test(priority = 13 , description ="Verify firstrow element",enabled=true)
    @Description("Test_description : Verify firstrow element")
    public void Test_012_Verify_firstrowElement() throws InterruptedException, FileNotFoundException {
        issueparttotech.Verify_firstrowElement();

    }

    @Test(priority = 14 , description ="Click on select",enabled=true)
    @Description("Test_description : Click on select")
    public void Test_013_clickOnSelect() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnSelect();
    }

    @Test(priority = 15 , description ="Verify Employee Details",enabled=true)
    @Description("Test_description : Verify Employee Details")
    public void Test_014_verifyEmployeeDetails() throws InterruptedException, FileNotFoundException {
       issueparttotech.verifyEmployeeDetails();

    }

    @Test(priority = 16 , description ="Verify Element",enabled=true)
    @Description("Test_description : Verify Element")
    public void Test_012_verifyElement() throws InterruptedException {
        issueparttotech.verifyElement();

    }

    @Test(priority = 17 , description ="verify ",enabled=true)
    @Description("Test_description : verify")
    public void Test_013_verify() throws InterruptedException {
          issueparttotech.verify();
    }

    @Test(priority = 18 , description ="Enter Part Number",enabled=true)
    @Description("Test_description : Enter Part Number")
    public void Test_014_enterPartNumber() throws InterruptedException {
           issueparttotech.enterPartNumber();

    }

    @Test(priority = 19 , description ="Click on Issue Part",enabled=true)
    @Description("Test_description : Click on Issue Part")
    public void Test_015_clickOnIssuePart() throws InterruptedException {
           issueparttotech.clickOnIssuePart();

    }

    @Test(priority = 20 , description ="Verify Part Name",enabled=true)
    @Description("Test_description : Verify Part Name")
    public void Test_016_VerifyPartName() throws InterruptedException, FileNotFoundException {
          issueparttotech.VerifyPartName();
    }

    @Test(priority = 21 , description ="Click on Scan Badge",enabled=true)
    @Description("Test_description : Click on Scan Badge")
    public void Test_017_clickOnScanBadge() throws InterruptedException {
          issueparttotech.clickOnScanBadge();
    }

    @Test(priority = 22 , description ="Click on Sign out",enabled=true)
    @Description("Test_description : Click on Sign out")
    public void Test_018_clickOnSignOut() throws InterruptedException {
           issueparttotech.clickOnSignOut();
    }

    @Test(priority = 23 , description ="Login with tech credentials",enabled=true)
    @Description("Test_description : Login with tech credentials")
    public void Test_019_loginAgain() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("TechUserName"),appProp.getProperty("TechPassword"));
    }

    @Test(priority = 24 , description ="Enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Enter TechBadge and click on go")
    public void Test_020_Enter_TechBadge_ClickGo() throws InterruptedException, FileNotFoundException {
        issueparttotech.enterTechBadge();
        issueparttotech.clickOnGo();
    }
    @Test(priority = 25 , description ="Click on Owner Name",enabled=true)
    @Description("Test_description : Click on Owner Name")
    public void Test_021_clickOwnerName() throws InterruptedException {
          issueparttotech.clickOwnerName();
    }

    @Test(priority = 26 , description ="Click on Select button",enabled=true)
    @Description("Test_description : Click on Select button")
    public void Test_022_clickOnSelect() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnSelectButton();
    }

    @Test(priority = 27 , description ="Click on MoreUnit",enabled=true)
    @Description("Test_description : Click on MoreUnit")
    public void Test_023_clickOnMoreUnit() throws InterruptedException {
          issueparttotech.clickOnMoreUnit();
    }

    @Test(priority = 28 , description ="Enter unit number",enabled=true)
    @Description("Test_description : Enter unit number")
    public void Test_024_() throws InterruptedException, FileNotFoundException {
           issueparttotech.EnterUnitNumber();
    }

    @Test(priority = 29 , description ="Click on select button",enabled=true)
    @Description("Test_description : Click on select button")
    public void Test_025_() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnSelect1();
    }

    @Test(priority = 30 , description ="Click on Part",enabled=true)
    @Description("Test_description : Click on Part")
    public void Test_026_() throws InterruptedException, FileNotFoundException {
        issueparttotech.clickOnPart();
    }

    @Test(priority = 31 , description ="Click on Sign out",enabled=true)
    @Description("Test_description : Click on Sign out")
    public void Test_027_clickOnSignOut() throws InterruptedException {
        issueparttotech.clickOnSignOut();
    }

    @Test(priority = 32 , description ="Verify username",enabled=true)
    @Description("Test_description : Verify username")
    public void Test_028_verifyUsername() throws InterruptedException {
        issueparttotech.verifyUserName();
    }


}
