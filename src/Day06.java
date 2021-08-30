import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/notes");


        System.out.println(driver.findElement(By.cssSelector("div#porsche div[class='vehicle-type']")).getText());
        System.out.println(driver.findElement(By.cssSelector("div#porsche div[name]")).getText());
        System.out.println(driver.findElement(By.cssSelector("div#porsche div[name]:nth-child(3)")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class='vehicle-types row'] > div:nth-child(2) > div")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class='vehicle-types row'] > div:nth-child(2) >div:nth-child(2)")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class='vehicle-types row'] > div:nth-child(2) >div:nth-child(3)")).getText());

        driver.close();

    }
}
