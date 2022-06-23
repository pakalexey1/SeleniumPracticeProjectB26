package com.cydeo.test.homework.day15;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hover_test {
    @Test
    public void hover_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo_hover_url"));
// 2. Hover over to first image

//3. Assert:
//    a. “name: user1” is displayed
//    b. “view profile” is displayed
        Actions hover = new Actions(Driver.getDriver());
        WebElement firstImg = Driver.getDriver().findElement(By.xpath("(//div/img)[1]"));
        hover.moveToElement(firstImg).perform();

        WebElement firstImgMsg = Driver.getDriver().findElement(By.xpath("(//div/h5)[1]"));
        Assert.assertTrue(firstImgMsg.isDisplayed());

        WebElement viewFirstProfile = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']/following-sibling::a"));
        Assert.assertTrue(viewFirstProfile.isDisplayed());

//4. Hover over to second image
//5. Assert:
//    a. “name: user2” is displayed
//    b. “view profile” is displayed
        WebElement secondImg = Driver.getDriver().findElement(By.xpath("(//div/img)[2]"));
        hover.moveToElement(secondImg).perform();

        WebElement secondImgMsg = Driver.getDriver().findElement(By.xpath("(//div/h5)[2]"));
        Assert.assertTrue(secondImgMsg.isDisplayed());

        WebElement viewSecondProfile = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']/following-sibling::a"));
        Assert.assertTrue(viewSecondProfile.isDisplayed());

        //6. Hover over to third image
//7. Confirm:
//    a. “name: user3” is displayed
//    b. “view profile” is displayed

        WebElement thirdImg = Driver.getDriver().findElement(By.xpath("(//div/img)[3]"));
        hover.moveToElement(secondImg).perform();

        WebElement thirdImgMsg = Driver.getDriver().findElement(By.xpath("(//div/h5)[32]"));
        Assert.assertTrue(thirdImgMsg.isDisplayed());

        WebElement viewThirdProfile = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']/following-sibling::a"));
        Assert.assertTrue(viewThirdProfile.isDisplayed());

    }
}

//    TC #3: Hover Test
//1. Go to https://practice.cydeo.com/hovers


// 2. Hover over to first image

//3. Assert:
//    a. “name: user1” is displayed
//    b. “view profile” is displayed
//4. Hover over to second image
//5. Assert:
//    a. “name: user2” is displayed
//    b. “view profile” is displayed
//6. Hover over to third image
//7. Confirm:
//    a. “name: user3” is displayed
//    b. “view profile” is displayed