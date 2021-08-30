import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_task2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // action class


        Actions action = new Actions(driver);

        driver.get("http://automation.techleadacademy.io/#/actionclass");
        Thread.sleep(3000);
        WebElement doubleclick= driver.findElement(By.xpath("//button[@class='btn btn-warning m-2 btn-lg']"));
        action.doubleClick(doubleclick).perform();

        driver.close();

    }
}
