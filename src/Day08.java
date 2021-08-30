import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day08 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");

       List<WebElement> list =  driver.findElements(By.xpath("//div[@id='porsche']/div/div/child::div"));
       for (WebElement a : list){
           System.out.println(a.getText());
       }
        driver.close();

    }
}
