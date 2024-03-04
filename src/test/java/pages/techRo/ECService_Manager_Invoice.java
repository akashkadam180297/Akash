package pages.techRo;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ECService_Manager_Invoice extends TestDriverActions {

    @FindBy(xpath = "//input[contains(@id,'itSearch::content')]")
    public WebElement input_SearchTextArea;


    @FindBy(xpath = "//a[contains(@id,':0:sfRM:tWoR:0:cl2')]")
    public WebElement input_ReferenceNumber ;

    @FindBy(xpath = "//label[contains(text(),'RO Date:')]")
    public WebElement label_RODate;

    @FindBy(xpath = "//a[contains(@id,'idReadingDate::glyph')]")
    public WebElement label_ReadingDateGraph;

    @FindBy(xpath = "//span[text()='Refresh']")
    public WebElement btn_Refresh;


    @FindBy(xpath = "//div[contains(@id,'cbROSM')]/a/span")
    public WebElement btn_Invoice;

    @FindBy(xpath = "//label[text()='Internal RO:']/following::input[1]")
    public WebElement InternalRO_txtbox;

    @FindBy(xpath = "//label[text()='RO Date:']")
    public WebElement label_RODate1;

    @FindBy(xpath = "//input[contains(@id,':idReadingDate::content')]")
    public WebElement input_RoDate;


    @FindBy(xpath = "(//span[contains(@id,':0:olWON')]//following::div)[1]")
    public WebElement label_RoNumber;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserNameTextArea;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//div[contains(@id,'msgDlg::_ttxt')]")
    WebElement warning_error_msg;

    @FindBy(xpath = "//td[contains(@class,'af|message::detail-cell')]")
    WebElement error_msg;

    @FindBy(xpath = "(//div[contains(@id,'cancel')]/a/span)[1]")
    WebElement ok_btn;

    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement close_btn;

    @FindBy(xpath = "//div[contains(@id,'ctbCancel')]")
    WebElement cancle_btn;


    /**click on complete Ro */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);
    }
    /**wait element present SearchList */
    public void verifyElementPresent () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_ReferenceNumber);
        Assert.assertTrue(input_ReferenceNumber.isDisplayed());

    }

    /** enter Data In Search TextArea */
    public void  enterDataInSearchTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_SearchTextArea);
        WebElementActions.getActions().inputText(input_SearchTextArea,appProp.getProperty("RoNumber"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Ro Number */
    public void clickOnRoNumber  () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_ReferenceNumber);
        WebElementActions.getActions().clickElement(input_ReferenceNumber);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  verify RO Date and calender Icon
     */
    public void verifyRODate1() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RODate);
        Assert.assertTrue(label_RODate.isDisplayed());
        Assert.assertTrue(label_ReadingDateGraph.isDisplayed());

    }

    /**
     * enter duplicateInternalPO number
     */
    public void enterDuplicateInternalPONumber() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InternalRO_txtbox);
            WebElementActions.getActions().inputText(InternalRO_txtbox, appProp.getProperty("RoNumber"));
            Thread.sleep(2000);
            InternalRO_txtbox.sendKeys(Keys.TAB);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * verify warning pop up element
     */
      public void verifyWarningPopUpElement() throws InterruptedException {
          if (LoginActions.environmentName.contains("EC")) {
              WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(warning_error_msg);
              Assert.assertTrue(warning_error_msg.isDisplayed());
              Assert.assertTrue(error_msg.isDisplayed());
              Assert.assertTrue(ok_btn.isDisplayed());
          }
      }
    /**
     *  click on Ok button
     */
    public void clickOKButton() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ok_btn);
            WebElementActions.getActions().clickElement(ok_btn);

            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**
     * enter Internal PO Number
     */
    public void enterInternalPONumber() throws InterruptedException {
        String PONumber = String.valueOf(WebElementActions.getActions().randomNumber(1000, 100000000));
        if (LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InternalRO_txtbox);
            WebElementActions.getActions().inputText(InternalRO_txtbox, PONumber);
            Thread.sleep(2000);
            InternalRO_txtbox.sendKeys(Keys.TAB);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**enter Yesterday Date */
    public void enterYesterdayDate () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_RoDate);
        WebElementActions.getActions().inputText(input_RoDate,appProp.getProperty("YesterdayDate"));

    }

    /**verify RO Date ,ReadingDate Graph */
    public void verifyRODate ()throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RODate1);
            Assert.assertTrue(label_RODate1.isDisplayed());

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ReadingDateGraph);
            Assert.assertTrue(label_ReadingDateGraph.isDisplayed());
        }
    }

    /** Store Ro Number */
    public void storeRoNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RoNumber);
        System.out.println("RoNumber");
        String originalWindow=driver.getWindowHandle () ;


    }
    /** click Invoice Button */
    public void clickInvoiceButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Invoice);
        WebElementActions.getActions().clickElement(btn_Invoice);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * click on close button
     */
    public void clickOnclose() throws InterruptedException {
        if (LoginActions.environmentName.contains("NA")) {
            Thread.sleep(3000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(close_btn);
            WebElementActions.getActions().clickElement(close_btn);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on cancle button
     */
  public void clickOncancle() throws InterruptedException {
        if (LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancle_btn);
            WebElementActions.getActions().clickElement(cancle_btn);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
       }


    /**click in Sign out Button */
    public void clickSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);

    }

    /**click UserName TextArea */
    public void ClickUserNameTextArea () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserNameTextArea);
        Assert.assertTrue(label_UserNameTextArea.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

}
