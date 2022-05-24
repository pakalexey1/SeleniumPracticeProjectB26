package com.cydeo.test.day4_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("div>button[class='login-btn']"));
        String actualResult = resetPasswordButton.getText();

        String expectedResult = "Reset password";

        String testResult = (actualResult.equals(expectedResult)) ? "Test passed" : "Test failed";
        System.out.println(testResult);

        driver.quit();

    }
}

/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
 */
