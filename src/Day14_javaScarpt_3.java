import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.util.List;

public class Day14_javaScarpt_3 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();

        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://automation.techleadacademy.io/#/alert");

        System.out.println( driver.getTitle());

        Thread.sleep(500);


        driver.close();


    }
}
