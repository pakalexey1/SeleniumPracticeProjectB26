package com.cydeo.test.day13_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1_Config_Practice extends TestBase {

    @Test
    public void crmLoginTest(){
        //2. Go to : http://login1.nextbasecrm.com/

        driver.get(ConfigurationReader.getProperty("env"));

        //3. Enter valid username
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(ConfigurationReader.getProperty("username"));

        //4. Enter valid password
        driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']")).sendKeys(ConfigurationReader.getProperty(
                "password"));

        //5. Click to Log In button
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver,"Portal");

    }

}


/*
T1_Config_Practice
1. Create new test and make set ups
2. Go to : https://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to Log In button
6. Verify title is as expected:
Expected: Portal
 */