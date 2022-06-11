package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Iframe_CRM_AppreciationTest extends TestBase {

    @Test
    public void sendingAppreciationMsg() throws InterruptedException {
        //2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");

        //3- Login Homepage ( Login with valid username and password)
//        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk29@cybertekschool.com");
//        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
//        driver.findElement(By.xpath("//input[@class='login-btn']")).click();

        CRM_Utilities.login_crm(driver,"hr1@cydeo.com","UserUser");

        //4- Click the MORE tab and select APPRECIATION
        driver.findElement(By.cssSelector("span[id*='feed-add-post-form-link-m']")).click();
        driver.findElement(By.xpath("//span[.='Appreciation'][@class='menu-popup-item-text']")).click();

        //5- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Test Message 456");
        driver.switchTo().parentFrame();
        Thread.sleep(5000);

        //6- Click the SEND button
        driver.findElement(By.id("blog-submit-button-save")).click();
        Thread.sleep(5000);

        //7- Verify the Appreciation message is displayed on the feed
        WebElement confirmMessage = driver.findElement(By.xpath("//div[.='Test Message 456']"));
        String actualMessage = confirmMessage.getText();
        String expectedMessage = "Test Message 456";
        Assert.assertEquals(actualMessage,expectedMessage,"Message is not found or doesn't match!");



    }
}


/*
1- Open a chrome browser
2- Go to: https://login2.nextbasecrm.com/
3- Login Homepage ( Login with valid username and
password)
4- Click the MORE tab and select APPRECIATION
5- Write an Appreciation message
6- Click the SEND button
7- Verify the Appreciation message is displayed on the feed
 */