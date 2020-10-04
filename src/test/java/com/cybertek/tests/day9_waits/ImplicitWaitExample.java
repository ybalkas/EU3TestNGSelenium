package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {

        WebDriver driver;

        @BeforeMethod
        public void setUp(){
            driver = WebDriverFactory.getDriver("chrome");
        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }

        @Test
        public void test1() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.findElement(By.cssSelector("#finish"));
            System.out.println(driver.findElement(By.cssSelector("#finish")).getText());

        }


}
