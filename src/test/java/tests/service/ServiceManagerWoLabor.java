package tests.service;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

@Listeners({utils.TestListener.class})
@Epic("Regression Test")
@Feature("Service Manager Labor Test")

public class ServiceManagerWoLabor extends TestDriverActions {

  @Test(priority=0, description="Login the page and go to the CompleteRo",enabled = true)
  @Description("Test Description -Login the page and go to the CompleteRo")
  public void gotoCompleteRoScreen() throws FileNotFoundException, InterruptedException {
    loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
    servicelabor.clickOnCompleteRo();

  }

  @Test(priority=1, description="Verify all the WebElements on the web page ",enabled = true)
  @Description("Test Description - Verify all the WebElements on the web page")
  public void verifyAllElements() throws InterruptedException {
     servicelabor.verifyCompleteRoElement();
     servicelabor.verifyRadioButtonsLabels();
     servicelabor.verifySummaryElements();
  }

  @Test(priority=2, description="Click on RO Number and verify the elements",enabled = true)
  @Description("Test Description - Click on RO Number and verify the elements")
  public void clickOnRONumber_VerifyElements() throws InterruptedException {
      servicelabor.clickOnRoNumber();
      servicelabor.verifyHeaderElementRepairOrderPage();
      servicelabor.verifyHeaderElement();
      servicelabor.verifyRepairOrderSubElement();
  }

  @Test(priority=3, description="Check that click on Internal Link and enter the text in Internal Note field",enabled = true)
  @Description("Test Description - Check that click on Internal Link and enter the text in Internal Note field")
  public void ClickInternalLink_and_EnterText() throws InterruptedException {
     servicelabor.clickOnInternalNoteLink();
     servicelabor.verifyInternalNotes();
     servicelabor.enterThisIsStandardNote();
     servicelabor.clickOnSaveExitbtn();
  }

  @Test(priority=4, description="Check that click on This is Standard Note and enter the text in Internal Note field",enabled = true)
  @Description("Test Description - Check that click on This is Standard Note and enter the text in Internal Note field")
  public void clickOnThisIsStandardNote_EnterInternalNote() throws InterruptedException {
     servicelabor.clickOnThisIsStandardNote();
     servicelabor.entercheckingnotescontain();
      servicelabor.clickOnSaveExitbtn();
  }

  @Test(priority=5, description="Check that click On Note link, verify the element and enter text in note field and save it ",enabled = true)
  @Description("Test Description -Check that click On Note link, verify the element and enter text in note field and save it ")
  public void clickOnNotes_and_EnterTextInNoteField() throws InterruptedException {
      servicelabor.clickOnNoteshyperLink();
//      servicelabor.verifyNotestextbox();
      servicelabor.entertextNoteField();
      servicelabor.clickOnSaveExitbtn();
  }

  @Test(priority=6, description="Verify Authorized By and click on the link of Authorized By",enabled = true)
  @Description("Test Description - Verify Authorized By and click on the link of Authorized By")
  public void verifyAuthorizedBy_and_ClickOnLink() throws InterruptedException {
      servicelabor.verifyAuthorizedBy();
      servicelabor.clickOnAuthorizedBy();
      servicelabor.verifiedAuthorizedByHyperlinkElements();


  }

  @Test(priority=7, description="Check that click on Add button and enter the text in name field and save it",enabled = true)
  @Description("Test Description -Check that click on Add button and enter the text in name field and save it")
  public void clickOnAdd_and_EntertheText() throws InterruptedException {
      servicelabor.clickOnAddContact();
      servicelabor.enterContactFirstName();
      servicelabor.enterContactLastName();
      servicelabor.clickOnSaveExitBtn();
  }

  @Test(priority=8, description="Check that enter last name, verify the element and click on select button ",enabled = true)
  @Description("Test Description - Check that enter last name, verify the element and click on select button")
  public void ennterLastName_and_clickOnSelectBtn() throws InterruptedException {
     servicelabor.enterLastName();
     servicelabor.verifiedFirstnameLastName();
     servicelabor.clickOnSelectBtn();

  }

  @Test(priority=9, description=" Check that the selected contact is reflected in the main screen",enabled = true)
  @Description("Test Description -  Check that the selected contact is reflected in the main screen")
  public void verifyElementofMainScreen() throws InterruptedException {
     servicelabor.verifiedFirstAndLastName();
     servicelabor.verifySubtotals();
     servicelabor.verifiedLaborPane();
     servicelabor.verifiedPartspanel();

  }

  @Test(priority=10, description="Check that click on Ro Status, verify the element and click on close button",enabled = true)
  @Description("Test Description - Check that click on Ro Status, verify the element and click on close button")
  public void clickOnRoStatus_and_CloseButton() throws InterruptedException {
     servicelabor.clickOnRoStatusHyperlink();
     servicelabor.verifiedRostatuElement();
     servicelabor.clickOnCloseBtn();
  }

  @Test(priority=11, description="Check that click on WIP status, verify the element and click on cancle",enabled = true)
  @Description("Test Description - Check that click on WIP status, verify the element and click on cancle")
  public void clickOnWIPStatus_and_clickCancle() throws InterruptedException {
     servicelabor.clickOnWipStatusHyperlink();
     servicelabor.verifyWIPStatusElement();
     servicelabor.clickOnCancleBtn();
  }

  @Test(priority=12, description="Check that click on Type hyperlink, verify the element and click on select button",enabled = true)
  @Description("Test Description - Check that click on Type hyperlink, verify the element and click on select button")
  public void clickOnTypelink_and_clickOnSelect() throws InterruptedException {
     servicelabor.clickOnTypeHyperlink();
     servicelabor.verifyTypeHyperlinkElement();
     servicelabor.clickOnTypeSelectBtn();
     servicelabor.verifiedEmergencyElement();
  }

  @Test(priority=13, description="Check that click on InvoiceTo hyperlink, verify element and click on cancle button",enabled = true)
  @Description("Test Description - Check that click on InvoiceTo hyperlink, verify element and click on cancle button")
  public void clickOnInvoiceTohyperlink_and_clickOnCancle() throws InterruptedException {
      servicelabor.clickOnInvoiceToHyperlink();
      servicelabor.verifyInvoiceHyperlinkElement();
      servicelabor.clickOnInvoiceCancleBtn();
  }

    @Test(priority=14, description="Check that click on View Profit and Loss hyperlink,verify and click Ok",enabled = true)
    @Description("Test Description -Check that click on View Profit and Loss hyperlink,verify and click Ok")
    public void clickViewProfitLoss_and_clickOk() throws InterruptedException {
        servicelabor.clickOnViewProfitLoss();
        servicelabor.verifyProfitLossElement();
        servicelabor.clickOnOKbtn();

    }

    @Test(priority=15, description="Check that click on Show labour Details,Number and Show parts Details",enabled = true)
    @Description("Test Description -Check that click on Show labour Details,Number and Show parts Details")
    public void clickOn_ShowLabourDetails_Number_ShowPartsDetails() throws InterruptedException {
        servicelabor.clickOnShowLabourbtn();
        servicelabor.clickOnNumber();
        servicelabor.clickOnShowPartsDetails();
    }

    @Test(priority=16, description="Check that click on Back to Complete RO and reference number",enabled = true)
    @Description("Test Description -Check that click on Back to Complete RO and reference number")
    public void clickOnBacktoCompleteRo_and_ReferenceNumber() throws InterruptedException {
       servicelabor.clickOnBacktoCompleteRO();
       servicelabor.clickOnReferenceNumber();

    }

    @Test(priority=17, description="Check that click on update Rates hyperlink and sign out the page",enabled = true)
    @Description("Test Description -Check that click on update Rates hyperlink and sign out the page")
    public void clickOnUpdateRates_and_SignOut() throws InterruptedException {
       servicelabor.clickOnUpdatedRates();
       servicelabor.verifyUpdateRates();
       servicelabor.clickOnCanclebutton2();
       servicelabor.clickOnSignOut();
    }


}