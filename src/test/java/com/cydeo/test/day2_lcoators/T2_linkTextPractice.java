package com.cydeo.test.day2_lcoators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        Thread.sleep(1000);

        //3- Click to A/B Testing from top of the list.
        WebElement linkABTesting = driver.findElement(By.linkText("A/B Testing"));
        linkABTesting.click();

        Thread.sleep(1000);

//        4- Verify title is:
//       Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification passed The actual title is: " + actualTitle + "\nthe expected title: " + expectedTitle);
        } else {
            System.out.println("Title verification failed. The actual title is: " + actualTitle + "\nthe expected " +
                    "title: " + expectedTitle);
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification passed The actual title is: " + actualTitle + "\nthe expected title: " + expectedTitle);
        } else {
            System.out.println("Title verification failed. The actual title is: " + actualTitle + "\nthe expected " +
                    "title: " + expectedTitle);
        }
        driver.quit();
    }
}


//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/
//        3- Click to A/B Testing from top of the list.
//        4- Verify title is:
//        Expected: No A/B Test
//        5- Go back to home page by using the .back();
//        6- Verify title equals:
//        Expected: Practice
//        ﻿