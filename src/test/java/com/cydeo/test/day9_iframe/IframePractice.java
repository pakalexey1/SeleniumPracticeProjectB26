package com.cydeo.test.day9_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class IframePractice extends TestBase {

//1- Open a chrome browser - done via inheritance

    @Test
    public void iframeTest() throws InterruptedException {
//        2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

//        3- Clear text from comment body

                // we can use frame(id) method with id arg.
//        driver.switchTo().frame("mce_0_ifr");
//
//        //we can use frame (locator), e.g. xpath locator
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id = 'mce_0_ifr']")));

        //we can use index number
        //we can find iframe tags using html tags, e.g. "//iframe"
        driver.switchTo().frame(0); // the first index

        WebElement commentBody = driver.findElement(By.id("tinymce"));
        //Thread.sleep(100);
        //clear() method delete everything text form comment body.
        commentBody.clear();


//        4- Type "Hello World" in comment body
        commentBody.sendKeys("Hello World");

//        5- Verify "Hello World" text is written in comment body
        assertEquals(commentBody.getText(),"Hello World");

//        6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
        driver.switchTo().parentFrame(); // go back to the main HTML body
        WebElement headerText = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]"));
        assertTrue(headerText.isDisplayed(),"Header text didn't appear");

        String actualHeader = headerText.getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

        assertEquals(actualHeader,expectedHeader,"Header text did not appear correctly");

    }

}

/*
TC #6: Iframe Task
1- Open a chrome browser - done via inheritance
2- Go to: https://practice.cydeo.com/iframe
3- Clear text from comment body
4- Type "Hello World" in comment body
5- Verify "Hello World" text is written in comment body
6- Verify header "An iFrame containing the TinyMCE
WYSIWYG Editor" is displayed
 */