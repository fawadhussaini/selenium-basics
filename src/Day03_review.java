import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_review {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/home");

        WebElement homeLink = driver.findElement(By.linkText("Home"));
        System.out.println(homeLink.getText());

        WebElement passionTeaLink = driver.findElement(By.partialLinkText("Passion"));
        System.out.println(passionTeaLink.getText());

        driver.close();

    }
}
