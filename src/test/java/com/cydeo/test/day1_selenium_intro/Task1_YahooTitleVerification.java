package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //1- Setting up webDriver manager
        WebDriverManager.chromedriver().setup();


        //2- Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //3- making any browser opened via WebDriver maximized
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        //actual title comes from selenium
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);

        //expected title comes from requirements
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed");
        }

        driver.close();
    }
}


/* TC1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
    Expected: Yahoo

 */