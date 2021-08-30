import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_task4 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // action class


        Actions action = new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/home");
        Thread.sleep(3000);

        WebElement done = driver.findElement(By.xpath("//h1[@id='title']"));
        action.click(done).doubleClick(done).perform();
        action.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();
        Thread.sleep(2000);
        driver.get("http://automation.techleadacademy.io/#/inputs");
        Thread.sleep(2000);

        WebElement inputField = driver.findElement(By.id("message"));
        action.keyDown(inputField, Keys.COMMAND).sendKeys("v").perform();



        driver.close();

    }
}
