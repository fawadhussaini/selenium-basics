import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Day14_HomeWork {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        driver.close();
        // this the homework for selenium class and due tommorrow
        // idk what to do . to start or no lol
        

//        1. Navigate to https://orbitz.com
//        2. By default "Hotel" is already selected
//        3. Going to - "Las Vegas, Nevada"
//        4. Check-in - Selects today's date
//        5. Check-out - 2 weeks later
//        6. Rooms - 2
//        a. Room 1:
//        i. Adults - 2
//        ii. Children - 2
//        1) Child 1 - 2
//        2) Child 2 - 4
//        b. Room 2:
//        i. Adults - 2
//        7. Click on Search
//        8. Print out names of all hotels displayed
//        9. Store all these Hotels in maps(3 different) by following criteria:
//        a. >= 4.5 stars
//        i. Output: Hotel name + stars
//        b. Has discount over 20%
//                i. Output: Hotel name + discount
//        c. Price is >$100
//        i. Output: Hotel name + price
//        10. Print out from 3 maps:
//        a. All values of each map
//        b. Hotels which has all of the  following criteria:
//			○ above 4.5 stars
//			○ price above $100
//			○ discount over 20%


    }
}
