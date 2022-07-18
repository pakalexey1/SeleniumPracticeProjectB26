package com.cydeo.practice.mehmet;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW02 {

    @Test
    public void test02(){
//        - Go to  "http://automationpractice.com/index.php"
        Driver.getDriver().get("http://automationpractice.com/index.php");

//        - Hover over on Dresses button
        Actions actions = new Actions(Driver.getDriver());
        WebElement dressesBtn = Driver.getDriver().findElement(By.linkText("DRESSES"));
        actions.moveToElement(dressesBtn).perform();

        //       - Verify following subCategories are displayed
//
//    Casual Dresses
//    Evening Dresses
//    Summer Dresses

        WebElement casualDresses = Driver.getDriver().findElement(By.xpath("(//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='Casual Dresses'])[2]"));

        WebElement eveningDresses = Driver.getDriver().findElement(By.xpath("(//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='Evening Dresses'])[2]"));
        WebElement summerDresses = Driver.getDriver().findElement(By.xpath("(//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='Summer Dresses'])[2]"));

        Assert.assertTrue(casualDresses.isDisplayed());
        Assert.assertTrue(eveningDresses.isDisplayed());
        Assert.assertTrue(summerDresses.isDisplayed());



    }

}

//    Task 1
//
//
//       - Hover over on Dresses button
//       - Verify following subCategories are displayed
//
//    Casual Dresses
//    Evening Dresses
//    Summer Dresses