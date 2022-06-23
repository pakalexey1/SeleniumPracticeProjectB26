package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T2_Action_Scroll {

    @Test
    public void actions_scroll_test(){

//    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

//    3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.partialLinkText("CYDEO"));

//    4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();

//    1- Continue from where the Task 4 is left in the same test.
//    2- Scroll back up to “Home” link using PageUP button

        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        //actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform(); // don't use because it's hard to calculate where the scrolling stops
        actions.moveToElement(homeLink).perform();

    }
}
/*
//    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/
//    3- Scroll down to “Powered by CYDEO”
//    4- Scroll using Actions class “moveTo(element)” method

//    1- Continue from where the Task 4 is left in the same test.
//    2- Scroll back up to “Home” link using PageUP button
 */