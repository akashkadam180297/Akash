package tests.parts;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("CounterSaleManager Test")

public class CounterSale extends TestDriverActions {

    @Test(priority=0 , description = "Test_001 Login the page and Go to counterSaleManager")
    @Description("Test Description : Login the page and Go to counterSaleManager")
    public void goto_countersaleManager_screen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password") );
        counter.gotoCounterSaleManagerScreen();

    }

    @Test(priority=1 , description = "Test_002 verify all the elements in the field")
    @Description("Test Description :  verify all the elements in the field")
    public void verify_all_fields() throws InterruptedException {
        counter.counterSaleManager();
        counter.toBeInvoiced();
        counter.saleSummary();
    }

    @Test(priority=2, description = "Test_003 click on add new counter sale",enabled = true)
    @Description("Test Description : Click on add new counter sale")
    public void add_new_counter_sale() throws InterruptedException {
        counter.clickOnSearch();
        counter.addNewCounterSale();
    }

    @Test(priority=3, description = "Test_004 verify location pop up",enabled = true)
    @Description("Test Description: verify location pop up")
    public void verify_location_popUp() throws InterruptedException {
        counter.locationPopUp();
        counter.addDataLocationPopUp();
        counter.newCustomer();

    }

    @Test(priority=4, description = "Test_005 verify counter sale page",enabled = true)
    @Description("Test Description: verify counter sale page ")
    public void verify_counter_sale_page() throws InterruptedException {
        counter.displayCounterSale();
    }

    @Test(priority=5, description = "Test_006 add part number and core part in counter sale",enabled = true)
    @Description("Test Description: add part number and core part in counter sale")
    public void add_parts_in_counter_sale() throws InterruptedException {
        counter.addPart();
        counter.notes();
        counter.clickOnaddParts();
        counter.addCorePart();
        counter.addQtyAndExpand();
      // TESTING

    }

    @Test(priority=6, description = "Test_007 check invoice and signout",enabled = true)
    @Description("Test Description: check invoice and signout")
    public void check_invoice_and_signout() throws InterruptedException {
        counter.lostSaleReasonPopup();
        counter.clickOnTaxexhyperlink();
        counter.invoiceNow();
        counter.clickOnSignOut();
    }










}
