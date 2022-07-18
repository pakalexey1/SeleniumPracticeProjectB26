package com.cydeo.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFrame {
    @Test
    public void iFrameTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //- Open "http://practice.cybertekschool.com/nested_frames"
        driver.get("http://practice.cybertekschool.com/nested_frames");

        //- Switch to middle frame
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
//        - Switch to right frame
        WebElement middleFrameText = driver.findElement(By.id("content"));
        Assert.assertEquals(middleFrameText.getText(),"MIDDLE");
        driver.switchTo().parentFrame();

//        - Switch to right frame
//        - Verify text is equal "RIGHT"

        driver.switchTo().frame("frame-right");
        WebElement rightFrameText = driver.findElement(By.xpath("//body[contains(text(),\"RIGHT\")]"));
        Assert.assertEquals(rightFrameText.getText(),"RIGHT");
        driver.switchTo().defaultContent();

//        - Switch to bottom frame
//        - Verify text is equal "BOTTOM"
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrameText = driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]"));
        Assert.assertEquals(bottomFrameText.getText(),"BOTTOM");

    }
}
/*
Task 2
            - Open "http://practice.cybertekschool.com/nested_frames"
            - Switch to middle frame
            - Verify text is equal "MIDDLE"
            - Switch to right frame
            - Verify text is equal "RIGHT"
            - Switch to bottom frame
            - Verify text is equal "BOTTOM"
 */