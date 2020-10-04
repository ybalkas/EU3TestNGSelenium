package com.cybertek.tests.day5_xpath;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick = driver.findElement(By.cssSelector("#disappearing_button"));

        System.out.println(dontClick.getText());

        driver.quit();


    }
}