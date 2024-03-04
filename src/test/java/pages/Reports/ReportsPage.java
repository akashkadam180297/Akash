package pages;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;

import static java.nio.file.Files.getAttribute;
import static org.apache.pdfbox.cos.COSInteger.get;


public class ReportsPage extends TestDriverActions {

    public Actions action;

    @FindBy(xpath = "(//a[text()='Reports'])[2]")
    WebElement btn_Reports;

    @FindBy(xpath = "(//input[contains(@placeholder,'dd/mm/yyyy')])[1]")
    public static List<WebElement> dateTextBox;

    @FindBy(xpath = "(//input[contains(@placeholder,'dd/mm/yyyy')])[2]")
    public static List<WebElement> toDate;
    @FindBy(xpath = "(//label[contains(text(),'As of Date')])[1]")
    WebElement asOfDate;

    @FindBy(xpath = "//span[contains(text(),'Run Report')]")
    WebElement btn_RunReport;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    @FindBy(xpath = "(//label[contains(text(),'Accounting')])[1]//following::select[1]")
    List<WebElement> year;

    @FindBy(xpath = "(//label[contains(text(),'Accounting')])[2]//following::select")
    List<WebElement> accounting_Period;

    @FindBy(xpath = "//*[contains(text(),'%s')]")
    WebElement reports_Categories;

    @FindBy(xpath = "//*[starts-with(text(),'%s')]")
    WebElement available_Reports;

    @FindBy(xpath = "//label[contains(text(),'credit limit:')]//following::input[1]")
    List<WebElement> credit_Limit;

    @FindBy(xpath = "//label[contains(text(),'Reading Type:')]//following::select[1]")
    List<WebElement> reading_Type;

    @FindBy(xpath = "//label[contains(text(),'UOM:')]//following::select[1]")
    List<WebElement> uom;

    @FindBy(xpath = "//label[contains(text(),'Employee:')]/parent::td/following-sibling::td/select")
    List<WebElement> emp;

    @FindBy(xpath = "//label[contains(text(),'Report Type:')]//following::select[1]")
    List<WebElement> reportType;

    @FindBy(xpath = "(//label[contains(text(),'Report Specification:')])[1]//following::select[1]")
    List<WebElement> reportSpecification;

    @FindBy(xpath = "//tr[contains(@id,'socWar')]/td[2]/child::select")
    List<WebElement> warehouse;

    @FindBy(xpath = "//input[contains(@id,'itSearchWarehouseSelect::content') and @type='text']")
    WebElement warehouseIn;

    @FindBy(xpath = "//span[contains(text(),'Warehouse Receiving')]")
    WebElement ScrollUpTo;

    @FindBy(xpath = "//label[contains(text(),'Unit Owner')]//following::select[1]")
    List<WebElement> unit_Owner;

    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "(//a[text()='Report History'])[1]")
    WebElement reportHistory_btn;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    WebElement refresh_btn;

    @FindBy(xpath = "(//a[contains(text(),'View')])[4]")
    WebElement view;

    @FindBy(xpath = "//label[contains(text(),'To Period:')]//following::select[1]")
    List<WebElement> to_Year;

    /**
     * Click On Reports
     */

    public void clickOnReports() throws InterruptedException {
        Thread.sleep(20000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Reports);
        WebElementActions.getActions().clickElement(btn_Reports);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click On Reports Categories
     */

    String reportName = "Vendor Management";
    String allReports = String.format("//span[contains(text(),'%s')]", reportName);

    public void clickOnReportsCategories() throws InterruptedException {
        Thread.sleep(10000);
        WebElement dyelement = driver.findElement(By.xpath(allReports));
        dyelement.click();
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Click On Available Reports
     */

    String availReportName = "Vendor Performance For Parts Ordering";
    String allAvailReports = String.format("//span[starts-with(text(),'%s')]", availReportName);

    public void clickOnAvailableReports() throws InterruptedException {
        Thread.sleep(10000);
        WebElement dyelement1 = driver.findElement(By.xpath(allAvailReports));
        if (dyelement1.isDisplayed()) {
            dyelement1.click();
            WaitActions.getWaits().loadingWait(loder);
        } else {
            Thread.sleep(5000);
            WebElementActions.getActions().moveOnTargetElement(ScrollUpTo);
            dyelement1.click();
        }

        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Enter Month in TO Date
     */
    public static String subtractMonthsFromCurrentDate(int monthsToSubtract) throws InterruptedException {
        Thread.sleep(10000);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -monthsToSubtract);

        Date resultDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm a");

        if (dateTextBox.size() >= 1 && dateTextBox.get(0).getAttribute("placeholder").contains("h:mm a")) {
            return dateFormat1.format(resultDate);
        } else {
            return dateFormat.format(resultDate);
        }
    }

    public String currentDate() {
        Calendar calendar = Calendar.getInstance();
        Date resultDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm a");

        if (toDate.get(0).getAttribute("placeholder").contains("h:mm a")) {
            return dateFormat1.format(resultDate);
        } else {
            return dateFormat.format(resultDate);
        }
    }

    public void creditLimit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(credit_Limit.get(0));
        WebElementActions.getActions().inputText(credit_Limit.get(0), "10");

    }

    public void readingType() throws InterruptedException {
        if (reading_Type.get(0).getText().contains("FUEL")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reading_Type.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reading_Type.get(0), "FUEL");
        } else if (reading_Type.get(0).getText().contains("COOLNESS temp")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reading_Type.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reading_Type.get(0), "COOLNESS temp");
        } else {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reading_Type.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reading_Type.get(0), "All");
        }

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(uom.get(0));
        WebElementActions.getActions().elementSelectByVisibilityText(uom.get(0), "GA");
    }

    public void employee() throws InterruptedException {
        if (emp.get(0).getText().contains("Adica Test Tech 1 (ADICA1)")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(emp.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(emp.get(0), "Adica Test Tech 1 (ADICA1)");
        } else {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(emp.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(emp.get(0), "All");
        }
    }

    public void reportType() throws InterruptedException {
        Thread.sleep(3000);
//        Select report = new Select((WebElement) reading_Type);
//        report.selectByValue("Balance sheet");
        if (reportType.get(0).getText().contains("Balance sheet")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportType.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reportType.get(0), "Balance sheet");
            Thread.sleep(3000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportSpecification.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reportSpecification.get(0), "Balance Sheet");
        } else {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportType.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reportType.get(0), "Income Statement");
            Thread.sleep(3000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportSpecification.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(reportSpecification.get(0), "Income Statement Report");
        }
    }

    public void toYear() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(to_Year.get(0));
        WebElementActions.getActions().elementSelectByVisibilityText(to_Year.get(0), "3");
    }

    public void wareHouse() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(warehouse.get(0));
        WebElementActions.getActions().elementSelectByVisibilityText(warehouse.get(0), "11329 WAREHO Warehouse for #11329");
    }

    public void unitOwner() throws InterruptedException {
        if(unit_Owner.get(0).getText().contains("0304 - 0304")) {
            Thread.sleep(3000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(unit_Owner.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(unit_Owner.get(0), "0304 - 0304");
        }
        else {
            Thread.sleep(3000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(unit_Owner.get(0));
            WebElementActions.getActions().elementSelectByVisibilityText(unit_Owner.get(0), "All");
        }

    }

    public void enterDateInTextBox(String dateToEnter) throws InterruptedException {
        Thread.sleep(10000);

        if (dateTextBox.size() >= 1 || toDate.size() >= 1) {
            WebElement fromDate = dateTextBox.get(0);
            if (fromDate.isEnabled()) {
                dateTextBox.get(0).clear();
                dateTextBox.get(0).sendKeys(dateToEnter);
                dateTextBox.get(0).sendKeys(Keys.TAB);
            }
            if (toDate.size() >= 1) {
                WebElement toDateTextBox = toDate.get(0);
                if (toDateTextBox.isDisplayed() && toDateTextBox.isEnabled()) {
                    toDate.get(0).clear();
                    toDate.get(0).sendKeys(currentDate());
                    TestListener.saveScreenshotPNG(driver);
                } else {
                    if (reportName.contains("BO Management") && availReportName.contains("Corpro License Summary Export")) {
                        asOfDate.isDisplayed();
                        TestListener.saveScreenshotPNG(driver);
                    }
                }
            }
            Thread.sleep(2000);
            if (warehouse.size() >= 1) {
                this.wareHouse();
                TestListener.saveScreenshotPNG(driver);
            } else if (emp.size() >= 1) {
                this.employee();
                TestListener.saveScreenshotPNG(driver);
            } else if (reading_Type.size() >= 1 && uom.size() >= 1) {
                this.readingType();
                TestListener.saveScreenshotPNG(driver);
            } else if (unit_Owner.size() >= 1) {
                this.unitOwner();
                TestListener.saveScreenshotPNG(driver);
            }
        } else if (reportType.size() >= 1 && reportSpecification.size() >= 1) {
            this.reportType();
            if (year.size() > 0 && accounting_Period.size() > 0) {
                Thread.sleep(5000);
                Select yearDropdown = new Select(year.get(0));
                yearDropdown.selectByVisibleText("2021");
                Thread.sleep(5000);
                Select priodeDropdown = new Select(accounting_Period.get(0));
                priodeDropdown.selectByVisibleText("2");
                Thread.sleep(2000);
            }
        } else if (year.size() > 0 && accounting_Period.size() > 0) {
            Thread.sleep(5000);
            Select yearDropdown = new Select(year.get(0));
            yearDropdown.selectByVisibleText("2021");
            Thread.sleep(5000);
            Select priodeDropdown = new Select(accounting_Period.get(0));
            priodeDropdown.selectByVisibleText("2");
            Thread.sleep(2000);
            TestListener.saveScreenshotPNG(driver);
        } else if (to_Year.size() >= 1) {
            this.toYear();
            TestListener.saveScreenshotPNG(driver);
        } else if (credit_Limit.size() >= 1) {
            this.creditLimit();
            TestListener.saveScreenshotPNG(driver);
        } else if (reading_Type.size() >= 1 && uom.size() >= 1) {
            this.readingType();
            TestListener.saveScreenshotPNG(driver);
        } else if (warehouse.size() >= 1) {
            this.wareHouse();
            TestListener.saveScreenshotPNG(driver);
        } else
            ReusableActions.deleteDownloadedFile();
            Thread.sleep(5000);
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_RunReport);
            WebElementActions.getActions().clickElement(btn_RunReport);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        int count = 0;
        while (count < 20) {
            //           System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
            if (queue.size() > 0) {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportHistory_btn);
                WebElementActions.getActions().clickElement(reportHistory_btn);

                for (int i = 0; i < 13; i++) {
                    //               System.out.println("Iteration :"+i);

                    try {
                        // Use FluentWait to define custom conditions and polling intervals
                        new FluentWait<>(driver)
                                .withTimeout(Duration.ofSeconds(120))
                                .pollingEvery(Duration.ofSeconds(30))
                                .ignoring(Exception.class)
                                .until(drv -> refresh_btn.isEnabled());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (refresh_btn.isEnabled()) {
                        //           System.out.println("Button is ENABLED in iteration " + i);
                        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(refresh_btn);
                        WebElementActions.getActions().clickElement(refresh_btn);
            /*           Thread.sleep(2000);
                        if(view.isEnabled())
                        {
                            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view);
                            WebElementActions.getActions().clickElement(view);

                            TestListener.saveScreenshotPNG(driver);

                            break;

                        }  */

                    } else {
                        System.out.println("Button is DISABLED in iteration " + i);
                    }
                }

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view);
                WebElementActions.getActions().clickElement(view);

                TestListener.saveScreenshotPNG(driver);

                break;
            }
        }

    }
    //   }

    public void readPDF() throws IOException, InterruptedException {
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
            System.out.println(pdfFullText);
            fis.close();
        } else {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            //Iterate through rows and columns to read data
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();  //move to next row
            }
            fis.close();
        }
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);
    }


    public void readExcel() throws InterruptedException, IOException {

        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        File file = new File(url);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = new HSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        //Iterate through rows and columns to read data
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();  //move to next row
        }
        fis.close();
        Thread.sleep(10000);
        ReusableActions.deleteDownloadedFile();

        TestListener.saveScreenshotPNG(driver);

    }


}

































