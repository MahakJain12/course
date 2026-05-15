package com.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.example.utils.Log;

public class BaseTest1 {
        protected WebDriver driver;
    
        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            Log.info("opening url");
            driver.get("https://admin-demo.nopcommerce.com/login");
            driver.manage().window().maximize();
        }
    
        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                Log.info("quitting url");
                driver.quit();
            }
        }
    }
