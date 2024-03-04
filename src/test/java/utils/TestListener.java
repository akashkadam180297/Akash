package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestDriverActions;


public class TestListener extends TestDriverActions implements ITestListener {
    public static String x;



    private static String GetTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public void onTestStart(ITestResult iTestResult) {}
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Method" + GetTestMethodName(iTestResult) + " Pass");
        if (driver instanceof WebDriver) {
            System.out.println("Screen captured for test case : " + GetTestMethodName(iTestResult) + ":Pass");
            saveScreenshotPNG(driver);
        }
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Method" + GetTestMethodName(iTestResult) + " Fail");
       // Object testClass = iTestResult.getInstance();
        if (driver instanceof WebDriver) {
            System.out.println("Screen captured for test case : " + GetTestMethodName(iTestResult) + ":Fail");
            saveScreenshotPNG(driver);
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {}

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {}
    public void onStart(ITestContext iTestContext) {}

    public void onFinish(ITestContext iTestContext) {}
}
