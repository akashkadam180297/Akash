package pages;

import actions.LoginActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class LoginPage extends TestDriverActions {
    Properties properties;

   // WebDriver driver;


    @FindBy(name = "username")
    public WebElement inputbox_Username;

    @FindBy(name = "password")
    public WebElement inputbox_Password;

    @FindBy(xpath = "//div[@id='signin']")
    public WebElement btn_Login;

    @FindBy(xpath = "//div[@role='menuitem']")
    public WebElement ddl_country;

    @FindBy(xpath = "//img[contains(@src,'flag-en_CA')]")
    public WebElement flag_CA;

    @FindBy(xpath = "//div[text()='Username or Password was not found!']")
    public WebElement error_Message;

    @FindBy(xpath = "//td[text()='Welcome, Shop Manager']")
    public WebElement shop_manager;

    @FindBy(xpath = "//img[contains(@src,'lg.gif')]")
    public WebElement loder_icon;

    @FindBy(xpath = "//h1[contains(.,'Signing In...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//div[@aria-label='English']")
    WebElement country_English;

    /**
     * Select Country from drop down
     */
    public void selectCountryFromDropDown() throws InterruptedException {
        WaitActions.getWaits().WaitUntilWebElementIsVisible(ddl_country);
        WebElementActions.getActions().clickElement(ddl_country);
        WaitActions.getWaits().WaitUntilWebElementIsVisible(flag_CA);
        WebElementActions.getActions().clickElement(flag_CA);
        WaitActions.getWaits().WaitUntilWebElementIsVisible(country_English);

    }


    /**
     * Enter Username
     *
     * @param userName
     */

    public void enterUserName(String userName) throws InterruptedException {
        Thread.sleep(3000);
        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        Thread.sleep(3000);
        WebElementActions.getActions().inputText(inputbox_Username, userName);

    }

    /**
     * Enter Password to login
     *
     * @param password
     */
    public void enterPassword(String password) throws InterruptedException {
        WebElementActions.getActions().inputText(inputbox_Password, password);


    }

    /**
     * Click on Login Button
     */
    public void clickLoginButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementTobeClickable(btn_Login);
        WebElementActions.getActions().clickElement(btn_Login);
    }

    /**
     * Enter wrong username
     * @param un
     */
    public void enterInvalidUsername(String un) throws InterruptedException {
        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Username);
        WebElementActions.getActions().inputText(inputbox_Username, un);
    }

    /**
     * Enter wrong password
     * @param pwd
     */
    public void enterInvalidPassword(String pwd) throws InterruptedException {
        WaitActions.getWaits().WaitUntilWebElementIsVisible(inputbox_Password);
        WebElementActions.getActions().inputText(inputbox_Password,pwd);
    }

    // WaitActions.getWaits().loadingWait(loder_icon);

    /**
     * login with invalid username and password
     */
    public void loginWithInvalidCredentials(String userName,String passWord) throws InterruptedException {
        enterInvalidUsername(userName);
        enterInvalidPassword(passWord);
        clickLoginButton();

        TestListener.saveScreenshotPNG(driver);
   }

    /**
     * Login with valid username and invalid password
     * @return
     * @throws InterruptedException
     */
  public void loginWithValidUsernameInvalidpassword(String userName,String passWord) throws InterruptedException {
      enterUserName(userName);
      enterInvalidPassword(passWord);
      clickLoginButton();

      TestListener.saveScreenshotPNG(driver);
  }

    /**
     * Login with valid username and valid password
     * @return
     * @throws InterruptedException
     */
  public void loginWithValidCredentials(String userName,String passWord) throws InterruptedException {
      enterUserName(userName);
      enterPassword(passWord);
  //    inputbox_Password.sendKeys(Keys.TAB);
      clickLoginButton();

      WaitActions.getWaits().loadingWait(loder);

 //     WaitActions.getWaits().pageLoadTimeOutUsingJavaScript();

      TestListener.saveScreenshotPNG(driver);
  }

  /* public void loginforKonaQaAndKonaEu() throws InterruptedException, IOException {
      //  public void loginforKonaQaAndKonaEu() throws InterruptedException, IOException {
     //  System.out.println("Before Username.....");
        //String envoirment = System.getProperty("browser", "chrome");
      //  String configFileName = "./%s-config.properties";
      //  String configFileName = System.getProperty("user.dir") + "/src/test/java/utils/spotorderpartsQA.properties";
       // String EnvironmentName = System.getProperty("url","qa");
        System.out.println("Before Username2.....");
       System.out.println("TestEnvironment: " + LoginActions.environmentName);
       // Check if the environmentName contains "spotorderpartskonaQA"
       if (LoginActions.environmentName.contains("spotorderpartskonaQA")) {
           // Use String.format to replace %s with the environment name in the file path
           String configFileName = String.format(
                   "%s/src/test/java/utils/%s.properties",
                   System.getProperty("user.dir"),
                   LoginActions.environmentName
           );

           System.out.println("Config File: " + configFileName);

           // Now configFileName contains the dynamic path based on the environment name
           // Use configFileName in the rest of your code...
       } else {
           // Handle other cases or provide a default configuration file name
           System.out.println("Unknown environment: " + LoginActions.environmentName);
       }

      }
         /* if (Appconfig.environmentName.contains("receviepartkonaeu")) {
              String configFileName = System.getProperty("user.dir") + "/src/test/java/utils/%s-config.properties";
              configFileName = String.format(configFileName,Appconfig.environmentName);
              //   System.out.println("configFileName"+ configFileName);
              properties = new Properties();
              properties.load(new FileInputStream(new File(configFileName)));
              //driver.get(properties.getProperty("url"));
          }
          */



        



    /**
     * Verify validation message
     * @param validationMessage
     * @return
     */
  public boolean assertMessage(String validationMessage)
  {
      WaitActions.getWaits().WaitUntilWebElementIsVisible(error_Message);
      return error_Message.getText().equals(validationMessage);
  }

    /**
     * Check that page title returns
     * @param pageTitle
     * @return
     */
  public boolean assertCheck(String pageTitle)
  {
      String Pagetitle = driver.getTitle();
      return Pagetitle.equals(pageTitle);
  }













}
