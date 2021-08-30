import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;

public class Day14_javaScarpt {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);


        driver.get("http://automation.techleadacademy.io/#/actionclass");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // to get the title of the page by java script
        String title= js.executeScript("return document.title").toString();
        System.out.println(title);
        // to click on something by javascript
        WebElement homeBtn = driver.findElement(By.linkText("Home"));
        js.executeScript("arguments[0].click();", homeBtn);

        Thread.sleep(3000);
        driver.close();


    }
}
