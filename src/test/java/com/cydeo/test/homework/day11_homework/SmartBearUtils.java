package com.cydeo.test.homework.day11_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartBearUtils {
final static String URL  = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
final static String USERNAME ="Tester";
final static String PASSWORD = "test";

    public static void SmartBearLogin (WebDriver driver){
        driver.get(URL);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(USERNAME);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(PASSWORD);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

}

/*
Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter

 */