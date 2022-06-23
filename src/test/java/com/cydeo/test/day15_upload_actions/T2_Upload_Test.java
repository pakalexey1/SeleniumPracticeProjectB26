package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Test {
    @Test
    public void upload_file_test() throws InterruptedException {
//    1. Go to “https://demo.guru99.com/test/upload”
        Driver.getDriver().get(ConfigurationReader.getProperty("target.url"));

//    2. Upload file into Choose File
        String filePath = "D:\\My Documents\\Cydeo\\HTML\\Class 2\\sta-je-html.jpg";
        Driver.getDriver().findElement(By.id("uploadfile_0")).sendKeys(filePath);

//    3. Click terms of service checkbox
        Driver.getDriver().findElement(By.id("terms")).click();

//    4. Click Submit File button
        Driver.getDriver().findElement(By.id("submitbutton")).click();

//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
        Thread.sleep(5000);
        String expectedMessage = "1 file\nhas been successfully uploaded.";
        String actualMessage = Driver.getDriver().findElement(By.id("res")).getText();

        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage,expectedMessage,"Didn't work");

    }
}

/*
//    1. Go to “https://demo.guru99.com/test/upload”
//    2. Upload file into Choose File
//    3. Click terms of service checkbox
//    4. Click Submit File button
//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
 */