package com.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.example.utils.ExtentReportManager;
import com.example.utils.Log;

public class BaseTest1 {
        protected WebDriver driver;
        protected static ExtentReports extent;
        protected ExtentTest test;

        @BeforeSuite
        public void setupReport(){
             extent = ExtentReportManager.getReportInstance();
        }

        @AfterSuite
        public void teardownReport(){
            extent.flush();
        }

        @BeforeMethod
        public void setUp() {           
            driver = new ChromeDriver();
            Log.info("opening url");
            driver.get("https://admin-demo.nopcommerce.com/login");
            Log.info("maximizing the window");
            driver.manage().window().maximize();
        }
    
        @AfterMethod
        public void tearDown(ITestResult result) {

            if(result.getStatus()==ITestResult.FAILURE){
                String screenshotPath = ExtentReportManager.captureScreenshot(driver, "Login Failure");
                test.fail("Test failed...check the screenshot",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            }
            if (driver != null) {
                Log.info("quitting url");
                driver.quit();
            }
        }
    }
