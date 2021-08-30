import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_task7 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();


        Actions action = new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/actionclass");
        Thread.sleep(3000);

        WebElement logo = driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg m-2']"));
        System.out.println("tooltip: - " + logo.getAttribute("data-tip"));

    }
}
