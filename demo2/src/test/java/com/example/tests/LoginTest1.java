package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.base.BaseTest1;
import com.example.pages.LoginPage1;
import com.example.utils.ExtentReportManager;
import com.example.utils.Log;

public class LoginTest1 extends BaseTest1 {

    @Test
    public void testValidLogin() {
        Log.info("Starting login test..");
        test = ExtentReportManager.createTest("Login Test");
       
        test.info("Navigating to URL");
        LoginPage1 loginPage = new LoginPage1(driver);
        test.info("adding credentials");
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        test.info("clicking on login button");
        loginPage.clickLoginButton();
        System.out.println("Title is : " + driver.getTitle());
        Log.info("checking title ");
        test.info("verifying the page title");
        Assert.assertEquals(driver.getTitle(),"Just a moment...");
        test.info("Login is successful");
    }

@Test
    public void testInvalidLogin(){
        Log.info("Starting login test..");
        test = ExtentReportManager.createTest("Login Test");
       
        test.info("Navigating to URL");
        LoginPage1 loginPage = new LoginPage1(driver);
        test.info("adding credentials");
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        test.info("clicking on login button");
        loginPage.clickLoginButton();
        System.out.println("Title is : " + driver.getTitle());
        Log.info("checking title ");
        test.info("verifying the page title");
        Assert.assertEquals(driver.getTitle(),"Just a momenbbbbjt...");
        test.info("Login is unsuccessful");

    }
}