package com.cydeo.test.day18_review;

import com.cydeo.pages.DynamicallyLoadedPage1;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadedTest1 {

    @Test
    public void dynamicallyLoadPage1(){
//        1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        DynamicallyLoadedPage1 dynamicallyLoadedPage1 = new DynamicallyLoadedPage1();

//        2. Click to start
        dynamicallyLoadedPage1.startBtn.click();

//        3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.loadingBar));

        BrowserUtils.waitForInvisibility(dynamicallyLoadedPage1.loadingBar);

//        4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicallyLoadedPage1.userName.isDisplayed());

//        5. Enter username: tomsmith
        dynamicallyLoadedPage1.userName.sendKeys("tomsmith");

//        6. Enter password: incorrectpassword
        dynamicallyLoadedPage1.password.sendKeys("incorrectpassword");

//        7. Click to Submit button
        dynamicallyLoadedPage1.submitBtn.click();

//        8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicallyLoadedPage1.errorMsg.isDisplayed());
    }
}
/*
1. Go to https://practice.cydeo.com/dynamic_loading/1
2. Click to start
3. Wait until loading bar disappears
4. Assert username inputbox is displayed
5. Enter username: tomsmith
6. Enter password: incorrectpassword
7. Click to Submit button
8. Assert “Your password is invalid!” text is displayed.
 */