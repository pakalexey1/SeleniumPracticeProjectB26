package com.cydeo.test.homework.day4_homework1;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplaed {
    public static void main(String[] args) {
//TC#1: XPATH and cssSelector Practices
// 1. Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
// 2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and / or CSS locator only (total of 6)
        //a.1 locate homeLink using cssSelector, class value
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

//        homeLink1.getAttribute("href");
        //a.2 locate homelink using cssSelector, href value
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

        //a.3 Locate homeLink using cssSelector, syntax2 for class "."
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));

        //a.4 Locate homeLink using xpath, using text
        WebElement homeLink4 = driver.findElement(By.xpath("//a[.='Home']"));

        //a.5 locate homelink using xpath, using attribute
        WebElement homeLink5 = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. "Forgot Password" header
        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div[class='example']>h2"));
//        forgotPasswordHeader.getText();

        //b.2 "Forgot Password" header using xpath, using text
        WebElement forgotPasswordHeader2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. "E-mail" text
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

        //c.2 "E-mail" text, using xpath
        WebElement emailText2 = driver.findElement(By.xpath("//label[@for='email']"));

        //d. "E-mail" input box
        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));

        //d. "E-mail" input box, using xpath
        WebElement emailInput2 = driver.findElement(By.xpath("//input[@name='email']"));

        //e. "Retrieve password" button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button#form_submit")); // # is a substitute
        // for id
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("button.radius"));

        //e.3 "Retrieve password" button, using xpath
        WebElement retrievePassword3 = driver.findElement(By.xpath("//i[.='Retrieve password']"));

        //f. "Powered by Cydeo" text
        WebElement powereByCydeo = driver.findElement(By.cssSelector("text-align: center;"));

        //f.2 "Powered by Cydeo" text, using xpath
        WebElement poweredByCydeo2 = driver.findElement(By.xpath("//div//i[@class='icon-2x icon-signin']"));

        System.out.println("++++++++++++++++++++++++++++++");
        //g. Verified all elements are displayed

         /*
        System.out.println("homelink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
*/
        driver.quit();

    }
}
