import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day13_task1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/selectclass");
        action.moveToElement(driver.findElement(By.linkText("Front End Design"))).perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.linkText("CSS"))).perform();

        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.linkText("Frameworks"))).click().perform();


        Thread.sleep(3000);

       driver.close();

    }
}
