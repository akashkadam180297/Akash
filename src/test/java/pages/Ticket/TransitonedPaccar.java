package pages.Ticket;

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

public class TransitonedPaccar extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(text(),'Equipment')])[3]")
    WebElement Equipment;

    @FindBy(xpath = "(//a[contains(text(),'Part Positions')])[1]")
    WebElement PartPositions;


    @FindBy(xpath = "//span[text()='New Part Position']")
    WebElement NewPartPosition;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement Code;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement Description;

    @FindBy(xpath = "//span[text()='Axle']")
    WebElement Axle;

    @FindBy(xpath = "//span[text()='Left/ Right']")
    WebElement LeftAndRight;

    @FindBy(xpath = "//span[text()='Inner/ Outer']")
    WebElement Inner;

    @FindBy(xpath = "//span[text()='Notes']")
    WebElement Notes;

    @FindBy(xpath = "(//span[contains(text(),'RF1')])[1]")
    WebElement codeValue;

    @FindBy(xpath = "(//span[contains(text(),'Right ')])[1]")
    WebElement DescriptionvaLue;

    @FindBy(xpath = "//label[contains(.,'Invoiced')]/preceding-sibling::input")
    WebElement invoicedRadiio;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_Refresh;

    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    WebElement label_ReferenceNumber;

    @FindBy(xpath = "//a[contains(.,'Delete Customer Invoice')]")
    WebElement DeleteCustomerInvoice;

    @FindBy(xpath = "(//div[contains(@id,':tParts::db')]//table//div//a/child::span[contains(@id,'::text')])[1]")
    WebElement PartNumber;

    @FindBy(xpath = "//label[text()='Part #:']/preceding-sibling::span")
    public WebElement label_PartRequired;

    @FindBy(xpath = "//label[text()='Part #:']")
    public WebElement label_Part;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span/following::div)[1]")
    public WebElement label_PartTextArea;

    @FindBy(xpath = "//label[text()='Part Description:']")
    public WebElement label_PartDescription;

    @FindBy(xpath = "(//label[text()='Part Description:']/following::div)[1]")
    public WebElement label_PartDescriptionTextArea;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//span)[1]")
    public WebElement label_laborRequired;

    @FindBy(xpath = "(//label[text()='Part Description:']/parent::span/parent::div//following-sibling::div//span//label)[1]")
    public WebElement label_Labor;

    @FindBy(xpath = "//label[text()='Part Description:']/following::div[1] ")
    public WebElement label_LaborDropDown;

    @FindBy(xpath = "//label[text()='Part Failure:']/preceding-sibling::span")
    public WebElement label_PartFailureRequired;

    @FindBy(xpath = "//label[text()='Part Failure:']")
    public WebElement label_PartFailure;

    @FindBy(xpath = "//label[text()='Part Failure:']/following::div[1]")
    public WebElement label_PartFailureDropDown;

    @FindBy(xpath = " //label[text()='Charge Quantity (EA):']/preceding-sibling::span")
    public WebElement label_ChargeQuantityRequired;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']")
    public WebElement label_ChargeQuantity;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']/following::div[1]")
    public WebElement label_ChargeQuantityTextArea;

    @FindBy(xpath = "//label[text()='Unit Charge:']")
    public WebElement label_UnitCharge;

    @FindBy(xpath = "//label[text()='Total Charge:']")
    public WebElement label_TotalCharge;

    @FindBy(xpath = "//table[contains(@id,'pgl7')]/tbody/tr/td[2]/span")
    public WebElement label_TotalChargeValue;

    @FindBy(xpath = "(//div[contains(@id,'pslStockOnHand::b')]//a//span)[1]")
    public WebElement btn_Close;
    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to Standard Codes
     */
    public static void gotoStandardCodesScrren() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Standard Codes");
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * click on Equipment
     */
    public void clickonEquipment() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Equipment);
        WebElementActions.getActions().clickElement(Equipment);
    }

    /**
     * click on Part Position
     */
    public void clickOnPartPosition() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PartPositions);
        WebElementActions.getActions().clickElement(PartPositions);
    }

    /**
     * verify New Part Position
     */
    public void verifyNewOnPartPosition() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewPartPosition);
        Assert.assertTrue(NewPartPosition.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
        Assert.assertTrue(Description.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Axle);
        Assert.assertTrue(Axle.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LeftAndRight);
        Assert.assertTrue(LeftAndRight.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Inner);
        Assert.assertTrue(Inner.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Notes);
        Assert.assertTrue(Notes.isDisplayed());


    }

    /**
     * verify codeValue and codeValue
     */
    public void verifyCodevalue() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(codeValue);
        Assert.assertTrue(codeValue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DescriptionvaLue);
        Assert.assertTrue(DescriptionvaLue.isDisplayed());

    }

    /**
     * go to complete RO Screen
     */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on invoice Button
     */
    public void clickOnInvoice() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(invoicedRadiio);
        WebElementActions.getActions().clickElement(invoicedRadiio);
    }

    /**
     * click on Refresh Button
     */
    public void clickOnRefresh() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions().clickElement(btn_Refresh);
    }

    /**
     * click On Reference Number
     */
    public void clickOnReferece() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ReferenceNumber);
        WebElementActions.getActions().clickElement(label_ReferenceNumber);
    }

    /**
     * verify Delete Customer Invoice
     */
    public void verifyDeleteCustomerInvoice() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DeleteCustomerInvoice);
        Assert.assertTrue(DeleteCustomerInvoice.isDisplayed());
    }

    /**
     * click On PartNumber
     */
    public void clickOnPartNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PartNumber);
        WebElementActions.getActions().clickElement(PartNumber);
    }

    /**
     * verify text Part #
     */
    public void verifyPart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Part);
        Assert.assertTrue(label_Part.isDisplayed());
    }

    /**
     * verify part Value
     */
    public void verifyPartTextArea() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartTextArea);
        Assert.assertTrue(label_PartTextArea.isDisplayed());

    }

    /**
     * verify text Part Description
     */
    public void verifyPartDescription() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartDescription);
        Assert.assertTrue(label_PartDescription.isDisplayed());

    }

    /**
     * verify PartDescription Value
     */
    public void verifyPartDescriptionTextArea() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartDescriptionTextArea);
        Assert.assertTrue(label_PartDescriptionTextArea.isDisplayed());

    }

    /**
     * verify labor Required
     */
    public void verifyLaborRequired() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_laborRequired);
        Assert.assertTrue(label_laborRequired.isDisplayed());

    }

    /**
     * verify text labor
     */
    public void verifyLabor() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Labor);
        Assert.assertTrue(label_Labor.isDisplayed());

    }

    /**
     * verify labor Dropdown
     */
    public void verifyLaborDropDown() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_LaborDropDown);
        Assert.assertTrue(label_LaborDropDown.isDisplayed());


    }

    /**
     * verify text part failure Required
     */
    public void verifyPartFailureRequired() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartFailureRequired);
        Assert.assertTrue(label_PartFailureRequired.isDisplayed());

    }

    /**
     * verify Text Part Failure
     */
    public void verifyPartFailure() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartFailure);
        Assert.assertTrue(label_PartFailure.isDisplayed());

    }

    /**
     * verify Part failure Dropdown
     */
    public void verifyPartFailureDropDown() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PartFailureDropDown);
        Assert.assertTrue(label_PartFailureDropDown.isDisplayed());

    }

    /**
     * verify Text ChargeQuantity Required
     */
    public void verifyChargeQuantityRequired() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityRequired);
        Assert.assertTrue(label_ChargeQuantityRequired.isDisplayed());
    }

    /**
     * verify Text  Charge Quantity
     */
    public void verifyChargeQuantity() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantity);
        Assert.assertTrue(label_ChargeQuantity.isDisplayed());

    }

    /**
     * verify Charge Quantity TextArea
     */
    public void verifyChargeQuantityTextArea() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_ChargeQuantityTextArea);
        Assert.assertTrue(label_ChargeQuantityTextArea.isDisplayed());

    }

    /**
     * verify Text Unit Charge
     */
    public void verifyUnitCharge() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitCharge);
        Assert.assertTrue(label_UnitCharge.isDisplayed());
    }

    /**
     * verify Text Total Charge
     */
    public void verifyTotalCharge() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalCharge);
        Assert.assertTrue(label_TotalCharge.isDisplayed());

    }

    /**
     * verify Total Charges Value
     */
    public void verifyTotalChargeValue() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_TotalChargeValue);
        Assert.assertTrue(label_TotalChargeValue.isDisplayed());
    }

    /**
     * verify Text Cancel Button
     */
    public void verifyCancelButton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Close);
        Assert.assertTrue(btn_Close.isDisplayed());

    }

    /**
     * click on cancel button
     */
    public void clickoncancel() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Close);
        WebElementActions.getActions().clickElement(btn_Close);


    }

    /**
     * click On Sign Out
     */

    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions().clickUsingJS(label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on UserName
     */
    public void clickOnUsername() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserName);
        WebElementActions.getActions().clickElement(label_UserName);

    }
}