import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day04_Task1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io");

        List<WebElement> navBtns = driver.findElements(By.cssSelector("a[class*='navbar-brand']"));
        System.out.println(navBtns.size());

        navBtns.forEach(button -> System.out.println("--" + button.getText()));

        driver.findElement(By.cssSelector("a[href='#/selectors']")).click();

        System.out.println(driver.findElement(By.cssSelector("div#lamborghini")).getText());

        driver.close();
    }
}
