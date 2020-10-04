package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CheckboxDemo {
    @Test
    public void Test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkBox1=driver.findElement(By.xpath("//input[1]"));
        WebElement checkBox2=driver.findElement(By.xpath("//input[2]"));
        System.out.println("checkBox1.isSelected()="+checkBox1.isSelected());
        System.out.println("checkBox2.isSelected()="+checkBox2.isSelected());
        //Verify checkBox1 is not selected and 2 is selected
        Assert.assertFalse(checkBox1.isSelected(),"Verify checkBox1 is not selected");
        Assert.assertTrue(checkBox2.isSelected(),"Verify checkBox2 is  selected");
        Thread.sleep(2000);
        checkBox1.click();
        Thread.sleep(3000);
        Assert.assertTrue(checkBox1.isSelected(),"Verify checkBox1 is  selected");
        Assert.assertTrue(checkBox2.isSelected(),"Verify checkBox2 is  selected");
        driver.quit();


    }
}
