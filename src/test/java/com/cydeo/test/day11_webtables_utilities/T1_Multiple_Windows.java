package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T1_Multiple_Windows extends TestBase {

    @Test
    public void multipleWindows() {
        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com/','_blank');");

//        Set<String> allWindowHandles = driver.getWindowHandles();
//
//        for (String eachWindow : allWindowHandles) {
//
//            driver.switchTo().window(eachWindow);
//            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//
//            if (driver.getCurrentUrl().contains("etsy")) {
//                break;
//            }
//        }
//
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Etsy";
//        Assert.assertTrue(actualTitle.contains(expectedTitle),"Titles do not match");

        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");

    }
}




/*
TC #2: Window Handle practice
1. Createnewtestandmakesetups
2. Goto:https://www.amazon.com/
3. Copypastethelinesfrombelowintoyourclass
4. CreatealogictoswitchtothetabwhereEtsy.comisopen
5. Assert:Titlecontains“Etsy”
Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com/%27,%27_blank%27);%22); ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com/%27,%27_blank%27);%22); ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com/%27,%27_blank%27);%22);
These lines will simply open new tabs using something called JavascriptExecutor and get those pages. We will learn JavascriptExecutor later as well.
 */