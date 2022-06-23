package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_JSExecutor_Scroll {

    @Test
    public void etsyScrollTest() throws InterruptedException {
        // * Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

        //* Scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // js.executeScript("window.scrollBy(0,4500)"); //window.scrollBy(x,y) -> x moves right or left, and y moves up and down.

        WebElement emailArea = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",emailArea);

        // * Generate random email and enter into subscribe box
        Faker faker = new Faker();
        emailArea.sendKeys(faker.internet().emailAddress());

        // * Click on Subscribe
        Driver.getDriver().findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']")).click();

        Thread.sleep(3000);
        //* Verify "Great! We've sent you an email to confirm your subscription." is displayed
        String actualMessage = Driver.getDriver().findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']")).getText();
        String expectedMessage = "Great! We've sent you an email to confirm your subscription.";

        Assert.assertEquals(actualMessage,expectedMessage,"They don't match!");


    }
}




/*
 * Goto Etsy homepage
 * Scroll down
 * Generate random email and enter into subscribe box
 * Click on Subscribe
 * Verify "Great! We've sent you an email to confirm your subscription." is displayed
 */