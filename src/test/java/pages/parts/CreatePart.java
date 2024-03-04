package pages.parts;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class CreatePart extends TestDriverActions {


    @FindBy(xpath = "//a[text()='Parts']")
    WebElement Parts;

    @FindBy(xpath = "//td[text()='Receive Parts']")
    WebElement PartMaster;

    @FindBy(xpath = "//span[text()='New Part']")
    WebElement btn_newPart;

    @FindBy(xpath = "//div[text()='New Part']")
    WebElement label_NewPart;

    @FindBy(xpath = "//div[text()='New Part']/following::span[2]")
    WebElement asterick_Part;

    @FindBy(xpath = "//div[text()='New Part']/following::label[1]")
    WebElement label_Part1;

    @FindBy(xpath = "//div[text()='New Part']/following::input[1]")
    WebElement txt_part1;

    @FindBy(xpath = "(//label[text()='Part #:']/following::span)[4]")
    WebElement asterisk_description;

    @FindBy(xpath = "(//label[text()='Description:'])[1]")
    WebElement label_description;

    @FindBy(xpath = "(//label[text()='Description:']/following::input)[1]")
    WebElement txt_description;

    @FindBy(xpath = "//input[contains(@id,':0:it2::content')]")
    public WebElement label_DescriptionTextArea;

    @FindBy(xpath = "//div[text()='New Part']/following::span[9]")
    WebElement asterisk_stockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]")
    WebElement label_stockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]/following::select[1]")
    WebElement dropdwn_stockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]/following::input[1]")
    WebElement checkbox_stockingUOM;

    @FindBy(xpath = "//label[text()='Stock Part']")
    WebElement label_stockPart;

    @FindBy(xpath = "//label[text()='Stock Part']/following::span[2]")
    WebElement asterisk_product;

    @FindBy(xpath = "(//label[text()='Product Group:'])[1]")
    WebElement label_productGroup;

    @FindBy(xpath = "(//label[text()='Product Group:'])[1]/following::select[1]")
    WebElement dropdwn_productGroup;

    @FindBy(xpath = "//select[contains(@id,'soc2::content')]")
    public WebElement label_ProductGroupTextArea;


    @FindBy(xpath = "//span[contains(.,'Create Part')]")
    public WebElement label_CreatePart;

    @FindBy(xpath = "(//label[text()='Product Group:'])[1]/following::span[3]")
    WebElement asterisk_cost;

    @FindBy(xpath = "(//label[text()='Cost:'])[1]")
    WebElement label_cost;

    @FindBy(xpath = "(//label[text()='Cost:'])[1]/following::input[1]")
    WebElement txt_cost;

    @FindBy(xpath = "(//label[text()='Cost:'])[1]/following::span[3]")
    WebElement asterisk_costingMethod;

    @FindBy(xpath = "(//label[text()='Costing Method:'])[1]")
    WebElement label_costingMethod;

    @FindBy(xpath = "(//label[text()='Costing Method:'])[1]/following::select[1]")
    WebElement dropdwn_costingMethod;

    @FindBy(xpath = "//label[text()='Use Retail Markup %']/preceding::input[1]")
    WebElement radiobtn_useRetailMarkup;

    @FindBy(xpath = "//label[text()='Use Retail Markup %']")
    WebElement label_useRetailMarkup;

    @FindBy(xpath = "//label[text()='Use Retail Markup %']/following::input[1]")
    WebElement radiobtn_useRetailPrice;

    @FindBy(xpath = "//label[text()='Use Retail Price']")
    WebElement label_useRetailPrice;

    @FindBy(xpath = "(//label[text()='Retail Markup %:'])[1]")
    WebElement label_retailMarkup;

    @FindBy(xpath = "(//label[text()='Retail Markup %:'])[1]/following::input[1]")
    WebElement txt_retailMarkup;

    @FindBy(xpath = "(//label[text()='GL Account Group:'])[1]")
    WebElement label_GLaccountGroup;

    @FindBy(xpath = "(//label[text()='GL Account Group:'])[1]/following::select[1]")
    WebElement dropdwn_GlaccountGrp;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]")
    WebElement label_vendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]/following::input[1]")
    WebElement txt_vendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]/following::td[2]/a/img")
    WebElement searchicon_vendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]/following::input[2]")
    WebElement checkbox_thisPartContainCore;

    @FindBy(xpath = "//label[text()='This part contains a core']")
    WebElement label_thisPartContainCore;

    @FindBy(xpath = "(//label[text()='Notes:'])[1]")
    WebElement label_notes;

    @FindBy(xpath = "//td[text()='Advanced']")
    WebElement label_advanced;

    @FindBy(xpath = "//td[text()='Advanced']/preceding::td[1]/a")
    WebElement arrow_advanced;

    @FindBy(xpath = "(//label[text()='Inventory Line:'])[1]")
    WebElement label_inventoryLine;

    @FindBy(xpath = "(//label[text()='Inventory Line:'])[1]/following::select[1]")
    WebElement dropdwn_inventoryLine;

    @FindBy(xpath = "(//label[text()='Inventory Class:'])[1]")
    WebElement label_inventoryClass;

    @FindBy(xpath = "(//label[text()='Inventory Class:'])[1]/following::select[1]")
    WebElement dropdwn_inventoryClass;

    @FindBy(xpath = "(//label[text()='Markup Group:'])[1]")
    WebElement label_markUpGroup;

    @FindBy(xpath = "(//label[text()='Markup Group:'])[1]/following::select[1]")
    WebElement dropdwn_markUpGrp;

    @FindBy(xpath = "(//label[text()='Warranty:'])[1]")
    WebElement label_warrenty;

    @FindBy(xpath = "(//label[text()='Warranty:'])[1]/following::select")
    WebElement dropdwn_warrenty;

    @FindBy(xpath = "(//label[text()='UPC Barcode:'])[1]")
    WebElement label_UPCbarcode;

    @FindBy(xpath = "(//label[text()='UPC Barcode:'])[1]/following::input[1]")
    WebElement txt_UPCbarcode;

    @FindBy(xpath = "//span[text()='Warehouse Management']")
    WebElement title_WarehouseManagement;

    @FindBy(xpath = "(//label[text()='Warehouse:'])[1]")
    WebElement label_warehouse;

    @FindBy(xpath = "(//label[text()='Warehouse:'])[1]/following::td[3]/a/img")
    WebElement searchicon_warehouse;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement label_location;

    @FindBy(xpath = "//label[text()='Room']")
    WebElement label_room;

    @FindBy(xpath = "//label[text()='Room']/following::input[1]")
    WebElement txt_room;

    @FindBy(xpath = "//label[text()='Row #']")
    WebElement label_row;

    @FindBy(xpath = "//label[text()='Row #']/following::input[1]")
    WebElement txt_row;

    @FindBy(xpath = "//label[text()='Shelf']")
    WebElement label_shelf;
    @FindBy(xpath = "//label[text()='Shelf']/following::input[1]")
    WebElement txt_shelf;

    @FindBy(xpath = "//label[text()='Bin #']")
    WebElement label_bin;

    @FindBy(xpath = "//label[text()='Bin #']/following::input[1]")
    WebElement txt_bin;

    @FindBy(xpath = "//label[text()='Replenishment:']")
    WebElement label_replenishment;

    @FindBy(xpath = "//label[text()='Min']")
    WebElement label_min;

    @FindBy(xpath = "//label[text()='Min']/following::input[1]")
    WebElement txt_min;

    @FindBy(xpath = "//label[text()='Max']")
    WebElement label_max;
    @FindBy(xpath = "//label[text()='Max']/following::input[1]")
    WebElement txt_max;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement btn_cancle;

    @FindBy(xpath = "(//span[text()='Create Part'])[1]")
    WebElement btn_createPart;

    @FindBy(xpath = "//span[contains(.,'Create')]")
    public WebElement btn_createpart1;

    @FindBy(xpath = "//input[contains(@id,':0:it10::content')]")
    public WebElement label_MaxTextArea;

    @FindBy(xpath = "//label[text()='Search:']/following::input[1]")
    WebElement txt_search;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Active']/following::td[1]/span/a")
    WebElement hyperlink_partNumber;

    @FindBy(xpath = "//span[text()='More Info']")
    WebElement btn_moreInfo;

    @FindBy(xpath = "(//label[text()='Part #:'])[2]/following::input[1]")
    WebElement txtfield_part;

    @FindBy(xpath = "(//label[text()='Part #:'])[2]/following::input[2]")
    WebElement txtfield_description;

    @FindBy(xpath = "//label[text()='Active:']/following::input[1]")
    WebElement checkbox_active;

    @FindBy(xpath = "(//a[text()='Costs & Pricing'])[1]")
    WebElement tab_costsAndPricing;

    @FindBy(xpath = "//label[text()='Standard:']/following::input[1]")
    WebElement  txtfield_standard;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement btn_ok;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_saveExit;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    public static void gotoPartMaster() throws FileNotFoundException, InterruptedException {

        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Part Master");


        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on New Part button
     */
    public void clickOnNewPart() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_newPart);
 //       Thread.sleep(2000);
        WebElementActions.getActions().clickElement(btn_newPart);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify element on New Part Page
     */
    public void verifyNewPart() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NewPart);
        Assert.assertTrue(label_NewPart.isDisplayed());
        Assert.assertTrue(asterick_Part.isDisplayed());
        Assert.assertTrue(label_Part1.isDisplayed());
        Assert.assertTrue(txt_part1.isDisplayed());
        Assert.assertTrue(asterisk_description.isDisplayed());
        Assert.assertTrue(label_description.isDisplayed());
        Assert.assertTrue(txt_description.isDisplayed());
        Assert.assertTrue(asterisk_stockingUOM.isDisplayed());
        Assert.assertTrue(label_stockingUOM.isDisplayed());
        Assert.assertTrue(dropdwn_stockingUOM.isDisplayed());
        Assert.assertTrue(checkbox_stockingUOM.isDisplayed());
        Assert.assertTrue(label_stockPart.isDisplayed());
        Assert.assertTrue(asterisk_product.isDisplayed());
        Assert.assertTrue(label_productGroup.isDisplayed());
        Assert.assertTrue(dropdwn_productGroup.isDisplayed());
        Assert.assertTrue(asterisk_cost.isDisplayed());
        Assert.assertTrue(label_cost.isDisplayed());
        Assert.assertTrue(txt_cost.isDisplayed());
        Assert.assertTrue(asterisk_costingMethod.isDisplayed());
        Assert.assertTrue(label_costingMethod.isDisplayed());
        Assert.assertTrue(dropdwn_costingMethod.isDisplayed());
        Assert.assertTrue(radiobtn_useRetailMarkup.isDisplayed());
        Assert.assertTrue(label_useRetailMarkup.isDisplayed());
        Assert.assertTrue(radiobtn_useRetailPrice.isDisplayed());
        Assert.assertTrue(label_useRetailPrice.isDisplayed());
        Assert.assertTrue(label_retailMarkup.isDisplayed());
        Assert.assertTrue(txt_retailMarkup.isDisplayed());
        Assert.assertTrue(label_GLaccountGroup.isDisplayed());
        Assert.assertTrue(dropdwn_GlaccountGrp.isDisplayed());
        Assert.assertTrue(label_vendor.isDisplayed());
        Assert.assertTrue(txt_vendor.isDisplayed());
        Assert.assertTrue(searchicon_vendor.isDisplayed());
        Assert.assertTrue(checkbox_thisPartContainCore.isDisplayed());
        Assert.assertTrue(label_thisPartContainCore.isDisplayed());
        Assert.assertTrue(label_notes.isDisplayed());
        Assert.assertTrue(label_advanced.isDisplayed());
        Assert.assertTrue(arrow_advanced.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Expand Advance
     * verify all the element
     */
     public void clickOnCollapseButton() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(arrow_advanced);
        WebElementActions.getActions().clickElement(arrow_advanced);

         WaitActions.getWaits().loadingWait(loder);

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_inventoryLine);
        Assert.assertTrue(label_inventoryLine.isDisplayed());
        Assert.assertTrue(dropdwn_inventoryLine.isDisplayed());
        Assert.assertTrue(label_inventoryClass.isDisplayed());
        Assert.assertTrue(dropdwn_inventoryClass.isDisplayed());
        Assert.assertTrue(label_markUpGroup.isDisplayed());
        Assert.assertTrue(dropdwn_markUpGrp.isDisplayed());
        Assert.assertTrue(label_warrenty.isDisplayed());
        Assert.assertTrue(dropdwn_warrenty.isDisplayed());
        Assert.assertTrue(label_UPCbarcode.isDisplayed());
        Assert.assertTrue(txt_UPCbarcode.isDisplayed());
        Assert.assertTrue(title_WarehouseManagement.isDisplayed());
        Assert.assertTrue(label_warehouse.isDisplayed());
        Assert.assertTrue(searchicon_warehouse.isDisplayed());
        Assert.assertTrue(label_location.isDisplayed());
        Assert.assertTrue(label_room.isDisplayed());
        Assert.assertTrue(txt_room.isDisplayed());
        Assert.assertTrue(label_row.isDisplayed());
        Assert.assertTrue(txt_row.isDisplayed());
        Assert.assertTrue(label_shelf.isDisplayed());
        Assert.assertTrue(txt_shelf.isDisplayed());
        Assert.assertTrue(label_bin.isDisplayed());
        Assert.assertTrue(txt_bin.isDisplayed());
        Assert.assertTrue(label_replenishment.isDisplayed());
        Assert.assertTrue(label_min.isDisplayed());
        Assert.assertTrue(txt_min.isDisplayed());
        Assert.assertTrue(label_max.isDisplayed());
        Assert.assertTrue(txt_max.isDisplayed());
        Assert.assertTrue(btn_cancle.isDisplayed());
        WebElementActions.getActions().moveOnTargetElement(btn_createpart1);
        Assert.assertTrue(btn_createpart1.isDisplayed());

         TestListener.saveScreenshotPNG(driver);

    }

    /**
     *  random Part Number
     */
     String partNumber = WebElementActions.getActions().randomAlphaNumeric(10);

    /**
     * Enter part
     */

    public void enterPartNumber() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_part1);
        WebElementActions.getActions().inputText(txt_part1, partNumber);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter cost
     */
    public void enterCost() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_cost);
        WebElementActions.getActions().inputText(txt_cost,appProp.getProperty("cost"));

        TestListener.saveScreenshotPNG(driver);
    }


    /**
     * enter description
     */
    public void enterDescription() throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_description);
            WebElementActions.getActions().inputText(txt_description, appProp.getProperty("Partdescription"));
            TestListener.saveScreenshotPNG(driver);

        }

    /**enter product group*/
    public void enterProductGroup() throws InterruptedException {
//           Thread.sleep(3000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(dropdwn_productGroup);
            WebElementActions.getActions().elementSelectByVisibilityText(dropdwn_productGroup, appProp.getProperty("productGroup"));

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);


            }


    /**
     * enter GL Account Group
     */
    public void enterGLAccountGroup() throws InterruptedException {
        if (LoginActions.environmentName.contains("QA") || LoginActions.environmentName.contains("NA")
            || LoginActions.environmentName.contains("EC")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(dropdwn_GlaccountGrp);
            WebElementActions.getActions().elementSelectByVisibilityText(dropdwn_GlaccountGrp, appProp.getProperty("GLaccountGroup"));
            TestListener.saveScreenshotPNG(driver);
        }
    }

    /**
     * click on create part
     */
    public void clickOnCreatePart() throws InterruptedException {

       //   WebElementActions.getActions().moveOnTargetElement(btn_createpart1);
        //   WebElementActions.getActions().clickElement(btn_createpart1);
        WebElementActions.getActions().moveOnTargetElement(label_MaxTextArea);
        Thread.sleep(3000);
        WebElementActions.getActions().moveOnTargetElement(label_MaxTextArea);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_createpart1);
           Thread.sleep(7000);
            WebElementActions.getActions().clickElement(btn_createpart1);

            WaitActions.getWaits().loadingWait(loder);

            TestListener.saveScreenshotPNG(driver);
        }

    /**
     * enter part number in search field
     */
    public void enterPartNumberInSearchField() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_search);
        WebElementActions.getActions().inputText(txt_search,partNumber);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on refresh button
     */
    public void clickOnRefreshButton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_refresh);
        WebElementActions.getActions().clickElement(btn_refresh);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on part number Hyperlink
     */
    public void clickOnPartNumberHyperlink() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(hyperlink_partNumber);
        WebElementActions.getActions().clickElement(hyperlink_partNumber);

        WaitActions.getWaits().loadingWait(loder);

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on more Info Button
     */
     public void clickOnMoreInfoButton() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_moreInfo);
         WebElementActions.getActions().clickElement(btn_moreInfo);

         WaitActions.getWaits().loadingWait(loder);

         TestListener.saveScreenshotPNG(driver);
     }

    /**
     * verify part number, description and active checkbox
     */
     public void verifyPartNumberDescriptionCheckbox() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txtfield_part);
         Assert.assertTrue(txtfield_part.isDisplayed());
         Assert.assertTrue(txtfield_description.isDisplayed());
         Assert.assertTrue(checkbox_active.isDisplayed());

         TestListener.saveScreenshotPNG(driver);
     }

    /**
     * click on costs and Pricing Tab
     */
     public void clickOnCostAndPricingTab() throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(tab_costsAndPricing);
         WebElementActions.getActions().clickElement(tab_costsAndPricing);

         WaitActions.getWaits().loadingWait(loder);

         TestListener.saveScreenshotPNG(driver);
     }

    /**
     * verify element Standard present
     */
      public void verifyElementStandard() throws InterruptedException {
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(txtfield_standard);
          Assert.assertTrue(txtfield_standard.isDisplayed());
      }

    /**
     * Extra step performed - not mentioned in script
     */
      public void clickOKbtnSaveExitBtn() throws InterruptedException {
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ok);
          WebElementActions.getActions().clickElement(btn_ok);

          WaitActions.getWaits().loadingWait(loder);


          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_saveExit);
          WebElementActions.getActions().clickElement(btn_saveExit);

          TestListener.saveScreenshotPNG(driver);

      }

    public void clickOnSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        Thread.sleep(3000);
        WebElementActions.getActions().clickUsingJS(btn_signOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }
}
