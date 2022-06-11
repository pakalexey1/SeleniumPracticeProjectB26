package com.cydeo.test.homework.vytrack;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02012 extends TestBase {
    @Test
    public void tc02012() throws InterruptedException {
        //1. Login into the website, the title is "Dashboard"
        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("storemanager79");
        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();
        Thread.sleep(25000);

        //2. Hover over the Fleet menu button
        //3. Click on the Vehicles option
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]")).click();
        //  Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();

        Thread.sleep(7000);

        //4. Verify the page's title is "All - Car - Entities - System - Car - Entities - System"
        String actualTitle = driver.getTitle();
        String expectedTitle = "All - Car - Entities - System - Car - Entities - System";

        Assert.assertEquals(actualTitle,expectedTitle,"Titles don't match!");

        //5. Click on "Create Car" button
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();
        Thread.sleep(5000);

        //6. Click on "Cancel" button
        driver.findElement(By.xpath("//a[@title='Cancel']")).click();
        Thread.sleep(7000);

        //7. Verify the page's title is "Car - Entities - System - Car - Entities - System"
        Assert.assertEquals(actualTitle,expectedTitle,"Titles don't match!");
        Thread.sleep(5000);

    }
}
/*
1. Login into the website, the title is "Dashboard"
2. Hover over the Fleet menu button
3. Click on the Vehicles option
4. Click on "Create Car" button
5. Click on "Cancel" button
6. Verify the page's title is "Car - Entities - System - Car - Entities - System"
 */