import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("input#login-button")).click();

       List<WebElement> list =  driver.findElements(By.cssSelector("div.inventory_item_name"));
       for(WebElement MyList : list){
           System.out.println(MyList.getText());
       }
        System.out.println(driver.findElement(By.cssSelector("div.inventory_item_price")).getText());


        driver.close();

    }
}
