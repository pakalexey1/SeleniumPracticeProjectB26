package com.cydeo.test.homework.day12_homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FindLatestNews {

    @Test
    public void testTechCrunch(){

        //1- Go to https://techcrunch.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techcrunch.com/");

        ////            2- For “The Latest News” list, verify followings;
        ////    a. each news has an author

//        List<WebElement> articles = driver.findElements(By.xpath("//h2[@class='post-block__title']/a[@class='post" +
//                "-block__title__link']"));
//
//        List<WebElement> authors = driver.findElements(By.xpath("//span[@class='river-byline__authors']"));

        Map<WebElement,WebElement> articleAuthor = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            articleAuthor.put(driver.findElement(By.xpath("(//h2[@class='post-block__title']/a[@class='post-block__title__link'])["+i+"]")), driver.findElement(By.xpath("(//span[@class='river-byline__authors'])["+i+"]")) );
        }






    }
}

/*
//    Using any test automation framework, Java language (except record/play tools) and Maven dependency management, please do following:
//            1- Go to https://techcrunch.com/
//            2- For “The Latest News” list, verify followings;
//    a. each news has an author
//    b. each news has an image
//    3- Click one of news from “The Latest News” list to reach the full content and verify followings;
//    a. the browser title is the same with the news title
//    b. the links within the news content
 */