package tests.techRo;

import constants.SheetConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("NonRepairBills")

public class CreateNonRepairBill_ServiceManagerTest extends TestDriverActions {


    @Test(priority = 0, description = "Test_001_Go to complete RO Screen")
    @Description("Test Description: Go to complete RO Screen")
    public void Test_001_goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        loginPage.loginWithValidCredentials(prop.getProperty("gmail_one_username"), prop.getProperty("gmail_one_password"));
        nonrepairbills.goToCompleteROScreen();


    }

    @Test(priority = 1, description = "Test_002_Click on CompleteRO ", enabled = true)
    @Description("Test Description: Click on CompleteRO  ")
    public void Test_002_clickCompleteRo() throws InterruptedException {
        nonrepairbills.clickCompleteRo();


    }


    @Test(priority = 2, description = "Test_003_Click on Non Repair Bills ", enabled = true)
    @Description("Test Description: Click on Non Repair Bill  ")
    public void Test_003_clickOnNonRepairBill() throws InterruptedException {
        nonrepairbills.clickOnNonRepairBill();


    }


    @Test(priority = 3, description = "Test_004_verify the present element on ReferenceContent ", enabled = true)
    @Description("Test Description:verify the present element on ReferenceContent ")
    public void Test_004_verifyReferenceContent() throws InterruptedException {
        nonrepairbills.verifyReferenceContent();

    }

    @Test(priority = 4, description = "Test_005_ verify  the  Required symbol ", enabled = true)
    @Description("Test Description:verify the  verify  the verify  the  Required symbol ")
    public void Test_005_verifyRequiredSymbol() throws InterruptedException {
        nonrepairbills.verifyRequiredSymbol();


    }

    @Test(priority = 5, description = "Test_006_ verify  the  text Invoice Date ", enabled = true)
    @Description("Test Description:verify the  verify  the verify  the  text Invoice Date ")
    public void Test_006_verifyInvoiceDate() throws InterruptedException {
        nonrepairbills.verifyInvoiceDate();


    }

    @Test(priority = 6, description = "Test_007_ verify  the  text Todays date ", enabled = true)
    @Description("Test Description:verify the  verify  the  text Todays date ")
    public void Test_007_verifyTodayDate() throws InterruptedException {
        nonrepairbills.verifyTodayDate();
    }


    @Test(priority = 5, description = "Test_006_ verify  the verify CustomerText ", enabled = true)
    @Description("Test Description:verify the  verify  the verify CustomerText  ")
    public void Test_008_verifyCustomerText() throws InterruptedException {
        nonrepairbills.verifyCustomerText();

    }

    @Test(priority = 6, description = "Test_007_ verify  the verify FedExGround Text  ", enabled = true)
    @Description("Test Description:verify  the verify FedExGround Text  ")
    public void Test_009_verifyFedExGroundText() throws InterruptedException {
        nonrepairbills.verifyFedExGroundText();


    }

    @Test(priority = 7, description = "Test_008_ verify  the BillTo ", enabled = true)
    @Description("Test Description:verify  the BillTo ")
    public void Test_010_verifyStarBillTo() throws InterruptedException {
        nonrepairbills.verifyStarBillTo();


    }

    @Test(priority = 8, description = "Test_009_ verify Bill TO Element", enabled = true)
    @Description("Test Description:verify Bill TO Element ")
    public void Test_011_verifyBillTOElement() throws InterruptedException {
        nonrepairbills.verifyBillTOElement();
        nonrepairbills.verifyBillToDropdownElement();

    }

    @Test(priority = 9, description = "Test_010_ verify Description Text", enabled = true)
    @Description("Test Description:verify Description Text ")
    public void Test_012_verifyDescriptionText() throws InterruptedException {
        nonrepairbills.verifyDescriptionText();
        nonrepairbills.verifyDescriptionContentElement();

    }

    @Test(priority = 10, description = "Test_011_ verify Notes Text", enabled = true)
    @Description("Test Description: verify Notes Text ")
    public void Test_013_verifyNotesText() throws InterruptedException {
        nonrepairbills.verifyNotesText();
        nonrepairbills.verifyNotesContentElement();

    }

    @Test(priority = 11, description = "Test_012_ verify SubTotalText,0.00 ", enabled = true)
    @Description("Test Description: verify SubTotal Text,0.00 ")
    public void Test_014_verifySubTotalText() throws InterruptedException {
        nonrepairbills.verifySubTotalText();
        nonrepairbills.verifyZeroPointZeroZeroSubTotalValue();

    }

    @Test(priority = 12, description = "Test_013_ verify TaxesText ,0.00 ", enabled = true)
    @Description("Test Description: verify TaxesText ,0.00 ")
    public void Test_015_verifyTaxesText() throws InterruptedException {
        nonrepairbills.verifyTaxesText();
        nonrepairbills.verifyTaxesValueZeroPointZeroZero();


    }

    @Test(priority = 13, description = "Test_014_ verify TotalText ,0.00,USD(Standard)", enabled = true)
    @Description("Test Description:verify TotalText ,0.00,USD(Standard) ")
    public void Test_016_verifyTotalText() throws InterruptedException {
        nonrepairbills.verifyTotalText();
        nonrepairbills.verifyTotalValueZeroPointZeroZero();
        nonrepairbills.verifyStandard();

    }

    @Test(priority = 14, description = "Test_015_ verify  the Attachment Icon)", enabled = true)
    @Description("Test Description:verify the Attachment Icon ")
    public void Test_017_verifyAttachmentIcon() throws InterruptedException {
        nonrepairbills.verifyAttachmentIcon();
        nonrepairbills.verifySeqText();
        nonrepairbills.verifyAccountText();

    }

    @Test(priority = 15, description = "Test_016_ verify Description NotesText )", enabled = true)
    @Description("Test Description:verify Description NotesText ")
    public void Test_018_verifyDescriptionNotesText() throws InterruptedException {
        nonrepairbills.verifyDescriptionNotesText();
        nonrepairbills.verifyFedExCategoryText();
        nonrepairbills.verifyQuantityText();
        nonrepairbills.verifyUnitCharge();
        nonrepairbills.verifyAmountText();
        nonrepairbills.verifyTaxOvrText();

    }

    @Test(priority = 16, description = "Test_017_ verify CrossSymbol Element )", enabled = true)
    @Description("Test Description:verify CrossSymbol Element ")
    public void Test_019_verifyCrossSymbolElement() throws InterruptedException {
        nonrepairbills.verifyCrossSymbolElement();
        nonrepairbills.verifyAccountPane();
        nonrepairbills.verifySearchText();


    }

    @Test(priority = 17, description = "Test_018_ verify Search Column )", enabled = true)
    @Description("Test Description: verify Search Column  ")
    public void Test_020_verifySearchColumn() throws InterruptedException {
        nonrepairbills.verifySearchColumn();
        nonrepairbills.verifySearchIcon();
        nonrepairbills.verifyAddElement();

    }

    @Test(priority = 18, description = "Test_019_ verify Cancel Element )", enabled = true)
    @Description("Test Description: verify Cancel Element ")
    public void Test_021_verifyCancelElement() throws InterruptedException {
        nonrepairbills.verifyCancelElement();
        nonrepairbills.verifyOKElement();
        nonrepairbills.verifySubmitElement();


    }
    @Test(priority = 19, description = "Test_020_ select BillTo Label )", enabled = true)
    @Description("Test Description: select BillTo Label")
    public void Test_022_selectBillToLabel() throws InterruptedException {
        nonrepairbills.selectBillToLabel();

    }
    @Test(priority = 20, description = "Test_021_ Write Note in note content NRB notes )", enabled = true)
    @Description("Test Description:  Write Note in note content NRB notes ")
    public void Test_023_fillNotesContent() throws InterruptedException {
        nonrepairbills.fillNotesContent();

    }
    @Test(priority = 21, description = "Test_022_ select FedEx in dropdown )", enabled = true)
    @Description("Test Description: select FedEx in dropdown  ")
    public void Test_024_selectFedExLabel() throws InterruptedException {
        nonrepairbills.selectFedExLabel();
        nonrepairbills.typeDescriptionNotes ();

    }
    @Test(priority = 22, description = "Test_023_ click Select Button wait submit button visible  )", enabled = true)
    @Description("Test Description: click Select Button wait submit button visible  ")
    public void Test_025_clickSubmitButton  () throws InterruptedException {
        nonrepairbills.clickSubmitButton();


    }
    @Test(priority = 23, description = "Test_024_ click on click SignOut Button  )", enabled = true)
    @Description("Test Description: click on click SignOut Button ")
    public void Test_026_clickSignOutButton () throws InterruptedException {
        nonrepairbills.clickSignOutButton();
        nonrepairbills.clickUserName();
    }

}