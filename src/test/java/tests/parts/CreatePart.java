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
@Feature("PartsRelatedItem Test")


public class CreatePart extends TestDriverActions {


    @Test(priority=0, description="Test_001 Login to the page and Go To Parts Master",enabled = true)
    @Description("Test Description:  Login to the page and Go To Parts Master")
    public void gotoPartsMaster() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        relatedItem.gotoPartMaster();

    }


    @Test(priority=1, description="Test_002 click on NewParts and verify all element",enabled = true)
    @Description("Test Description:  Click on NewParts and Verify all element")
    public void click_NewPart_Verify_All_Elements() throws InterruptedException {
        relatedItem.clickOnNewPart();
        relatedItem.verifyNewPart();
        relatedItem.clickOnCollapseButton();
    }

   @Test(priority=2, description="Test_003 Enter part number and create new part",enabled = true)
    @Description("Test Description:  Enter part number and create new part")
    public void create_new_part() throws InterruptedException {
       relatedItem.enterPartNumber();
       relatedItem.enterCost();
       relatedItem.enterDescription();
       relatedItem.enterProductGroup();
       relatedItem.enterGLAccountGroup();
       relatedItem.clickOnCreatePart();

    }

     @Test(priority=3, description="Test_004 Search Part number ",enabled = true)
    @Description("Test Description:  Search Part number")
    public void search_the_number() throws InterruptedException {
        relatedItem.enterPartNumberInSearchField();
        relatedItem.clickOnRefreshButton();
        relatedItem.clickOnPartNumberHyperlink();
        relatedItem.clickOnMoreInfoButton();
    }

    @Test(priority=4, description="T_005 Verify the Description and click Cost and Pricing Tab",enabled = true)
    @Description("Test Description : Verify Standard field value")
    public void verify_standard_field() throws InterruptedException {
 //       relatedItem.verifyPartNumberDescriptionCheckbox();
        relatedItem.clickOnCostAndPricingTab();
        relatedItem.verifyElementStandard();

    }

    @Test(priority=5, description="T_006 click on Sign out",enabled = true)
    @Description("Test Description:  Sign out and verify username")
    public void signOut_verify_username() throws InterruptedException {
        relatedItem.clickOKbtnSaveExitBtn();
        relatedItem.clickOnSignOut();
    }



























}
