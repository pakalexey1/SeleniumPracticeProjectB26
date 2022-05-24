package com.cydeo.test.homework.day4_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTestP2 {
    @Test
    public void loginTestP2(){
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement loginBox = driver.findElement(By.cssSelector("div>input[name='USER_LOGIN']"));
        loginBox.sendKeys("asdkjfaskljdfh");

        //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorMessage = driver.findElement(By.cssSelector("div[class='errortext']"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Login or E-mail not found";

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

        driver.quit();

    }
}

/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found




PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */