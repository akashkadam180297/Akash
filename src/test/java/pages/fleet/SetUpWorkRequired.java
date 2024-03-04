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

public class SetUpWorkRequired extends TestDriverActions {

    @FindBy(xpath = "(//label[text()='Search Unit:']/following::input[1])[1]")
    WebElement txt_searchunit;

    @FindBy(xpath = "//span[text()='Current Location']/following::a[1]/span")
    WebElement hyperlink_number;

    // @FindBy(xpath = "//span[text()='More Info']")
    @FindBy(xpath = "(//span[text()='Save / Exit'])[1]/following::span[1]")
    WebElement btn_moreInfo;

    @FindBy(xpath = "(//a[text()='Work Required'])[1]")
    WebElement btn_workRequired;

    @FindBy(xpath = "//span[text()='More Work ...']")
    WebElement btn_moreWork;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement btn_VMRS;

    @FindBy(xpath = "//label[text()='Search:']/following::td[6]/a/img")
    WebElement img_airIntakeSystem;

    @FindBy(xpath = "(//span[text()='Description'])[1]/following::a[1]/img")
    WebElement plus_icon;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement btn_add;

    @FindBy(xpath = "(//span[text()='Save / Exit'])[2]")
    WebElement WorkRequired_SaveExit;

    @FindBy(xpath = "(//span[text()='Save / Exit'])[1]")
    WebElement btn_saveExit;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    /**
     * click on fleet
     *  Go to Unit master
     */
    public void gotoUnitMaster() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("Unit Master");

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  Type Unit Number 118888
     */
    public void enterUnitNumber() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(txt_searchunit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_searchunit);
        WebElementActions.getActions().inputText(txt_searchunit,prop.getProperty("UnitNumber"));

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on 118888
     */
    public void clickOnHyperLink() throws InterruptedException {
        Thread.sleep(5000);
      //  WaitActions.getWaits().waitForElementTobeClickable(hyperlink_number);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_number);
        WebElementActions.getActions().clickElement(hyperlink_number);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Moreinfo button
     */
    public void clickOnMoreInfo() throws InterruptedException {
        //        Thread.sleep(3000);
     //   WaitActions.getWaits().waitForElementTobeClickable(btn_moreInfo);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_moreInfo);
        WebElementActions.getActions().clickElement( btn_moreInfo);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Work requird tab
     */
    public void clickOnWorkRequired() throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(btn_workRequired);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_workRequired);
        WebElementActions.getActions().clickElement(btn_workRequired);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on More work tab
     */
    public void clickOnMoreWork() throws InterruptedException {
        //WaitActions.getWaits().waitForElementTobeClickable(btn_moreWork);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_moreWork);
//      Thread.sleep(5000);
        WebElementActions.getActions().clickElement(btn_moreWork);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on VMRS tab
     */
    public void clickOnVMRS() throws InterruptedException {
     //   WaitActions.getWaits().waitForElementTobeClickable(btn_VMRS);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_VMRS);
        WebElementActions.getActions().clickElement(btn_VMRS);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Image Air Intake System
     */
    public void clickOnAirIntakeSystem() throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(img_airIntakeSystem);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_airIntakeSystem);
        WebElementActions.getActions().clickElement(img_airIntakeSystem);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * click on plus icon
     */
    public void clickOnPlusIcon() throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(plus_icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_icon);
        WebElementActions.getActions().clickElement(plus_icon);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Add button
     */
    public void clickOnAddbutton() throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(btn_add);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions().clickElement(btn_add);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on save and exit of work required
     */
    public void clickOnSaveAndExit() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(WorkRequired_SaveExit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(WorkRequired_SaveExit);
        Thread.sleep(3000);
        WebElementActions.getActions().clickElement(WorkRequired_SaveExit);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on save and exit
     */
    public void clickOnSaveAndExit2() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(btn_saveExit);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_saveExit);
//        Thread.sleep(2000);
        WebElementActions.getActions().clickElement(btn_saveExit);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(btn_signOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }



}


