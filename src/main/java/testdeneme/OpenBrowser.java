package testdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        // driver.get("https://www.google.com");
       //driver.navigate().to("https://www.google.com");

        /* driver.navigate().to("https://www.ebay.co.uk");
       Thread.sleep(3000);
       driver.navigate().back();
       driver.navigate().to("https://cybertekschool.okta.com/");
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().refresh();  */
        driver.quit();
    }
}