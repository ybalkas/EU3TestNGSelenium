package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }


    
    @Test
    public void switchWindows(){
        System.out.println("title before click="+driver.getTitle());
        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("title before new window="+driver.getTitle());
        driver.findElement(By.linkText("ClickHere")).click();
        System.out.println("title after new window="+driver.getTitle());

    }
    @Test
    public void moreThantwoWindows(){

    }
}
