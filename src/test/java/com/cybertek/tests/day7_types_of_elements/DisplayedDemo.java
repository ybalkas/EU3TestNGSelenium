package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DisplayedDemo {

    @Test
    public  void Test() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement usernameInput= driver.findElement(By.id("username"));
        System.out.println(usernameInput.isDisplayed());
        Assert.assertFalse(usernameInput.isDisplayed(),"Verify that username box is NOT displayed");
        // verify username inputbox is not displayed on the screen
        // click start

        driver.findElement(By.cssSelector("#tart>buttons")).click();
        Thread.sleep(5000);
        Assert.assertTrue(usernameInput.isDisplayed(),"Verify that username box is displayed");
    }

}
