package com.cydeo.test.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create properties object
    // make it private to be inaccessible from outside
    // make static because static runs first and we will use this object under static method
    private static Properties properties = new Properties();

    //putting into a static block so that it runs only once
    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading the configuration file");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
