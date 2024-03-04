package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import tests.TestDriverActions;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;


public class WaitActions extends TestDriverActions {
    public WebDriverWait wait;
    public JavascriptExecutor jsExecutor;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    private static WaitActions instance;


    public WaitActions() throws IOException {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));    //15


    }

    public static synchronized WaitActions getWaits() {
        if (instance == null) {
            try {
                instance = new WaitActions();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }


    /**
     * wait for webElement visible
     *
     * @param element
     * @return
     */
    public boolean WaitUntilWebElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(40))   //20
                .until(ExpectedConditions.visibilityOf(element));
        System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
        return true;
    }

    /**
     * wait for web List Element
     *
     * @param element
     * @return
     */
    public boolean WaitUntilWebElementIsVisible(List<WebElement> element) {
        new WebDriverWait(driver, Duration.ofSeconds(30))    // 10
                .until(ExpectedConditions.visibilityOfAllElements(element));
        System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
        return true;
    }

    /**
     * wait for element clickable
     *
     * @param element
     * @return
     */
    public boolean isElementClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
            System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
            return false;
        }
    }

    /**
     * wait for element to be clickable
     *
     * @param element
     * @return
     */
    public boolean waitForElementTobeClickable(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(40))  //20
                .until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
        return false;
    }

    /**
     * Page load time out using javascript
     */
    public void pageLoadTimeOutUsingJavaScript() {
        WebDriverWait jsWait = new WebDriverWait(driver, Duration.ofSeconds(60));  //60
        jsWait.until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    /**
     * Wait for loader with list web element
     *
     * @param element
     */
    public void loadingWait(WebElement element) {
        try {
            WebDriverWait loadWait = new WebDriverWait(driver, Duration.ofSeconds(15));  //15
            //waitForElementTobeClickable(element);
            loadWait.until(ExpectedConditions.invisibilityOf(element)); // wait for loader to disappear
        } catch (Exception e) {
        }
    }

    /**
     * Wait for loader with list web element
     *
     * @param element
     */
    public void loadingWait(List<WebElement> element) throws InterruptedException {
        int visibleCount = 0;
        while (element.size() == 0 && visibleCount < 2) {
            Thread.sleep(1000);
            visibleCount++;
        }
        if (element.size() > 0) {
            System.out.println("Loader is found by xpath : " + element);
            int invisibleCount = 0;
            while (element.size() != 0 && invisibleCount < 60) {   //60
                System.out.println("Entered in while loop");
                Thread.sleep(1000);
                invisibleCount++;
            }
        } else {
            System.out.println("Loader is not visible");
        }
    }

    public static boolean isClickable(WebElement webe) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));    // 5
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getDateTime() {

        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        // get current date time with Date()
        Date date = new Date();

        // Now format the date
        String currentDate = dateFormat.format(date);

        String newCurrentDate = currentDate.replace('/', '-');
        return newCurrentDate;

    }

    /**
     * Scroll till the top of the element
     * @param element
     **/
    public void scrollElementTillView(WebElement element){
        PageFactory.initElements(driver, this);
        WaitUntilWebElementIsVisible(element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * wait for element to be refresh and clickable
     * @param element
     */
    public static void waitForElementToBeRefreshedAndClickable(WebElement element) throws InterruptedException {
        try {
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));  //80
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
            Thread.sleep(2000);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

    }

    /**
     * wait for element to be refresh and visible
     * @param element
     */

    public static void waitForElementToBeRefreshedAndIsVisible(WebElement element) throws InterruptedException {
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
            Thread.sleep(3000);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

    }

    public void fluentWait(WebElement element, int timeOut) {
        Wait<WebDriver> wait = null;
        try {
            wait = new FluentWait<WebDriver>((WebDriver) driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(Exception.class);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception e) {
        }
    }


}

