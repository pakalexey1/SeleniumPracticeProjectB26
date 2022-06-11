package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRM_Utilities {
    /*
    Method 1 info:
    - Name: login_crm()
    - Return type: void
    - Arg1: WebDriver
     */
    public static void login_crm(WebDriver driver) {
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk1@cybertekschool.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
    }

    /*
    Method 2 info:
    - Name: login_crm()
    - Return type: void
    - Arg1: WebDriver
    - Arg2: String username
    - Arg3: String password
     */
    public static void login_crm(WebDriver driver, String username, String password) {
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
                driver.findElement(By.xpath("//input[@class='login-btn']")).click();
    }
}