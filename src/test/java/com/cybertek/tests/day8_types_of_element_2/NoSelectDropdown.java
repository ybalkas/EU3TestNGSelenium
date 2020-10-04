package com.cybertek.tests.day8_types_of_element_2;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement= driver.findElement(By.id("dropdownMenuLink"));
        //To see available options click dropdownElement
        dropdownElement.click();
        List<WebElement> dropdownOptions= (List<WebElement>) driver.findElement(By.className("dropdown-item"));
        System.out.println("dropdownOptions="+dropdownOptions);
        for (WebElement dropdownOption : dropdownOptions) {
            System.out.println(dropdownOption.getText());
        }
        System.out.println(dropdownOptions.size());
        System.out.println(dropdownOptions.get(2));


    }
}
