package com.cydeo.test.day12_learningProperties;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CRMLogin extends TestBase {

    @Test
    public void crmLogin(){
        driver.get(ConfigurationReader.getProperty("env"));

        //3. Enter valid username
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(ConfigurationReader.getProperty("username"));

        //4. Enter valid password
        driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']")).sendKeys(ConfigurationReader.getProperty(
                "password"));

        //5. CLick to Log In button
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
