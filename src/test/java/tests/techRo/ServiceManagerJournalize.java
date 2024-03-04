package tests.techRo;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class ServiceManagerJournalize extends TestDriverActions {
    @Test(priority = 0, description = "Test_001_Login the page and Go to Financials ")
    @Description("Test Description: Login the page and Go to Financials ")
    public void Test_001_gotoFinancials ()  throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        journalizepage.gotoFinancials();


    }
    @Test(priority = 1, description = "Test_001_Click OnGenerate Journals   ")
    @Description("Test Description: Click OnGenerate Journals")
    public void Test_002_clickOnGenerateJournals ()   throws InterruptedException, IOException {
        journalizepage.clickOnGenerateJournals();
        journalizepage.selectJournals();
        journalizepage. clickOnTableGenerateJournalsButton ();
//        journalizepage. verifyElementNotPresent ();

    }
    @Test(priority = 2, description = "Test_001_Click On Service Board   ")
    @Description("Test Description: Click On Service Board  ")
    public void Test_003_clickOnServiceBoard ()    throws InterruptedException, IOException {
        journalizepage.clickOnServiceBoard ();


    }
    @Test(priority = 3, description = "Test_001_Click Financial manager   ")
    @Description("Test Description: Click OnGenerate Journals")
    public void Test_004_clickOnFinancialManagerText ()    throws InterruptedException, IOException {
        journalizepage.clickOnFinancialManagerText();
 //       journalizepage. clickOnJournalSources ();
        journalizepage.verifyTodaysDate();
        journalizepage.clickOnSignOut ();

    }

}


