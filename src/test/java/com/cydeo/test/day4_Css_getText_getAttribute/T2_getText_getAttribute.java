package com.cydeo.test.day4_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_getText_getAttribute {
    @Test
    public void testT2_getText_getAttribute(){

       // TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form 3- Verify header text is as expected:
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //    Expected: Registration form
//        WebElement header = driver.findElement(By.tagName("h2"));
        WebElement header = driver.findElement(By.cssSelector("div[class='page-header']>h2"));
        String expectedHeader = "Registration form";
        String actualHeader = header.getText();


//        String resultHeaderTest = (expectedHeader.equals(actualHeader))?"Header test passed" : "Header test failed";
//        System.out.println(resultHeaderTest);

//        4- Locate "First name" input box
//        5- Verify placeholder attribute’s value is as expected: Expected: first name
        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        Assert.assertEquals(actualHeader,expectedHeader);
        Assert.assertEquals(actualPlaceHolder,expectedPlaceHolder);

//        String resultFirstNameInput = (expectedPlaceHolder.equals(actualPlaceHolder)) ? "Placeholder test passed" :
//                "Placeholder test failed";
//        System.out.println(resultFirstNameInput);



        driver.quit();
    }
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form 3- Verify header text is as expected:
Expected: Registration form 4- Locate “First name” input box
3- Verify header text is as expected:
    Expected: Registration form
4- Locate "First name" input box
5- Verify placeholder attribute’s value is as expected: Expected: first name

 */