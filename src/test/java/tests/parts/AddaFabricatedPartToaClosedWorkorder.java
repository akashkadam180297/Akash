package tests.parts;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AddaFabricatedPartToaClosedWorkorder extends TestDriverActions {

    @Test(priority = 0, description = "Test_001_Login the page and Go to CompleteRo Screen")
    @Description("Test Description: Login the page and Go to CompleteRo Screen")
    public void Test_001_gotoCompleteRo() throws InterruptedException, IOException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        addafabricatedparttoaclosedworkorder.goToCompleteROScreen();

    }
    @Test(priority = 1, description = "Test_002_click On New RO")
    @Description("Test Description: click On Reference Number")
    public void Test_002_clickoNewRo() throws InterruptedException, IOException {
        addafabricatedparttoaclosedworkorder.clickoNewRo();
        addafabricatedparttoaclosedworkorder.typeUnitNumber();
        addafabricatedparttoaclosedworkorder.clickonSelectButton();
        addafabricatedparttoaclosedworkorder.clickOnAddLabour();
       // addafabricatedparttoaclosedworkorder.clickOnCloseRO();
    }
    @Test(priority = 2, description = "Test_003_type Search Text Area")
    @Description("Test Description: type Search Text Area")
    public void Test_003_typeSearchTextArea()throws InterruptedException, IOException {
    //    addafabricatedparttoaclosedworkorder.typeSearchTextArea();
   //     addafabricatedparttoaclosedworkorder.clickonRefresh();
   //     addafabricatedparttoaclosedworkorder.clickonReferenceNumber();
   //     addafabricatedparttoaclosedworkorder.clickOnAddLabour2();
        addafabricatedparttoaclosedworkorder.clickOnAddParts();
        addafabricatedparttoaclosedworkorder.verifyPart();
        addafabricatedparttoaclosedworkorder.verifyRoTotalcost();
        addafabricatedparttoaclosedworkorder.TotalCharge();
        addafabricatedparttoaclosedworkorder.clickPartNumber1();
        addafabricatedparttoaclosedworkorder.PartHash1();
        addafabricatedparttoaclosedworkorder.clickonCancelButton ();
    }
    @Test(priority = 3, description = "Test_004_click on Add Part")
    @Description("Test Description: click on Add Part")
    public void Test_004_clickonAddPart() throws InterruptedException, IOException {
        addafabricatedparttoaclosedworkorder. clickonAddPart();
        addafabricatedparttoaclosedworkorder. clickonNewPart ();
        addafabricatedparttoaclosedworkorder.verifypartHash ();
        addafabricatedparttoaclosedworkorder.verifypartDescription ();
        addafabricatedparttoaclosedworkorder. verifyStockingUOM ();
        addafabricatedparttoaclosedworkorder. verifyStockPart ();
        addafabricatedparttoaclosedworkorder.verifyProductGroupRequired ();
        addafabricatedparttoaclosedworkorder.verifyCostRequired ();
        addafabricatedparttoaclosedworkorder.verifyCostingMethod ();
        addafabricatedparttoaclosedworkorder. verifyGLAccoutGroup ();
        addafabricatedparttoaclosedworkorder. verifyVendor ();
        addafabricatedparttoaclosedworkorder. verifyCancelButton ();
        addafabricatedparttoaclosedworkorder.clickonCacelButton ();
    }
    @Test(priority = 4, description = "Test_005_click on part Text Area")
    @Description("Test Description:click on part Text Area")
    public void Test_005_clickonPartTextArea () throws InterruptedException, IOException {
        addafabricatedparttoaclosedworkorder. clickonPartTextArea ();
        addafabricatedparttoaclosedworkorder. verifyPartNumberText ();
        addafabricatedparttoaclosedworkorder. clickonPartNumber ();
        addafabricatedparttoaclosedworkorder. verifyFabricatedParts2();
        addafabricatedparttoaclosedworkorder. verifyPartNumber ();
        addafabricatedparttoaclosedworkorder. verifyFabricatedQuantity ();
        addafabricatedparttoaclosedworkorder. clickOnCloseButton ();
        addafabricatedparttoaclosedworkorder.clickOnSignOut ();
        addafabricatedparttoaclosedworkorder.clickOnUsername ();


    }
}
