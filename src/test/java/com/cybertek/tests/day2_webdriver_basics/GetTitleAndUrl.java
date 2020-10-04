package com.cybertek.tests.day2_webdriver_basics;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
       public static void main(String[] args) {
              WebDriverManager.chromedriver().setup();
              WebDriver driver = new ChromeDriver();
              driver.get("http://practice.cybertekschool.com");
              System.out.println(driver.getTitle());
              // ALT + ENTER THEN press enter
              // getTitle()-----> get you the title of the page
              String title = driver.getTitle();
              System.out.println("title latest= " + title);
              String currentUrl = driver.getCurrentUrl();
              System.out.println("currentUrl = " + currentUrl);
              String pageSource = driver.getPageSource();
              System.out.println("pageSource = " + pageSource);


       }


}
