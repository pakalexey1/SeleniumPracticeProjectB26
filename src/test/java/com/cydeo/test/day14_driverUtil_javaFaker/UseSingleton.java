package com.cydeo.test.day14_driverUtil_javaFaker;

import org.testng.annotations.Test;

public class UseSingleton {
    @Test
    public void singletonTest(){
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);
    }
}
