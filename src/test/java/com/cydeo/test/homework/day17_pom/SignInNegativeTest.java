package com.cydeo.test.homework.day17_pom;

import com.cydeo.pages.Library1;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInNegativeTest {
    @Test
    public void singInNegativeTest() {

//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com

        Library1 library1 = new Library1();
        Driver.getDriver().get("https://library1.cydeo.com");

//        3- Do not enter any information
//        4- Click to “Sign in” button

        library1.signInBtn.click();

//        5- Verify expected error is displayed:
//        Expected: This field is required.
        Assert.assertEquals(library1.errorMsg.getText(),"This field is required.");
    }
}
/*TC #1: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.

NOTE: FOLLOW POM DESIGN PATTERN
 */