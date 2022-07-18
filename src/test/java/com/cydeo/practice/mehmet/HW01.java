package com.cydeo.practice.mehmet;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW01 {

    @Test
    public void uploadTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("herokuapp"));

        String filePath = "C:\\Users\\pakal\\Desktop\\cabinets.JPG";
        Driver.getDriver().findElement(By.id("fileinput")).sendKeys(filePath);

        Driver.getDriver().findElement(By.cssSelector ("input[type='submit']")).click();

//        - Verify Expected message equals "You uploaded a file. This is the result."
        String uploadMessage = Driver.getDriver().findElement(By.xpath("//p[contains(text(),'You')]")).getText();
        Assert.assertEquals(uploadMessage,"You uploaded a file. This is the result.");

    }
}
//    Task 1
//            - Go to  "https://testpages.herokuapp.com/styled/file-upload-test.html"
//            - Upload file into Choose File
//    NOTE : Create a file called as UploadTest.txt in project to upload ( I will show how we can )
//       - Choose General File
//       - Click Upload button
//       - Verify Expected message equals "You uploaded a file. This is the result."