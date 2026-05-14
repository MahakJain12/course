package com.example.tests;

import org.testng.annotations.Test;

import com.example.base.BaseTest1;
import com.example.pages.LoginPage1;

public class LoginTest1 extends BaseTest1 {

    @Test
    public void testValidLogin() {

        LoginPage1 loginPage = new LoginPage1(driver);
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLoginButton();
        System.out.println("Title is : " + driver.getTitle());
    }
}
