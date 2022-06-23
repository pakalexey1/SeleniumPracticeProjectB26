package com.cydeo.test.homework.day11_homework;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements extends TestBase {

    @Test
    public void checkNumberOfLinks(){

        driver.get("https://www.openxcell.com");

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        // Total number of links is 337
        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println("allLinks.get(i).getText() = " + allLinks.get(i).getText());

        }
    }

    @Test
    public void getTestFromLinks(){
        driver.get("https://www.openxcell.com");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < allLinks.size(); i++) {
            if (!allLinks.get(i).getText().isEmpty())
            System.out.println("allLinks.get(i).getText() = " + allLinks.get(i).getText());
        }
        // Total number of not empty links is 12
    }

    @Test
    public void countEmptyLinks(){
        driver.get("https://www.openxcell.com");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int count =0;
        try {
            for (int i = 0; i < allLinks.size(); i++) {

                if (allLinks.get(i).getText().isEmpty()) {
                    count++;
                }
            }

        }catch (StaleElementReferenceException e){
            System.out.println(count);
        }
        // Total number of empty links is 186
    }

}
