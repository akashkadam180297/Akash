package pages.service;

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

public class ECServiceManager_AddRemoveLabor extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Total Charge']/following::a[3]")
    WebElement hyperlink_referenceNum;

    @FindBy(xpath = "//span[text()='Add Labour']")
    WebElement btn_AddLabour;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement tab_VMRS;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[5]")
    WebElement automatic_manual_Chassis;

    @FindBy(xpath = "//label[text()='Search:']/following::a[3]/img")
    WebElement plus_icon;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement add_btn;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::tr[1]/td[13]")
    WebElement row_one;

    @FindBy(xpath = "(//span[text()='Total Charge'])[1]/following::a[7]")
    WebElement cross_icon;

    @FindBy(xpath = "//span[text()='Show Labour Details']/following::a[2]/img")
    WebElement delete_icon;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[1]")
    WebElement aerodynamic_img;

    @FindBy(xpath = "(//span[text()='Description'])[2]/following::a[1]")
    WebElement IconPlus;

    @FindBy(xpath = "//label[text()='Complaint:']/following::textarea[1]")
    WebElement txt_complaint;

    @FindBy(xpath = "//label[text()='Cause/Reason:']/following::textarea[1]")
    WebElement txt_cause;

    @FindBy(xpath = "//label[text()='Correction/Task:']/following::textarea[1]")
    WebElement txt_task;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//span[text()='Yes, delete labour and parts']")
    List<WebElement> Yes_delete_labour_and_parts ;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to CompleteRo
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Click on Reference Number(O104914)
     */
      public void clickOnReferenceNumber() throws InterruptedException {
 //         Thread.sleep(3000);
 //         WaitActions.getWaits().waitForElementTobeClickable(hyperlink_referenceNum);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_referenceNum);
          WebElementActions.getActions().clickElement(hyperlink_referenceNum);
  //        Thread.sleep(2000);
          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
      /**
      * click on Add Labour
      */
      public void clickOnAddLabour() throws InterruptedException {
//         WaitActions.getWaits().waitForElementTobeClickable(btn_AddLabour);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AddLabour);
         WebElementActions.getActions().clickElement(btn_AddLabour);
 //        Thread.sleep(2000);
          WaitActions.getWaits().loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);
       }
       /**
       * Click on VMRS tab.
       */
       public void clickOnVMRStab() throws InterruptedException {
  //         Thread.sleep(2000);
 //       WaitActions.getWaits().waitForElementTobeClickable(tab_VMRS);
           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_VMRS);
        WebElementActions.getActions().clickElement(tab_VMRS);
 //       Thread.sleep(2000);
           WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
       /**
       * click on image of "Automatic/Manual Chassis Lubricator"
       */
       public void clickOnAutomatic_ManualChassisLubricator() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(automatic_manual_Chassis);
           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(automatic_manual_Chassis);
        WebElementActions.getActions().clickElement(automatic_manual_Chassis);
 //       Thread.sleep(3000);
           WaitActions.getWaits().loadingWait(loder);
             TestListener.saveScreenshotPNG(driver);
         }
       /**
        *Click on "+" icon(In green colour)
       */
       public void clickOnPlusIcon() throws InterruptedException {
//           WaitActions.getWaits().waitForElementTobeClickable(plus_icon);
           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_icon);
           WebElementActions.getActions().clickElement(plus_icon);
 //          Thread.sleep(3000);
           WaitActions.getWaits().loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);
       }
       /**
        *click on Add button
        **/
      public void clickOnAddbutton() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(add_btn);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(add_btn);
        WebElementActions.getActions().clickElement(add_btn);
 //       Thread.sleep(2000);
          WaitActions.getWaits().loadingWait(loder);
           TestListener.saveScreenshotPNG(driver);
       }
      /**
      * click on Cross icon
      */
      public void clickOnCrossIcon() throws InterruptedException {
          Thread.sleep(5000);
//          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(row_one);
          WebElementActions.getActions().moveOnTargetElement(row_one);

 //         WaitActions.getWaits().waitForElementTobeClickable(cross_icon);
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cross_icon);
          Thread.sleep(2000);
          WebElementActions.getActions().clickElement(cross_icon);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * Click on delete icon(Trash icon)
     */
    public void clickOnDeleteIcon() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(delete_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(delete_icon);
        WebElementActions.getActions().clickElement(delete_icon);


//        WaitActions.getWaits().loadingWait(loder);

        if( Yes_delete_labour_and_parts.size()>0)
        {
            WebElementActions.getActions().clickElement(Yes_delete_labour_and_parts.get(0));
        }

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *click on img
     **/
    public void clickOnImg() throws InterruptedException {
//        Thread.sleep(3000);
//        WaitActions.getWaits().waitForElementTobeClickable(aerodynamic_img);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(aerodynamic_img);
        WebElementActions.getActions().clickElement(aerodynamic_img);
 //       Thread.sleep(2000);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *Click on "+" icon(In green colour)
     */
    public void clickOnPlusbtn() throws InterruptedException {
        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(plus_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_icon);
        WebElementActions.getActions().clickElement(plus_icon);
//        Thread.sleep(3000);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *type Third complaint(complaint)
     **/
    public void enterThirdComplaint() throws InterruptedException {
 //       Thread.sleep(3000);
 //       WaitActions.getWaits().waitForElementTobeClickable(txt_complaint);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_complaint);
        WebElementActions.getActions().inputText(txt_complaint,"complaint");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *type Third cause( cause)
     **/
    public void enterThirdCause() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(txt_cause);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_cause);
        WebElementActions.getActions().inputText(txt_cause,"cause");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *type Third correction(correction)
     **/
    public void enterThirdCorrection() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(txt_task);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_task);
        WebElementActions.getActions().inputText(txt_task,"task");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {
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
