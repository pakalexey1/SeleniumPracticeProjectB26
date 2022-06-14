package com.cydeo.test.homework.day11_homework;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBear extends TestBase {
    @Test
    public void linkVerification(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        /*
        3. Enter username: “Tester”
        4. Enter password: “test”
        5. Click to Login button
         */
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("There are " + allLinks.size()+ " links on the landing page");

        //7. Print out each link text on this page
        for (WebElement eachLink : allLinks){
            System.out.println(eachLink.getText());
        }



    }

}
/*
TC #1: Smartbear software link verification
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page

 */