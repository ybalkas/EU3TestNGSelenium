package com.cybertek.tests.day13_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    public void wrongPasswordTest() {

        LoginPage LoginPage= new LoginPage();
        LoginPage.usernameInput.sendKeys("user1");
        LoginPage.passwordInput.sendKeys("somepassword");
        LoginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
     /* driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("somepassword");
        driver.findElement(By.id("_submit")).click();

      */
         // by getting url we verified


    }
}