import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day09_Task4 {


    public static class Day09_Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io/#/popup");
            driver.findElement(By.xpath("//*[text()='Message']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("exampleInputEmail1")).sendKeys("test@mail.test");
            driver.findElement(By.id("message-text")).sendKeys("test message");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


        }

    }}