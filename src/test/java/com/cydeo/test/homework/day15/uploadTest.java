package com.cydeo.test.homework.day15;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class uploadTest {
    @Test
    public void uploadTest() throws InterruptedException {
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice.url"));

        //2. Find some small file from your computer, and get the path of it.
        String filePath = "D:\\My Documents\\Cydeo\\HTML\\Class 2\\sta-je-html.jpg";

        //3. Upload the file.
        Driver.getDriver().findElement(By.xpath("//input[@id ='file-upload']")).sendKeys(filePath);
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//input[@id ='file-submit']")).click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement msg = Driver.getDriver().findElement(By.xpath("//h3"));
        Assert.assertTrue(msg.isDisplayed());

    }
}
/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
 */