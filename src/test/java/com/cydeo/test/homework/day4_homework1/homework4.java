package com.cydeo.test.homework.day4_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework4 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/forgot_password");

        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
        emailBox.sendKeys("test@test.com");

        //the same but with css
        //WebElement emailBox2 = driver.findElement(By.cssSelector("input[type='text']"));


        WebElement retrievePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        retrievePasswordButton.click();

        //the same with css
        //WebElement retrievePasswordButton2 = driver.findElement(By.cssSelector("input[type = 'text']"));

        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();

        WebElement emailSent = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        String actualEmailSentMessage = emailSent.getText();

        String expectedEmailSentMessage = "Your e-mail’s been sent!";

        if (actualURL.contains(expectedURL)){
            System.out.println("Test passed");

        }else{
            System.out.println("Test failed");
            System.out.println(actualURL);
        }

        String emailSentTest = (actualEmailSentMessage.equals(expectedEmailSentMessage)) ? "Email test passed" :
        "Email test failed";
        System.out.println(emailSentTest);

        //driver.quit();

    }
}

/*
TC #3: Practice Cydeo/ForgotPassword URL verification
1. Open Chrome browser
2. Go to http://practice.cydeo.com/forgot_password
3. Enter any email into input box
4. Click on Retrieve password
5. Verify URL contains:
Expected: “email_sent”
6. Verify textbox displayed the content as expected.
Expected: “Your e-mail’s been sent!”
 */
