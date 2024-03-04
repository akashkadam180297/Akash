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
@Epic("Testing")
@Feature("OverRideTaxesCauseOtherTaxDisappear")

public class OverRideTaxesCauseOtherTaxDisappear extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to complete Ro Screen",enabled=true)
    @Description("Test Description : Login the page and go to complete Ro Screen")
    public void T_001_goToCompletero() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        overRideTaxes.gotoCompleteRo();
    }

    @Test(priority=1,description="T_002_Click on New Ro",enabled=true)
    @Description("Test Description :Click on New Ro")
    public void T_002_ClickonNewRo() throws InterruptedException {
        overRideTaxes.clickOnNewRo();
    }

    @Test(priority=2,description="T_003_click on first unit",enabled=true)
    @Description("Test Description :click on first unit")
    public void T_003_clickOnFirstUnit() throws InterruptedException {
        overRideTaxes.clickOnUnit();
    }

    @Test(priority=3,description="T_004_Click on close button",enabled=true)
    @Description("Test Description :Click on close button")
    public void T_004_ClickonClosebutton() throws InterruptedException {
 //       overRideTaxes.clickOnClose();
    }

    @Test(priority=4,description="T_005_click on Add labour",enabled=true)
    @Description("Test Description :click on Add labour")
    public void T_005_clickAddLabour() throws InterruptedException {
        overRideTaxes.clickOnAddLabour();
    }

    @Test(priority=5,description="T_006_click on VMRS",enabled=true)
    @Description("Test Description :click on VMRS")
    public void T_006_clickOnVMRS() throws InterruptedException {
        overRideTaxes.clickOnVMRS();
    }

    @Test(priority=6,description="T_007_Search First labour",enabled=true)
    @Description("Test Description :Search First labour")
    public void T_007_searchFirstlabour() throws InterruptedException {
        overRideTaxes.enterFirstLabour();
    }

    @Test(priority=7,description="T_008_click on firstlabour image",enabled=true)
    @Description("Test Description :click on firstlabour image")
    public void T_008_clickFirstlabourImage() throws InterruptedException {
        overRideTaxes.clickOnFirstLabourImg();
    }

    @Test(priority=8,description="T_009_click on plus button",enabled=true)
    @Description("Test Description :click on plus button")
    public void T_009_clickPlusButton() throws InterruptedException {
        overRideTaxes.clickOnPlusButton();
    }

    @Test(priority=9,description="T_010_click on add button",enabled=true)
    @Description("Test Description :click on add button")
    public void T_010clickAddButton() throws InterruptedException {
        overRideTaxes.clickOnAddButton();
    }
    @Test(priority=10,description="T_011_Add second labour",enabled=true)
    @Description("Test Description :Add second labour")
    public void T_011_addSecondLabour() throws InterruptedException {
        overRideTaxes.clickOnAddLabour();
        overRideTaxes.clickOnVMRS();
        overRideTaxes.enterSecondLabour();
        overRideTaxes.clickOnFirstLabourImg();
        overRideTaxes.clickOnPlusButton();
        overRideTaxes.clickOnAddButton();
    }
    @Test(priority=11,description="T_012_click on add parts",enabled=true)
    @Description("Test Description :click on add parts")
    public void T_012_clickOnParts() throws InterruptedException {
         overRideTaxes.clickOnParts();
    }
    @Test(priority=12,description="T_013_enter part number",enabled=true)
    @Description("Test Description :enter part number")
    public void T_013_enterPart() throws InterruptedException {
        overRideTaxes.enterPart();
    }
    @Test(priority=13,description="T_014_click on issue part",enabled=true)
    @Description("Test Description :click on issue part")
    public void T_014_clickIssuePart() throws InterruptedException {
         overRideTaxes.clickIssuePart();
    }
    @Test(priority=14,description="T_015_click on close",enabled=true)
    @Description("Test Description :click on close")
    public void T_015_clickOnClose() throws InterruptedException {
        overRideTaxes.clickClose();
    }
    @Test(priority=15,description="T_016_Add Second part",enabled=true)
    @Description("Test Description :Add Second part")
    public void T_016_addSecondpart() throws InterruptedException {
         overRideTaxes.clickOnParts();
         overRideTaxes.enterSecondPart();
         overRideTaxes.clickIssuePart();
         overRideTaxes.clickClose();

    }
    @Test(priority=16,description="T_017_click on taxes",enabled=true)
    @Description("Test Description :click on taxes")
    public void T_017_clickOnTaxes() throws InterruptedException {
        overRideTaxes.clickOnTaxes();
    }
    @Test(priority=17,description="T_018_verify taxes pop up",enabled=true)
    @Description("Test Description :verify taxes pop up")
    public void T_018_verifyTaxes() throws InterruptedException {
        overRideTaxes.verifyTaxesPopUp();
    }


    @Test(priority=18,description="T_019_click on Add Tax",enabled=true)
    @Description("Test Description :click on Add Tax")
    public void T_019_clickAddTax() throws InterruptedException {
        overRideTaxes.clickOnAddTax();
    }
    @Test(priority=19,description="T_020_verify percentage amount pop up",enabled=true)
    @Description("Test Description :verify percentage amount pop up")
    public void T_020_verifyPercentageAmount() throws InterruptedException {
        overRideTaxes.verifyPercentageAmountPopUp();
    }

    @Test(priority=20,description="T_021_select option from dropdown - VAT",enabled=true)
    @Description("Test Description :select option from dropdown - VAT")
    public void T_021_clickOnVat() throws InterruptedException {
        overRideTaxes.clickOnVat();
    }

    @Test(priority=21,description="T_022_enter percentage of VAT",enabled=true)
    @Description("Test Description :enter percentage of VAT")
    public void T_022_enterPercentageVat() throws InterruptedException {
        overRideTaxes.enterPercentageVAT();
    }

    @Test(priority=22,description="T_023_enter Amount of vat",enabled=true)
    @Description("Test Description :enter Amount of vat")
    public void T_023_enterVATAmount() throws InterruptedException {
        overRideTaxes.enterVATAmount();
    }
    @Test(priority=23,description="T_024_override the percentage amount",enabled=true)
    @Description("Test Description :override the percentage amount")
    public void T_024_PercentageVat() throws InterruptedException {
//        overRideTaxes.enterPercentageVAT();
    }

    @Test(priority=24,description="T_025_click on OK button",enabled=true)
    @Description("Test Description :click on OK button")
    public void T_025_clickOKButton() throws InterruptedException {
        overRideTaxes.clickOnOK();
    }

    @Test(priority=25,description="T_026_click on Add Tax",enabled=true)
    @Description("Test Description :click on Add Tax")
    public void T_026_clickonAddTax() throws InterruptedException {
        overRideTaxes.clickOnAddTax();
    }
    @Test(priority=26,description="T_027_select option of T1 from dropdown",enabled=true)
    @Description("Test Description :select option of T1 from dropdown")
    public void T_027_selectoptionT1fromdropdown() throws InterruptedException {
        overRideTaxes.clickOnT1();
    }

    @Test(priority=27,description="T_028_enter percentage of T1",enabled=true)
    @Description("Test Description :enter percentage of T1")
    public void T_028_enterT1Percentage() throws InterruptedException {
        overRideTaxes.enterPercentageT1();
    }

    @Test(priority=28,description="T_029_enter Amount of T1",enabled=true)
    @Description("Test Description :enter Amount of T1")
    public void T_029_enterT1aMOUNT() throws InterruptedException {
        overRideTaxes.enterT1Amount();
    }
    @Test(priority=29,description="T_030_override the percentage amount",enabled=true)
    @Description("Test Description :override the percentage amount")
    public void T_030_enterPercentageVat() throws InterruptedException {
//        overRideTaxes.enterPercentageT1();
    }
    @Test(priority=30,description="T_031_click on Ok button",enabled=true)
    @Description("Test Description :click on Ok button")
    public void T_031_clickOnOK() throws InterruptedException {
        overRideTaxes.clickOnOK();
    }
    @Test(priority=31,description="T_032_click on close of taxes",enabled=true)
    @Description("Test Description :click on close of taxes")
    public void T_032_clickOnCloseTaxes() throws InterruptedException {
        overRideTaxes.clickOnClose_Taxes();
    }

    @Test(priority=32,description="T_033_click on invoice button",enabled=true)
    @Description("Test Description :click on invoice button")
    public void T_033_clickOnInvoice() throws InterruptedException, FileNotFoundException {
        overRideTaxes.clickOnInvoice();
    }
    @Test(priority=33,description="T_034_verify All taxes are visible and the being calculated properly",enabled=true)
    @Description("Test Description :verify All taxes are visible and the being calculated properly")
    public void T_034_verifyAllTaxes() throws IOException, InterruptedException {
        overRideTaxes.VerifyTaxesonPDF();
    }
    @Test(priority=34,description="T_035_Sign out the page and verify username",enabled=true)
    @Description("Test Description :Sign out the page and verify username")
    public void T_035_signOutAndVerifyUsername() throws IOException, InterruptedException {
        overRideTaxes.clickOnSignOut();
    }




}
