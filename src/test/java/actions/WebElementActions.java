package actions;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import tests.TestDriverActions;

import java.util.List;
import java.util.Random;
import java.util.Set;


import static tests.TestDriverActions.driver;




public class WebElementActions extends TestDriverActions {

    private static WebElementActions instanceElement;
    protected JavascriptExecutor jsExecutor;
    String parentWindowHandle;
    String title;

    public static synchronized WebElementActions getActions() {
        if (instanceElement == null) {
            instanceElement = new WebElementActions();
        }
        return instanceElement;
    }

    /**
     * Use this method to input text into text box, rich text box etc.
     *
     * @param element
     * @param text
     */
    public void inputText(WebElement element, String text) throws InterruptedException {
//        WaitActions.getWaits().WaitUntilWebElementIsVisible(element);
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(element);
        Thread.sleep(2000);
        element.clear();
//        Thread.sleep(2000);
        element.sendKeys(text);
    }



    /**
     * Use this method to click on any clickable element. i.e. button
     *
     * @param element
     */
    public void clickElement(WebElement element) throws InterruptedException {
        //WaitActions.getWaits().WaitUntilWebElementIsVisible(element);
        //       WaitActions.getWaits().waitForElementTobeClickable(element);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(element);
        Thread.sleep(2000);
        element.click();
    }

    /**
     * Click on element using action class
     *
     * @param element
     */
    public void clickUsingActions(WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();
    }

    /**
     * move to horizontally using action class
     */
    public void moveOnTargetElement(WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }
    /**
     * Switch to child window from the parent
     */
/*    public void switchToChildWindow() {
        parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String i : allWindowHandles) {
            title = driver.switchTo().window(i).getTitle();
            System.out.println(title);
        }
    }  */

    public void switchToChildWindow() {
        parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String i : allWindowHandles) {
            driver.switchTo().window(i);
        }
    }

    public void switchBackToParentWindow() throws InterruptedException {
        driver.close();
        driver.switchTo().window(parentWindowHandle);
    }

    public void uploadFile(WebElement element, String path) {
        element.sendKeys(System.getProperty("user.dir") + path);
    }

    public void switchToIFrame() {
        driver.switchTo().frame(0);
    }

    public void switchBackToDefault() {
        driver.switchTo().defaultContent();
    }

    public void clickUsingJS(WebElement element) {
        WaitActions.getWaits().WaitUntilWebElementIsVisible(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    /**
     * Scroll to the top of the page
     */
    public void scrollToTop() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    /**
     * Scroll to the end of the page
     */
    public void scrollToEnd() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }



    /**
     * Click on dropdown
     *
     * @return
     */
    public Select selectDropdown(WebElement element) {

        return new Select(element);
    }

    /**
     * select element from menu by using SelectByVisibilitytext
     */

    public void elementSelectByVisibilityText(WebElement element,String value)
    {
        Select sec = new Select(element);
        sec.selectByVisibleText(value);
    }

    public void closeAllWindow(List<String> hList,String parentWindowId)
    {

        for(String e : hList)
        {
            if(!e.equals(parentWindowId))
            {
                driver.switchTo().window(e).close();
            }
        }
    }

 /*   public static String readDataFromJsonFile(String fileName, String data) {
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) obj;
        return (String) jsonObject.get(data);
    }
*/

    /**
     * Generate random Number
     * @param low
     * @param high
     * @return
     */
    public int randomNumber(int low, int high){
        Random r = new Random();
        int result = r.nextInt((high - low) + 1) + low;
        return result;
    }

    /**
     * Generate random alphanumeric string
     *
     */

    public String randomAlphaNumeric(int n){
        Random r1 = new Random();
        String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(n);
        for(int i=0;i<n;i++)
        {
            int index = (int)(alphaNum.length()*Math.random());
            sb.append(alphaNum.charAt(index));
            //   sb.append(alphaNum.length()*Math.random());
        }
        return sb.toString();


    }
}

