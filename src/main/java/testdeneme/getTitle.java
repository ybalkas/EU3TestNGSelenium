package testdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.amazon.co.uk/");
         String title=driver.getTitle();
        System.out.println("title="+title);
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
       driver.findElement(By.linkText("https://www.amazon.co.uk/")).sendKeys(selectLinkOpeninNewTab);
    }

}
