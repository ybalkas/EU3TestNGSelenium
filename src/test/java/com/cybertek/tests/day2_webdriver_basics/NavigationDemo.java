package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
      //  WebDriver driver= new ChromeDriver();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
