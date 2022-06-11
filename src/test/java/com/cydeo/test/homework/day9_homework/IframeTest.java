package com.cydeo.test.homework.day9_homework;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest extends TestBase {
    @Test
    public void iframeTest() throws InterruptedException {
        driver.get("https://login2.nextbasecrm.com/");

//        1.  Users are on the homepage (Login with valid username and password)
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk1@cybertekschool.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        2.  Users click the MESSAGE tab
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();

//        3.  Users write test message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Test message");

//        4.  Users click the SEND button
        driver.switchTo().parentFrame();
        driver.findElement(By.id("blog-submit-button-save")).click();
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("blog_post_body_7155")));

        WebElement message = driver.findElement(By.xpath("//div[.='Bla']"));
        String actualMessage = message.getText();

        String expectedMessage = "Test message";

        Assert.assertEquals(actualMessage,expectedMessage);




    }
}


/*
Test cases #1
Description:  Users send text messages successfully
Environment:  https://login2.nextbasecrm.com/
Steps::
1.  Users are on the homepage (Login with valid username and password)
2.  Users click the MESSAGE tab
3.  Users write test message
4.  Users click the SEND button
5.  Verify the message is displayed on the feed

 */