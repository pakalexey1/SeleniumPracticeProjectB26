package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_WebtablePractice extends TestBase {

    @Test
    public void order_name_verify_test() {
//        1. Goto : https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

//        2. Verify Bob’s name is listed as expected.
//        Expected: “Bob Martin”
        WebElement actualCell = driver.findElement(By.xpath("////table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String actualCellStr = actualCell.getText();
        String expectedCellStr = "Bob Martin";

        Assert.assertEquals(actualCellStr, expectedCellStr, "Names don't match");

//        3. Verify Bob Martin’s order date is as expected: 12/31/2021
        WebElement actualDate = driver.findElement(By.xpath("////table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[.='12/31/2021']"));
        String actualDateStr = actualDate.getText();
        String expectedDateStr = "12/31/2021";

        Assert.assertEquals(actualDateStr,expectedDateStr,"Dates don't match");

    }
}
/*
TC #1: Web table practice

2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021

 */