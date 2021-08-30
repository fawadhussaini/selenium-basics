import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

import java.util.List;

public class Day08_Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");

        driver.findElement(By.xpath("//div[@id=\"contact-link\"]")).click();
        WebElement selectE = driver.findElement(By.xpath("//div[@class=\"form-group selector1\"][1]"));
        Thread.sleep(2000);
        Select select = new Select(selectE);

        Thread.sleep(2000);
        select.selectByValue("Webmaster");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[@id=\"uniform-id_contact\"][1]")).getText());
        driver.close();

    }
}
