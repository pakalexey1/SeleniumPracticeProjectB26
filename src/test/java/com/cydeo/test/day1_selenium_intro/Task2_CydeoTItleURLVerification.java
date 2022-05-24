package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoTItleURLVerification {

    public static void main(String[] args) {

        //1- Setup webDriver manager
        WebDriverManager.chromedriver().setup();

        //2- Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //3- Maximize browser window
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        String expectedUrl = "cydeo";// it comes from requirements
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification passed");
        } else {
            System.out.println("URL verification failed");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

        driver.close();
    }
}


/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice

 */