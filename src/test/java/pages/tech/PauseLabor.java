package pages.tech;

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

public class PauseLabor extends TestDriverActions {

    @FindBy(xpath = "//span[contains(text(),'Scan Employee Badge')]/following::input[1]")
    WebElement enter_Techbadge;

    @FindBy(xpath = "//span[text()='Go']")
    WebElement btn_Go;

    @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
    List<WebElement> btn_assignedWork;

    @FindBy(xpath = "//span[text()='More Units']")
    WebElement btn_MoreUnits;

    @FindBy(xpath = "(//label[text()='Search Unit:'])[1]/following::input[1]")
    WebElement searchunit_Firstname;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement btn_select;

    @FindBy(xpath = "//div[contains(@id,'ctbLabourGuide')]/a/span")
    WebElement btn_MoreUnit;

   @FindBy(xpath = "(//a[contains(text(),'VMRS')])[1]")
    WebElement btn_VMRS;

    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement img_MarineWork;

   @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement btn_plus ;

    @FindBy(xpath = "//textarea[contains(@id,'itComplaint::content')]")
    WebElement complaint_textbox;

   @FindBy(xpath = "//div[contains(@id,'ctbOk')]/a/span")
    WebElement btn_add;

   @FindBy(xpath = "//a[contains(@id,'ciWorkRequired')]/img")
    WebElement  img_WorkRequired;

    @FindBy(xpath = "//div[contains(@id,'ctbPause')]/a/span")
    WebElement btn_pause;

    @FindBy(xpath = "//a[contains(@id,'clStartJob')]/span[2]")
    WebElement label_CurrentJob_PauseWork;

    @FindBy(xpath = "//a[contains(@id,'cl1')]/span[2]")
    WebElement label_Unit_FirstUnit;

    @FindBy(xpath = "//table[contains(@id,'ptTRO:pgl2')]/tbody/tr/td[3]/span")
    WebElement lable_pause;

   @FindBy(xpath = "//span[contains(@id,'ot3')]/label")
    WebElement selectAssignedWork;

    @FindBy(xpath = "(//div[contains(@id,'ctbSelect')]/a)[1]")
    WebElement select_btn;

    @FindBy(xpath = "(//a[contains(text(),'Summary')])[1]")
    WebElement btn_Summary;

   @FindBy(xpath = "//div[contains(@id,'unitReadyButtonId')]/a/span")
    WebElement btn_unitReady;

    @FindBy(xpath = "//div[contains(@id,'ctbSelectAssignedWork')]/a/span")
    WebElement Select_button;

    @FindBy(xpath = "//img[contains(@id,'ciWoactStartId::icon')]")
    WebElement clock_icon;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
    List<WebElement> loder;



    public void enterTechBadge() throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(enter_Techbadge);
       WebElementActions.getActions().inputText(enter_Techbadge,appProp.getProperty("TechBadge"));

    }

    public void clickOnGo() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Go);
        WebElementActions.getActions().clickElement(btn_Go);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickMoreUnits() throws InterruptedException {
        Thread.sleep(8000);
        if(btn_assignedWork.size()> 0)
        {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
            WebElementActions.getActions().clickElement(btn_assignedWork.get(0));

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        Thread.sleep(2000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_MoreUnits);
        WebElementActions.getActions().clickElement(btn_MoreUnits);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void enterFirstUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchunit_Firstname);
        WebElementActions.getActions().inputText(searchunit_Firstname,appProp.getProperty("FirstUnit"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickSelectButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions().clickElement(btn_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickMoreWorks() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_MoreUnit);
        WebElementActions.getActions().clickElement(btn_MoreUnit);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickVMRS() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_VMRS);
        WebElementActions.getActions().clickElement(btn_VMRS);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickVMRSImg() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_MarineWork);
        WebElementActions.getActions().clickElement(img_MarineWork);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickPlusbtn() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_plus);
        WebElementActions.getActions().clickElement(btn_plus);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void enterTextComplaintBox() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(complaint_textbox);
        WebElementActions.getActions().inputText(complaint_textbox,appProp.getProperty("Text"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickOnAdd() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_add);
        WebElementActions.getActions().clickElement(btn_add);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickAccessoriesImg() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_WorkRequired);
        WebElementActions.getActions().clickElement(img_WorkRequired);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickPauseButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_pause);
        WebElementActions.getActions().clickElement(btn_pause);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void verifyPauseWork_FirstUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_CurrentJob_PauseWork);
        Assert.assertTrue(label_CurrentJob_PauseWork.isDisplayed());
        Assert.assertTrue(label_Unit_FirstUnit.isDisplayed());

    }

    public void enterSecondunit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchunit_Firstname);
        WebElementActions.getActions().inputText(searchunit_Firstname,appProp.getProperty("SecondUnit"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void verifyPause() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lable_pause);
        Assert.assertTrue(lable_pause.isDisplayed());
    }

    public void clickAssignedWork() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_assignedWork.get(0));
        WebElementActions.getActions().clickElement(btn_assignedWork.get(0));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void verifySelectAssignedWork() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(selectAssignedWork);
        Assert.assertTrue(selectAssignedWork.isDisplayed());
    }

    public void clickOnSelect() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_btn);
        WebElementActions.getActions().clickElement(select_btn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickOnSummary() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Summary);
        WebElementActions.getActions().clickElement(btn_Summary);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickOnUnitReady() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_unitReady);
        WebElementActions.getActions().clickElement(btn_unitReady);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void click_Select() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Select_button);
        WebElementActions.getActions().clickElement(Select_button);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    public void clickClockIcon() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(clock_icon);
        WebElementActions.getActions().clickElement(clock_icon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on signOut btn
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(4000);
        WebElementActions.getActions().clickElement(btn_signOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }




}
