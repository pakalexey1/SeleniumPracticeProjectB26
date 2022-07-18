package com.cydeo.test.homework.day16;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class javaScriptExecutorScrollToTarget {

    @Test
    public void jsScrollToTargetTest() throws InterruptedException {

//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice.large"));


        //        3- Scroll down to “Cydeo” link
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(cydeoLink));

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
        Thread.sleep(1000);

//        4- Scroll up to “Home” link
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        Thread.sleep(1000);

    }
}
/*
TC #7: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only

JavaScript method to use : arguments[0].scrollIntoView(true)

Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
 */