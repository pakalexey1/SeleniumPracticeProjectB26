package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefException {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //click on "Add Element" button
        WebElement AddElementButton = driver.findElement(By.xpath("//button[. ='Add Element']"));
        AddElementButton.click();

        //Verify "Delete" button is displayed after clicking on the "Add Element" button
        WebElement DeleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("DeleteButton.isDisplayed() after clicking on \"Add Element\" button " +DeleteButton.isDisplayed());

        //Click "Delete" button
        DeleteButton.click();

        //Verify "Delete" button is NOT displayed after clicking

        try {
            System.out.println("DeleteButton.isDisplayed() after clicking on it= " + DeleteButton.isDisplayed());
        }catch(StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This means the element the web element is completely deleted from the page and html");
        }

        driver.quit();
    }
}
