package com.cydeo.test.homework.day7_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownTest {
    @Test
    public void dropdownTest (){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1st, 1923” and verify it is selected.
//        Select year using   : visible text
//        Select month using    : value attribute Select
//        day using : index number
        Select dropdownYear = new Select(driver.findElement(By.id("year")));
        Select dropdownMonth = new Select(driver.findElement(By.id("month")));
        Select dropdownDay = new Select(driver.findElement(By.id("day")));

        dropdownYear.selectByVisibleText("1923");
        dropdownMonth.selectByValue("11");
        dropdownDay.selectByIndex(0);

        String actualYear = dropdownYear.getFirstSelectedOption().getText();
        String actualMonth = dropdownMonth.getFirstSelectedOption().getText();
        String actualDay = dropdownDay.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear,"1923");
        Assert.assertEquals(actualMonth,"December");
        Assert.assertEquals(actualDay,"1");

    }
}

/*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
 Select year using   : visible text
Select month using    : value attribute Select
day using : index number
 */