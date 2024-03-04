package pages.techRo;

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

public class CreateNonRepairBill_ServiceManager extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(text(),'Complete RO')])[1]")
    public WebElement complete_RO;

    @FindBy(xpath = "//a//span[text()='Non Repair Bill']")
    public WebElement btn_NonRepairBill;

    @FindBy(xpath = "//label[text()='Reference:']/parent::td/following-sibling::td/child::span")
    public WebElement reference_Content;


    @FindBy(xpath = "//td[@class='xy x4z']/span")
    public WebElement mendatorysymbol_invocedate;

    @FindBy(xpath = "//label[text()='Invoice Date:']")
    public WebElement lebel_invoiceDate;

    @FindBy(xpath = "//label[text()='Invoice Date:']/parent::td/following-sibling::td")
    public WebElement todays_Date;

    @FindBy(xpath = "//label[text()='Customer:']")
    public WebElement lebel_Customertext;


    @FindBy(xpath = "//span[text()='FedEx Ground']")
    public WebElement lebel_CustomerFedExground;

    @FindBy(xpath = "(//td[@class='x15 x4z']/span)[2]")
    public WebElement mendatorystar_Billto;

    @FindBy(xpath = "//label[contains(text(),'Bill To:')]")
    public WebElement lebal_BillTo;

    @FindBy(xpath = "//label[contains(text(),'Bill To:')]/parent::td/following-sibling::td//child::select")
    public WebElement dropdown_BillTo;

    @FindBy(xpath = "//label[contains(text(),'Description:')]")
    public WebElement lebal_Description;

    @FindBy(xpath = "//label[contains(text(),'Description:')]//parent::td/following-sibling::td/child::input")
    public WebElement input_Decriptioncontent;

    @FindBy(xpath = "//label[contains(text(),'Notes:')]")
    public WebElement lebal_Note;

    @FindBy(xpath = "//label[contains(text(),'Notes:')]/parent::td/following-sibling::td/child::textarea")
    public WebElement textarea_notesContent;


    @FindBy(xpath = "//label[contains(.,'Sub Total:')]")
    public WebElement lebal_SubTotal;

    @FindBy(xpath = "//label[contains(.,'Sub Total:')]//parent::td//following-sibling::td//table//tr//following-sibling::td/child::span")
    public WebElement input_subTotalZero;

    @FindBy(xpath = "//td[contains(.,'Sub Total:')]/parent::tr/following-sibling::tr[1]/child::td[1]/child::label")
    public WebElement label_Taxes;

    @FindBy(xpath = "//a[@class='xgn']/span")
    public WebElement input_TaxesZero;

    @FindBy(xpath = "//td[contains(.,'Sub Total:')]/parent::tr/following-sibling::tr[3]//child::td[1]//child::label")
    public WebElement label_Total;

    @FindBy(xpath = "//td[contains(.,'Sub Total:')]/parent::tr/following-sibling::tr[3]//child::tr/child::td[2]/span")
    public WebElement input_Tatalzero;

    @FindBy(xpath = "//td[text()='USD']")
    public WebElement input_USD;

    @FindBy(xpath = "(//a[@class='xfp']/img)[3]")
    public WebElement verify_Icon;


    @FindBy(xpath = "//span[contains(.,'Seq')]")
    public WebElement label_Seq;

    @FindBy(xpath = "//span[contains(text(),'Account #')]")
    public WebElement label_Account;

    @FindBy(xpath = "//span[contains(text(),'Description/Notes')]")
    public WebElement label_DescriptionNotes;


    @FindBy(xpath = " //span[contains(text(),'FedEx Category')]")
    public WebElement lebal_category;

    @FindBy(xpath = "//span[contains(text(),'Quantity')]")
    public WebElement lebal_Quantity;

    @FindBy(xpath = "//span[contains(text(),'Unit Charge')]")
    public WebElement lebal_UnitCharge;

    @FindBy(xpath = "//span[contains(text(),'Amount')]")
    public WebElement lebal_Amount;

    @FindBy(xpath = "//span[contains(text(),'Tax Ovr.')]")
    public WebElement lebal_TaxOvr;

    @FindBy(xpath = "//img[@title='Remove']")
    public WebElement img_crosssymbol;

    @FindBy(xpath = "//h1[text()='Revenue Accounts']")
    public WebElement label_RevenueAccounts;

    @FindBy(xpath = "//label[@class='af_inputText_label-text'][contains(.,'Search:')]")
    public WebElement lebel_Search;

    @FindBy(xpath = "(//table[@class='x1u']//td//input)[2]")
    public WebElement input_SearchCoulum;

    @FindBy(xpath = "(//table[@class='x1a']//td//img[contains(@src,'/lov_ena')])[2] ")
    public WebElement verify_Searchicon;


    @FindBy(xpath = "//select[contains(@id,'soc1::content')] ")
    public WebElement fedEx_Dropdown;


    @FindBy(xpath = "(//span[text()='Add'])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//textarea[contains(@id,':0:it7::content')]")
    public WebElement input_DescriptionNotes;

    @FindBy(xpath = "(//span[text()='Cancel'])[1] ")
    public WebElement label_Cancel;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    public WebElement label_Ok;

    @FindBy(xpath = "(//span[text()='Submit'])[2]")
    public WebElement label_Submit;

    @FindBy(xpath = " //a[text()='Sign Out']")
    public WebElement label_SignOut;


    @FindBy(xpath = "//select[contains(@id,'soc2::content')]")
    public WebElement dropdown_SelectBillTo;


    @FindBy(xpath = "//label[contains(text(),'Notes:')]/parent::td/following-sibling::td/child::textarea")
    public WebElement textarea_typeNotesContent;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement label_Username;


    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    /**go to complete RO Screen */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);

    }

    /*** method to click on complete_RO_Btn*/

    public void clickCompleteRo() throws InterruptedException {
      //  WaitActions.getWaits().waitForElementTobeClickable(complete_RO);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(complete_RO);
        complete_RO.click();
        TestListener.saveScreenshotPNG(driver);

    }

    /*** method to click on Non-RepairBills*/
    public void clickOnNonRepairBill() throws InterruptedException {

       // WaitActions.getWaits().waitForElementTobeClickable(btn_NonRepairBill);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_NonRepairBill);
        btn_NonRepairBill.click();
        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);


    }

    /*** method to verify Reference Content*/
    public void verifyReferenceContent() throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(reference_Content);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reference_Content);
        Assert.assertTrue(reference_Content.isDisplayed());



    }

    /*** method to verify test and element in complete_RO*/

    public void verifyRequiredSymbol() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(mendatorysymbol_invocedate);
        Assert.assertTrue(mendatorysymbol_invocedate.isDisplayed());



    }
    /**method  to verify invoice date */
    public void verifyInvoiceDate () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebel_invoiceDate);
        Assert.assertTrue(lebel_invoiceDate.isDisplayed());


    }
    /** method to verify ToDateDate */
    public void verifyTodayDate () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(todays_Date);
        System.out.println("Todays date is :"+ReusableActions.todaysdate());
        Assert.assertTrue(todays_Date.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**method to verify customer Text*/

    public void verifyCustomerText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebel_Customertext);
        Assert.assertTrue(lebel_Customertext.isDisplayed());


    }

    /**method to verify FeXeGround Text */
    public void verifyFedExGroundText() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebel_CustomerFedExground);
        Assert.assertTrue(lebel_CustomerFedExground.isDisplayed());


    }

    /** method to verify Star Bill To */
    public void verifyStarBillTo () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(mendatorystar_Billto) ;
        Assert.assertTrue(mendatorystar_Billto.isDisplayed());


    }

    /** method to verify Bill To Element */
    public void verifyBillTOElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_BillTo);
        Assert.assertTrue(lebal_BillTo.isDisplayed());


    }

    /** method to verify Bill tO Dropdown Element */
    public void verifyBillToDropdownElement  () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(dropdown_BillTo);
        Assert.assertTrue(dropdown_BillTo.isDisplayed());


    }

    /** method to verify Description Text */
    public void verifyDescriptionText () throws InterruptedException {

      //  WaitActions.getWaits().WaitUntilWebElementIsVisible(lebal_Description);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_Description);
        Assert.assertTrue(lebal_Description.isDisplayed());


    }

    /** method to verify Description content */
    public void verifyDescriptionContentElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_Decriptioncontent);
        Assert.assertTrue(input_Decriptioncontent.isDisplayed());


    }

    /** method to verify Notes Text */
    public void  verifyNotesText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_Note);
        Assert.assertTrue(lebal_Note.isDisplayed());

    }

    /** metohd to verify Notes Content*/
    public void verifyNotesContentElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(textarea_notesContent);
        Assert.assertTrue(textarea_notesContent.isDisplayed());

    }

    /** method to verify Sub Total Text */
    public void verifySubTotalText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_SubTotal);
        Assert.assertTrue(lebal_SubTotal.isDisplayed());


    }

    /** method to verify Sub Total value 0.00 */
    public void  verifyZeroPointZeroZeroSubTotalValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_subTotalZero);
        Assert.assertTrue(input_subTotalZero.isDisplayed());

    }

    /** method to verify Taxes Text */

    public void verifyTaxesText  () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Taxes);
        Assert.assertTrue(label_Taxes.isDisplayed());


    }


    /** method to verify Taxes value 0.00 */
    public void verifyTaxesValueZeroPointZeroZero () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_TaxesZero) ;
        Assert.assertTrue(input_TaxesZero.isDisplayed());

    }

    /** method to verify Total Text */
    public void verifyTotalText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Total) ;
        Assert.assertTrue(label_Total.isDisplayed());

    }

    /** method to verify Total value 0.00 */
    public void verifyTotalValueZeroPointZeroZero () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_Tatalzero);
        Assert.assertTrue(input_Tatalzero.isDisplayed());


    }
    /** method to verify Standard Text USD */
    public  void verifyStandard () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_USD);
        Assert.assertTrue(input_USD.isDisplayed());


    }

    /**  method to verify Attachment Icon */

    public void verifyAttachmentIcon() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(verify_Icon);
        Assert.assertTrue(verify_Icon.isDisplayed());

    }

    /** method to verify Seq Text */
    public void  verifySeqText () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Seq);
        Assert.assertTrue(label_Seq.isDisplayed());

    }

    /** Method to verify Account Text */
    public void verifyAccountText () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Account);
        Assert.assertTrue(label_Account.isDisplayed());



    }
    /** method to verify Description Note Text */
    public void verifyDescriptionNotesText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_DescriptionNotes) ;
        Assert.assertTrue(label_DescriptionNotes.isDisplayed());


    }

    /** method to verify FedExCategory Text */
    public void verifyFedExCategoryText() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_category) ;
        Assert.assertTrue(lebal_category.isDisplayed());



    }

    /** method to verify Quantity Text */
    public void verifyQuantityText() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_Quantity) ;
        Assert.assertTrue(lebal_Quantity.isDisplayed());


    }

    /** method to verify Unit Charge Text */
    public void verifyUnitCharge() throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_UnitCharge);
        Assert.assertTrue(lebal_UnitCharge.isDisplayed());

    }

    /** method to verify Amount Text */
    public void verifyAmountText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_Amount);
        Assert.assertTrue(lebal_Amount.isDisplayed());


    }

    /** method to verify TaxOvr Text */
    public void verifyTaxOvrText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebal_TaxOvr);
        Assert.assertTrue(lebal_TaxOvr.isDisplayed());


    }

    /** method to verify CrossSymbol */
    public void verifyCrossSymbolElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(img_crosssymbol);
        Assert.assertTrue(img_crosssymbol.isDisplayed());


    }


    /**method to verify Accounts pane*/

    public void verifyAccountPane( ) throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RevenueAccounts);
        Assert.assertTrue(label_RevenueAccounts.isDisplayed());


    }
    /** method to verify Search Text */
    public void verifySearchText ( ) throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(lebel_Search);
        Assert.assertTrue(lebel_Search.isDisplayed());



    }

    /** method to verify Search column */
    public void verifySearchColumn () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_SearchCoulum);
        Assert.assertTrue(input_SearchCoulum.isDisplayed());


    }

    /** method to verify Search Icon */
    public void verifySearchIcon() throws InterruptedException {



        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(verify_Searchicon);
        Assert.assertTrue(verify_Searchicon.isDisplayed());


    }

    /** method to verify Add  Element  Text */
    public void verifyAddElement () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Add);
        Assert.assertTrue(label_Add.isDisplayed());



    }


    /** method to verify Cancel Element */
    public void verifyCancelElement () throws InterruptedException {


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Cancel) ;
        Assert.assertTrue(label_Cancel.isDisplayed());


    }

    /** method to verify OK  Element */
    public void verifyOKElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Ok);
        Assert.assertTrue(label_Ok.isDisplayed());


    }

    /** method to verify Submit Element */
    public void verifySubmitElement () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Submit);
        Assert.assertTrue(label_Submit.isDisplayed());
        TestListener.saveScreenshotPNG(driver);


    }

    /** select  Bill to label  */

    public void selectBillToLabel() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(dropdown_SelectBillTo);
        WebElementActions.getActions().elementSelectByVisibilityText(dropdown_SelectBillTo,prop.getProperty("BillTO_label"));
        TestListener.saveScreenshotPNG(driver);

    }
    /** write note in Notes content */
    public void fillNotesContent () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(textarea_typeNotesContent);
        WebElementActions.getActions().inputText(textarea_typeNotesContent,prop.getProperty("type"));
        TestListener.saveScreenshotPNG(driver);



    }

    /** select FedEx Label */
    public void selectFedExLabel () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(fedEx_Dropdown);
        WebElementActions.getActions().elementSelectByVisibilityText(fedEx_Dropdown,prop.getProperty("FedEx_label") );
        TestListener.saveScreenshotPNG(driver);

    }

    /** click  to the submit button */
    public void clickSubmitButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Submit);
        label_Submit.click();
        TestListener.saveScreenshotPNG(driver);


    }
    /**type Description/Notes */
    public void typeDescriptionNotes () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(input_DescriptionNotes);
        WebElementActions.getActions().clickElement(input_DescriptionNotes);
        TestListener.saveScreenshotPNG(driver);

    }

    /** method to  click on  signOut Button*/
    public void clickSignOutButton () throws InterruptedException {
        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }

    /**method to the click on  username*/
    public void clickUserName  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Username);
        label_Username.click();


    }


}


