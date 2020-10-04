package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.List;

public class CheckBox {


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
    public void test1() {

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkBox=driver.findElement(By.id("isAgeSelected"));
        System.out.println("checkBox1.isSelected()="+checkBox.isSelected());
        String ExpectedText="";
        Assert.assertFalse(checkBox.isSelected(),"Verify that checkbox is not selected");
        WebElement Message=driver.findElement(By.id("txtAge"));

        System.out.println("Message.isDisplayed() = " + Message.isDisplayed());
        Assert.assertFalse(Message.isDisplayed(),"Verify that Success - Check box is checked is not displayed");
        checkBox.click();
        System.out.println("Message.isDisplayed() = " + Message.isDisplayed());
        Assert.assertTrue(Message.isDisplayed(),"Verify that Success - Check box is checked is not displayed");

    }
   /*
   1.Open Chrome browser
   2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
   3.Verify “Check All” button text is “Check All”
   4.Click to “Check All” button
   5.Verify all check boxes are checked6.Verify button text changed to “Uncheck All”
    */
    @Test
    public void test2() {
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        WebElement checkBox=driver.findElement(By.id("check1"));
        String textOfBoxBeforeClick=checkBox.getAttribute("value");
        System.out.println("textOfBoxBeforeClick = " + textOfBoxBeforeClick);
        Assert.assertEquals(textOfBoxBeforeClick,"Check All");
        checkBox.click();
        List <WebElement> checkBoxes= driver.findElements(By.xpath("//*[@class='cb1-element']"));

        for (WebElement box : checkBoxes) {
            System.out.println(box.isSelected());
            Assert.assertTrue(box.isSelected(),"Verify that text box is selected");
        }
          String textOfBoxAfterClick=checkBox.getAttribute("value");
        System.out.println("textOfBoxAfterClick = " + textOfBoxAfterClick);
        Assert.assertEquals(textOfBoxAfterClick,"Uncheck All");
    }
}
