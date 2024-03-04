package tests.tech;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

public class TechWoLabor extends TestDriverActions {

    @Test(priority=0, description="T_001 Login the page and Go to the Tech Ro",enabled = true)
    @Description("Test Description - Login the page and Go to the Tech Ro ")
    public void gotoTechRo() throws InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        labor.enterTechBadge();
        labor.clickOnGo();
    // labor.clickOnAssignedWork();
        labor.clickOnMoreUnit();

    }
    @Test(priority=1, description="T_002 Verify the Element and Enter the Unit Number",enabled = true)
    @Description("Test Description - Verify the Element and Enter the Unit Number ")
    public void enter_Unit_Number() throws InterruptedException {
        labor.verifyHeaderElement();
        labor.verifyTableElement();
        labor.enterUnitNumber();
        labor.clickOnSelectBtn();
    }
    @Test(priority=2, description="T_003 Verify the element and click on Unit History",enabled = true)
    @Description("Test Description - Verify the element and click on Unit History")
    public void verifyElement_Click_UnitHistory() throws InterruptedException
    {
        labor.verifyTecnicianPortalPage();
        labor.LabourtabElement();
        labor.labourAsapShopElement();
        labor.clickOnUnitHistorytab();
        labor.verifyUnitNumberTabElement();

    }

    @Test(priority=3, description="T_004 Click on Labour,MoreWork and VMRS tab",enabled = true)
    @Description("Test Description - Click on Labour,MoreWork and VMRS tab")
    public void clickOn_Labour_MoreWork_VMRSTab() throws InterruptedException {
        labor.clickOnLabourTab();
        labor.addWorkRequired();
        labor.clickWorkRequired();
        labor.clickOnMoreWorkTab();
        labor.verifyMoreWorktabElement();
        labor.clickOnVMRStab();
    }

    @Test(priority=4, description="T_005 Enter AderoDynamic Device in search field",enabled = true)
    @Description("Test Description - Enter AderoDynamic Device in search field")
    public void enter_AeroDynamic_Device_First() throws InterruptedException {
        labor.clickOnUnitHistoryTab();
        labor.verifyUnitHistoryTabElement();
//        labor.clickOnLabourDetailsVMRStab();
        labor.clickOnVMRStab();
        labor.verifyElementofVMRS();
        labor.enterAreodynamicDevices(); //1
        labor.clickOnAeroDynamicDevicesImg();
    }

    @Test(priority=5, description="T_006 Enter Aerodynamic Device and click on Image",enabled = true)
    @Description("Test Description : Enter Aerodynamic Device and click on Image")
    public void enter_AeroDynamic_ClickIMG() throws InterruptedException {
 //       labor.verifyAeroDynamicDeviceElement();
        labor.clickOnAeroDynamicsDeviceshyperlink();
        labor. verifySearchTextField();
        labor.enterAreodynamicDevices(); //2
        labor.clickOnAeroDynamicDevicesImg();

    }

    @Test(priority=6, description="T_007 Check that add AeroDynamic Device and Delete it from Labour section",enabled = true)
    @Description("Test Description - Check that add AeroDynamic Device and Delete it from Labour section")
    public void add_AeroDynamic_Delete_Labour() throws InterruptedException {
        labor.enterAreodynamicDevices(); //3
        labor.clickOnPlusButton();
        labor.verifyAeroDynamicSelectedElement();
        labor.enterText();
        labor.clickOnAddButton();
        labor.clickOnCrossIcon();
        labor.clickOnDeleteIcon();

    }

    @Test(priority=7, description="T_008 Check that again add Aerodynamic Device ",enabled = true)
    @Description("Test Description - Check that again add Aerodynamic Device")
    public void again_Add_AeroDynamicDevice() throws InterruptedException {
        labor.clickOnMoreWorkTab();
        labor.clickOnVMRStab();
        labor.enterAreodynamicDevices(); //4
        labor.verifyAddElement();
        labor.clickOnAeroDynamicDevicesImg();
        labor.verifyAerodynamicDevices004();
        labor.enterAreodynamicDevices(); //5
        labor.verifyAerodynamicDeviceHyperlink();
        labor.clickOnPlusButton();
        labor.verifyAerodynamicDeviceTextarea();
        labor.clickOnAddButton();


    }

    @Test(priority=8, description="T_009 Enter Accessories Group Image",enabled = true)
    @Description("Test Description - Enter Accessories Group Image")
    public void enter_AccessoriesGroup_Img() throws InterruptedException {
        labor.clickOnWorkRequired();
// labor.verifyXicon();
        labor.clickOnCrossIconAsapShop();
        labor.clickOnCancleButton();
        labor.clickOnMoreWorkTab();
//        labor.clickOnLabourDetailsVMRStab();
        labor.clickOnVMRStab();
        labor.clickOnAccessoriesGroupImg();
    }

    @Test(priority=9, description="T_010 Click on Select Button and Again start from Aerodynamic Device ",enabled = true)
    @Description("Test Description - Click on Select Button and Again start from Aerodynamic Device")
    public void clickOn_SelectButton() throws InterruptedException {

        labor.clickOnPlusIcon_LabourDetails();
        labor.clickOnAddButton2();
        labor.clickOnWorkRequired();
        labor.clickOnCrossIconAsapShop2();
        labor.verifyDeleteAerodynamicDevice();
        labor.clickOnSelectButton2();
        labor.clickOnWorkRequired();
        labor.clickOnSignOut();


    }
}