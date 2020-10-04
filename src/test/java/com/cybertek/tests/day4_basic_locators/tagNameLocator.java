package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
            driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput= driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Yusuf Balkas");
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("ybalkas@gmail.com");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
