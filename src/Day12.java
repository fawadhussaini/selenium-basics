import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // action class


        Actions action = new Actions(driver);

        driver.get("https://www.amazon.com/");

        Thread.sleep(3000);
        action.moveToElement(driver.findElement(By.xpath("//li[@class='nav_last']"))).perform();
        //driver.close();

    }
}
