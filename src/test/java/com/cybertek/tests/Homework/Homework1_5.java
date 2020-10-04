package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class Homework1_5 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
                         }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
  /*
  Step 1. Go to “https://practice-cybertekschool.herokuapp.com”Step
  2. Click on “Registration Form”Step
  3. Enter “wrong_dob” into date of birth input box.Step
  4. Verify that warning message is displayed: “The date of birth is not valid”
   */
    @Test
    public void test1() throws InterruptedException {

        WebElement dateOfBirth =driver.findElement(By.xpath("//*[@name='birthday']"));
         dateOfBirth.sendKeys("wrong_dob");
          WebElement message=driver.findElement(By.xpath("//*[@data-bv-validator='date'] "));
       String  actualMessage=message.getText();
        Assert.assertTrue(message.isDisplayed(),"Verify that message displayed");
        Assert.assertEquals("The date of birth is not valid",actualMessage);
    }
    /*
    Step 1. Go to “https://practice-
     cybertekschool.herokuapp.com” Step 2. Click on “Registration Form”

Step 3. Verify that following options for
programming languages are displayed: c++, java,
JavaScript

     */
    @Test
    public void test2()  {

        List <WebElement> Languages= driver.findElements(By.xpath("//label[@class='form-check-label']"));
        for (WebElement language : Languages) {
            System.out.println("language.getText() = " + language.getText());
            Assert.assertTrue(language.isSelected(),"Verify that languages are displayed");
        }

    }
    /*

       Step 3. Enter only one alphabetic character into ﬁrst
     name input box.
        Step 4. Verify that warning message is displayed:
     “ﬁrst name must be more than 2 and less than 64
characters long”
  //input[@class='form-control']
     */

    @Test
    public void test5() throws InterruptedException {

        List <String> information=new ArrayList<>();
        information.add("yusuf");
        information.add("balkas");
        information.add("ybalkas");
        information.add("ybalkas@gmail.com");
        information.add("124fwe");
        information.add("454-454-6778");
        information.add("11/03/1974");

        List <WebElement> inputBoxes= driver.findElements(By.xpath("//input[@class='form-control']"));
        for (int i = 0; i < inputBoxes.size(); i++) {
           inputBoxes.get(i).sendKeys(information.get(i));
        }
      WebElement gender=driver.findElement(By.xpath("//input[@type='radio'][1]"));
      gender.click();
        //*[@name='department']
        WebElement department=driver.findElement(By.xpath("//select[@name='department']"));
        WebElement jobTitle=driver.findElement(By.xpath("//select[@name='job_title']"));
        Select departmentDropDown = new Select(department);
        departmentDropDown.selectByIndex(2);
        Select jobTitleDropdown= new Select(jobTitle);
        jobTitleDropdown.selectByIndex(2);
        WebElement checkBoxLang= driver.findElement(By.cssSelector("#inlineCheckbox1"));
        checkBoxLang.click();

        driver.findElement(By.cssSelector("#wooden_spoon")).click();
        Thread.sleep(2000);
        String expectedResult="You've successfully completed registration!";
        WebElement actualResult= driver.findElement(By.xpath("//p"));
        System.out.println("actualResult.getText() = " + actualResult.getText());
        Assert.assertEquals(expectedResult,actualResult.getText());
        }
    }




