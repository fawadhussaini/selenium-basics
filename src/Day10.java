import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Day10 {


    public static class Day09_Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io");

            String currentWindow = driver.getWindowHandle();
            System.out.println(currentWindow);

            System.out.println(driver.getTitle());
            driver.findElement(By.linkText("PHP Travels")).click();
            System.out.println(driver.getTitle() + "\n");

            Set<String> windows = driver.getWindowHandles();
//        windows.forEach(eachWindow -> System.out.println(eachWindow));

            for(String eachWindow: windows){
                if (!eachWindow.equalsIgnoreCase(currentWindow)){
                    driver.switchTo().window(eachWindow);
                }
            }
            Thread.sleep(2000);
            System.out.println(driver.getTitle());
            driver.close();
            Thread.sleep(2000);

            driver.switchTo().window(currentWindow);
            driver.findElement(By.linkText("Internet")).click();

            System.out.println(driver.findElement(By.xpath("//h1")).getText());

            Set<String> windows2 = driver.getWindowHandles();
            for(String eachWindow: windows2){
                if (!eachWindow.equalsIgnoreCase(currentWindow)){
                    driver.switchTo().window(eachWindow);
                }
            }

            System.out.println(driver.findElement(By.xpath("//h1")).getText());



        }

    }}