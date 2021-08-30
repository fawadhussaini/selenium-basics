import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/home");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Inputs")).click();



        String expectedText = "Test keyword";
        String actualText = "";

        driver.findElement(By.id("message")).sendKeys(expectedText);
        driver.findElement(By.name("button1")).click();

        actualText = driver.findElement(By.name("message1")).getText();

        System.out.println("Is actual equal to expected: " + actualText.equalsIgnoreCase(expectedText));

        Thread.sleep(3000);
        driver.close();
    }
}