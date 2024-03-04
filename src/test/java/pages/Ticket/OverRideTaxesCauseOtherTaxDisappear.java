package pages.Ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class OverRideTaxesCauseOtherTaxDisappear extends TestDriverActions {

    @FindBy(xpath = "//div[contains(@id,'cbNWO')]")
    WebElement newRo;
    @FindBy(xpath = "//div[contains(@id,'cbSelectUnitLocal')]")
    WebElement firstUnit_select;
    @FindBy(xpath = "//div[contains(@id,'cbCancel')]")
    WebElement close_btn;
    @FindBy(xpath = "//div[contains(@id,'ctbwseq')]/following::a[2]")
    WebElement btn_AddLabour;
    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement VMRS;
    @FindBy(xpath = "//input[contains(@id,'searchVmrs:dc_it1::content')]")
    WebElement search_text;
    @FindBy(xpath = "//a[contains(@id,'cilvmrsys')]/img")
    WebElement FirstLabour_img;
    @FindBy(xpath = "//a[contains(@id,'ciAddVmrs')]/img")
    WebElement plusIcon;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement btnAdd;

    @FindBy(xpath = "//label[text()='Tax:']/following::a[1]")
    WebElement taxex_link ;
    @FindBy(xpath = "//div[contains(@id,'ctbAddWoTax')]")
    WebElement Add_tax;
    @FindBy(xpath = "//select[contains(@id,'socTax::content')]")
    WebElement select_option;
    @FindBy(xpath = "//input[contains(@id,'itOVTP::content')]")
    WebElement percentage;
    @FindBy(xpath = "//input[contains(@id,'itOVTPA::content')]")
    WebElement amount;
    @FindBy(xpath = "//div[contains(@id,'ctbOk')]")
    WebElement OK_Btn;
    @FindBy(xpath = "//span[text()='Invoice']")
    WebElement invoice_btn;
    @FindBy(xpath = "//div[contains(@id,'cbClose')]")
    WebElement btn_close;
    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;
    @FindBy(xpath = "//div[text()='Taxes']")
    WebElement taxes;
    @FindBy(xpath = "//span[text()='Tax']")
    WebElement tax ;
    @FindBy(xpath = "//span[text()='%']")
    WebElement sign_percentage;
    @FindBy(xpath = "//span[text()='Amount']")
    WebElement Amount;
    @FindBy(xpath = "//span[text()='Override / Details']")
    WebElement overrideDetails;
   @FindBy(xpath = "//span[text()='Add Parts']")
    WebElement AddParts;
    @FindBy(xpath = "//input[contains(@id,'itSearchPartSelect::content')]")
    WebElement part_textbox;
    @FindBy(xpath = "//div[contains(@id,'cbIssuePart')]")
    WebElement issuePart;
    @FindBy(xpath = "(//div[contains(@id,'ctbClose')])[2]")
    WebElement close;
    @FindBy(xpath =  "//li[contains(@class,'AFAutoSuggestItem')]")
    WebElement listOfParts;

   @FindBy(xpath = "(//div[text()='Taxes'])[2]")
    WebElement taxes_2;
    @FindBy(xpath = "(//label[text()='Tax:'])[2]")
    WebElement tax_2;
    @FindBy(xpath = "//label[text()='Override']")
    WebElement override;
    @FindBy(xpath = "//label[text()='Percentage:']")
    WebElement percentage1;
    @FindBy(xpath = "//label[text()='Amount:']")
    WebElement amount1;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /**
     * go to complete ro screen
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
   public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
       ReusableActions.getActions().clickParentMenu("Service");
       ReusableActions.getActions().clickChildMenu("Complete RO");
   }
    /**
     * click on New Ro
     */
    public void clickOnNewRo() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(newRo);
        WebElementActions.getActions().clickElement(newRo);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  click on any unit
     */
    public void clickOnUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(firstUnit_select);
        WebElementActions.getActions().clickElement(firstUnit_select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close
     */
     public void clickOnClose() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(close_btn);
         WebElementActions.getActions().clickElement(close_btn);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on Add labour
     */
      public void clickOnAddLabour() throws InterruptedException {
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AddLabour);
          WebElementActions.getActions().clickElement(btn_AddLabour);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);
      }
    /**
     * click on VMRS
     */
    public void clickOnVMRS() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRS);
        WebElementActions.getActions().clickElement(VMRS);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter first labour
     */
    public void enterFirstLabour() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_text);
        WebElementActions.getActions().inputText(search_text,appProp.getProperty("FirstName"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on firstlabour image
     */
     public void clickOnFirstLabourImg() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FirstLabour_img);
         WebElementActions.getActions().clickElement(FirstLabour_img);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * click on plus button
     */
    public void clickOnPlusButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plusIcon);
        WebElementActions.getActions().clickElement(plusIcon);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add button
     */
    public void clickOnAddButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btnAdd);
        WebElementActions.getActions().clickElement(btnAdd);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * Enter first labour
     */
    public void enterSecondLabour() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_text);
        WebElementActions.getActions().inputText(search_text,appProp.getProperty("SecondName"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on add parts
     */
    public void clickOnParts() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddParts);
        WebElementActions.getActions().clickElement(AddParts);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter part number
     */
    public void enterPart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(part_textbox);
        WebElementActions.getActions().inputText(part_textbox,appProp.getProperty("firstPart"));
        Thread.sleep(2000);
        WebElementActions.getActions().clickElement(listOfParts);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on issue part
     */
    public void clickIssuePart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(issuePart);
        WebElementActions.getActions().clickElement(issuePart);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter second part number
     */
    public void enterSecondPart() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(part_textbox);
        WebElementActions.getActions().inputText(part_textbox,appProp.getProperty("secondPart"));
        Thread.sleep(2000);
        WebElementActions.getActions().clickElement(listOfParts);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close
     */
    public void clickClose() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(close);
        WebElementActions.getActions().clickElement(close);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on Taxes
     */
    public void clickOnTaxes() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(taxex_link);
        WebElementActions.getActions().clickElement(taxex_link);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * verify taxes element
     */
    public void verifyTaxesPopUp() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(taxes);
        Assert.assertTrue(taxes.isDisplayed());
        Assert.assertTrue(tax.isDisplayed());
        Assert.assertTrue(sign_percentage.isDisplayed());
        Assert.assertTrue(Amount.isDisplayed());
        Assert.assertTrue(overrideDetails.isDisplayed());
    }
    /**
     * verify percentage amount pop up
     */
    public void verifyPercentageAmountPopUp() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(taxes_2);
        Assert.assertTrue(taxes_2.isDisplayed());
        Assert.assertTrue(tax_2.isDisplayed());
        Assert.assertTrue(override.isDisplayed());
        Assert.assertTrue(percentage1.isDisplayed());
        Assert.assertTrue(amount1.isDisplayed());
    }
    /**
     * click on Add Tax
     */
     public void clickOnAddTax() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Add_tax);
         WebElementActions.getActions().clickElement(Add_tax);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * select option from dropdown
     */
    public void clickOnVat() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_option);
        WebElementActions.getActions().elementSelectByVisibilityText(select_option,appProp.getProperty("selectOption_1"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter percentage of VAT
     */
    public void enterPercentageVAT() throws InterruptedException {
        String VatPercentage = String.valueOf(WebElementActions.getActions().randomNumber(1,10));

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(percentage);
        WebElementActions.getActions().inputText(percentage,VatPercentage);

        amount.sendKeys(Keys.TAB);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter Amount
     */
    public void enterVATAmount() throws InterruptedException {
        String VatAmount = String.valueOf(WebElementActions.getActions().randomNumber(1,10));

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(amount);
        WebElementActions.getActions().inputText(amount,VatAmount);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on OK button
     */
     public void clickOnOK() throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(OK_Btn);
         WebElementActions.getActions().clickElement(OK_Btn);

         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);
     }
    /**
     * select option of T1 from dropdown
     */
    public void clickOnT1() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(select_option);
        WebElementActions.getActions().elementSelectByVisibilityText(select_option,appProp.getProperty("selectOption_2"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter percentage of T1
     */
    public void enterPercentageT1() throws InterruptedException {
        String T1Percentage = String.valueOf(WebElementActions.getActions().randomNumber(1,10));

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(percentage);
        WebElementActions.getActions().inputText(percentage,T1Percentage);

        amount.sendKeys(Keys.TAB);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * enter Amount of T1
     */
    public void enterT1Amount() throws InterruptedException {
        String T1Amount = String.valueOf(WebElementActions.getActions().randomNumber(1,10));

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(amount);
        WebElementActions.getActions().inputText(amount,T1Amount);


        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on close button
     */
    public void clickOnClose_Taxes() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_close);
        WebElementActions.getActions().clickElement(btn_close);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on invoice button
     */
    public void clickOnInvoice() throws InterruptedException, FileNotFoundException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(invoice_btn);
        WebElementActions.getActions().clickElement(invoice_btn);

        Thread.sleep(5000);
        ReusableActions.getActions().deleteDownloadedFile();

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     *  verify taxes on PDF
     */
    public void VerifyTaxesonPDF() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        if (url.contains(".pdf")) {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            PDDocument document = null;
            document = PDDocument.load(fis);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfFullText = pdfStripper.getText(document);
     //       System.out.println(pdfFullText);

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("All taxes are visible and the being calculated properly.");

            }

            fis.close();

        }
    }

        /**
         * click on sign out button
         * verify username
         */
        public void clickOnSignOut() throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
            Thread.sleep(3000);
            WebElementActions.getActions().clickUsingJS(btn_signOut);

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
            Assert.assertTrue(inputbox_Username.isDisplayed());

            TestListener.saveScreenshotPNG(driver);
        }
    }










