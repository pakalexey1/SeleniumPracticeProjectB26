package com.cydeo.test.homework.day4_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpath_practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //click on Button 1
        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        buttonOne.click();

        //click on Button 1 using css
        WebElement buttonTwo = driver.findElement(By.cssSelector("button[onclick='button1()']"));

        // Verify text displayed as expected
        // Expected: "Clicked on button one!"
        WebElement message = driver.findElement(By.xpath("//p[@id='result']"));
        String actualMessage = message.getText();

        String expectedMessage = "Clicked on button one!";

        String result = (actualMessage.equals(expectedMessage))?"The test passed" : "The test failed";
        System.out.println(result);

        driver.quit();

    }
}
/*

 */