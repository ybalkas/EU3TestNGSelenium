package com.cybertek.tests.day_10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void FileUpload() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement choseFile = driver.findElement(By.name("file"));
        choseFile.sendKeys("C:\\Users\\Hasan1\\Desktop\\file.txt");
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        String ActualFileName = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(ActualFileName, "file.txt");
    }

    @Test
    public void FileUpload2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement choseFile = driver.findElement(By.name("file"));
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath + "/" + filePath;
        System.out.println("fullPath = " + fullPath);
        choseFile.sendKeys(fullPath);
        Thread.sleep(3000);
    }
}
