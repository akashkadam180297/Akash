package tests.parts;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class JournalizeCounterSale extends TestDriverActions{


    @Test(priority=0, description="Login the page and Go to the Financial Manager",enabled = true)
    @Description("Test Description : T_001_Login the page and Go to the Financial Manager")
    public void gotoFinancialManager() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        journalizecountersale.gotoFinanceManager();

    }

    @Test(priority=1, description="Click on dropdown,refresh button,generateJournalize and select check box",enabled = true)
    @Description("Test Description : T_001_Click on dropdown,refresh button,generateJournalize and select check box")
    public void clickOnGererateJournals_checkbox() throws InterruptedException {
//        journalizecountersale.clickOnDropDown();
//        journalizecountersale.clickOnRefreshButton();
        journalizecountersale.clickOnGenerateJournalize();
        journalizecountersale.clickOnCheckBoxofPeriod();

    }

    @Test(priority=2, description="Select checkBox ,click on GenerateJournal and service board",enabled = true)
    @Description("Test Description : T_002_Select checkBox ,click on GenerateJournal and service board")
    public void serviceBoard() throws InterruptedException {
        journalizecountersale.clickOnCheckBox();
        journalizecountersale.clickOnGenerateJournalsBtn();
        journalizecountersale.clickOnServiceBoard();

    }
    @Test(priority=3, description="Click on Financial manager,verify and sign out the page",enabled = true)
    @Description("Test Description : T_003_Click on Financial manager,verify and sign out the page")
    public void financialManager() throws FileNotFoundException, InterruptedException {
        journalizecountersale.clickOnFinancialManager();
        journalizecountersale.verifyExportJournals();
        journalizecountersale.verifyTodaysdateColumn();
        journalizecountersale.clickOnSignOutVerifyUsername();

    }











}
