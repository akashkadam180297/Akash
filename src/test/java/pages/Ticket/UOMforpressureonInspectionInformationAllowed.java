package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class UOMforpressureonInspectionInformationAllowed extends TestDriverActions {
    @FindBy(xpath = "//span[contains(.,'Unit Inspection Information')]")
    WebElement label_UnitInspectionInformation;

    @FindBy(xpath = "//span[text()='Seq#']")
    WebElement seq;

    @FindBy(xpath = "//span[text()='Label / Abbreviation']")
    WebElement LabelAbbreviation;

     @FindBy(xpath = "//span[text()='Type']")
     WebElement Type;

     @FindBy(xpath = "//span[text()='Length']")
     WebElement length;

     @FindBy(xpath = "//span[text()='Decimal Places']")
     WebElement DecimalPlaces;

     @FindBy(xpath = "(//span[text()='UOM'])[1]")
     WebElement UOM;

    @FindBy(xpath = "//a[contains(.,'Add Unit Inspection Information')]/child::span")
    WebElement AddUnitInspectionInformation;

    @FindBy(xpath = "(//input[contains(@id,':it1::content')])[2]")
    WebElement label_LabelTextArea;

    @FindBy(xpath = "//select[contains(@id,':soctyp::content')]")
    WebElement TypeTextArea;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement UOMTextaraea;

    @FindBy(xpath ="(//label[text()='Length']/parent::td/following::td/child::input)[1]" )
    WebElement lengthTestarea;

    @FindBy(xpath = "(//label[text()='Length']/parent::td/following::td/child::input)[2]")
    WebElement decimalTextarea;


    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement Cancel;

    @FindBy(xpath = "//span[contains(text(),'UOM')]/parent::td")
    WebElement label_Type;

    @FindBy(xpath = "//span[contains(text(),'PSI')]")
    WebElement UOM_PSI;

   @FindBy(xpath = "(//span[contains(text(),'UOM')]/parent::td)[2]")
   WebElement label_UOM;

    @FindBy(xpath = "//span[contains(text(),'Kilopascal')]")
    WebElement KPA;

    @FindBy(xpath = "(//span[contains(text(),'UOM')]/parent::td)[3]")
    WebElement label_UOM1;

    @FindBy(xpath = "//span[contains(text(),'Bar')]")
    WebElement Bar;

    @FindBy(xpath = "//a[contains(.,'Close')]")
    WebElement btn_Close;

    @FindBy(xpath = "//a[contains(@id,':0:clEqYMM')]/span")
    WebElement label_UnitNumber;

    @FindBy(xpath = "//a[contains(.,'More Info')]")
    WebElement btn_MoreInfo;

    @FindBy(xpath = "//label[text()='UOM:']")
    WebElement label_additionalspecsUOM;

    @FindBy(xpath = "//select[contains(@id,':soc5::content')]")
    WebElement UOM3;

    @FindBy(xpath = "//label[text()='UOM:']")
    WebElement UOM2;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
    WebElement btn_SaveExit;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[1]")
    WebElement SaveExit;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    public WebElement sign_out;

    @FindBy(name = "username")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /** go to PM Inspection Manager*/
   public void clickOnPMInspectionManager () throws FileNotFoundException, InterruptedException {
       ReusableActions.getActions().clickParentMenu("Fleet");
       ReusableActions.getActions().clickChildMenu("PM Inspection Manager");

       TestListener.saveScreenshotPNG(driver);

   }
   /**click on Unit Inspection Information */
   public void clickOnUnitInspectionInformation  () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UnitInspectionInformation);
       WebElementActions.getActions().clickElement(label_UnitInspectionInformation);
        WaitActions.getWaits().loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);

   }
   /**verify seq# ,label,Type,length,Decimal,UOM */
   public void  verifyData () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(seq);
       Assert.assertTrue(seq.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LabelAbbreviation);
       Assert.assertTrue(LabelAbbreviation.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Type);
       Assert.assertTrue(Type.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(length);
       Assert.assertTrue(length.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DecimalPlaces);
       Assert.assertTrue(DecimalPlaces.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UOM);
       Assert.assertTrue(UOM.isDisplayed());
       WaitActions.getWaits().loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);

   }

   /**click on Add UnitInspection Information */
   public void clickOnAddUnitInspectionInformation () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddUnitInspectionInformation);
       WebElementActions.getActions().clickElement(AddUnitInspectionInformation);

       TestListener.saveScreenshotPNG(driver);

   }
   /**enter Label TextArea Name*/
   public void enterLabel () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_LabelTextArea);
       WebElementActions.getActions().inputText(label_LabelTextArea,appProp.getProperty("lABELONE"));


       TestListener.saveScreenshotPNG(driver);

   }
   /**select Dropdown TYPE */
   public void selectdropdownUOM () throws InterruptedException {
       Select objselect=new Select(TypeTextArea);
       objselect.selectByVisibleText("UOM");

       Assert.assertTrue(UOM.isDisplayed());
       TestListener.saveScreenshotPNG(driver);

   }
    /**click length and Decimal */
    public void clicklengthandDecimal () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(lengthTestarea);
        WebElementActions.getActions().inputText(lengthTestarea,appProp.getProperty("one"));


        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(decimalTextarea);
        WebElementActions.getActions().inputText(decimalTextarea,appProp.getProperty("one"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**select Dropdown UOM */
     public void selectdropdownBar () throws InterruptedException {
       Select objselect=new Select(UOMTextaraea);
       objselect.selectByVisibleText(" Bar [BAR]");

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UOMTextaraea);
        Assert.assertTrue(UOMTextaraea.isDisplayed());
       TestListener.saveScreenshotPNG(driver);
   }

   /**click on Add Button */
   public void clickOnCancel() throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Cancel);
       WebElementActions.getActions().clickElement(Cancel);
       WaitActions.getWaits().loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);
   }
   /**click On Add Unit Inspection Information */
   public void enterLabelTwo () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_LabelTextArea);
       WebElementActions.getActions().inputText(label_LabelTextArea,appProp.getProperty("lABELTWO"));

       TestListener.saveScreenshotPNG(driver);

   }
    /**click length and Decimal */
    public void clicklengthandDecimalTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(lengthTestarea);
        WebElementActions.getActions().inputText(lengthTestarea,appProp.getProperty("two"));

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(decimalTextarea);
        WebElementActions.getActions().inputText(decimalTextarea,appProp.getProperty("two"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**select dropdown Kilopascal [KPA]*/
     public void selectdropdownKilopascal () throws InterruptedException {
         Select objselect=new Select(UOMTextaraea);
         objselect.selectByVisibleText(" Kilopascal [KPA]");

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UOMTextaraea);
         Assert.assertTrue(UOMTextaraea.isDisplayed());
         TestListener.saveScreenshotPNG(driver);

     }
     /**verify Type And UOM 2*/
     public void verifyTypeandUOM2() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UOM);
         Assert.assertTrue(label_UOM.isDisplayed());

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(KPA);
         Assert.assertTrue(KPA.isDisplayed());

         TestListener.saveScreenshotPNG(driver);
     }
    /**click On Add Unit Inspection Information */
    public void enterLabelThree () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_LabelTextArea);
        WebElementActions.getActions().inputText(label_LabelTextArea,appProp.getProperty("lABELTHREE"));

        TestListener.saveScreenshotPNG(driver);

    }
    /**click length and Decimal */
    public void clicklengthandDecimalThree () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(lengthTestarea);
        WebElementActions.getActions().inputText(lengthTestarea,appProp.getProperty("three"));

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(decimalTextarea);
        WebElementActions.getActions().inputText(decimalTextarea,appProp.getProperty("three"));

        TestListener.saveScreenshotPNG(driver);
    }

    /**select Dropdown Bar [BAR] */
     public void selectdropdownPSI () throws InterruptedException {
         Select objselect=new Select(UOMTextaraea);
         objselect.selectByVisibleText(" PSI [PSI]");


         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UOMTextaraea);
         Assert.assertTrue(UOMTextaraea.isDisplayed());
         TestListener.saveScreenshotPNG(driver);

     }
     /**click on Close Button  */
     public void clickonClose () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Close);
         WebElementActions.getActions().clickElement(btn_Close);
         Thread.sleep(3000);
         WaitActions.getWaits().loadingWait(loder);

         TestListener.saveScreenshotPNG(driver);

    }
   /**go to Unit Master */
   public void gotoUnitMasterScreen() throws InterruptedException, FileNotFoundException {

       ReusableActions.getActions().clickParentMenu("Fleet");
       ReusableActions.getActions().clickChildMenu("Unit Master");

       TestListener.saveScreenshotPNG(driver);
   }
   /**click On Unit Number*/
   public void clickonUnitNumber () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UnitNumber);
       WebElementActions.getActions().clickElement(label_UnitNumber);
       WaitActions.getWaits().loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);
   }
   /**click on More info*/
   public void clickonMoreInfo () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_MoreInfo);
       WebElementActions.getActions().clickElement(btn_MoreInfo);

       TestListener.saveScreenshotPNG(driver);

   }
   /** verify UOM spec BAR*/
   public void  verifyOnspecs () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_additionalspecsUOM);
       Assert.assertTrue(label_additionalspecsUOM.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UOM3);
       WebElementActions.getActions().clickElement(UOM3);
       Select objselect = new Select(UOM3);
       objselect.selectByVisibleText("BAR");

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UOM3);
       Assert.assertTrue(UOM3.isDisplayed());

       TestListener.saveScreenshotPNG(driver);
   }
   /**verify UOM spec KPA */
       public void verifyOnSpecsKPA () throws InterruptedException {
           Select objselect = new Select(UOM3);
           objselect.selectByVisibleText("KPA");

           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UOM3);
           Assert.assertTrue(UOM3.isDisplayed());

           TestListener.saveScreenshotPNG(driver);
       }
    /**verify UOM spec PSI*/
       public void verifyOnSpecsPSI () throws InterruptedException {
        Select objselect = new Select(UOM3);
        objselect.selectByVisibleText("PSI");

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UOM3);
       Assert.assertTrue(UOM3.isDisplayed());

       TestListener.saveScreenshotPNG(driver);

   }
  /**click on Save/Exit */
  public void clickOnSaveExit () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExit);
      WebElementActions.getActions().clickElement(btn_SaveExit);


      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveExit);
      WebElementActions.getActions().clickElement(SaveExit);

      TestListener.saveScreenshotPNG(driver);

  }
    /**
     * click on signOut button
     * click on  username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(sign_out);
        WebElementActions.getActions().clickElement(sign_out);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);
        TestListener.saveScreenshotPNG(driver);
    }

}
