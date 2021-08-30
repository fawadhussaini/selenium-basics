import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Day13 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectclass");
       // Actions action = new Actions(driver);
        driver.findElement(By.xpath("(//li//a)[2]")).click();

        driver.findElement(By.xpath("(//li//a)[2][1]")).click();

        //driver.findElement(By.xpath("//li//a[text()='Frameworks']")).click();

       Thread.sleep(2000);
       driver.close();

    }
}
