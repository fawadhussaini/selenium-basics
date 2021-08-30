import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_Task2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");

        driver.close();


    }
}