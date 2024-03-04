package tests.Ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UomforpressureonInspectionInformationAllowed extends TestDriverActions {
    @Test(priority = 0, description = "Test_001_Login the page and Go to create unit Screen", enabled = true)
    @Description("Test Description: Login the page and Go to create unit Screen")
    public void Test_001_gotoPMInspectionManager() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        unitinspectioninformation.clickOnPMInspectionManager();

    }

    @Test(priority = 1, description = "Test_002_click on Unit Inspection Information ", enabled = true)
    @Description("Test Description: click on Unit Inspection Information ")
    public void Test_002_clickOnUnitInspectionInformation() throws InterruptedException {
        unitinspectioninformation.clickOnUnitInspectionInformation();
        unitinspectioninformation. verifyData ();
        unitinspectioninformation.clickOnAddUnitInspectionInformation();
        unitinspectioninformation.enterLabel();
        unitinspectioninformation.selectdropdownUOM();
        unitinspectioninformation.clicklengthandDecimal ();
        unitinspectioninformation.selectdropdownBar();
        unitinspectioninformation.clickOnCancel() ;


    }

    @Test(priority = 2, description = "Test_003_click On Add Unit Inspection Information", enabled = true)
    @Description("Test Description: click On Add Unit Inspection Information")
    public void Test_003_clickOnAddUnitInspectionInformation() throws InterruptedException {
        unitinspectioninformation.clickOnAddUnitInspectionInformation();
        unitinspectioninformation.enterLabelTwo();
        unitinspectioninformation.selectdropdownUOM();
        unitinspectioninformation.clicklengthandDecimalTwo ();
        unitinspectioninformation.selectdropdownKilopascal();
        unitinspectioninformation.clickOnCancel() ;
       // unitinspectioninformation.verifyTypeandUOM2();
    }

    @Test(priority = 3, description = "Test_004_click On Add Unit Inspection Information", enabled = true)
    @Description("Test Description: click On Add Unit Inspection Information")
    public void Test_004_clickOnAddUnitInspectionInformationTwo() throws InterruptedException {
        unitinspectioninformation.clickOnAddUnitInspectionInformation();
        unitinspectioninformation.enterLabelThree ();
        unitinspectioninformation.selectdropdownUOM();
        unitinspectioninformation.clicklengthandDecimalThree();
        unitinspectioninformation.selectdropdownPSI ();
        unitinspectioninformation.clickOnCancel();
      //  unitinspectioninformation.verifyTypeandUOM();
        unitinspectioninformation.clickonClose ();

    }
    @Test(priority = 4, description = "Test_005_Go to Unit Master", enabled = true)
    @Description("Test Description: go to unit master")
    public void Test_005_gotoUnitMaster() throws InterruptedException, FileNotFoundException {
        unitinspectioninformation.gotoUnitMasterScreen();
        unitinspectioninformation.clickonUnitNumber () ;


    }
    @Test(priority = 5, description = "Test_006_click on MoreInfo", enabled = true)
    @Description("Test Description: click on More Info")
    public void Test_006_clickonMoreInfo () throws InterruptedException, FileNotFoundException {
        unitinspectioninformation.clickonMoreInfo ();
        unitinspectioninformation.verifyOnspecs ();
        unitinspectioninformation.verifyOnSpecsKPA ();
        unitinspectioninformation.verifyOnSpecsPSI ();
        unitinspectioninformation.clickOnSaveExit ();
        unitinspectioninformation.clickOnSignOut();


    }
}
