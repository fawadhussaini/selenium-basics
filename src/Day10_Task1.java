import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day10_Task1 {


    public static class Day09_Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");


            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("http://automation.techleadacademy.io");

            String currentWindowID = driver.getWindowHandle();
            System.out.println(currentWindowID);

            List<WebElement> links = driver.findElements(By.className("link"));
            links.forEach(a -> a.click());

            Set<String> allWindowIDs = driver.getWindowHandles();

            Thread.sleep(2000);
            for(String windowID: allWindowIDs){
                if(!windowID.equalsIgnoreCase(currentWindowID)){
                    driver.switchTo().window(windowID);
                    if (driver.getTitle().equalsIgnoreCase("My Store")){
                        break;
                    }
                }
            }

            Thread.sleep(2000);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
        }

    }}