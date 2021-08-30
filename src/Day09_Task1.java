import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day09_Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        Select select = new Select(driver.findElement(By.id("cars")));
        Thread.sleep(3000);
        select.selectByValue("Developer");
        Thread.sleep(3000);
        select.selectByIndex(7);
        Thread.sleep(3000);
        select.selectByVisibleText("Product Owner");

        List<WebElement> list = select.getAllSelectedOptions();
//        list.forEach(a-> System.out.println(a.getText()));

        System.out.println(select.isMultiple());
        Thread.sleep(3000);
        select.deselectByIndex(7);
        Thread.sleep(3000);
        select.deselectAll();

        driver.close();
    }}
