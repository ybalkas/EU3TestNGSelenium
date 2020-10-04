package com.cybertek.tests.day_10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecuterDemo {

        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = WebDriverFactory.getDriver("chrome");
        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }
        @Test
        public void clickWithJS(){
            driver.get("http://practice.cybertekschool.com/");
           WebElement dropdownLink=driver.findElement(new By.ByLinkText("Dropdown"));
            JavascriptExecutor jse=( JavascriptExecutor )driver;
            jse.executeScript("arguments[0].click();",dropdownLink);
        }
    public void typeWithJS() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor jse=( JavascriptExecutor )driver;
        String text= "Hello Disabled input";

        jse.executeScript("arguments[0].setAttribute('value', '" + text +"')", inputBox);
        Thread.sleep(3000);
    }
    @Test
    public void ScrollDownAndUp() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,250)");

        }
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,-250)");

        }
    }
        @Test
        public void scrolltoAnElement() throws InterruptedException {
            driver.get("https://www.amazon.com/");
            driver.manage().window().maximize();
            WebElement eng= driver.findElement(By.xpath("//*[.='Amazon Top Sellers'][1]"));
             Thread.sleep(2000);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
              jse.executeScript("arguments[0].scrollIntoView(true);",eng);
            Thread.sleep(3000);
        }

}
