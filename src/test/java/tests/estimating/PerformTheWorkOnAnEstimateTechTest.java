package tests.estimating;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.IOException;

public class PerformTheWorkOnAnEstimateTechTest extends TestDriverActions {

    @Test(priority = 0, description = "verify and using Login and password credentials")
    @Description("Test Description -verify and using Login and password credentials ")
    public void T_001gotoTechRo() throws InterruptedException, IOException {
        loginPage.loginWithValidCredentials(prop.getProperty("tech_two_username"), prop.getProperty("tech_two_password"));
        performtheworkonanestimatepage.enterTechBadge();
        performtheworkonanestimatepage.clickOnGo();
        performtheworkonanestimatepage.verifySelectWork ();

    }

    @Test(priority = 1, description = "verify  Estimate Approved ")
    @Description("Test Description -verify  Estimate Approved ")
    public void T_002verifyEstimateApproved () throws InterruptedException, IOException {
        performtheworkonanestimatepage. verifyData ();
        performtheworkonanestimatepage.verifyEstimateApproved ();
        performtheworkonanestimatepage.verifyEstimateElement ();

    }

    @Test(priority = 2, description = "click On Delete Image ")
    @Description("Test Description -click On Delete Image ")
    public void T_003clickOnDeleteImg () throws InterruptedException, IOException {
        performtheworkonanestimatepage.clickOnDeleteImg ();
        performtheworkonanestimatepage. clickOnTrashButton ();

    }

    @Test(priority = 3, description = "click On Sign Out ")
    @Description("Test Description -click On Sign Out ")
    public void T_004clickOnSignOut () throws InterruptedException, IOException {
        performtheworkonanestimatepage.clickOnSignOut ();
        performtheworkonanestimatepage. clickOnUserNameTextArea ();

    }

}