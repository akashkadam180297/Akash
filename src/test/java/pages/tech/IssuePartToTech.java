package pages.tech;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class IssuePartToTech extends TestDriverActions {

    @FindBy(xpath = "//span[text()='Scan Employee Badge']/following::input[1]")
    WebElement TechBadgeName;

    @FindBy(xpath = "//span[text()='Go']")
    WebElement btn_Go;

    @FindBy(xpath = "//span[text()='Back to Scan Employee Badge']")
    WebElement backToScanEmployeeBadge;

    @FindBy(xpath = "//label[text()='Employee:']")
    WebElement label_employee;

    @FindBy(xpath = "//label[text()='Employee:']/following::a[1]")
    WebElement label_TechName;

    @FindBy(xpath = "//label[text()='Location assigned to employee:']")
    WebElement label_locationAssignEmployee;

    @FindBy(xpath = "//label[text()='Location assigned to employee:']/following::select")
    WebElement dropdwn_locationAssignEmployee;

    @FindBy(xpath = "//label[text()='Search Work In Progress:']")
    WebElement label_searchWorkInProgress;

    @FindBy(xpath = "//label[text()='Search Work In Progress:']/following::input[1]")
    WebElement inputbox_searchWorkInProgress;

    @FindBy(xpath = "//span[text()='Location']")
    WebElement label_location;

    @FindBy(xpath = "//span[text()='Unit Number']")
    WebElement label_unitNumber;

    @FindBy(xpath = "//span[text()='Owner']")
    WebElement label_owner;

    @FindBy(xpath = "//span[text()='RO#']")
    WebElement label_RO;

    @FindBy(xpath = "//span[text()='Date']")
    WebElement label_date;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement label_description;

    @FindBy(xpath = "//span[text()='VMRS']")
    WebElement label_VMRS;

    @FindBy(xpath = "//th[contains(@id,'sfWIP:wipTB:c12')]/div")
    WebElement column_select;

    @FindBy(xpath = "(//td[contains(@id,'c26')])[1]/span")
    WebElement label_firstrow;

    @FindBy(xpath = "//div[contains(@id,'cbSelectWoact')]")
    WebElement btn_select;

    @FindBy(xpath = "//label[text()='Employee:']/following::span[1]")
    WebElement employee_TechName;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement Location;

    @FindBy(xpath = "//label[text()='Location:']/following::div[1]")
    WebElement Location_Name;

    @FindBy(xpath = "//label[text()='Owner:']")
    WebElement Owner;

    @FindBy(xpath = "//label[text()='Owner:']/following::div[1]")
    WebElement Owner_Name;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement Unit;

    @FindBy(xpath = "//label[text()='Unit #:']/following::div[1]")
    WebElement Unit_Name;

    @FindBy(xpath = "//label[text()='Year:']")
    WebElement Year;

    @FindBy(xpath = "//label[text()='Year:']/following::div[1]")
    WebElement Year_Name;

    @FindBy(xpath = "//label[text()='Make & Model:']")
    WebElement Make_Model;

    @FindBy(xpath = "//label[text()='RO#:']")
    WebElement RO;

    @FindBy(xpath = "//label[text()='RO#:']/following::div[1]")
    WebElement RO_Name;

    @FindBy(xpath = "//label[text()='RO#:']/following::span[2]")
    WebElement asterisk;

    @FindBy(xpath = "//label[text()='RO#:']/following::label[1]")
    WebElement Labour;

    @FindBy(xpath = "//label[text()='RO#:']/following::span[3]")
    WebElement Labour_Name;

    @FindBy(xpath = "//label[text()='Part #:']")
    WebElement Part;

    @FindBy(xpath = "//label[text()='Part #:']/following::input[1]")
    WebElement Part_Input;

    @FindBy(xpath = "//label[text()='Part #:']/following::img[1]")
    WebElement search_icon;

    @FindBy(xpath = "//label[text()='Part #:']/following::img[2]")
    WebElement icon;

    @FindBy(xpath = "//span[text()='New Part']")
    WebElement New_Part;

    @FindBy(xpath = "//label[text()='Quantity  (EA):']")
    WebElement Quantity_EA;

    @FindBy(xpath = "//label[text()='Quantity  (EA):']/following::input[1]")
    WebElement Quantity_Input;

    @FindBy(xpath = "//label[text()='Warehouse:']")
    WebElement Warehouse;

    @FindBy(xpath = "//a[contains(@id,'clWHI')]")
    WebElement Warehouse_Name;

    @FindBy(xpath = "//h1[text()='Repair-Brakes']")
    WebElement RepairBrakes_LabourName;

    @FindBy(xpath = "//span[text()='#']")
    WebElement hash;

    @FindBy(xpath = "//span[text()='Part Number']")
    WebElement PartNumber;

    @FindBy(xpath = "//span[text()='Part Number']/following::span[1]")
    WebElement label_Labour;

    @FindBy(xpath = "//span[text()='Core']")
    WebElement core;

    @FindBy(xpath = "//span[text()='Actual Quantity']")
    WebElement Actual_Quantity;

    @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement UnitCost;

    @FindBy(xpath = "//span[text()='Charge Quantity']")
    WebElement ChargeQuantity;

    @FindBy(xpath = "//span[text()='Unit Charge']")
    WebElement UnitCharge;

    @FindBy(xpath = "//span[text()='Total Charge']")
    WebElement TotalCharge;

    @FindBy(xpath = "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement list_PartNumber;

    @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]")
    WebElement btn_IssuePart;

    @FindBy(xpath = "//a[contains(@id,'clPartsStockOnHand')]")
    WebElement PartName_present;

    @FindBy(xpath = "//div[contains(@id,'cbCSCR')]")
    WebElement btn_ScanBadge;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement sign_out;

    @FindBy(xpath = "//a[contains(@id,'clFac')]")
    WebElement ownerName;

    @FindBy(xpath = "//div[contains(@id,'cbSelectFac')]/a/span")
    WebElement select;

    @FindBy(xpath = "//div[contains(@id,'ctbMoreUnits')]/a/span")
    WebElement moreUnit;

    @FindBy(xpath = "//div[contains(@id,'ctbAssignedWork')]")
    List<WebElement> AssignedWork;

    @FindBy(xpath = "//div[contains(@id,'cbSelectFac')]")
    WebElement Select;

    @FindBy(xpath = "(//label[contains(text(),'Search Unit:')]/following::input[1])[1]")
    WebElement searchUnit;

    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement ButtonSelect;

    @FindBy(xpath = "(//a[contains(@id,'sdiParts::disAcr')])[1]")
    WebElement btn_part;

    @FindBy(xpath = "//h1[contains(text(),'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;



    /**
     * Click on Parts
     * click on counter sale manager
     */
    public static void gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Issue Parts to RO");

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter TechBadge
     */
    public  void enterTechBadge() throws FileNotFoundException, InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TechBadgeName);
       WebElementActions.getActions().inputText(TechBadgeName,appProp.getProperty("TechBadge"));

    }

    /**
     * Enter TechBadge
     */
    public  void clickOnGo() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Go);
        WebElementActions.getActions().clickElement(btn_Go);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Verify backToScanEmployeeBadge
     */
    public  void Verify_BacktoScanEmployeeBadge() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(backToScanEmployeeBadge);
        Assert.assertTrue(backToScanEmployeeBadge.isDisplayed());
    }

    /**
     * Enter TechBadge
     */
    public void Verify_Employee() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_employee);
        Assert.assertTrue(label_employee.isDisplayed());
        Assert.assertTrue(label_TechName.isDisplayed());
    }

    /**
     * Enter TechBadge
     */
    public void Verify_LocationAssignedtoEmployee() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_locationAssignEmployee);
        Assert.assertTrue(label_locationAssignEmployee.isDisplayed());
        Assert.assertTrue(dropdwn_locationAssignEmployee.isDisplayed());
    }

    /**
     * Enter TechBadge
     */
    public void Verify_SearchWorkInProgress() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_searchWorkInProgress);
        Assert.assertTrue(label_searchWorkInProgress.isDisplayed());
        Assert.assertTrue(inputbox_searchWorkInProgress.isDisplayed());
    }

    /**
     * Enter TechBadge
     */
    public void Verify_Location() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_location);
        Assert.assertTrue(label_location.isDisplayed());
    }

    /**
     * Enter TechBadge
     */
    public void Verify_UnitNumber() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_unitNumber);
        Assert.assertTrue(label_unitNumber.isDisplayed());

    }

    /**
     * Enter TechBadge
     */
    public void Verify_Owner() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_owner);
        Assert.assertTrue(label_owner.isDisplayed());

    }

    /**
     * Enter TechBadge
     */
    public void Verify_RO() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RO);
        Assert.assertTrue(label_RO.isDisplayed());

    }

    /**
     * Enter TechBadge
     */
    public void Verify_Date() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_date);
        Assert.assertTrue(label_date.isDisplayed());

    }

    /**
     * Enter TechBadge
     */
    public void Verify_Description() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_description);
        Assert.assertTrue(label_description.isDisplayed());

    }

    /**
     * Enter TechBadge
     */
    public void Verify_VMRS() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        Assert.assertTrue(label_VMRS.isDisplayed());
        Assert.assertTrue(column_select.isDisplayed());


    }

    /**
     * Enter TechBadge
     */
    public void Verify_firstrowElement() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_firstrow);
        Assert.assertTrue(label_firstrow.isDisplayed());
        Assert.assertTrue(btn_select.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter TechBadge
     */
    public void clickOnSelect()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_select);
        WebElementActions.getActions().clickElement(btn_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter TechBadge
     */
    public void verifyEmployeeDetails() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_employee);
        Assert.assertTrue(label_employee.isDisplayed());
        Assert.assertTrue(employee_TechName.isDisplayed());
        Assert.assertTrue(Location.isDisplayed());
        Assert.assertTrue(Location_Name.isDisplayed());
        Assert.assertTrue(Owner.isDisplayed());
        Assert.assertTrue(Owner_Name.isDisplayed());
        Assert.assertTrue(Unit.isDisplayed());
        Assert.assertTrue(Unit_Name.isDisplayed());
        Assert.assertTrue(Year.isDisplayed());
        Assert.assertTrue(Year_Name.isDisplayed());
        Assert.assertTrue(Make_Model.isDisplayed());
        Assert.assertTrue(RO.isDisplayed());
        Assert.assertTrue(RO_Name.isDisplayed());


    }

    public void verifyElement() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(asterisk);
        Assert.assertTrue(asterisk.isDisplayed());
        Assert.assertTrue(Labour.isDisplayed());
        Assert.assertTrue(Labour_Name.isDisplayed());
        Assert.assertTrue(Part.isDisplayed());
        Assert.assertTrue(Part_Input.isDisplayed());
        Assert.assertTrue(search_icon.isDisplayed());
        Assert.assertTrue(icon.isDisplayed());
        Assert.assertTrue(New_Part.isDisplayed());
        Assert.assertTrue(Quantity_EA.isDisplayed());
        Assert.assertTrue(Quantity_Input.isDisplayed());
        Assert.assertTrue(Warehouse.isDisplayed());
        Assert.assertTrue(Warehouse_Name.isDisplayed());

    }

    public void verify() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RepairBrakes_LabourName);
        Assert.assertTrue(RepairBrakes_LabourName.isDisplayed());
        Assert.assertTrue(hash.isDisplayed());
        Assert.assertTrue(PartNumber.isDisplayed());
        Assert.assertTrue(label_Labour.isDisplayed());
        Assert.assertTrue(core.isDisplayed());
        Assert.assertTrue(Actual_Quantity.isDisplayed());
        Assert.assertTrue(UnitCost.isDisplayed());
        Assert.assertTrue(ChargeQuantity.isDisplayed());
        Assert.assertTrue(UnitCharge.isDisplayed());
        Assert.assertTrue(TotalCharge.isDisplayed());

    }
    /**
     *  Enter Part Number
    **/
    public void enterPartNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Part_Input);
        WebElementActions.getActions().inputText(Part_Input,appProp.getProperty("PartNumber"));

        WebElementActions.getActions().clickElement(list_PartNumber);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  click on Issue Part
     **/
    public void clickOnIssuePart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_IssuePart);
        WebElementActions.getActions().clickElement(btn_IssuePart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     *  verify part name present in the row
     */
    public void VerifyPartName() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartName_present);
        Assert.assertTrue(PartName_present.isDisplayed());
    }
    /**
     * click on scan badge
     */
    public void clickOnScanBadge() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ScanBadge);
        WebElementActions.getActions().clickElement(btn_ScanBadge);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on sign out
     */
    public void clickOnSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(sign_out);
        WebElementActions.getActions().clickElement(sign_out);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  click on Owner Name
     */
    public void clickOwnerName() throws InterruptedException {
        Thread.sleep(8000);
        if(AssignedWork.size() > 0)
        {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AssignedWork.get(0));
            WebElementActions.getActions().clickElement(AssignedWork.get(0));

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        Thread.sleep(1000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ownerName);
        WebElementActions.getActions().clickElement(ownerName);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on select
     */
    public void clickOnMoreUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(moreUnit);
        WebElementActions.getActions().clickElement(moreUnit);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter TechBadge
     */
    public void clickOnSelectButton()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Select);
        WebElementActions.getActions().clickElement(Select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter TechBadge
     */
    public void EnterUnitNumber()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchUnit);
        WebElementActions.getActions().inputText(searchUnit,appProp.getProperty("UnitNumber"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickOnSelect1()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ButtonSelect);
        WebElementActions.getActions().clickElement(ButtonSelect);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    public void clickOnPart()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_part);
        WebElementActions.getActions().clickElement(btn_part);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Extra Step
     * Enter number  0001020006
     */
    public void enterPart()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Part_Input);
        WebElementActions.getActions().inputText(Part_Input,appProp.getProperty("PartName"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on issue part
     */
    public void issuePart()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_IssuePart);
        WebElementActions.getActions().clickElement(btn_IssuePart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on cross icon
     */
 /*   public void issuePart()throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable();
        WebElementActions.getActions().clickElement();

        TestListener.saveScreenshotPNG(driver);
    }  */

    /**
     *
     * verify username
     */
    public void verifyUserName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);
    }

}
