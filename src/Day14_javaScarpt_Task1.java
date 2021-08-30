import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Day14_javaScarpt_Task1 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/synchronization");
        WebDriverWait wait = new WebDriverWait(driver, 60);

        driver.findElement(By.id("input-text")).sendKeys("Test message");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("text-display")),"Test message"));

        System.out.println(driver.findElement(By.xpath("//div[text()='Test message']")).getText());
        driver.close();


    }
}
