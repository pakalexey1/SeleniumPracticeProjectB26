package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Library1 extends PagesBase {

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(id= "inputEmail-error")
    public WebElement errorMsg;

    @FindBy (id = "inputEmail")
    public WebElement emailField;

    @FindBy (id = "inputPassword")
    public WebElement passwordField;

    @FindBy (id = "inputEmail-error")
    public WebElement enterValidEmailMsg;

    @FindBy (xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPassMsg;

    public void login(String userName, String password){
        wait.until(ExpectedConditions.visibilityOf(signInBtn));
        emailField.sendKeys(userName);
        passwordField.sendKeys(password);
        signInBtn.click();
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
