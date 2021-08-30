import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_Task2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/iframes");
        // switching to parent frame
        driver.switchTo().frame("parent-iframe");
        // switching to inner frame
        driver.switchTo().frame("budget-tracker");
        // to fill out to
        driver.findElement(By.id("t-name")).sendKeys("fawad");
        driver.findElement(By.id("t-amount")).sendKeys("100");
        driver.findElement(By.id("add-btn")).click();
        // storing the text in total for later test
        String total = driver.findElement(By.className("total")).getText();

        System.out.println(total);
        // going back to main window
        driver.switchTo().defaultContent();

        // switching to first frame
        driver.switchTo().frame("note");

        driver.findElement(By.className("note-title")).sendKeys("fawad");
        driver.findElement(By.className("note-textarea")).sendKeys(total);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='fas fa-save text-light save-note']")).click();


        driver.findElement(By.xpath("//span[text()='fawad']")).click();
        String res = driver.findElement(By.xpath("//textarea[@class='note-textarea']")).getText();
        System.out.println(res);

        if(res.equals(total)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        driver.quit();

    }
}
