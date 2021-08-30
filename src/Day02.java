import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02 {
   public static void main(String [] args) throws InterruptedException{
//      System.setProperty("webdriver.gecko.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();
//
//      driver.get("https://amazon.com");
      System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

      WebDriver driver = new ChromeDriver();
      // to open the window in full screen.
     // driver.manage().window().maximize();
     // driver.get("https://google.com");
      // driver.get and driver.navaget .to() are the same and driver.navaget is faster.
//      driver.navigate().to("https://google.com");
//      System.out.println(driver.getCurrentUrl());
//
//      Thread.sleep(2000);
//      driver.navigate().to("https:/amazon.com");
//      Thread.sleep(2000);
//      driver.navigate().back();
//      Thread.sleep(2000);
//      driver.navigate().forward();

      // it gets the url of the webside.
     // System.out.println(driver.getPageSource());
      // we not really using it.
      // to print title of the webside..
      System.out.println(driver.getTitle());
      Thread.sleep(3000);
      driver.get("http://automation.techleadacademy.io/#/home");

      String title = driver.findElement(By.id("title")).getText();
      System.out.println(title);

      String text = driver.findElement(By.id("links-header")).getText();
      System.out.println(text);

      

   }
}
