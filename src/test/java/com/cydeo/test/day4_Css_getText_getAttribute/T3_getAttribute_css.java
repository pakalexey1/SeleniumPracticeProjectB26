package com.cydeo.test.day4_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice 1- Open a chrome browser
        //1 - Open chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “Log in” button text is as expected:
//        Expected: Log In

        //WebElement loginButton = driver.findElement(By.cssSelector("input[type='sudibmit']"));//located using type
        // attribute

        //WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']")); // located using value
        // attribute

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedLoginButtonText ="Log In";
        String actualLoginButtonText = loginButton.getAttribute("value");

        String testResult = actualLoginButtonText.equals(expectedLoginButtonText) ? "Test passed" : "Test failed";
        System.out.println(testResult);

        driver.quit();
    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice 1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
 */