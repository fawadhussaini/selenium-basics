import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Day14_javaScarpt_4 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/");
        WebDriverWait wait = new WebDriverWait(driver,60);

        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.id("Kuba"))));
        driver.findElement(By.id("test")).click();


        driver.close();


    }
}
