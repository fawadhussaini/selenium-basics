import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");
        driver.findElement(By.cssSelector("a#shopping-cart")).click();
        driver.findElement(By.cssSelector("div.shelf-item__buy-btn")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
