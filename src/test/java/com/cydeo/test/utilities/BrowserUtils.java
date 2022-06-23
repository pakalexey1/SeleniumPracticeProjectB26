package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles){
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl.toLowerCase())){
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed");
    }
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle,"Title verification failed");
    }
}

/*
TC : Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Multiple Windows logic re-usable
3. When method is called, it should switch window and verify
title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl (part of URL that will be checked if the actual URL contains it)
• Arg3: String expectedTitle (part of the Title that will be checked if the actual title contains it)
 */