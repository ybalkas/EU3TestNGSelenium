package com.cybertek.tests.day3_webelemet_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyURLnotChanged {

    public static void main(String[] args) throws InterruptedException {
       //open choromebrowser

        //  WebDriver driver= new ChromeDriver();
       // WebDriver driver= new WebDriverFactory.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        //  WebDriver driver= new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
      // Save the expected url before clicking the button
        String expectedUrl= driver.getCurrentUrl();
        // click on RetrieveButton
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        // verify that URL did not change
        String actualUrl= driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        } else{
            System.out.println("FAILED");
        }
        driver.quit();

    }
}
