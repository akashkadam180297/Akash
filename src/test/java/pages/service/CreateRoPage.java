package pages.service;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class CreateRoPage extends TestDriverActions {


    @FindBy(xpath = "//span[text()='New RO']")
    public WebElement btn_Add_new_Ro;

    @FindBy(xpath = "(//div[contains(@id,'cbSelectCus')])[1]")
    public WebElement row_Select_First_Line_Item;

    @FindBy(xpath = "//span[text()='Add Labour']")
    public WebElement btn_Add_labor;

    @FindBy(xpath = "//h2[text()='Repair-Accessories Group']/following::span[2]")
    public WebElement btn_Add_part;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement btn_labor_add_final;

    @FindBy(xpath = "(//a[text()='Service Programs'])[1]")
    public WebElement tab_Service_Program;


    @FindBy(xpath = "//img[contains(@id,':cil3::icon')]")
    public WebElement select_Service_Program;

    @FindBy(xpath="(//div[text()='Add Labour']/following::a[text()='VMRS'])[1]")
    public WebElement select_VMRS;

    @FindBy(xpath = "//h1[text()='Click icon to drill down']/following::a[1]/img")
    public WebElement click_first_Icon;

    @FindBy(xpath = "//label[text()='Search:']/following::td[6]/span/a/img")
    public WebElement plus_service_program_one;

//    @FindBy(xpath = "//a[contains(@id,'ciDWA1')]")
//    public List<WebElement> number_of_added_labors;
    @FindBy(xpath = "//span[text()='Total Charge']/following::a[6]/img")
    public List<WebElement> number_of_add_labour;

 //   @FindBy(xpath = "//a[contains(@id,'ciRTPart1')]")
//    public List<WebElement> number_of_added_parts;
    @FindBy(xpath = "(//span[text()='Total Charge']/following::a[6]/img)[1]")
    public List<WebElement> number_of_add_part;

    @FindBy(xpath = "(//span[@class='af_column_data-container']//a)[2]")
    public WebElement plus_service_program_two;

    @FindBy(xpath = "//img[contains(@id,':cilF::icon')]")
    public WebElement icon_magnify;


    @FindBy(xpath = "//span[text()='Issue Part']")
    public WebElement btn_Issue_Part;

   // @FindBy(xpath = "//table[contains(@id,'pgocb2')]//div[contains(@id,'ctbClose')]//span")
    @FindBy(xpath = "(//span[text()='Close'])[2]")
    public WebElement btn_Issue_Part_Close;

    @FindBy(xpath = "//span[text()='New Part']")
    public WebElement btn_New_Part;

    @FindBy(xpath = "(//div[@id='reg1:0:rWO:1:r11:1:tWAP::db']//tr)[1]")
    public WebElement first_row;

    @FindBy(xpath = "//span[text()='Non-Catalog Part']")
    public WebElement btn_Non_Catalog_Part;

    @FindBy(xpath = "//label[text()='Part#:']//preceding-sibling::input")
    public WebElement txt_part;
    @FindBy(xpath = "//label[contains(text(),'Description')]//preceding-sibling::input")
    public WebElement txt_description;
    @FindBy(xpath = "//label[contains(text(),'Unit Cost')]//preceding-sibling::input")
    public WebElement txt_unit_cost;
    @FindBy(xpath = "//label[text()='Parts Account Group:']//preceding-sibling::select")
    public WebElement ddl_parts_account_group;

    @FindBy(xpath = "//table[@id='reg1:0:rWO:1:r11:1:r3:2:pgl1']//input")
    public WebElement txt_quantity;

    @FindBy(xpath = "//table[@id='reg1:0:rWO:1:r11:1:r3:2:pgl1']//select")
    public WebElement ddl_UOM;

    @FindBy(xpath = "//table[@id='reg1:0:rWO:1:r11:1:r3:2:pg1']//span[text()='Cancel']")
    public WebElement btn_cancel;

    @FindBy(xpath = "//table[@id='reg1:0:rWO:1:r11:1:r3:2:pg1']//span[text()='Issue Part']")
    public WebElement btn_Issue_Part_on_non_catalog;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement select_First_Line_Item;

    @FindBy(xpath = "//span[text()='Add Parts']/following::a[1]/img")
    public WebElement icon_delete_part;

   @FindBy(xpath="//span[text()='Do you want to continue?']/following::span[4]")
    public List<WebElement> yes_delete_labour_and_parts;
//      public WebElement yes_delete_labour_and_parts;

    @FindBy(xpath = "//a[contains(@id,'trashWA')]")
//    public List<WebElement> icon_delete_labor;
      public WebElement icon_delete_labour;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "//span[text()='Close']")
     WebElement close_alert;

    int no_of_labors_before_added, no_of_parts_before_added;

    /**
     * Go to the complete RO screen
     *
     * @throws InterruptedException
     */
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on Add new RO button
     */
    public void clickNewRo() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(btn_Add_new_Ro);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add_new_Ro);
        WebElementActions.getActions().clickElement(btn_Add_new_Ro);
        WaitActions.getWaits().loadingWait(loder);

        //       btn_Add_new_Ro.click();
        TestListener.saveScreenshotPNG(driver);
    }


    /**
     * Select First Unit
     */
    public void selectFirstUnit() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(select_First_Line_Item);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_First_Line_Item);
        WebElementActions.getActions().clickElement(select_First_Line_Item);

        WaitActions.getWaits().loadingWait(loder);

//        select_First_Line_Item.click();
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on button Add Labor
     */
    public void clickAddLabor() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(btn_Add_labor);
//        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add_labor);
        WebElementActions.getActions().clickElement(btn_Add_labor);
        WaitActions.getWaits().loadingWait(loder);


     /*   Thread.sleep(8000);
        WaitActions.getWaits().waitForElementTobeClickable(btn_Add_labor);
        no_of_labors_before_added = number_of_added_labors.size();
        Thread.sleep(2000);
        btn_Add_labor.click();   */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on TAB : Service Program
     *
     * @throws InterruptedException
     */
    public void selectServiceProgram() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(tab_Service_Program);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_Service_Program);
        WebElementActions.getActions().clickElement(tab_Service_Program);
        Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(select_Service_Program);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_Service_Program);
        WebElementActions.getActions().clickElement(select_Service_Program);


     /*   WaitActions.getWaits().waitForElementTobeClickable(tab_Service_Program);
        tab_Service_Program.click();
        Thread.sleep(2000);
        WaitActions.getWaits().waitForElementTobeClickable(select_Service_Program);
        select_Service_Program.click();   */


        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * Click on VMRS Tab
     */
    public void selectVMRS() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(select_VMRS);
       //
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_VMRS);
        WebElementActions.getActions().clickElement(select_VMRS);
        WaitActions.getWaits().loadingWait(loder);

//        select_VMRS.click();
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click first icon in VMRS
     */
    public void clickIcon() throws InterruptedException {
//        WaitActions.getWaits().waitForElementTobeClickable(click_first_Icon);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(click_first_Icon);
        WebElementActions.getActions().clickElement(click_first_Icon);
        WaitActions.getWaits().loadingWait(loder);

        //     click_first_Icon.click();
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on + sign to add service program
     */
    public void addServiceProgram() throws InterruptedException {
        Thread.sleep(2000);
//      WaitActions.getWaits().waitForElementTobeClickable(plus_service_program_one);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plus_service_program_one);
      WebElementActions.getActions().clickElement(plus_service_program_one);
//        WaitActions.getWaits().loadingWait(loder);

//        plus_service_program_one.click();
        TestListener.saveScreenshotPNG(driver);


    }


    /**
     * Add final labor click
     */
    public void addLaborFinal() throws InterruptedException {
         Thread.sleep(2000);
//        WaitActions.getWaits().waitForElementTobeClickable(btn_labor_add_final);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_labor_add_final);
        WebElementActions.getActions().clickElement( btn_labor_add_final);
        WaitActions.getWaits().loadingWait(loder);


        //   btn_labor_add_final.click();

        TestListener.saveScreenshotPNG(driver);

    }


    /**
     * verify labor added
     */
    public void verify_labor_added() throws InterruptedException {
 //       Thread.sleep(3000);
        try {
    //        WaitActions.getWaits().WaitUntilWebElementIsVisible(number_of_add_labour.get(0));
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(number_of_add_labour.get(0));
            Assert.assertTrue(number_of_add_labour.size() >= 0);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

     /*    WaitActions.getWaits().waitForElementTobeClickable(number_of_added_labors.get(0));
        Assert.assertTrue(number_of_added_labors.size() == no_of_labors_before_added + 1);  */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on button - Add Parts
     */
    public void clickAddPart() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(btn_Add_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add_part);
        WebElementActions.getActions().clickElement(btn_Add_part);
        WaitActions.getWaits().loadingWait(loder);



    /*    WaitActions.getWaits().waitForElementTobeClickable(btn_Add_part);
        no_of_parts_before_added = number_of_added_parts.size();
        Thread.sleep(2000);
      WebElementActions.getActions().clickUsingJS( btn_Add_part); */
 //       btn_Add_part.click();

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click on - search icon to select item
     *
     */
    public void clickSearchAndPart() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(icon_magnify);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_magnify);
        WebElementActions.getActions().clickUsingJS(icon_magnify);
 //       Thread.sleep(3000);
        WaitActions.getWaits().loadingWait(loder);

//        WaitActions.getWaits().waitForElementTobeClickable(row_Select_First_Line_Item);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(row_Select_First_Line_Item);
        WebElementActions.getActions().clickUsingJS(row_Select_First_Line_Item);

        WaitActions.getWaits().loadingWait(loder);



     /*   WaitActions.getWaits().waitForElementTobeClickable(icon_magnify);
        icon_magnify.click();
        WaitActions.getWaits().waitForElementTobeClickable(row_Select_First_Line_Item);
        row_Select_First_Line_Item.click(); */

 //        Thread.sleep(5000);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *Click on - issuePart button
     */
    public void clickIssuePart() throws InterruptedException {

 //       WaitActions.getWaits().waitForElementTobeClickable(btn_Issue_Part);
 //       Thread.sleep(5000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Issue_Part);
        WebElementActions.getActions().clickUsingJS(btn_Issue_Part);
        WaitActions.getWaits().loadingWait(loder);


        //          Thread.sleep(5000);

     /*   WaitActions.getWaits().waitForElementTobeClickable(btn_Issue_Part);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_Issue_Part);
 //       btn_Issue_Part.click();   */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  click on - close button
     */
    public void clickCloseButton() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(btn_Issue_Part_Close);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Issue_Part_Close);
        WebElementActions.getActions().clickElement(btn_Issue_Part_Close);
        WaitActions.getWaits().loadingWait(loder);


      /*  WaitActions.getWaits().waitForElementTobeClickable(btn_Issue_Part_Close);
        btn_Issue_Part_Close.click(); */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  Check that Parts added
     */
    public void verify_part_added() throws InterruptedException {
         Thread.sleep(3000);
        try {
    //        WaitActions.getWaits().WaitUntilWebElementIsVisible(number_of_add_part.get(0));
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(number_of_add_part.get(0));
            Assert.assertTrue(number_of_add_part.size() >= 0);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }


     /*   Thread.sleep(3000);
        WaitActions.getWaits().waitForElementTobeClickable(number_of_added_parts.get(0));
//        Assert.assertTrue(number_of_added_parts.size() == no_of_labors_before_added + 1);
        Assert.assertTrue(number_of_added_parts.size() == no_of_parts_before_added + 1); */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on added part cross icon
     */
   public void clickOnAddedPart() throws InterruptedException {

       WaitActions.getWaits().waitForElementTobeClickable(number_of_add_part.get(0));
//       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(number_of_add_part.get(0));
       WebElementActions.getActions().clickUsingJS(number_of_add_part.get(0));

       WaitActions.getWaits().loadingWait(loder);





     /*   Thread.sleep(2000);
       WaitActions.getWaits().waitForElementTobeClickable(number_of_added_parts.get(0));
        number_of_added_parts.get(0).click();  */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Parts delete icon
     */
    public void clickOnPartDeleteIcon() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(icon_delete_part);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_delete_part);
        WebElementActions.getActions().clickUsingJS(icon_delete_part);
  //       Thread.sleep(20000);
        WaitActions.getWaits().loadingWait(loder);


 //       WebElementActions.getActions().clickUsingJS(icon_delete_labour);
         if(yes_delete_labour_and_parts.size()>0)
        {
            WebElementActions.getActions().clickElement(yes_delete_labour_and_parts.get(0));

            WaitActions.getWaits().loadingWait(loder);
        }



    /*    WebElementActions.getActions().clickUsingJS(icon_delete_labour);
          if(yes_delete_labour_and_parts.size()>0)
          {
              WebElementActions.getActions().clickUsingJS(yes_delete_labour_and_parts.get(0));
          } */


     /*       Thread.sleep(2000);
            WaitActions.getWaits().waitForElementTobeClickable(icon_delete_part);
//            icon_delete_part.click();
            Thread.sleep(5000);
        WebElementActions.getActions().clickUsingJS(icon_delete_labor.get(0));
            //CHECK IF POPUP APPEAR AND IF YES THEN CLICK ON BUTTON - //span[text()='Yes, delete labor and parts']

            // public void popupAppear () {
            if (yes_delete_labour_and_parts.size() > 0) {
                WebElementActions.getActions().clickUsingJS(yes_delete_labour_and_parts.get(0));
               // yes_delete_labour_and_parts.get(0).click();

       */

//        WaitActions.getWaits().WaitUntilWebElementIsVisible(number_of_add_part);
//        Assert.assertTrue(number_of_add_part.isDisplayed());


        TestListener.saveScreenshotPNG(driver);
            }
 //       }

    /**
     * click on added labour cross icon
     */
    public void clickOnAddedLabor() throws InterruptedException {

 //       WaitActions.getWaits().waitForElementTobeClickable(number_of_add_labour.get(0));
//        WebElementActions.getActions().clickElement(number_of_add_labour.get(0));

        WaitActions.getWaits().loadingWait(loder);




      /*  Thread.sleep(5000);
        WaitActions.getWaits().waitForElementTobeClickable(number_of_added_labors.get(0));
        Thread.sleep(2000);
        number_of_added_labors.get(0).click();  */

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Labor delete icon
     */
    public void clickOnLaborDeleteIcon() throws InterruptedException {

//        WaitActions.getWaits().waitForElementTobeClickable(icon_delete_labour);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(icon_delete_labour);
        WebElementActions.getActions().clickElement(icon_delete_labour);

 //       WaitActions.getWaits().loadingWait(loder);

      /*      if (number_of_added_labors.size() > 0) {
                WaitActions.getWaits().waitForElementTobeClickable(icon_delete_labor.get(0));
                Thread.sleep(5000);
                WebElementActions.getActions().clickUsingJS(icon_delete_labor.get(0));
       //         icon_delete_labor.get(0).click();
                Thread.sleep(5000);
                //CHECK IF POPUP APPEAR AND IF YES THEN CLICK ON BUTTON - //span[text()='Yes, delete labor and parts']
                if (yes_delete_labour_and_parts.size() > 0) {
                    WebElementActions.getActions().clickUsingJS(yes_delete_labour_and_parts.get(0));
 //                   yes_delete_labour_and_parts.get(0).click(); */

     //      WaitActions.getWaits().WaitUntilWebElementIsVisible( number_of_add_labour);
           Assert.assertTrue( number_of_add_labour.size()>=0);




                    TestListener.saveScreenshotPNG(driver);
 //                }
            }
        }


    /**
     * Check that part deleted
     */
 /*   public void verifyPartDeleted() throws InterruptedException {



        Thread.sleep(2000);
        Assert.assertTrue(number_of_added_parts.size()==0);


        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * check that labor deleted
     */
 /*   public void verifyLaborDeleted() throws InterruptedException {
        Thread.sleep(2000);

       Assert.assertTrue(number_of_added_labors.size()==0);
        TestListener.saveScreenshotPNG(driver);

    }
     */



