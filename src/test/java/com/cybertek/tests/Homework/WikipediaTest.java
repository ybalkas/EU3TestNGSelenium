package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://www.wikipedia.org/");
       driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium (software)");
       // driver.findElement(By.id(//i[@class='sprite svg-search-icon']));
    }


}
