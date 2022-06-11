package com.cydeo.test.base;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public WebDriver driver;
    @BeforeTest
    public void SetUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
