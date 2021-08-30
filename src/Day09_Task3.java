import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day09_Task3 {


    public static class Day09_Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io/#/alert");

            driver.findElement(By.id("generate-password")).click();
            Alert alert = driver.switchTo().alert();
            Thread.sleep(2000);
            System.out.println(alert.getText());
            alert.sendKeys("8");
            alert.accept();
            alert.accept();
            alert.dismiss();
            alert.accept();
            alert.accept();
            System.out.println(alert.getText());
            alert.accept();

            driver.close();

        }

    }
}