package pages.fleet;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class CreateRedTagDMS extends TestDriverActions {

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]/following::input[1]")
    WebElement input_searchUnit;

    @FindBy(xpath = "//span[text()='Current Location']/following::a[1]")
    WebElement hyperlink_UnitNumber;

    @FindBy(xpath = "//span[text()='Red Tag']")
    WebElement btn_RedTag;

    @FindBy(xpath = "//div[text()='Red Tag']")
    WebElement subtitle_RedTag;

    @FindBy(xpath = "//div[contains(@id,'tsvd')]")
    List<WebElement> Work_Required;

    @FindBy(xpath = "(//label[text()='Status:'])[2]/preceding::span[1]")
    WebElement label_asterisk;

    @FindBy(xpath = "(//label[text()='Status:'])[2]")
    WebElement label_status;

    @FindBy(xpath = "(//label[text()='Status:'])[2]/following::select")
    WebElement dropdown_status;

    @FindBy(xpath = "(//label[text()='Notes:'])[2]/preceding::span[1]")
    WebElement label_asterisk_Notes;

    @FindBy(xpath = "(//label[text()='Notes:'])[2]")
    WebElement label_notes;

    @FindBy(xpath = "(//label[text()='Notes:'])[2]/following::textarea")
    WebElement notes_textarea;


    @FindBy(xpath = "(//label[text()='Notes:'])[2]/following::span[2]")
    WebElement btn_cancle;


    @FindBy(xpath = "(//label[text()='Notes:'])[2]/following::span[3]")
    WebElement btn_saveEit;

    @FindBy(xpath = "//label[text()='Status:']/following::a[1]")
    WebElement hyperlink_unavailable;

    @FindBy(xpath = "//span[text()='Update unit status to available']")
    WebElement btn_Updateunitstatustoavailable;

    @FindBy(xpath = "//textarea[contains(@id,'itSerdueNotesTS::content')]")
    //   List<WebElement> Work_required_note;
    WebElement Work_required_note;

    @FindBy(xpath = "//label[text()='Created Date:']")
//    List<WebElement> Created_Date;
    WebElement Created_Date;

    @FindBy(xpath = "//label[text()='Created by:']")
    //   List<WebElement> Created_by;
    WebElement Created_by;

    @FindBy(xpath = "//td[text()='Kevin Ingram Kevin Ingram']")
//    List<WebElement> Kevin_Ingram_Kevin_Ingram;
    WebElement Kevin_Ingram_Kevin_Ingram;

    @FindBy(xpath = "//span[text()='Available [AVAIL]']")
    WebElement Available_AVAIL;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement SaveExit_btn;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    //h1[text()='Working...Please Wait']

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;



    /*
     * Go to Unit Master Screen
     * */
    public void gotoUnitMasterScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("Unit Master");
    }
    /**
     * Enter UnitNumber
     */
    public void enterUnitNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_searchUnit);
        WebElementActions.getActions().inputText(input_searchUnit,prop.getProperty("UnitNumber"));

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Unit Number
     */
    public void clickOnUnitNumber() throws InterruptedException {
        //WaitActions.getWaits().waitForElementTobeClickable(hyperlink_UnitNumber);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_UnitNumber);
        WebElementActions.getActions().clickElement(hyperlink_UnitNumber);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * verify element present Red Tag
     */
    public void verifyRedTag() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_RedTag);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_RedTag);
        Assert.assertTrue(btn_RedTag.isDisplayed());
    }
    /**
     * click on Red Tag button
     */
    public void clickonRedTag() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RedTag);
        WebElementActions.getActions().clickElement(btn_RedTag);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify text Red Tag
     */
    public void verifyRedTag1() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(subtitle_RedTag);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(subtitle_RedTag);
        Assert.assertTrue(subtitle_RedTag.isDisplayed());
    }
    /**
     * verify element present Work Required list
     */
    public void verifyworkRequiredList() throws InterruptedException {
     //   WaitActions.getWaits().WaitUntilWebElementIsVisible(Work_Required.get(0));
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Work_Required.get(0));
        Assert.assertTrue(Work_Required.size() > 0);
    }
    /**
     * verify text *
     */
    public void verifyAsterisk() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_asterisk);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_asterisk);
        Assert.assertTrue(label_asterisk.isDisplayed());
    }
    /**
     * verify text Status:
     */
    public void verifyStatus() throws InterruptedException {
        //WaitActions.getWaits().WaitUntilWebElementIsVisible(label_status);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_status);
        Assert.assertTrue(label_status.isDisplayed());
    }
    /**
     * verify element present Status Drop-down
     */
    public void verifyDropDown() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(dropdown_status);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(dropdown_status);
        Assert.assertTrue(dropdown_status.isDisplayed());
    }
    /**
     * verify text *
     */
    public void verifyAsterisk1() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_asterisk_Notes);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_asterisk_Notes);
        Assert.assertTrue(label_asterisk_Notes.isDisplayed());
    }
    /**
     * verify text Notes:
     */
    public void verifyNotes() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_notes);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_notes);
        Assert.assertTrue(label_notes.isDisplayed());
    }
    /**
     * verify element present Text Area of Notes
     */
    public void verifyAreaOfNotes() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(notes_textarea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(notes_textarea);
        Assert.assertTrue(notes_textarea.isDisplayed());
    }
    /**
     * verify element present Cancel
     */
    public void verifyCancle() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_cancle);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_cancle);
        Assert.assertTrue(btn_cancle.isDisplayed());
    }
    /**
     * verify element present Save/Exit
     */
    public void verifySaveExit() throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_saveEit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_saveEit);
        Assert.assertTrue(btn_saveEit.isDisplayed());
    }
    /**
     * type Work required note(In notes text area)
     */
    public void enterWorkRequired() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(notes_textarea);
        WebElementActions.getActions().inputText(notes_textarea,prop.getProperty("textarea"));
    }
    /**
     * click on Save/Exit
     */
    public void clickSaveExit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_saveEit);
        WebElementActions.getActions().clickElement(btn_saveEit);
    }
    /**
     * verify element present Unavailable
     */
    public void verifyUnavailable() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(hyperlink_unavailable);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_unavailable);
        Assert.assertTrue(hyperlink_unavailable.isDisplayed());
    }
    /**
     * verify element present 'Update unit status to available' button
     */
    public void verifyUpdateunitStatus() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Updateunitstatustoavailable);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Updateunitstatustoavailable);
        Assert.assertTrue(btn_Updateunitstatustoavailable.isDisplayed());
    }
    /**
     * click on 'Update unit status to available' button
     */
    public void clickUpdateunitstatus() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Updateunitstatustoavailable);
        WebElementActions.getActions().clickElement(btn_Updateunitstatustoavailable);
    }
    /**
     * verify text Work required note
     */
    public void verifyWorkRequired() throws InterruptedException {
      // WaitActions.getWaits().WaitUntilWebElementIsVisible(Work_required_note);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Work_required_note);
        Assert.assertTrue(Work_required_note.isDisplayed());

    }
    /**
     * verify text Created Date:
     */
    public void verifyCreatedDate() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(Created_Date);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Created_Date);
        Assert.assertTrue(Created_Date.isDisplayed());
    }
    /**
     * verify text Created by:
     */
    public void verifyCreatedBy() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(Created_by);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Created_by);
        Assert.assertTrue(Created_by.isDisplayed());
    }
    /**
     * verify text DMSName(Kevin Ingram Kevin Ingram)
     */
    public void verifyDMSName() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(Kevin_Ingram_Kevin_Ingram);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Kevin_Ingram_Kevin_Ingram);
        Assert.assertTrue(Kevin_Ingram_Kevin_Ingram.isDisplayed());
    }
    /**
     * verify text Available [AVAIL]
     */
    public void verifyAvailable() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(Available_AVAIL);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Available_AVAIL);
        Assert.assertTrue(Available_AVAIL.isDisplayed());
    }
    /**
     * type Un-red-tag notes
     */
    public void enterUnredTag() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(notes_textarea);
        WebElementActions.getActions().inputText(notes_textarea,prop.getProperty("unRedTag"));
    }
    /**
     * click on Save/Exit
     */
    public void clickSaveExitBtn() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_saveEit);
        WebElementActions.getActions().clickElement(btn_saveEit);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * verify element present Red Tag
     */
    public void verifyRedTagbtn() throws InterruptedException {
       // WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_RedTag);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_RedTag);
        Assert.assertTrue(btn_RedTag.isDisplayed());
    }
    /**
     * click on Sign Out
     */
    public void clickOnSignOut () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);


      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

}
