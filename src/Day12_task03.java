import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_task03 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();


        Actions action = new Actions(driver);

        driver.get("http://automation.techleadacademy.io/#/actionclass");
        Thread.sleep(3000);
        WebElement workout = driver.findElement(By.id("todo3"));
        WebElement target = driver.findElement(By.xpath("//div//div[@id='div1']"));

        action.dragAndDrop(workout,target).perform();
        driver.close();

    }
}
