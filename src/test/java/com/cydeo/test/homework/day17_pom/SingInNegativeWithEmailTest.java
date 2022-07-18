package com.cydeo.test.homework.day17_pom;

import com.cydeo.pages.Library1;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInNegativeWithEmailTest {
    @Test
    public void singInNegativeWithEmailTest(){
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");
        Library1 library1 = new Library1();

//        3- Enter invalid email format
        library1.emailField.sendKeys("wrongEmailFormat");
        library1.signInBtn.click();

//        4- Verify expected error is displayed
        Assert.assertEquals(library1.enterValidEmailMsg.getText(),"Please enter a valid email address.");



    }
}
/*
TC #2: Invalid email format error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter invalid email format
4- Verify expected error is displayed:
Expected: Please enter a valid email address.

NOTE: FOLLOW POM DESIGN PATTERN
 */