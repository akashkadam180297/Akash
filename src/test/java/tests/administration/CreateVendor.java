package tests.administration;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("Vendors Test")

public class CreateVendor extends TestDriverActions {

      @Test(priority=0,description = "Test_001 Login to the page and go to vendors screen ",enabled = true)
      @Description("Test Description:  Login to the page and go to vendors screen  ")
      public void Test_001_gotoVendorsScreen() throws FileNotFoundException, InterruptedException {
          loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password") );
          vendorsPage.gotoVendorsScreen();
          vendorsPage.clickOnAddVendors();
      }

      @Test(priority=1,description = "Test_002 verify all the elements from the fields", enabled = true)
      @Description("Test Description: verify all the elements from the fields")
      public void Test_002_VerifyAllformfields() throws InterruptedException {
          vendorsPage.vendorsManagerHeader();
          vendorsPage.vendorsListTable();
      }


      @Test(priority=2,description = "Test_003 enter the vendor code and name in the field and click on Ok", enabled = true)
      @Description("Test Description: enter the vendor code and name in the field and click on Ok")
      public void Test_003_enterfieldandclickonOK() throws InterruptedException
      {
          vendorsPage.enterVendorCode();
          vendorsPage.enterVendorName();
          vendorsPage.selectPaymentTermsMenu();
          vendorsPage.clickOnOKbutton();

      }

      @Test(priority=3, description = "Test_004 Check vendor name in search box and sign out the page", enabled = true)
      @Description("Test Description: Check vendor name in search box and sign out the page")
       public void checkVendorName_SignOutPage() throws InterruptedException {
          vendorsPage.vendorNameInSearchBox();
          vendorsPage.clickOnSignOut();
      }

}
