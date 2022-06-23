package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_Actions_HoverOver {
    @Test

    public void googleActionsHoverTest(){
//1. Go to www.google.com
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

//2. Hover over search button
        Actions action = new Actions(Driver.getDriver());
        WebElement searchButton = Driver.getDriver().findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
        action.moveToElement(searchButton).perform();

//3. Hover over on Felling Lucky button
        WebElement iAmFeelingLucky = Driver.getDriver().findElement(By.id("gbqfbb"));
        action.moveToElement(iAmFeelingLucky).perform();



    }
}

/*
1. Go to www.google.com

2. Hover over search button

3. Hover over on Felling Lucky button

 */