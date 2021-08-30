import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.IdentityHashMap;

public class Day12_task5 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // action class


        Actions action = new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/iframes");
        Thread.sleep(3000);

        driver.switchTo().frame("parent-iframe");

        System.out.println(driver.findElement(By.xpath("(//body/div[@id='iframe-text'])")).getText());

        WebElement hello = driver.findElement(By.xpath("(//body/div[@id='iframe-text'])"));
        action.click(hello).doubleClick(hello).perform();
        Thread.sleep(2000);
        action.keyDown(Keys.COMMAND).sendKeys("c").perform();

        driver.get("http://automation.techleadacademy.io/#/inputs");
        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.id("message"));
        action.keyDown(inputField, Keys.COMMAND).sendKeys("v").perform();

        driver.close();

    }
}
