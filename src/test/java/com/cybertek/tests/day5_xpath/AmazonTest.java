package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    // go to amazon.com
    // search for selenium
    // click search button
    // verifyt 1-48 of 304 results for "selenium"
    public static void main(String[] args) {
      WebDriver driver= WebDriverFactory.getDriver("chrome");
      driver.get("https://www.amazon.com/");
      WebElement searchBox= driver.findElement(By.xpath( "//input[@type='text']"));
      searchBox.sendKeys("ipad");
      driver.findElement(By.xpath( "//input[@value='Go']")).click();
       // String actualMessage2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]").getText();
      String actualMessage1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
      System.out.println(actualMessage1);
       // System.out.println(actualMessage2);
     // String actualResult=actualMessage1+" "+actualMessage2;
     /* System.out.println(actualResult);

     String expectedResult="1-48 of 187 results for \"selenium\"";
      if(expectedResult.equals(actualResult)){
        System.out.println("PASS");
      }else{
        System.out.println("FAIL");
        System.out.println("ExpectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);
      } */
    }

  }
