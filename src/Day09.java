import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day09 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Select select = new Select(driver.findElement(By.className("product_sort_container")));

        List<WebElement> options = select.getOptions();
//        options.forEach(eachOption -> System.out.println(eachOption.getText()));

        select.selectByValue("lohi");
        Thread.sleep(2000);
        select = new Select(driver.findElement(By.className("product_sort_container")));

//        System.out.println(select.getFirstSelectedOption().getText());

        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        for(int i = 0; i < prices.size()-1; i++){
            String currentPrice = prices.get(i).getText();
            String nextPrice = prices.get(i+1).getText();

            double price1 = Double.parseDouble(currentPrice.substring(1));
            double price2 = Double.parseDouble(nextPrice.substring(1));

            if (price1 <= price2){
                System.out.println("Test Passed");
                System.out.println("Price 1: " + price1 + " | Price 2: " + price2);
            }
        }

        driver.close();
    }
}
