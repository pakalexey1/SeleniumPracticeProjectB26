package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_ActionsPractice {



    @Test
    public void cydeoPracticeDragAndDropTest(){



//        3. Click and hold small circle
//        4. Move it on top of the big circle
//        5. And release on it.

        WebElement dragable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement targetCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(dragable,targetCircle).perform();

        actions.moveToElement(dragable).clickAndHold().moveToElement(targetCircle).release().perform();

//        6. Verify “You did great!” text appears on big circle

        Assert.assertEquals(targetCircle.getText(),"You did great!", "Message test failed");



    }
}

/*
1. Open a chrome browser
2. Go to:
https://practice.cydeo.com/drag_and_drop_circles
3. Click and hold small circle
4. Move it on top of the big circle
5. And release on it.
6. Verify “You did great!” text appears on big circle
 */