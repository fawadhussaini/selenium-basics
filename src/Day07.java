import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Day07 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        System.out.println(driver.findElement(By.xpath("//ul[@class='wsb-navigation-rendered-top-level-menu ']")).getText());
        driver.findElement(By.xpath("//a[text()='Our Passion']")).click();
        System.out.println(driver.findElement(By.xpath("//h1")).getText());


        System.out.println(driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000450914902']")).getText());
        System.out.println(driver.findElement(By.xpath("(//h2)[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000450914920']")).getText());
        driver.findElement(By.xpath("//a[@href='menu.html'][@data-title='Menu']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='wsb-element-text'][8]")).getText());

        System.out.println(driver.findElement(By.xpath("//div[@class='wsb-element-text'][7]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='wsb-element-text'][15]")).getText());
        driver.findElement(By.xpath("//a[text()='Check Out']")).click();
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("323@gamil.com");
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("name");
        driver.findElement(By.xpath("//*[@id='address']")).sendKeys("212 k st");

        driver.findElement(By.xpath("(//input)[3]")).sendKeys("card_number");
        driver.findElement(By.xpath("(//input)[4]")).sendKeys("cardHolder name");
        driver.findElement(By.xpath("(//input)[5]")).sendKeys("varification");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();


        Thread.sleep(3000);
        driver.close();

    }
}
