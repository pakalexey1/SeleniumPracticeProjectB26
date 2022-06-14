package com.cydeo.test.homework.day11_homework;

import com.cydeo.test.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPlacement extends TestBase {

    @Test
    public void softwareOrderPlacing() throws InterruptedException {
        /*
        2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
         */
        SmartBearUtils.SmartBearLogin(driver);

        //6. Click on Order
        driver.findElement(By.linkText("Order")).click();
        Thread.sleep(5000);

        //7. Select familyAlbum from product, set quantity to 2
       Select dropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
       dropdown.selectByVisibleText("FamilyAlbum");

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.clear();
        quantity.sendKeys("2");

        //8. Click to “Calculate” button
        driver.findElement(By.cssSelector("input[value='Calculate']")).click();

        //9. Fill address Info with JavaFaker
        //• Generate: name, street, city, state, zip code

        Faker faker = new Faker();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("90027");

        //10. Click on “visa” radio button
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();

        //11. Generate card number using JavaFaker
        String creditCardNumber = faker.finance().creditCard().replaceAll("-","");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(creditCardNumber);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("24/12");
//        Thread.sleep(500000);
        //12. Click on “Process”
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();


        //13. Verify success message “New order has been successfully added.
        WebElement successMessage = driver.findElement(By.xpath("//input[@type='reset']/following-sibling::strong"));
        String actualMessage =successMessage.getText();
        String expectedMessage = "New order has been successfully added.";
        Assert.assertEquals(actualMessage,expectedMessage,"Messages do not match");

    }
}
/*
TC#2: Smartbear software order placing
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
6. Click on Order
7. Select familyAlbum from product, set quantity to 2
8. Click to “Calculate” button
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code
10. Click on “visa” radio button
11. Generate card number using JavaFaker
12. Click on “Process”
13. Verify success message “New order has been successfully added.”
 */