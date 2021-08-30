import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/notes");
        driver.manage().window().maximize();
        System.out.println( driver.findElement(By.cssSelector("div>h5[class='sc-gtsrHT gfuSqG']")).getText());
        // to print Tag +ID
        System.out.println("1. "+ driver.findElement(By.cssSelector("li>p[class='sc-dlnjwi dJXsSm']")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("p#first-list-item")).getText());

        // to print Tag + class

        driver.close();

    }
}