import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys("GoonzSquad");
        driver.findElement(By.cssSelector("yt-icon[class='style-scope ytd-searchbox']")).click();
        driver.findElement(By.cssSelector("div#mouseover-overlay")).click();


//        Thread.sleep(5000);
//        driver.close();
    }
}
