package pages.estimating;

import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.util.List;

public class PerformTheWorkOnAnEstimateTech extends TestDriverActions {
    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement txt_scanEmployeeBadge;

    @FindBy(xpath = "//span[text()='Go']")
    public WebElement btn_GO;


    @FindBy(xpath = "//label[text()='Select assigned work.']")
    public List<WebElement> txt_SelectAssignedWork;

    @FindBy(xpath = "(//div[contains(@id,'ctbSelectAssignedWork')]//child::a/child::span[text()='Select'])[1]")
    public WebElement btn_SelectButton;


    @FindBy(xpath = "//div[contains(@id,':0:tic::db')]")
    public List <WebElement> label_NoDataToDisplay;
    @FindBy(linkText = "More Work ...")
    public WebElement txt_MoreLinkText;

    @FindBy(xpath = "//input[contains(@id,'it1::content')]")
    public WebElement input_SearchTextArea;

    @FindBy(xpath = "//div[contains(@id,':phSerproIC::content')]//child::td//a/child::img")
    public WebElement img_PMInspection;

    @FindBy(xpath = "  //img[contains(@id,':0:ciAddSerproactIC::icon')]")
    public WebElement txt_PMInspection;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement btn_Add;

    @FindBy(xpath = "(//img[contains(@id,':ciWorkRequiredIC::icon')])[1]")
    public WebElement img_Images;




    @FindBy(xpath = "(//span[contains(.,'PM inspection.')])[1]")
    public WebElement label_PmInspectText;


    @FindBy(xpath = "//img[contains(@id,':0:ciWorkRequiredIC::icon')]")
    public WebElement label_imgElement;
    @FindBy(xpath = "(//img[contains(@id,':citWorkRequiredDeleteIC')])[1]")
    public WebElement label_Delete;

    @FindBy(xpath = "//a[contains(@id,'trashButtonVmrserreqIC:dc_cil1')]/img")
    public WebElement label_TrashButton;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public  WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserNameTextArea;


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;



    /**Enter the Tech Badge data*/
    public void enterTechBadge() throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(txt_scanEmployeeBadge);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_scanEmployeeBadge);
        WebElementActions.getActions().inputText(txt_scanEmployeeBadge,prop.getProperty("Tech"));
        TestListener.saveScreenshotPNG(driver);


    }

    /*** Click on Go*/
    public void clickOnGo() throws InterruptedException {

      //  WaitActions.getWaits().waitForElementTobeClickable(btn_GO);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GO);
        WebElementActions.getActions().clickElement(btn_GO);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**verify SelectWork Title*/
    public void verifySelectWork () throws InterruptedException {

        if (txt_SelectAssignedWork.size()>0){
            WebElementActions.getActions().clickElement(btn_SelectButton);

        }else{

        }

    }

    public void verifyData () throws InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        System.out.println(label_NoDataToDisplay.size());
        if (label_NoDataToDisplay.size() == 1) {
         //   WaitActions.getWaits().waitForElementTobeClickable(txt_MoreLinkText);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_MoreLinkText);
            WebElementActions.getActions().clickElement(txt_MoreLinkText);
         //   WaitActions.getWaits().WaitUntilWebElementIsVisible(input_SearchTextArea);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_SearchTextArea);
            WebElementActions.getActions().inputText(input_SearchTextArea, prop.getProperty("Enter"));
         //   WaitActions.getWaits().WaitUntilWebElementIsVisible(img_PMInspection);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_PMInspection);
            WebElementActions.getActions().clickElement(img_PMInspection);
           // WaitActions.getWaits().WaitUntilWebElementIsVisible(txt_PMInspection);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_PMInspection);
            WebElementActions.getActions().clickElement(txt_PMInspection);
          //  WaitActions.getWaits().WaitUntilWebElementIsVisible(btn_Add);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add);
            WebElementActions.getActions().clickElement(btn_Add);


        } else {

           // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PmInspectText);
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PmInspectText);
            Assert.assertTrue(label_PmInspectText.isDisplayed());

        }
    }
    /** verify Estimate Approved */
    public void verifyEstimateApproved () throws InterruptedException {

       // WaitActions.getWaits().WaitUntilWebElementIsVisible(label_PmInspectText);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PmInspectText);
        Assert.assertTrue(label_PmInspectText.isDisplayed());
    }
    /** verify Estimate Element */
    public void verifyEstimateElement () throws InterruptedException {
      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(label_imgElement);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_imgElement);
        Assert.assertTrue(label_imgElement.isDisplayed());

    }


    /**click On Delete Img*/
    public void clickOnDeleteImg () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_Delete);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Delete);
        WebElementActions.getActions().clickElement(label_Delete);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /** click On Trash Button */
    public  void clickOnTrashButton () throws InterruptedException {
       // WaitActions.getWaits().waitForElementTobeClickable(label_TrashButton);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_TrashButton);
        WebElementActions.getActions().clickElement(label_TrashButton);
        TestListener.saveScreenshotPNG(driver);


    }
    /**click On Sign Out  Button */
    public void clickOnSignOut () throws InterruptedException {

     //   WaitActions.getWaits().waitForElementTobeClickable(label_SignOut);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);
    }
    /** click On UserName TextArea*/
    public void clickOnUserNameTextArea () throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(label_UserNameTextArea);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UserNameTextArea);
        WebElementActions.getActions().clickElement(label_UserNameTextArea);
        TestListener.saveScreenshotPNG(driver);
    }

}

