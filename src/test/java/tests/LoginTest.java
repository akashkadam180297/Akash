package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("Login Test")
public class LoginTest extends TestDriverActions {

    @Test(priority = 0, description = "Test_001 Invalid Login Scenario with wrong username and password")
    @Description("Test Description : Invalid Login.")
    public void login_with_invalid_credential() throws InterruptedException {


        try {
            loginPage.loginWithInvalidCredentials(prop.getProperty("InvalidName"), prop.getProperty("Invalid0Password"));

                   Assert.assertTrue(loginPage.assertMessage(prop.getProperty("validation")));

//            loginPage.assertMessage(prop.getProperty("validation"));

//            System.out.println("Invalid login successfully pass");


        } catch (Throwable e) {
            System.out.println("There is some issue to login to website.");

     //       e.printStackTrace();

            Assert.fail("There is some issue to login to website.");

        }

    }


    @Test(priority = 1, description = "Test_002 check if login signin button with correct username and wrong password")
    @Description("Test Description : Invalid login")
    public void valid_username_invalid_password() {

        try {
            loginPage.loginWithValidUsernameInvalidpassword(prop.getProperty("username"), prop.getProperty("Invalid0Password"));

            Assert.assertTrue(loginPage.assertMessage(prop.getProperty("validation")));

        } catch (Exception e) {
            System.out.println("There is some issue to login to website.");
            Assert.fail("There is some issue to login to website.");

        }

    }

    @Test(priority = 2, description = "Test_003 valid scenario with correct username and password ")
    @Description("Test Description : valid login")
    public void valid_login_with_valid_credential() throws InterruptedException {


        try {
            loginPage.loginWithValidCredentials(prop.getProperty("username"), prop.getProperty("password"));

            Assert.assertTrue(loginPage.assertCheck(prop.getProperty("emdecs")));


        } catch (Exception e) {
            System.out.println("Login Successfully");

         /*   String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, "Sign In");
            Assert.assertTrue(true);  */
        }


        }



        }

