package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    public static String returnOrderData(WebDriver driver, String customerName) {
        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDataCell = driver.findElement(By.xpath(locator));

        return customerDataCell.getText();
    }

    public static String returnOrderData2(WebDriver driver, String customerName) {
        return driver.findElement(By.xpath("//td[.='" + customerName + "']//following-sibling::td[3]")).getText();
    }
    /*
    //Method #1 info:
        //• Name: returnOrderDate ()
        //• Return type: String
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //This method should accept a costumerName and return the costumer order date
        //as a String.
     */


    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {
        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        String actualOrderDate = customerDateCell.getText();
        Assert.assertEquals(customerDateCell.getText(),expectedOrderDate);
    }

}


