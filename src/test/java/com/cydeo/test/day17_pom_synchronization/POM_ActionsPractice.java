package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_ActionsPractice {
    CydeoPracticePage cydeoPracticePage;
    Actions actions;

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice.dragdrop"));
        cydeoPracticePage = new CydeoPracticePage();
        actions = new Actions(Driver.getDriver());

    }

    @Test
    public void dragSmallCircleText(){

//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles

//        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
//        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();


//        3. Verify expected default text appears on big circle
//                Expected = "Drag the small circle here."
//        POM_ActionsPractices

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drag the small circle here.");

    }

    @Test
    public void drop_here_text() throws InterruptedException {
//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
//        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
//        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();
        Thread.sleep(1000);
//        3. Click and hold small circle
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold().moveByOffset(100,100).perform();
        Thread.sleep(1000);
//        4. Verify "Drop here." text is displayed on the big circle
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drop here.", "Message test failed");
    }
}
/*
1. Open a chrome browser
2. Go to:
https://practice.cydeo.com/drag_and_drop_circles
3. Verify expected default text appears on big circle
   Expected = "Drag the small circle here."
POM_ActionsPractices
 */