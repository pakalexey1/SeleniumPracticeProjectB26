package com.cydeo.test.homework.day11_homework;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOrder extends TestBase {
    @Test
    public void verifyOrder(){
        //1. Open browser and login to Smartbear software
        SmartBearUtils.SmartBearLogin(driver);

        //2. Click on View all orders
        driver.findElement(By.xpath("//a[.='View all orders']")).click();

        //3. Verify Susan McLaren has order on date “01/05/2010”
        String actualCustomerName = driver.findElement(By.xpath("//td[.='Susan McLaren']")).getText();
        String expectedCustomerName = "Susan McLaren";

        Assert.assertEquals(actualCustomerName,expectedCustomerName,"Customer not found");

        String actualOrderDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[" +
                ".='01/05/2010']")).getText();
        String expectedOrderDate ="01/05/2010";

        Assert.assertEquals(actualOrderDate,expectedOrderDate,"Date is not found");




    }
}
/*
TC#3: Smartbear software order verification
1. Open browser and login to Smartbear software
2. Click on View all orders
3. Verify Susan McLaren has order on date “01/05/2010”
 */