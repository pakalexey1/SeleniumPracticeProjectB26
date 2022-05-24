package com.cydeo.test.homework.day4_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {
    @Test
    public void loginTest (){

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeCheckBox = driver.findElement(By.cssSelector("div>label[class='login-item-checkbox-label']"));
        String actualLabelText = rememberMeCheckBox.getText();
        String expectedLabelText = "Remember me on this computer";
        Assert.assertEquals(actualLabelText,expectedLabelText);

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotYourPasswordLink = driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
        String actualForgotYourPasswordLink = forgotYourPasswordLink.getText();
        String expectedForgotYourPasswordLink = "FORGOT YOUR PASSWORD?";
        Assert.assertEquals(actualForgotYourPasswordLink,expectedForgotYourPasswordLink);

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        WebElement forgotPasswordHref = driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
        String actualForgotPasswordHref = forgotPasswordHref.getAttribute("href");
        String expectedForgotPasswordHref = "forgot_password=yes";
        Assert.assertTrue(actualForgotPasswordHref.contains(expectedForgotPasswordHref));

        driver.quit();
    }
}

/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes



PS: Inspect and decide which locator you should be using to locate web
elements.
 */