import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day09_Task2 {


    public static class Day09_Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io/#/alert");

            driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();
            Alert alert = driver.switchTo().alert();
            Thread.sleep(2000);
            System.out.println(alert.getText());
            alert.accept();

            driver.findElement(By.xpath("//button[@class='btn btn-outline-success']")).click();
            Thread.sleep(2000);
            alert = driver.switchTo().alert();

            alert.sendKeys("99");
            alert.accept();
            driver.close();
        }

    }}