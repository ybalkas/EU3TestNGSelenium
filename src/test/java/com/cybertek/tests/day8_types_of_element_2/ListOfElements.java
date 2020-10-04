package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
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
        driver.get("http://practice.cybertekschool.com/hovers");
        // driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons = driver.findElements(By.cssSelector("div.figure"));

        System.out.println(buttons.size());
        for (WebElement button : buttons) {
            System.out.println(button.getText());
            System.out.println("button.isDisplayed()" + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(), "verify that buttons displayed");

        }
        //click button2
        buttons.get(1).click();
    }

    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println();
        System.out.println(buttons.size());
        for (WebElement button : buttons) {
            System.out.println(button.getText());
            System.out.println("button.isDisplayed()"+button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verify that buttons displayed");

        }
        //click button2
        buttons.get(1).click();

    }

    @Test
    public void test3() {
        driver.get("http://practice.cybertekschool.com/hovers");
        List<WebElement> figures = driver.findElements(By.cssSelector("div.figure"));

        System.out.println();
        System.out.println(figures.size());
        for(WebElement figure:figures){
            System.out.println(figure.getAttribute(""));
        }
    }
}

