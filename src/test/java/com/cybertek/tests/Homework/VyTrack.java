package com.cybertek.tests.Homework;

import com.cybertek.pages.BasePage;
import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VyTrack extends TestBase {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    @Test
    public void loginFunctionality() throws InterruptedException {
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user16");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        // driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);
    }

    @Test
    public void VehiclesTabHoverOver() throws InterruptedException {
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user16");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        // driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        driver.findElement(By.cssSelector(".custom-checkbox__icon")).click();
        driver.findElement(By.id("_submit")).click();

        List<WebElement> hoverOverElement = driver.findElements(By.xpath("//a[@class='unclickable']"));
        actions.moveToElement(hoverOverElement.get(0)).perform();
        Thread.sleep(2000);
        WebElement Vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        wait.until(ExpectedConditions.elementToBeClickable(Vehicle));
        Vehicle.click();

    }

    @Test
    public void VehiclesTableShow() throws InterruptedException {
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user16");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        // driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        driver.findElement(By.cssSelector(".custom-checkbox__icon")).click();
        driver.findElement(By.id("_submit")).click();
        List<WebElement> hoverOverElement = driver.findElements(By.xpath("//a[@class='unclickable']"));
        actions.moveToElement(hoverOverElement.get(0)).perform();
        Thread.sleep(2000);
        WebElement Vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        wait.until(ExpectedConditions.elementToBeClickable(Vehicle));
        Vehicle.click();
        WebElement table = driver.findElement(By.xpath("//div[@class='grid-container']/table"));
        wait.until(ExpectedConditions.visibilityOf(table));
        Assert.assertTrue(table.isDisplayed(), "Verify that grid is displayed");
        //Finding table elements clicking each row
        List<WebElement> eachCar = driver.findElements(By.cssSelector(".grid-row.row-click-action"));

    }

    @Test
    public void VehiclesClickeachRow() throws InterruptedException {
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user16");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        // driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        driver.findElement(By.cssSelector(".custom-checkbox__icon")).click();
        driver.findElement(By.id("_submit")).click();
        List<WebElement> hoverOverElement = driver.findElements(By.xpath("//a[@class='unclickable']"));
        actions.moveToElement(hoverOverElement.get(0)).perform();
        Thread.sleep(2000);
        WebElement Vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        wait.until(ExpectedConditions.elementToBeClickable(Vehicle));
        Vehicle.click();
        WebElement table = driver.findElement(By.xpath("//div[@class='grid-container']/table"));
        wait.until(ExpectedConditions.visibilityOf(table));
        Assert.assertTrue(table.isDisplayed(), "Verify that the table is displayed");
        //Finding table elements clicking each row

        List<WebElement> carList = driver.findElements(By.xpath("//tbod//tr"));

        driver.findElement(By.xpath("(//tbody//tr)[2]")).click();
        Thread.sleep(2000);
//
        for (int i = 1; i <= carList.size(); i++) {
//           driver.findElement(By.xpath("(//tbody//tr)["+i+"]")).click();
//           Thread.sleep(2000);
//            //verfiy 1 araba ismini
//            //verify gneral info title is displayed
//
//            driver.navigate().back();
//            Thread.sleep(2000);
//
//        }


//        List<WebElement> eachCar = driver.findElements(By.cssSelector(".grid-row.row-click-action"));
//        System.out.println("eachCar.size() = " + eachCar.size());
//        for (WebElement car : eachCar) {
//            System.out.println(car.getText());
//        }
//        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//           eachCar.get(1).click();
//        Thread.sleep(3000);
            //  WebElement carInformationForm = driver.findElement(By.cssSelector(".form-horizontal"));
            // Assert.assertTrue(carInformationForm.isDisplayed(),"Verify that for each car information is displayed");
          /*
        for (WebElement eachCarIneachRow : eachCar) {
            eachCarIneachRow.click();
            Thread.sleep(2000);
            WebElement carInformationForm = driver.findElement(By.cssSelector(".form-horizontal"));
            Thread.sleep(2000);
            Assert.assertTrue(carInformationForm.isDisplayed(),"Verify that for each car information is displayed");
            WebElement backclickCar=driver.findElement(By.xpath("//div[@class='pull-left']/div[2]"));
            Thread.sleep(5000);
            backclickCar.click();
            Thread.sleep(5000);

           */
        }


    }
}

