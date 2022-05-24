package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {
    public static void main(String[] args) throws InterruptedException {

        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        // 3- make any browser opened via WebDriver maximized
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        //navigate().to() method is for navigating to a web Page
        //driver.navigate().to("https://www.etsy.com");

        // Used for stopping application. We are giving time to an application to see steps
        Thread.sleep(300);

        // navigate().back() method is for navigating to back from web page
        driver.navigate().back();

        Thread.sleep(300);

        // navigate().back() method is for navigating to back from web page
        driver.navigate().forward();

        Thread.sleep(300);

        // navigate().refresh() method is for refreshing the page
        driver.navigate().refresh();

        // driver.getTitle() is extracting the Title
        System.out.println("Etsy page title : " + driver.getTitle());

        //get current page's URL
        System.out.println("etsy page URL: " + driver.getCurrentUrl());

        driver.get("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());

        System.out.println("Tesla page URL: " + driver.getCurrentUrl());

        //closes the current tab
        driver.close();

        //closes all of the pages/tabs
        //driver.quit();

    }
}
