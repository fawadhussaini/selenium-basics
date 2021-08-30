import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day11_Task4 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

// 1. Open https://www.amctheatres.com/
        driver.get("https://www.amctheatres.com/");

// 2. Print out main text of Welcome! pop-up window
        System.out.println("\n***Printing Welcome! pop-up window text***");
        System.out.println(driver.findElement(By.xpath("//p[@class='onboarding-tour-modal__body']")).getText());

// 3. Click "Let's Go!" option of pop-up window
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='Btn Btn--Primary']")).click();

// 4. Print out text of pop-up window "Get More with AMC Stubs"
        System.out.println("\n***Printing out text of pop-up window \"Get More with AMC Stubs\"***");
        System.out.println(driver.findElement(By.xpath("//p[@class='tourtip__content']")).getText());

// 5. Close the pop-up
        driver.findElement(By.xpath("//button[@class='Btn Btn--icon tourtip__container-close']")).click();

// 6. Close the pop-up (didn't appear, so skip) // ?

// 7. Click all following buttons to open new pages:

        String originalWindow = driver.getWindowHandle();

        List<WebElement> bottomLinks = driver.findElements(By.xpath("//div[@class='SiteFooter-social']/ul/li"));
        Thread.sleep(2000);
        bottomLinks.forEach(e -> e.click());

// 8. Print out specific section of each following websites:
        System.out.println("\n*** a. Pinterest ***");
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows){
            driver.switchTo().window(window);
            if (driver.getTitle().contains("Pinterest")){
                break;
            }
        }


        System.out.println(driver.getTitle());



       // driver.quit();

    }
}
