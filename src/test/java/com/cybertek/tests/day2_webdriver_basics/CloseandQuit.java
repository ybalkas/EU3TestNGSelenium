package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(3000);

        //close current tab
       // driver.close();
        // giving new browser tab
       // driver = new ChromeDriver();


    }
}
