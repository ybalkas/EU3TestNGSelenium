package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElement {
    @Test
    public void Test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement greenRadioButton=driver.findElement(By.id("green"));
        WebElement redRadioButton=driver.findElement(By.id("red"));
       // System.out.println("blueRadioButton.isSelected()="+greenRadioButton.isSelected());
       //  System.out.println("redRadioButton.isSelected()="+redRadioButton.isSelected());
        greenRadioButton.click();
        //How to check any web element is enabled or not
        System.out.println("greenRadioButton.isEnabled()="+greenRadioButton.isEnabled());
        Assert.assertFalse(greenRadioButton.isEnabled(),"Verify that radio button is disabled");
    }
    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement inputbox=driver.findElement(By.cssSelector("#input-example>input"));


    }
}
