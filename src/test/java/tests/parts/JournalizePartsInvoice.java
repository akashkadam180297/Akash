package tests.parts;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners(utils.TestListener.class)
@Epic("Regression Test")
@Feature("Journalize Parts Test")

public class JournalizePartsInvoice extends TestDriverActions {

    @Test(priority=0, description="Login the page and Go to the Financial Manager",enabled = true)
    @Description("Test Description : T_001_Login the page and Go to the Financial Manager")
    public void gotoFinancialManager() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        journalize.gotoFinanceManager();

    }

    @Test(priority=1, description="Click on dropdown,refresh button,generateJournalize and select check box",enabled = true)
    @Description("Test Description : T_001_Click on dropdown,refresh button,generateJournalize and select check box")
    public void clickOnGererateJournals_checkbox() throws InterruptedException {
 //       journalize.clickOnDropDown();
 //       journalize.clickOnRefreshButton();
        journalize.clickOnGenerateJournalize();
        journalize.clickOnCheckBoxofPeriod();

    }

    @Test(priority=2, description="Select checkBox ,click on GenerateJournal and service board",enabled = true)
    @Description("Test Description : T_002_Select checkBox ,click on GenerateJournal and service board")
    public void serviceBoard() throws InterruptedException, FileNotFoundException {
        journalize.clickOnCheckBox();
        journalize.clickOnGenerateJournalsBtn();
        journalize.clickOnServiceBoard();

    }
    @Test(priority=3, description="Click on Financial manager,verify and sign out the page",enabled = true)
    @Description("Test Description : T_003_Click on Financial manager,verify and sign out the page")
    public void financialManager() throws FileNotFoundException, InterruptedException {
        journalize.clickOnFinancialManager();
        journalize.verifyTodaysdateColumn();
        journalize.clickOnSignOutVerifyUsername();

    }











}
