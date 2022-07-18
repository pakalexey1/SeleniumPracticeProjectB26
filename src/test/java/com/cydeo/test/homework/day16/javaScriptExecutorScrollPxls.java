package com.cydeo.test.homework.day16;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class javaScriptExecutorScrollPxls {

    @Test
    public void javaScriptExecutor() throws InterruptedException {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/infinite_scroll

        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice.scroll"));

//        3- Use below JavaScript method and scroll
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("window.scrollBy(0,400)");

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,750)");
        }

//        b.  750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,-750)");
        }
    }

}

/*
TC #6: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/infinite_scroll
3- Use below JavaScript method and scroll
a.  750 pixels down 10 times.
b.  750 pixels up 10 times

JavaScript method to use : window.scrollBy(0,0)
 */