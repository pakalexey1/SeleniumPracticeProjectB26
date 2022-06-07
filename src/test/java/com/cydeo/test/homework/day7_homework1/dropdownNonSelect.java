package com.cydeo.test.homework.day7_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdownNonSelect {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
         driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void dropdownNonSelect() {
      driver.get("https://practice.cydeo.com/dropdown");

        WebElement nonSelectDropdown = driver.findElement(By.id("dropdownMenuLink"));
        nonSelectDropdown.click();

        WebElement nonSelectDropdownFacebook = driver.findElement(By.xpath("//a[.='Facebook']"));
        nonSelectDropdownFacebook.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
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