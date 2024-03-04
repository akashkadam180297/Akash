package pages.administration;

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

public class CreateCustomerPage extends TestDriverActions {



    @FindBy(xpath = "//h1[contains(text(),'Customers List')]" )
    WebElement label_Customer_list_1;

    @FindBy(xpath = "//label[contains(text(),'Search:')]" )
    WebElement label_search;

    @FindBy(xpath = "//label[contains(text(),'Search:')]/following::input[1]" )
    WebElement txt_search_field;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive:')]" )
    WebElement label_Include_Inactive;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive:')]/following::input[1]" )
    WebElement chkbox_Include_Inactive;

    @FindBy(xpath = "//h2[contains(text(),'Customers List')]" )
    WebElement label_Customer_list2;

    @FindBy(xpath = "//span[contains(text(),'Add Customer')]" )
    WebElement btn_Add_Customer;

    @FindBy(xpath = "//h1[text()='Customers List']" )
    WebElement label_customer_list_1;

    @FindBy(xpath = "//span[contains(text(),'Name')]" )
    WebElement label_name;

    @FindBy(xpath = "//span[text()='Code']" )
    WebElement label_code;

    @FindBy(xpath = "//span[text()='Phone']" )
    WebElement label_phone;

    @FindBy(xpath = "//span[text()='City']" )
    WebElement label_city;

    @FindBy(xpath = "//span[text()='Address']" )
    WebElement label_address;

    @FindBy(xpath = "//span[text()='Province']" )
    WebElement label_province;

    @FindBy(xpath = "//span[text()='Postal Code']" )
    WebElement label_postalcode;

    @FindBy(xpath = "//span[text()='Country']" )
    WebElement label_country;

    @FindBy(xpath = "//label[text()='Payment Term:']" )
    WebElement label_payment_term;

    @FindBy(xpath = "//span[text()='Active']" )
    WebElement label_active;

    @FindBy(xpath = "//div[contains(text(),'New Customer')]" )
    WebElement label_newCustomer;

    @FindBy(xpath = "//h1[contains(text(),'Contact')]" )
    WebElement label_contact;

    @FindBy(xpath = "//h1[contains(text(),'Contact')]/following::span[1]" )
    WebElement label_code_asterisk;

    @FindBy(xpath = "//label[text()='Code:']" )
    WebElement label_code2;

    @FindBy(xpath = "//label[text()='Code:']/following::input[1]" )
    WebElement txt_code_field;

    @FindBy(xpath = "//label[text()='Code:']/following::span[1]" )
    WebElement label_name_asterisk;

    @FindBy(xpath = "//label[text()='Name:']" )
    WebElement label_name2;

    @FindBy(xpath = "//label[text()='Name:']/following::input[1]" )
    WebElement txt_name_field;

    @FindBy(xpath = "//label[contains(text(),'Active:')]" )
    WebElement label_active2;

    @FindBy(xpath = "//label[contains(text(),'Active:')]/following::input[1]" )
    WebElement chebox_active2;

    @FindBy(xpath = "//label[contains(text(),'Contact:')]" )
    WebElement label_contact2;

    @FindBy(xpath = "//label[contains(text(),'Contact:')]/following::input[1]" )
    WebElement txt_contact_field;

    @FindBy(xpath = "//label[contains(text(),'Phone:')]" )
    WebElement label_phone2;

    @FindBy(xpath = "//label[contains(text(),'Phone:')]/following::input[1]" )
    WebElement txt_phone_field;

    @FindBy(xpath = "//label[contains(text(),'Phone:')]/following::input[2]" )
    WebElement txt_phone_field2;

    @FindBy(xpath = "//label[contains(text(),'Email:')]" )
    WebElement label_email;

    @FindBy(xpath = "//label[contains(text(),'Email:')]/following::input[1]" )
    WebElement txt_email_field;

    @FindBy(xpath = "//label[contains(text(),'Fax:')]" )
    WebElement label_fax;

    @FindBy(xpath = "//label[contains(text(),'Fax:')]/following::input[1]" )
    WebElement txt_fax_field;

    @FindBy(xpath = "//h1[contains(text(),'Address')]" )
    WebElement title_address;

    @FindBy(xpath = "//label[contains(text(),'Address')]" )
    WebElement label_address3;

    @FindBy(xpath = "//label[contains(text(),'Address')]/following::input[1]" )
    WebElement txt_address3_field;

    @FindBy(xpath = "//label[contains(text(),'Address')]/following::input[2]" )
    WebElement txt_address3_field2;

    @FindBy(xpath = "//label[contains(text(),'City:')]" )
    WebElement label_city2;

    @FindBy(xpath = "//label[contains(text(),'City:')]/following::span[1]" )
    WebElement label_country_asterisk;

    @FindBy(xpath = "//label[contains(text(),'Country:')]" )
    WebElement label_country2;

    @FindBy(xpath = "//label[text()='Country:']/following::select[1]" )
    WebElement dropdown_country;

    @FindBy(xpath = "//label[contains(text(),'State:')]" )
    WebElement label_state;

    @FindBy(xpath = "//label[contains(text(),'State:')]/following::select[1]" )
    WebElement dropdown_state;

    @FindBy(xpath = "//label[contains(text(),'ZIP Code:')]" )
    WebElement label_zip_code;

    @FindBy(xpath = "//label[contains(text(),'ZIP Code:')]/following::input[1]" )
    WebElement txt_zip_code_field;

    @FindBy(xpath = "//h1[contains(text(),'Contracts')]" )
    WebElement title_Contracts;

    @FindBy(xpath = "//label[text()='Parts:']" )
    WebElement label_parts;

    @FindBy(xpath = "//label[text()='Parts:']/following::select[1]" )
    WebElement dropdown_parts;

    @FindBy(xpath = "//label[text()='Parts:']/following::a[1]/img" )
    WebElement parts_plusicon;

    @FindBy(xpath = "//label[text()='Parts:']/following::span[2]" )
    WebElement parts_AddContract;

    @FindBy(xpath = "//label[text()='Labour:']" )
    WebElement label_labour;

    @FindBy(xpath = "//label[text()='Labour:']/following::select[1]" )
    WebElement drpdown_labour;

    @FindBy(xpath = "//label[text()='Labour:']/following::a[1]/img" )
    WebElement labour_plusicon;

    @FindBy(xpath = "//label[text()='Labour:']/following::span[2]" )
    WebElement labour_AddContract ;

    @FindBy(xpath = "//label[text()='Supply:']" )
    WebElement label_supply;

    @FindBy(xpath = "//label[text()='Supply:']/following::select[1]" )
    WebElement drpdown_supply;

    @FindBy(xpath = "//label[text()='Supply:']/following::a[1]/img" )
    WebElement supply_plusicon;

    @FindBy(xpath = "//label[text()='Supply:']/following::span[2]" )
    WebElement supply_AddContract;

    @FindBy(xpath = "//label[text()='Payment Term:']" )
    WebElement label_payment_term2;

    @FindBy(xpath = "//label[text()='Payment Term:']/following::select[1]" )
    WebElement drpdown_payment_term;

    @FindBy(xpath = "//label[text()='Payment Term:']/following::a[1]/img" )
    WebElement payment_term_plusiocn;

    @FindBy(xpath = "//label[text()='Payment Term:']/following::span[2]" )
    WebElement payment_term_add;

    @FindBy(xpath = "//h1[contains(text(),'Tax Exempt')]" )
    WebElement title_Tax_Exempt;

    @FindBy(xpath = "//h1[contains(text(),'Tax Exempt')]/following::input[1]" )
    WebElement chkbox_tax_Exempt;

    @FindBy(xpath = "//h1[contains(text(),'Tax Exempt')]/following::label[1]" )
    WebElement label_tax_Exempt;

    @FindBy(xpath = "//label[contains(text(),'Exempt #:')]" )
    WebElement label_exempt;

    @FindBy(xpath = "//label[contains(text(),'Exempt #:')]/following::input[1]")
    WebElement txt_exempt_field;

    @FindBy(xpath = "//label[text()='Exempt #:']/following::span[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "//label[text()='Exempt #:']/following::span[2]")
    WebElement btn_ok;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    /**
     * go to Customer screen
     * @throws InterruptedException
     */
    public static void gotoCustomerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Customer");
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Add Customer
     */
    public void clickOnAddCustomer() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add_Customer);
        WebElementActions.getActions().clickElement(btn_Add_Customer);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter Code
     */
    public void enterCode() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_code_field);
       String customerCode= String.valueOf(WebElementActions.getActions().randomAlphaNumeric(6));
        WebElementActions.getActions().inputText(txt_code_field,customerCode);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * random Customer name
     */
    String customerName = WebElementActions.getActions().randomAlphaNumeric(10);

    /**
     * enter name
     */
    public void entername() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_name_field);
        WebElementActions.getActions().inputText(txt_name_field,customerName);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  country dropdown
     */
    public void countryavailable() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(dropdown_country);
        WebElementActions.getActions().selectDropdown(dropdown_country);
        WebElementActions.getActions().elementSelectByVisibilityText(dropdown_country, appProp.getProperty("countryname"));
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Ok button
     */
    public void clickOnOKbutton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ok);
        WebElementActions.getActions().clickElement(btn_ok);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify all fields of Customer manager
     */
    public void customerManagerTitle() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Customer_list_1);
        Assert.assertTrue(label_Customer_list_1.isDisplayed());
        Assert.assertTrue(label_search.isDisplayed());
        Assert.assertTrue(txt_search_field.isDisplayed());
        Assert.assertTrue(label_Include_Inactive.isDisplayed());
        Assert.assertTrue(chkbox_Include_Inactive.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify all elements of customer list table
     */

    public void customerListTableTitle() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Customer_list2);
        Assert.assertTrue(label_Customer_list2.isDisplayed());
        Assert.assertTrue(btn_Add_Customer.isDisplayed());
        Assert.assertTrue(label_customer_list_1.isDisplayed());
        Assert.assertTrue(label_name.isDisplayed());
        Assert.assertTrue(label_code.isDisplayed());
        Assert.assertTrue(label_phone.isDisplayed());
        Assert.assertTrue(label_city.isDisplayed());
        Assert.assertTrue(label_address.isDisplayed());
        Assert.assertTrue(label_province.isDisplayed());
        Assert.assertTrue(label_postalcode.isDisplayed());
        Assert.assertTrue(label_country.isDisplayed());
        Assert.assertTrue(label_payment_term.isDisplayed());
        Assert.assertTrue(label_active.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify new customer page - Contact element
     */
    public void newCustomerPage() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_newCustomer);
        Assert.assertTrue(label_newCustomer.isDisplayed());
        Assert.assertTrue(label_contact.isDisplayed());
        Assert.assertTrue(label_code_asterisk.isDisplayed());
        Assert.assertTrue(label_code2.isDisplayed());
        Assert.assertTrue(txt_code_field.isDisplayed());
        Assert.assertTrue(label_name_asterisk.isDisplayed());
        Assert.assertTrue(label_name2.isDisplayed());
        Assert.assertTrue(txt_name_field.isDisplayed());
        Assert.assertTrue(label_active2.isDisplayed());
        Assert.assertTrue(chebox_active2.isDisplayed());
        Assert.assertTrue(label_contact2.isDisplayed());
        Assert.assertTrue(txt_contact_field.isDisplayed());
        Assert.assertTrue(label_phone2.isDisplayed());
        Assert.assertTrue(txt_phone_field.isDisplayed());
        Assert.assertTrue(txt_phone_field2.isDisplayed());
        Assert.assertTrue(label_email.isDisplayed());
        Assert.assertTrue(txt_email_field.isDisplayed());
        Assert.assertTrue(label_fax.isDisplayed());
        Assert.assertTrue(txt_fax_field.isDisplayed());
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * Verify new customer page - address element
     */
    public void addressTitle() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_address);
        Assert.assertTrue(title_address.isDisplayed());
        Assert.assertTrue(label_address3.isDisplayed());
        Assert.assertTrue(txt_address3_field.isDisplayed());
        Assert.assertTrue(txt_address3_field2.isDisplayed());
        Assert.assertTrue(label_city2.isDisplayed());
        Assert.assertTrue(label_country_asterisk.isDisplayed());
        Assert.assertTrue(label_country2.isDisplayed());
        Assert.assertTrue(dropdown_country.isDisplayed());
        Assert.assertTrue(label_state.isDisplayed());
        Assert.assertTrue(dropdown_state.isDisplayed());
        Assert.assertTrue(label_zip_code.isDisplayed());
        Assert.assertTrue(txt_zip_code_field.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify new customer page - contract element
     */
    public void contractsTitle() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_Contracts);
        Assert.assertTrue(title_Contracts.isDisplayed());
        Assert.assertTrue(label_parts.isDisplayed());
        Assert.assertTrue(dropdown_parts.isDisplayed());
        Assert.assertTrue(parts_plusicon.isDisplayed());
        Assert.assertTrue(parts_AddContract.isDisplayed());
        Assert.assertTrue(label_labour.isDisplayed());
        Assert.assertTrue(drpdown_labour.isDisplayed());
        Assert.assertTrue(labour_plusicon.isDisplayed());
        Assert.assertTrue(labour_AddContract.isDisplayed());
        Assert.assertTrue(label_supply.isDisplayed());
        Assert.assertTrue(drpdown_supply.isDisplayed());
        Assert.assertTrue(supply_plusicon.isDisplayed());
        Assert.assertTrue(supply_AddContract.isDisplayed());
        Assert.assertTrue(label_payment_term2.isDisplayed());
        Assert.assertTrue(drpdown_payment_term.isDisplayed());
        Assert.assertTrue(payment_term_plusiocn.isDisplayed());
        Assert.assertTrue(payment_term_add.isDisplayed());
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Verify new customer page - tax exempt element
     */
    public void taxExemptTitle() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_Tax_Exempt);
        Assert.assertTrue(title_Tax_Exempt.isDisplayed());
        Assert.assertTrue(chkbox_tax_Exempt.isDisplayed());
        Assert.assertTrue(label_tax_Exempt.isDisplayed());
        Assert.assertTrue(label_exempt.isDisplayed());
        Assert.assertTrue(txt_exempt_field.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        Assert.assertTrue(btn_ok.isDisplayed());
        Assert.assertTrue(btn_signOut.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**
     * Type CustomerName in search field
     *
     */
    public void CustomerNameInSearchField() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_search_field);
        WebElementActions.getActions().inputText(txt_search_field,customerName);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }


}
