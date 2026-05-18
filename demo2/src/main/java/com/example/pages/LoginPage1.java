package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.utils.Log;

public class LoginPage1 {
    private WebDriver driver;

    @FindBy(id="Email")
    WebElement usernameTextBox ;

    @FindBy(id="Password")
    WebElement passwordTextBox;                

    @FindBy(xpath="//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")
    WebElement loginButton;

    // private By usernameTextBox = By.id("Email");
    // private By passwordTextBox = By.id("Password");
    // private By loginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");

    public LoginPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username) {
       Log.info("Clearing the textbox");
        usernameTextBox.clear();
         Log.info("entering username");
         usernameTextBox.sendKeys(username);
    }

    public void enterPassword(String password) {
        Log.info("Clearing the textbox");
        passwordTextBox.clear();
        Log.info("entering password");
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton() {
        Log.info("clicking on Login button");
        loginButton.click();
    }
}

