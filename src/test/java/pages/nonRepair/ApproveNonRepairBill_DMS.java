package pages.nonrepair;

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

public class ApproveNonRepairBill_DMS extends TestDriverActions {

    @FindBy(xpath = "//label[text()='Shop Estimates']/following::input[1]")
    WebElement radio_CompleteRepairs;

    @FindBy(xpath = "//label[text()='Select:']/following::input[1]")
    WebElement radio_myApproval;
    @FindBy(xpath = "//label[text()='My Approvals']/following::input[1]")
    WebElement radio_all;

    @FindBy(xpath = "//div[contains(@id,'r3:0:t1::db')]/table/tbody/tr/td[4]")
    List<WebElement> reference_row;

    @FindBy(xpath = "//label[text()='Reference:']/following::span[1]")
    WebElement reference_value;

    @FindBy(xpath = "//label[text()='Vendor:']/following::span[1]")
    WebElement vendor_name;

    @FindBy(xpath = "//label[text()='Notes:']")
    WebElement label_notes;

    @FindBy(xpath = "//span[text()='Sub Account']")
    WebElement label_subAccount;

    @FindBy(xpath = "//span[text()='To Be Revised']/following::a[2]")
    WebElement hyperlink_pendingApproval;

    @FindBy(xpath = "//label[text()='Total:']/following::td[3]")
    WebElement total_value;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "//span[text()='Reject']")
    WebElement btn_reject;

    @FindBy(xpath = "//span[text()='To Be Revised']")
    WebElement btn_ToBeRevised;

    @FindBy(xpath = "(//label[text()='Invoice Date:'])[1]/following::span[1]")
    WebElement label_TodaysDate;

    @FindBy(xpath = "//label[text()='Notes:']/following::textarea[1]")
    WebElement label_TheseAreNotes;

    @FindBy(xpath = "//span[text()='Approve']")
    WebElement btn_approve;

    @FindBy(xpath = "//div[text()='To Be Rejected']")
    WebElement label_ToBeRejected;

    @FindBy(xpath = "//div[text()='To Be Rejected']/following::span[1]")
    WebElement asterisk_;

    @FindBy(xpath = "//label[text()='Please enter your reason']")
    WebElement label_PleaseEnterYourReason;

    @FindBy(xpath = "//label[text()='Please enter your reason']/following::textarea[1]")
    WebElement textarea_PleaseEnterYourReason;

    @FindBy(xpath = "//label[text()='Internal Notes']")
    WebElement label_InternalNotes;

    @FindBy(xpath = "//label[text()='Internal Notes']/following::textarea")
    WebElement textarea_InternalNotes;

    @FindBy(xpath = "(//span[text()='Cancel'])[3]")
    WebElement cancle;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement ok;

    @FindBy(xpath = "//div[text()='To Be Revised']")
    WebElement label_ToBeRevised;

    @FindBy(xpath = "//div[text()='To Be Revised']/following::span[1]")
    WebElement asterisk1;

    @FindBy(xpath = "//div[text()='To Be Revised']/following::label[1]")
    WebElement label_PleaseEnter;

    @FindBy(xpath = "//div[text()='To Be Revised']/following::textarea[1]")
    WebElement textarea2;

    @FindBy(xpath = "//div[text()='To Be Revised']/following::label[2]")
    WebElement InternalNotes;

    @FindBy(xpath = "//div[text()='To Be Revised']/following::textarea[2]")
    WebElement textarea_Internal;

    @FindBy(xpath = "(//span[text()='OK'])[2]")
    WebElement ok_btn;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "(//span[text()='Cancel'])[2]")
    WebElement cancle_btn_2;

    @FindBy(xpath = "//label[text()='Reference:']/following::span[1]")
    WebElement reference_Num;


    /**
     * Go to Approval Screen /click on Approvals
     */
    public void gotoApprovalScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Approvals");

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * click on Completed Repairs Radio button
     */
    public void clickOnCompleteRepair() throws InterruptedException {
 //     WaitActions.getWaits().waitForElementTobeClickable(radio_CompleteRepairs);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radio_CompleteRepairs);
      WebElementActions.getActions().clickElement(radio_CompleteRepairs);

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * Extra step
     * click on my approval
     */
    public void clickOnMyApproval() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(radio_myApproval);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radio_myApproval);
        WebElementActions.getActions().clickElement(radio_myApproval);

        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * click on 'ALL Radio' Button
     */

     public void clickOnAll() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(radio_all);
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radio_all);
        WebElementActions.getActions().clickElement(radio_all);

         WaitActions.getWaits().loadingWait(loder);
     }
    /**
     * Click on Reference number
     */
    public void clickOnReferenceNumber() throws InterruptedException {
 //       WaitActions.getWaits().WaitUntilWebElementIsVisible(reference_row);
//        WebElementActions.getActions().clickUsingJS();
       int a = WebElementActions.getActions().randomNumber(1,reference_row.size());
        for(int i =0;i<=reference_row.size();i++)
        {
            if(reference_row.get(i).getText().contains("OI"+a))
            {
                reference_row.get(a).click();
                break;
            }
        }

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * Verify element of reference number
     */
      public void verifyReferenceNumber() throws InterruptedException {
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(reference_value);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reference_value);
          Assert.assertTrue(reference_value.isDisplayed());
          Assert.assertTrue(label_TodaysDate.isDisplayed());
          Assert.assertTrue(vendor_name.isDisplayed());
          Assert.assertTrue(label_notes.isDisplayed());
          Assert.assertTrue(label_TheseAreNotes.isDisplayed());
          Assert.assertTrue(total_value.isDisplayed());
          Assert.assertTrue(label_subAccount.isDisplayed());
          Assert.assertTrue(hyperlink_pendingApproval.isDisplayed());
          Assert.assertTrue(btn_cancle.isDisplayed());
          Assert.assertTrue(btn_reject.isDisplayed());
          Assert.assertTrue(btn_approve.isDisplayed());
          Assert.assertTrue(btn_ToBeRevised.isDisplayed());

      }
    /**
     * click on reject button
     */
    public void clickOnRejectBtn() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_reject);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_reject);
        WebElementActions.getActions().clickElement(btn_reject);

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * verify reject button element
     */
      public void verifyRejectbuttonElement() throws InterruptedException {
//          WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToBeRejected);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToBeRejected);
          Assert.assertTrue(label_ToBeRejected.isDisplayed());
          Assert.assertTrue(asterisk_.isDisplayed());
          Assert.assertTrue(label_PleaseEnterYourReason.isDisplayed());
          Assert.assertTrue(textarea_PleaseEnterYourReason.isDisplayed());
          Assert.assertTrue(label_InternalNotes.isDisplayed());
          Assert.assertTrue(textarea_InternalNotes.isDisplayed());
          Assert.assertTrue(cancle_btn_2.isDisplayed());
          Assert.assertTrue(ok.isDisplayed());
 //         Assert.assertTrue(.isDisplayed());
      }
    /**
     * click on cancel button
     */
    public void clickOnCancle() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(cancle_btn_2);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancle_btn_2);
        WebElementActions.getActions().clickElement(cancle_btn_2);

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * Click on "To be Revised" button
     */
    public void clickOnTobeRevised() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_ToBeRevised);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ToBeRevised);
        WebElementActions.getActions().clickElement(btn_ToBeRevised);

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     *  verify elements of To Be revised tab
     */
    public void verifyElementsToBeRevised() throws InterruptedException {
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(label_ToBeRevised);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ToBeRevised);
        Assert.assertTrue(label_ToBeRevised.isDisplayed());
        Assert.assertTrue(asterisk1.isDisplayed());
        Assert.assertTrue(label_PleaseEnter.isDisplayed());
        Assert.assertTrue(textarea2.isDisplayed());
        Assert.assertTrue(InternalNotes.isDisplayed());
        Assert.assertTrue(textarea_Internal.isDisplayed());
        Assert.assertTrue(ok_btn.isDisplayed());
 //       Assert.assertTrue(.isDisplayed());
    }
    /**
     * click on cancle button
     */
    public void clickOnCancleButton() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(cancle);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cancle);
        WebElementActions.getActions().clickElement(cancle);

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * click on Approve button
     */
    public void clickOnApprove() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_approve);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_approve);
        WebElementActions.getActions().clickElement(btn_approve);

        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * verify the element Reference Number which is approve
     */
      public void verifyApproveElement() throws InterruptedException {
 //         WaitActions.getWaits().WaitUntilWebElementIsVisible(reference_Num);
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reference_Num);
          Assert.assertTrue(reference_Num.isDisplayed());
      }

    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut () throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

















}
