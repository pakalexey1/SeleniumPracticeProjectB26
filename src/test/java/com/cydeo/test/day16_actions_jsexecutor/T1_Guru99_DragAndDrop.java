package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Guru99_DragAndDrop {


    @Test

    public void dragAndDrop() throws InterruptedException {
        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");

        //    3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(bank, debitAccount).perform();

        //    4- Drag “5000” and drop into Amount area under Debit Side
        WebElement fiveK = Driver.getDriver().findElement(By.xpath("//li[@class='block13 ui-draggable']"));
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

        actions.dragAndDrop(fiveK,debitAmount).perform();

        //    5- Drag “SALES” and drop into Account area under Credit Side
        WebElement sales = Driver.getDriver().findElement(By.xpath("//li[@data-id='6']/a"));
        WebElement creditAccount = Driver.getDriver().findElement(By.id("loan"));

        actions.dragAndDrop(sales,creditAccount).perform();

        //    6- Drag “5000” and drop into Amount area under Credit Side
        WebElement creditAmount = Driver.getDriver().findElement(By.id("amt8"));
        actions.dragAndDrop(fiveK,creditAmount).perform();

        //    7- Verify “Perfect!” text displayed.
        String actualMessage = Driver.getDriver().findElement(By.xpath("//div[@class='table4_result']/a")).getText();

        Assert.assertEquals(actualMessage,"Perfect!");

    }
}
/*
//    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
//    3- Drag “BANK” and drop into Account area under Debit Side
//    4- Drag “5000” and drop into Amount area under Debit Side
//    5- Drag “SALES” and drop into Account area under Credit Side
//    6- Drag “5000” and drop into Amount area under Credit Side
//    7- Verify “Perfect!” text displayed.
 */