package com.cydeo.test.day4_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Locators_getText {
    @Test
    public void testT1_Locators_getText() {
//TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement loginBox = driver.findElement(By.name("USER_LOGIN"));
        loginBox.sendKeys("incorrect" + Keys.ENTER);

        //4- Enter incorrect password: “incorrect”
        WebElement passwordBox = driver.findElement(By.name(("USER_PASSWORD")));
        passwordBox.sendKeys("incorrect" + Keys.ENTER);

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String actualErrorMessage = errorMessage.getText();

        String expectedErrorMessage = "Incorrect login or password";

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

        driver.quit();

    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */