package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagesBase {
    public PagesBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


}
