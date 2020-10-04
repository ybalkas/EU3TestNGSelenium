package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void Test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        blueRadioButton.getAttribute("name");
        blueRadioButton.getAttribute("type");
        blueRadioButton.getAttribute("id");
        blueRadioButton.getAttribute("checked");
        System.out.println(blueRadioButton.getAttribute("name"));
        System.out.println(blueRadioButton.getAttribute("type"));
        System.out.println(blueRadioButton.getAttribute("id"));
        System.out.println(blueRadioButton.getAttribute("checked"));
        System.out.println(blueRadioButton.getAttribute("href"));
        WebElement button2= driver.findElement(By.xpath("  //label[@for=\"football\"]"));
        System.out.println("outer="+button2.getAttribute("outerHTML"));
        System.out.println("inner="+button2.getAttribute("innerHTML"));


    }
}
