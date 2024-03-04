package tests;

import actions.DataActions;
import actions.LoginActions;
import actions.WaitActions;
import constants.SheetConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.Estimate.SubmitAnEstimateServiceManager;
import pages.LoginPage;
import pages.ReportsPage;
import pages.Ticket.*;
import pages.Ticket.CustomerProofNotesIssue;
import pages.Ticket.SplitRoLocation;
import pages.administration.CreateCustomerPage;
import pages.administration.CreateVendorPage;
import pages.estimating.ApproveanEstimateDMSPage;
import pages.estimating.PerformTheWorkOnAnEstimateTech;
import pages.fleet.CreateRedTagDMS;
import pages.fleet.CreateUnitPage;
import pages.fleet.SetUpWorkRequired;


import pages.parts.*;
//import pages.pmWorkFlow.WorkOrderWorkflowPage;
import pages.pmWorkFlow.cGVTechPerformPM;
import pages.service.*;

import pages.tech.IssuePartToTech;
import pages.tech.PauseLabor;
import pages.techRo.*;
import pages.tech.EC_Tech_WoLabor;
import pages.tech.EC_Tech_WoParts;


import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestDriverActions {


    public static WebDriver driver;
    public LoginPage loginPage;
    public CreateUnitPage createUnitPage;
    public CreateRoPage createRoPage;
    public CreateVendorPage vendorsPage;
    public CreateCustomerPage customerPage;
    public CounterSalePage counter;
    public CreatePart relatedItem;
    public SetUpWorkRequired setUp;
    public ECServiceManager_ChangeCustomerPOafterInvoicing update;
    public InquireFXG_UnitHistory unit;
    public JournalizePartsInvoice journalize;
    public EC_Tech_WoLabor labor;
    public EC_Tech_WoParts part;
    public ECServiceManager_AddRemoveLabor addRemove;
    public ServiceManagerWoLabor servicelabor;
    public CreateNonRepairBill_ServiceManager nonrepairbills;
    public cGVTech_WoCompliance wocompliance;
    public ECService_Manager_Invoice completeropage;
    public ServiceManagerPartsRelatedTasks servicemanagerpartsrelatedtasks;
    public pages.nonrepair.ApproveNonRepairBill_DMS approveNonRepairBill ;
    public CreateRedTagDMS redtag;
    public ECServiceManager_Journalize journalizepage ;
    public pages.cGVUnitFunctionality.InquireFXG_UnitHistory unithistorypage;
    public ApproveanEstimateDMSPage approveanestimatedmspage;
    public cGVTechPerformPM pmworkorderworkflowpage;
    public PerformTheWorkOnAnEstimateTech performtheworkonanestimatepage;
    public Spotorderpart spotorderparts;
    public ReceivePart  receivepart;
    public JournalizeCounterSale journalizecountersale;
    public SubmitAnEstimateServiceManager  submitanestimateservicemanager;
    public IssuePartToTech issueparttotech;
    public PauseLabor pauselabor;
    public AddaFabricatedPartToaClosedWorkorder addafabricatedparttoaclosedworkorder;
    public SplitRoLocation splitRoLocation;
    public ReportsPage reportsPage;
    public UOMforpressureonInspectionInformationAllowed unitinspectioninformation;
    public CustomerProofNotesIssue customerProofNotesIssue;
    public NonIcCompletedAndWorkFine nonIcCompletedAndWorkFine;
    public TransitonedPaccar location;
    public OverRideTaxesCauseOtherTaxDisappear overRideTaxes ;





    LoginActions loginActions;




    String folderPath, cmd,filePath;

    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

  /*  @BeforeSuite
    public void logSuite() {
        System.getProperty(("user.dir") + "\\log4j.xml");
        //DOMConfigurator.configure("log4j.xml");
    } */
    public String allurePathWin = System.getProperty("user.dir") + "\\allure-2.13.6\\bin\\allure.bat";

    public static Properties prop,configProp,appProp;

    public void property() throws IOException, InterruptedException {
        if (this.getClass().getCanonicalName().contains("LoginTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/login.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateUnit")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createunitQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CounterSale")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/countersaleQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateCustomer")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createcustomerQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateVendor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createvendorQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateRoTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/config.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/submitanestimateservicemanagerQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/setupworkrequired.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerchangecustomerpoafterinvoicingQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unitfunctionality.properties";
        }
        else if (this.getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/journalizepartsinvoiceQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("TechWoLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwolaborQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("TechWoParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/techwopartsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/addremove.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerwolaborQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/NonRepairBills.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerinvoiceQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approvenonrepair.properties";
        }
        else if (this.getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/wocompliance.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerjournalizeQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/redtag.properties";
        }
        else if (this.getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/unithistory.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/approveanestimatedms.properties";
        }
        else if (this.getClass().getCanonicalName().contains("cGVTechPerformPM")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/cgvtechperformpmQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/performtheworkonanestimate.properties";
        }
        else if (this.getClass().getCanonicalName().contains("Spotorderparts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/spotorderpartsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CreatePart")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/createpartQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ReceiveParts")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/receivepartsQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/servicemanagerpartsrelatedtasksQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("SplitRoLocation")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/splitrolocationQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("AddaFabricatedPartToaClosedWorkorder")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/AddafabricatedparttoaclosedworkorderQA.properties";
        }
        else if (this.getClass().getCanonicalName().contains("CustomerProofNotesIssue")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/customerproofnotesissueQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("Reports")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/reportsQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("UOMforpressureonInspectionInformationAllowed")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/uomforpressureoninspectioninformationallowedQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("TransitonedPaccar")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/transitonedpaccarQA.properties";
        }
        else if(this.getClass().getCanonicalName().contains("NonIcCompletedAndWorkFine")) {
            filePath = System.getProperty("user.dir") + "/src/test/java/utils/noniccompletedandworkfineQA.properties";
        }

    }


        /* try {
            prop = new Properties();
            FileInputStream fip = new FileInputStream(filePath);
            try {
                prop.load(fip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }   */



    /**
     * Initialization of Framework
     */

    @BeforeClass(alwaysRun = true)
    public void initialization() throws IOException, InterruptedException {


  //      property();


        String browserName = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForBrowser, SheetConstants.browserRowNumber);

//        System.getProperty(("user.dir") +"\\log4j.xml");
//        DOMConfigurator.configure("D:\\intellij\\latest_OfficeWork\\WorkingProject\\Emdecs_Test_Automation\\log4j.xml");

        if (browserName.equalsIgnoreCase(browserName)) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("plugins.plugins_disabled", new String[] { "Chrome PDF Viewer" });
            chromePrefs.put("plugins.always_open_pdf_externally", true);
            chromePrefs.put("download.prompt_for_download", false);
            chromePrefs.put("download.default_directory", System.getProperty("user.dir")+"\\downloadFiles");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--start-maximized");
            //options.addArguments("--headless=new");
            options.addArguments("--window-size=1366,768");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--always-authorize-plugins");
            options.addArguments("enable-automation");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-extensions");
            options.addArguments("--allow-running-insecure-content");
            options.setExperimentalOption("prefs", chromePrefs);
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(options);
            //  driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().maximize();



        } else if (browserName.equalsIgnoreCase("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        LoginActions loginActions = new LoginActions();
         if(LoginActions.environmentName.contains("QA")||LoginActions.environmentName.contains("EU")||LoginActions.environmentName.contains("EC")||LoginActions.environmentName.contains("NA")) {

             driver.get(loginActions.getAppUrl1(getMyClassName()));    //new method Akash kadam
         }else{
              driver.get(loginActions.getAppUrl());      //old method
         }


  //      loginPage.selectCountryFromDropDown();


//         driver.manage().timeouts().pageLoadTimeout(timeUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//         driver.manage().timeouts().implicitlyWait(timeUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        createRoPage = PageFactory.initElements(driver, CreateRoPage.class);
        createUnitPage = PageFactory.initElements(driver, CreateUnitPage.class);
        vendorsPage = PageFactory.initElements(driver, CreateVendorPage.class);
        customerPage = PageFactory.initElements(driver, CreateCustomerPage.class);
        counter = PageFactory.initElements(driver, CounterSalePage.class);
        relatedItem = PageFactory.initElements(driver, CreatePart.class);
       // order = PageFactory.initElements(driver, SpotOrderParts.class);
        setUp = PageFactory.initElements(driver,SetUpWorkRequired.class);
        update = PageFactory.initElements(driver, ECServiceManager_ChangeCustomerPOafterInvoicing.class);
        unit = PageFactory.initElements(driver, InquireFXG_UnitHistory.class);
        journalize = PageFactory.initElements(driver, JournalizePartsInvoice.class);
        labor = PageFactory.initElements(driver, EC_Tech_WoLabor.class);
        part = PageFactory.initElements(driver, EC_Tech_WoParts.class);
        addRemove = PageFactory.initElements(driver, ECServiceManager_AddRemoveLabor.class);
        servicelabor = PageFactory.initElements(driver, ServiceManagerWoLabor.class);
        nonrepairbills = PageFactory.initElements(driver, CreateNonRepairBill_ServiceManager.class);
        wocompliance = PageFactory.initElements(driver, cGVTech_WoCompliance.class);
        completeropage = PageFactory.initElements(driver, ECService_Manager_Invoice.class);
        servicemanagerpartsrelatedtasks= PageFactory.initElements(driver, ServiceManagerPartsRelatedTasks.class);
        approveNonRepairBill = PageFactory.initElements(driver, pages.nonrepair.ApproveNonRepairBill_DMS.class);
        journalizepage = PageFactory.initElements(driver, ECServiceManager_Journalize.class);
        redtag = PageFactory.initElements(driver,CreateRedTagDMS.class);
        unithistorypage = PageFactory.initElements(driver, pages.cGVUnitFunctionality.InquireFXG_UnitHistory.class);
        approveanestimatedmspage = PageFactory.initElements(driver, ApproveanEstimateDMSPage.class);
        pmworkorderworkflowpage = PageFactory.initElements(driver, cGVTechPerformPM.class);
        performtheworkonanestimatepage = PageFactory.initElements(driver, PerformTheWorkOnAnEstimateTech.class);
        spotorderparts = PageFactory.initElements(driver,Spotorderpart.class);
        journalizecountersale = PageFactory.initElements(driver, JournalizeCounterSale.class);
        receivepart= PageFactory.initElements(driver, ReceivePart.class);
        submitanestimateservicemanager=PageFactory.initElements(driver, SubmitAnEstimateServiceManager.class);
        issueparttotech = PageFactory.initElements(driver, IssuePartToTech.class);
        pauselabor = PageFactory.initElements(driver,PauseLabor.class);
        splitRoLocation = PageFactory.initElements(driver,SplitRoLocation.class);
        addafabricatedparttoaclosedworkorder = PageFactory.initElements(driver, AddaFabricatedPartToaClosedWorkorder.class);
        customerProofNotesIssue = PageFactory.initElements(driver, CustomerProofNotesIssue.class);
        reportsPage = PageFactory.initElements(driver,ReportsPage.class);
        unitinspectioninformation = PageFactory.initElements(driver, UOMforpressureonInspectionInformationAllowed.class);
        nonIcCompletedAndWorkFine = PageFactory.initElements(driver,NonIcCompletedAndWorkFine.class);
        location = PageFactory.initElements(driver,TransitonedPaccar.class);
        overRideTaxes = PageFactory.initElements(driver,OverRideTaxesCauseOtherTaxDisappear.class);



        loginPage.selectCountryFromDropDown();

        property();

        configProp  = new Properties();
        FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/utils/config.properties");
        try {
            configProp.load(fip);
        } catch (IOException e) {
            e.printStackTrace();
        }

 /*       if(getClass().getCanonicalName().contains("LoginTest")){
            LoginActions loginActions = new LoginActions();
            driver.get(loginActions.getAppUrl());
            loginPage.selectCountryFromDropDown();
        }
        else{
         //   loginToSystem();
        }  */



    }


 /*   public void loginToSystem() throws InterruptedException, IOException {
        LoginActions loginActions = new LoginActions();

        driver.get(loginActions.getAppUrl());

//        loginPage.enterUserName(loginActions.getUserCredentials()[0]);
//        loginPage.enterPassword(loginActions.getUserCredentials()[1]);

        loginPage.selectCountryFromDropDown();
//        loginPage.enterUserName("c2357service2");
//        loginPage.enterPassword("Password");

         loginPage.enterUserName(username);
         loginPage.enterPassword(password);

//        loginPage.enterUserName((configProp.getProperty("username")));
//        loginPage.enterPassword((configProp.getProperty("password")));

        loginPage.clickLoginButton();
        Thread.sleep(8000);


    }   */


    /**
     * It generates test execution report in Html Format (Including Test steps, Screenshots and Pass/Fail Status)
     */
    public void generateHtmlReport() {


    }

    /**
     * Quit Browser after all execution completed
     */

    public void emptyResults() {
        try {
            for (File file : new java.io.File(System.getProperty("user.dir") + "/allure-results").listFiles())
                if (!file.isDirectory()) {
                    file.delete();
                }
        } catch (Exception E) {

        }
    }

    @AfterSuite(alwaysRun = true)
    public void generateAllure() throws Exception {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");
        String currentDateTime = format.format(date);
      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        } */
        if (getClass().getCanonicalName().contains("CreateRoTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRoTestReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateUnit")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateUnitReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateVendor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateVendorReports/" + "__" + currentDateTime;
        }
         else if (getClass().getCanonicalName().contains("CreateCustomer")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateCustomerReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CounterSale")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CounterSaleReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("LoginTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/LoginTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimate_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SetUpWorkRequiredTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerChangeCustomerPOafterInvoicingReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("InquireFXG_UnitHistoryTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/InquireFXG_UnitHistoryTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizePartsInvoiceReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TechWoParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TechWoPartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ECServiceManager_AddRemoveLaborTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerWoLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateNonRepairBill_ServiceManagerTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTech_WoComplianceTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerInvoiceReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBillTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UnitMasterTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerJournalizeReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreateRedTagDMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ApproveNonRepairBill_DMSTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("cGVTechPerformPM")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/cGVTechPerformPMReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PerformTheWorkOnAnEstimateTechTestReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("JournalizeCounterSale")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/JournalizeCounterSaleReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ServiceManagerPartsRelatedTasksReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SubmitAnEstimateServiceManagerReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Spotorderparts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SpotorderpartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("ReceiveParts")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReceivePartsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CreatePart")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CreatePartReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("IssuePartToTech")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/IssuePartToTechReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("PauseLabor")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/PauseLaborReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("SplitRoLocation")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/SplitRoLocation/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("AddaFabricatedPartToaClosedWorkorder")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/AddaFabricatedPartToaClosedWorkorder/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("CustomerProofNotesIssue")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/CustomerProofNotesIssue/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("Reports")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/ReportsReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("UomforpressureonInspectionInformationAllowed")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/UomforpressureonInspectionInformationAllowedReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("TransitonedPaccar")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/TransitonedPaccarReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("NonIcCompletedAndWorkFine")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/NonIcCompletedAndWorkFineReports/" + "__" + currentDateTime;
        }
        else if (getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
            folderPath = System.getProperty("user.dir") + "/allure-results/Reports/OverRideTaxesCauseOtherTaxDisappearReports/" + "__" + currentDateTime;
        }




        File theDir = new File(folderPath);

            // if the directory does not exist, create it

            if (!theDir.exists()) {
                System.out.println("creating directory: " + theDir.getName());
                boolean result = false;
                try {
                    theDir.mkdirs();
                    result = true;
                } catch (SecurityException se) {
                    // handle it
                    System.out.println(se.getMessage());
                }
                if (result) {
                    System.out.println("Folder created");
                }
            } else if (theDir.exists()) {
                System.out.println("Folder exist");
            }

      /*  if (getClass().getCanonicalName().contains("CreateRoTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
        } */
            if (getClass().getCanonicalName().contains("CreateRoTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRoTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateUnit")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateUnitReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateVendor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateVendorReports\\" + theDir.getName();
            }
             else if (getClass().getCanonicalName().contains("CreateCustomer")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateCustomerReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CounterSale")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CounterSaleReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("LoginTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\LoginTestReports\\" +theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimate_ServiceManagerTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimate_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SetUpWorkRequiredTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SetUpWorkRequiredTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerChangeCustomerPOafterInvoicing")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerChangeCustomerPOafterInvoicingReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizePartsInvoice")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizePartsInvoiceReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TechWoParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TechWoPartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ECServiceManager_AddRemoveLaborTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ECServiceManager_AddRemoveLaborTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerWoLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerWoLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateNonRepairBill_ServiceManagerTest")) {
            cmd = allurePathWin + " generate" + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateNonRepairBill_ServiceManagerTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerInvoice")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerInvoiceReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBillTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBillTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UnitMasterTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UnitMasterTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTech_WoComplianceTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTech_WoComplianceTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerJournalize")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerJournalizeReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreateRedTagDMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreateRedTagDMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ReceiveParts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReceivePartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ApproveNonRepairBill_DMSTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ApproveNonRepairBill_DMSTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("cGVTechPerformPM")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\cGVTechPerformPMReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PerformTheWorkOnAnEstimateTechTest")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PerformTheWorkOnAnEstimateTechTestReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("JournalizeCounterSale")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\JournalizeCounterSaleReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("ServiceManagerPartsRelatedTasks")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ServiceManagerPartsRelatedTasksReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SubmitAnEstimateServiceManager")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SubmitAnEstimateServiceManagerReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Spotorderparts")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SpotorderpartsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CreatePart")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CreatePartReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("IssuePartToTech")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\IssuePartToTechReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("PauseLabor")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\PauseLaborReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("SplitRoLocation")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\SplitRoLocation\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("AddaFabricatedPartToaClosedWorkorder")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\AddaFabricatedPartToaClosedWorkorder\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("CustomerProofNotesIssue")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\CustomerProofNotesIssue\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("Reports")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\ReportsReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("UomforpressureonInspectionInformationAllowed")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\UomforpressureonInspectionInformationAllowedReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("TransitonedPaccar")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\TransitonedPaccarReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("NonIcCompletedAndWorkFine")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\NonIcCompletedAndWorkFineReports\\" + theDir.getName();
            }
            else if (getClass().getCanonicalName().contains("OverRideTaxesCauseOtherTaxDisappear")) {
                cmd = allurePathWin + " generate " + " " + System.getProperty("user.dir") + "\\allure-results -o" + " " + System.getProperty("user.dir") + "\\allure-results\\Reports\\OverRideTaxesCauseOtherTaxDisappearReports\\" + theDir.getName();
            }


        System.out.println("Before Report Process");
                System.out.println("This is CMD : " + cmd);
                Process process = Runtime.getRuntime().exec(cmd);
                Thread.sleep(5000);
                System.out.println("Generating Report");
                process.waitFor(60, TimeUnit.SECONDS);
                System.out.println("After Report Process");
                Thread.sleep(5000);
                System.out.println("End Time: " + WaitActions.getWaits().getDateTime());
                emptyResults();

            }

    /** new method Akash */
    public  String  getMyClassName() {

        return this.getClass().getSimpleName();  //To get  Current className
    }


           @AfterMethod(alwaysRun = true)
           public void afterMethodTakeScreenShot(ITestResult result) {
           TestListener.saveScreenshotPNG(driver);

           }


 /*   public static class Log {
        //Initialize Log4j instance
        private static Logger Log = Logger.getLogger(TestDriverActions.Log.class.getName());

        //Info Level Logs
        public static void info(String message) {
            Log.info(message);
        }

        //Error Level Logs
        public static void error(String message) {
            Log.error(message);
        }
    }     */



        /*   @AfterTest(alwaysRun = true)
            public void tearDown () {
                   driver.quit();
            }  */
        }
