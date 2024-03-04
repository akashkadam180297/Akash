package tests.fleet;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("SetUpWorkRequired Test")

public class SetUpWorkRequiredTest extends TestDriverActions {


    @Test(priority=0,description="Login the page and click on Unit Master",enabled = true)
    @Description("Login the page and click on Unit Master")
    public void gotoUnitMaster() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(prop.getProperty("service_one_username"), prop.getProperty("service_one_password"));
        setUp.gotoUnitMaster();
    }

    @Test(priority=1,description="Search Number, click on hyperlink and go to work required", enabled = true)
    @Description("Search Number, click on hyperlink and go to work required")
    public void search_Number() throws InterruptedException {
        setUp.enterUnitNumber();
        setUp.clickOnHyperLink();
        setUp.clickOnMoreInfo();
        setUp.clickOnWorkRequired();
    }

    @Test(priority=2,description="Check Air Intake System image and add it", enabled = true)
    @Description("Check Air Intake System image and add it")
    public void AirIntakeSystem() throws InterruptedException {
        setUp.clickOnMoreWork();
        setUp.clickOnVMRS();
        setUp.clickOnAirIntakeSystem();
        setUp.clickOnPlusIcon();
        setUp.clickOnAddbutton();

    }

    @Test(priority=3,description="Save the number and verify", enabled=true)
    @Description("Save the number and verify")
    public void save_number_verify() throws InterruptedException {
        setUp.clickOnSaveAndExit();
        setUp.clickOnSaveAndExit2();
        setUp.clickOnSignOut();


    }











}
