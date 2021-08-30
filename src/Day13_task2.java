import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;

public class Day13_task2 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("http://automation.techleadacademy.io/#/home");
        Thread.sleep(2000);
        // to make background color different
        WebElement h1Element = driver.findElement(By.xpath("//h1"));
        js.executeScript("arguments[0].style.backgroundColor='yellow'",h1Element);
        js.executeScript("arguments[0].style.border ='solid 2px red'",h1Element);
        Thread.sleep(4000);
        driver.close();

    }
}
