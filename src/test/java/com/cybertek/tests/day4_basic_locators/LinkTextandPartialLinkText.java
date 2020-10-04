package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class LinkTextandPartialLinkText {
    public static void main(String[] args) {


       // http://practice.cybertekschool.com/dynamic_loading
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
       //WebElement link= driver.findElement(By.lin("Example 2: Element on the page that is rende trigger"));
       // link.click();
    }
}