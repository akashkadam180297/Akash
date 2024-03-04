package pages.techRo;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ECServiceManager_Journalize extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Financials']//..//following::td/child::div[@class='x193'])[1]")
    public WebElement label_Financial;

    @FindBy(xpath = "//td[text()='Financial Manager']")
    public WebElement label_FinancialManger;

    @FindBy(xpath = "//span[text()='Generate Journals']")
    public WebElement btn_GenerateJournals;

    @FindBy(xpath = "//input[contains(@id,'sbc1::content')]")
    public WebElement txt_AssertDisposal;

    @FindBy(xpath = "//div[contains(@id,'cb3')]//span[text()='Generate Journals']")
    public WebElement label_GenerateButton;

    @FindBy(xpath = "(//div[contains(@id,'::db')]/child::table)[1]")
    public WebElement label_NoDataPresent;

   /*@FindBy(xpath = "(//a[contains(text(),'Service Board')]/parent::div)[1]")
    public WebElement label_ServiceBoard;
   */
    @FindBy(xpath = "(//a[text()='Complete RO'])[1]")
    public WebElement label_CompleteRO;

    @FindBy(xpath = "(//a[contains(text(),'Financial Manager')])[1]")
    public WebElement txt_FinancialManager;

    @FindBy(xpath = "//a[text()='Journal Sources']/parent::div[contains(@id,'::_afrTabCnt')]")
    public WebElement label_JournalSources;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//td[contains(@id,'c16')]")
    WebElement todays_date;





    /**goto Financials */
    public void gotoFinancials () throws InterruptedException, FileNotFoundException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Financials");
        ReusableActions.getActions().clickChildMenu("Financial Manager");
        TestListener.saveScreenshotPNG(driver);

    }


    /** click On Generate Journals Button*/
    public void clickOnGenerateJournals () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
        WebElementActions.getActions().clickElement(btn_GenerateJournals);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** select  Journals*/
    public void selectJournals() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_AssertDisposal);
        WebElementActions.getActions().clickElement(txt_AssertDisposal);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Table Generate Journals Button */
    public void clickOnTableGenerateJournalsButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_GenerateButton);
        WebElementActions.getActions().clickElement(label_GenerateButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** verify Element not Present */
    public void verifyElementNotPresent () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NoDataPresent);
        Assert.assertFalse(label_NoDataPresent.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Service Board */
    public void clickOnServiceBoard () throws InterruptedException, FileNotFoundException {

        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Service Board");
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Financial Manager */
    public void clickOnFinancialManagerText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_FinancialManager);
        WebElementActions.getActions().clickElement(txt_FinancialManager);
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify today's date
     */
    public void verifyTodaysDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(todays_date);
        org.testng.Assert.assertTrue(todays_date.isDisplayed());
    }
    /** click On  Journal Sources */
    public void clickOnJournalSources () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_JournalSources);
        WebElementActions.getActions().clickElement(label_JournalSources);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }



}


