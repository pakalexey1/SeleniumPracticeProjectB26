package com.cydeo.test.homework.day17_pom;

import com.cydeo.pages.Library1;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInNegativeWithPasswordTest {

    @Test
    public void signInNegativeWithPasswordTest(){
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");
        Library1 library1 = new Library1();

//        3- Enter incorrect username or incorrect password
        library1.login("test@test.com", "sadfkljahsdf");

//        4- Verify title expected error is displayed:
//        Expected: Sorry, Wrong Email or Password

        Assert.assertEquals(library1.wrongEmailOrPassMsg.getText(),"Sorry, Wrong Email or Password");

    }
}

/*
TC #3: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter incorrect username or incorrect password
4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password

NOTE: FOLLOW POM DESIGN PATTERN
 */