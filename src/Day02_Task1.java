import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Task1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // to open TLA
        driver.get("http://automation.techleadacademy.io/#/home");
        System.out.println("Title "+driver.getTitle());
        System.out.println( "URL is: "+driver.getCurrentUrl());
        System.out.println("length of URL:"+driver.getCurrentUrl().length());
        Thread.sleep(2000);

        // to epen amazon

        driver.get("http://amazon.com");
        System.out.println("Title "+driver.getTitle());
        System.out.println( "URL is: "+driver.getCurrentUrl());
        System.out.println("length of URL:"+driver.getCurrentUrl().length());
        Thread.sleep(2000);

        // to open theinformation website
        driver.get("http://theinformation.com");
        System.out.println("Title "+driver.getTitle());
        System.out.println( "URL is: "+driver.getCurrentUrl());
        System.out.println("length of URL:"+driver.getCurrentUrl().length());
        Thread.sleep(2000);
        driver.close();
    }
}
