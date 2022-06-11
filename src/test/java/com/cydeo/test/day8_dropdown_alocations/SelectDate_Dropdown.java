package com.cydeo.test.day8_dropdown_alocations;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDate_Dropdown {
    WebDriver driver;
    @BeforeTest
    public void SetUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void selectDate_Dropdown(){
        driver.get("https://practice.cydeo.com/dropdown");

        Select dropdownYear = new Select(driver.findElement(By.id("year")));
        Select dropdownMonth = new Select(driver.findElement(By.id("month")));
        Select dropdownDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        for (WebElement eachOfDropdownYearOptions : dropdownYear.getOptions()){
            System.out.println(eachOfDropdownYearOptions.getText());
        }

        dropdownYear.selectByVisibleText("1923");
        dropdownMonth.selectByValue("11");
        dropdownDay.selectByIndex(0);

        String actualYear = dropdownYear.getFirstSelectedOption().getText();
        String actualMonth = dropdownMonth.getFirstSelectedOption().getText();
        String actualDay = dropdownDay.getFirstSelectedOption().getText();

        String expectedYear="1923";
        String expectedMonth = "December";
        String expectedDay = "1";

//        Assert.assertTrue(actualYear.equals(expectedYear),"Year selection didn't pass");
//        Assert.assertTrue(actualMonth.equals(expectedMonth),"Month selection didn't pass");
//        Assert.assertTrue(actualDay.equals(expectedDay),"Day selection didn't pass");
//
//        Assert.assertEquals(actualYear,expectedYear,"Year selection didn't pass");
//        Assert.assertEquals(actualMonth,expectedMonth,"Month selection didn't pass");
//        Assert.assertEquals(actualDay,expectedDay,"Day selection didn't pass");



    }

}
/*
TC : Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - log in or sign up”

*Remember: If there is no <select>  tag, it is called HTML
dropdown and We handle just as any other web
element. We locate. We click.
 */