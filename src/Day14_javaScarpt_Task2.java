import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Day14_javaScarpt_Task2 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/synchronization");
        WebDriverWait wait = new WebDriverWait(driver, 60);
        //  to do
        // click on desplayalert and wait and then print the text.

        driver.findElement(By.xpath("//div//button[@class='btn btn-warning']")).click();


        Alert alert  = driver.switchTo().alert();
       // wait.until(ExpectedConditions.textToBePresentInElement();

        System.out.println(driver.findElement(By.xpath("//div[text()='Test message']")).getText());
        driver.close();
        // to do
        // Weather Dashbord in the same page is displat alert , insert a city and wait and print text.



    }
}
