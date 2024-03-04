package tests.tech;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("PauseLabor")

public class PauseLabor extends TestDriverActions {

    @Test(priority = 0 , description ="Login the page ",enabled=true)
    @Description("Test_description : Login the page")
    public void Test_001_Login_gotoTechRo() throws InterruptedException {

        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
    }

    @Test(priority = 1 , description ="Enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Enter TechBadge and click on go")
    public void Test_002_Enter_TechBadge_ClickGo() throws InterruptedException {
         pauselabor.enterTechBadge();
         pauselabor.clickOnGo();
    }

    @Test(priority = 2 , description ="Click on More Units",enabled=true)
    @Description("Test_description : Click on More Units")
    public void Test_003_click_MoreUnits() throws InterruptedException {
        pauselabor.clickMoreUnits();
    }

    @Test(priority = 3 , description ="Enter First Unit",enabled=true)
    @Description("Test_description : Enter First Unit")
    public void Test_004_Enter_Firstunit() throws InterruptedException {
         pauselabor.enterFirstUnit();
    }

    @Test(priority = 4 , description ="Click on Select button",enabled=true)
    @Description("Test_description : Click on Select button")
    public void Test_005_Click_SelectButton() throws InterruptedException {
        pauselabor.clickSelectButton();

    }

    @Test(priority = 5 , description ="Click on More Works",enabled=true)
    @Description("Test_description : Click on More Works")
    public void Test_006_click_MoreUnit() throws InterruptedException {
         pauselabor.clickMoreWorks();
    }

    @Test(priority = 6 , description ="click on VMRS",enabled=true)
    @Description("Test_description : click on VMRS")
    public void Test_007_click_VMRS() throws InterruptedException {
        pauselabor.clickVMRS();
    }

    @Test(priority = 7 , description ="click on Marine Work image in VMRS",enabled=true)
    @Description("Test_description : click on Marine Work image in VMRS")
    public void Test_008_click_VMRS_Img() throws InterruptedException {
         pauselabor.clickVMRSImg();
    }

    @Test(priority = 8 , description ="click on plus button",enabled=true)
    @Description("Test_description : click on plus button")
    public void Test_009_click_PlusButton() throws InterruptedException {
        pauselabor.clickPlusbtn();
    }

    @Test(priority = 9 , description ="Enter text in complaint box",enabled=true)
    @Description("Test_description : Enter text in complaint box")
    public void Test_010_enterTextinComplaintBox() throws InterruptedException {
         pauselabor.enterTextComplaintBox();
    }

    @Test(priority = 10 , description ="Click on Add button",enabled=true)
    @Description("Test_description : Click on Add button")
    public void Test_011_click_AddBtn() throws InterruptedException {
        pauselabor.clickOnAdd();

    }

    @Test(priority = 11 , description ="Click on Work Required image",enabled=true)
    @Description("Test_description : Click on Work Required image")
    public void Test_012_click_WorkRequired_Img() throws InterruptedException {
        pauselabor.clickAccessoriesImg();

    }

    @Test(priority = 12 , description ="Click on Pause button",enabled=true)
    @Description("Test_description : Click on Pause button")
    public void Test_013_click_PauseButton() throws InterruptedException {
        pauselabor.clickPauseButton();

    }

    @Test(priority = 13 , description ="Again enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Again enter TechBadge and click on go")
    public void Test_014_EnterTechBadge_ClickGo() throws InterruptedException {
        pauselabor.enterTechBadge();
        pauselabor.clickOnGo();

    }

    @Test(priority = 14 , description ="Verify PauseWork and FirstUnit",enabled=true)
    @Description("Test_description : Verify PauseWork and FirstUnit")
    public void Test_015_verify_PauseWork_FirstUnit() throws InterruptedException {
          pauselabor.verifyPauseWork_FirstUnit();
    }

    @Test(priority = 15 , description ="Enter Second unit",enabled=true)
    @Description("Test_description : Enter Second unit")
    public void Test_016_Enter_SecondUnit() throws InterruptedException {
        pauselabor.enterSecondunit();

    }

    @Test(priority = 16 , description ="Click on select button",enabled=true)
    @Description("Test_description : Click on select button")
    public void Test_016_clickSelect() throws InterruptedException {
        pauselabor.clickSelectButton();
    }

    @Test(priority = 17 , description ="Verify Pause in play",enabled=true)
    @Description("Test_description : Verify Pause in play")
    public void Test_017_VerifyPause() throws InterruptedException {
        pauselabor.verifyPause();
    }

    @Test(priority = 18 , description ="Click on More Works",enabled=true)
    @Description("Test_description : Click on More Works")
    public void Test_018_AgainClick_MoreWorks() throws InterruptedException {
        pauselabor.clickMoreWorks();
    }

    @Test(priority = 19 , description ="Click on VMRS",enabled=true)
    @Description("Test_description : Click on VMRS")
    public void Test_020_ClickVMRS() throws InterruptedException {
        pauselabor.clickVMRS();
    }

    @Test(priority = 20 , description ="Click VMRS Image",enabled=true)
    @Description("Test_description : Click VMRS Image")
    public void Test_021_click_VMRS_Image() throws InterruptedException {
        pauselabor.clickVMRSImg();
    }

    @Test(priority = 21 , description ="Click on plus button",enabled=true)
    @Description("Test_description : Click on plus button")
    public void Test_022_click_PlusButton() throws InterruptedException {
        pauselabor.clickPlusbtn();
    }

    @Test(priority = 22 , description ="Enter text in complaint textfield",enabled=true)
    @Description("Test_description : Enter text in complaint textfield")
    public void Test_023_enterText_Complaint_Textfield() throws InterruptedException {
        pauselabor.enterTextComplaintBox();
    }

    @Test(priority = 23 , description ="Click on Add button",enabled=true)
    @Description("Test_description : Click on Add button")
    public void Test_024_click_On_Add() throws InterruptedException {
        pauselabor.clickOnAdd();
    }

    @Test(priority = 24 , description ="Click on Work Required Image",enabled=true)
    @Description("Test_description : Click on Work Required Image")
    public void Test_025_click_MarinWalkAround_Img() throws InterruptedException {
        pauselabor.clickAccessoriesImg();
    }

    @Test(priority = 25 , description ="Again click on pause button",enabled=true)
    @Description("Test_description : Again click on pause button")
    public void Test_026_click_Pause() throws InterruptedException {
        pauselabor.clickPauseButton();
    }

    @Test(priority = 26 , description ="Enter TechBadge and click on go",enabled=true)
    @Description("Test_description : Enter TechBadge and click on go")
    public void Test_027_EnterTechBadge_ClickonGo() throws InterruptedException {
        pauselabor.enterTechBadge();
        pauselabor.clickOnGo();
    }

    @Test(priority = 27 , description ="Verify Second Pause Work",enabled=true)
    @Description("Test_description : Verify Second Pause Work")
    public void Test_028_Verify_SecondPauseWork() throws InterruptedException {
        pauselabor.verifyPauseWork_FirstUnit();
    }

    @Test(priority = 28 , description ="Click on Assigned Work",enabled=true)
    @Description("Test_description : Click on Assigned Work")
    public void Test_029_clickOn_AssignedWork() throws InterruptedException {
          pauselabor.clickAssignedWork();
    }

    @Test(priority = 29 , description ="Verify select assigned work",enabled=true)
    @Description("Test_description : Verify select assigned work")
    public void Test_030_verifySelectAssignedWork() throws InterruptedException {
          pauselabor.verifySelectAssignedWork();
    }

    @Test(priority = 30 , description ="Click on select",enabled=true)
    @Description("Test_description : Click on select")
    public void Test_031_clickOnSelect() throws InterruptedException {
          pauselabor.clickOnSelect();
    }

    @Test(priority = 31 , description ="Click on Summary",enabled=true)
    @Description("Test_description : Click on Summary")
    public void Test_32_clickSummary() throws InterruptedException {
         pauselabor.clickOnSummary();
    }

    @Test(priority = 32 , description ="Click on Unit Ready",enabled=true)
    @Description("Test_description : Click on Unit Ready")
    public void Test_033_clickUnitReady() throws InterruptedException {
          pauselabor.clickOnUnitReady();
    }

    @Test(priority = 33 , description ="Click on Select button",enabled=true)
    @Description("Test_description : Click on Select button")
    public void Test_034_Click_Select() throws InterruptedException {
          pauselabor.click_Select();
    }

    @Test(priority = 34 , description ="Click on clock icon",enabled=true)
    @Description("Test_description : Click on clock icon")
    public void Test_035_clickClockIcon() throws InterruptedException {
           pauselabor.clickClockIcon();
    }

    @Test(priority = 35 , description ="Click on Summary",enabled=true)
    @Description("Test_description : Click on Summary")
    public void Test_036_clickOnSummary() throws InterruptedException {
        pauselabor.clickOnSummary();
    }

    @Test(priority = 36 , description ="Click on Unit Ready",enabled=true)
    @Description("Test_description : Click on Unit Ready")
    public void Test_037_clickOnUnitReady() throws InterruptedException {
        pauselabor.clickOnUnitReady();
    }

    @Test(priority = 37 , description ="Click on SignOut",enabled=true)
    @Description("Test_description : Click on SignOut")
    public void Test_038_clickSignout() throws InterruptedException {
         pauselabor.clickOnSignOut();
    }


}
