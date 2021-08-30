import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_task1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/actionclass");
        Thread.sleep(3000);

        WebElement rightClickBtn = driver.findElement(By.xpath("//div[@class='container']//button[3]"));

//        action.moveToElement(rightClickBtn).perform();
//        action.contextClick().perform();

//        action.moveToElement(rightClickBtn).contextClick().perform();
        action.contextClick(rightClickBtn).perform();
        driver.close();
    }
}
