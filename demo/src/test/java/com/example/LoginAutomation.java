package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");    
        System.out.println("Title is : "+driver.getTitle());
        WebElement email = driver.findElement(By.id("Email"));
        email.clear();
        email.sendKeys("admin@yourstore.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.clear();
        password.sendKeys("admin");
        driver.findElement(By.cssSelector("span.password-eye"));
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")).click();
        driver.quit();
        }
}
