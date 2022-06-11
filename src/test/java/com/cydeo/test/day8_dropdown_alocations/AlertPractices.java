package com.cydeo.test.day8_dropdown_alocations;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPractices {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    //Part 1
    @Test
    public void confirmAlertTest() {
//3. Click to “Click for JS Confirm” button
        WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        confirmAlertBtn.click();
//4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
//5.Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.id("result"));
        String actualResultText = resultText.getText();
        String expectedResultText = "You clicked: Ok";

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed");
        Assert.assertEquals(actualResultText,expectedResultText,"Result texts don't match!");
    }
    //Part 2

    @Test
    public void promtAlertTest(){
//        3. Click to “Click for JS Confirm” button
        WebElement jsPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPrompt.click();

//        4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

//        5. Click to OK button from the alert
        alert.accept();

//        6. Verify “You entered:  hello” text is displayed.
        WebElement youEnteredMessage = driver.findElement(By.id("result"));
        Assert.assertTrue(youEnteredMessage.isDisplayed(),"The message wasn't displayed");

        String actualText = youEnteredMessage.getText();
        String expectedText = "You entered: hello";

        Assert.assertEquals(actualText,expectedText,"Actual text doesn't match expected one");

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }



}
/*
Part1
TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

Part2
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.

 */