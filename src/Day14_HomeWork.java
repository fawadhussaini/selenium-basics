import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.DateFormatter;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.concurrent.TimeUnit;
// the new changes
//==========
public class Day14_HomeWork {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;

        driver.get("https://orbitz.com");
        driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']")).click();
        driver.findElement(By.id("location-field-destination")).sendKeys("Las Vegas");
        driver.findElement(By.xpath("//div[@class='truncate']")).click();

        //Selecting dates
        driver.findElement(By.id("d1-btn")).click();

        //Getting current date and plus 2 weeks
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String currentDate = formatter.format(date);
        String futureDate = formatter.format(date.plusDays(14));

//        try{
//            driver.findElement(By.xpath("//button[@aria-label='" + currentDate + "']")).click();
//        } catch (NoSuchElementException e){
//            System.out.println("Exception was handled");
//            driver.findElement(By.xpath("//button[@data-stid='date-picker-paging']")).click();
//            driver.findElement(By.xpath("//button[@aria-label='" + currentDate + "']")).click();
//        }

        driver.findElement(By.xpath("//button[@data-stid='date-picker-paging']")).click();
        driver.findElement(By.xpath("//button[@aria-label='" + currentDate + "']")).click();

        driver.findElement(By.xpath("//button[@aria-label='" + futureDate + "']")).click();
        driver.findElement(By.xpath("//button[text()='Done']")).click();

        //Selecting rooms
        driver.findElement(By.xpath("//button[@data-testid='travelers-field-trigger']")).click();
        driver.findElement(By.xpath("(//button[@class='uitk-flex-item uitk-step-input-button'])[4]")).click();
        driver.findElement(By.xpath("(//button[@class='uitk-flex-item uitk-step-input-button'])[4]")).click();

        //selecting child ages
        Select select1 = new Select(driver.findElement(By.id("child-age-input-0-0")));
        select1.selectByVisibleText("2");

        Select select2 = new Select(driver.findElement(By.id("child-age-input-0-1")));
        select2.selectByVisibleText("4");

        driver.findElement(By.xpath("//*[text()='Add another room']")).click();
        driver.findElement(By.xpath("(//button[@class='uitk-flex-item uitk-step-input-button'])[6]")).click();
        driver.findElement(By.xpath("//button[@data-testid='guests-done-button']")).click();

        //clicking Search button
        driver.findElement(By.xpath("//*[text()='Search']")).click();

        //moving to the bottom of the page
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//footer")));

        //capturing and printing out all hotel names
        List<WebElement> hotels = driver.findElements(By.xpath("//section[@class='results']//div[starts-with(@class,'uitk-layout-grid')]/h3"));
//        hotels.forEach(each -> System.out.println(each.getText()));

        Map<String, Integer> price = new HashMap<>();
        Map<String, Double> rating = new HashMap<>();
        Map<String, Integer> discount = new HashMap<>();

        List<WebElement> allItems = driver.findElements(By.xpath("//ol/li[contains(@class, 'horizontal')]"));

        for(int i=0; i < allItems.size(); i++){
            //name of the hotel
            String hotelName = allItems.get(i).findElement(By.xpath(".//div[starts-with(@class,'uitk-layout-grid')]/h3")).getText();

            //price of the hotel
            String tempPrice = allItems.get(i).findElement(By.xpath(".//span[@data-stid='price-lockup-text']")).getText();
            int actualPrice = Integer.parseInt(tempPrice.substring(1));

            //rating of the hotel
            String tempRating = allItems.get(i).findElement(By.xpath(".//span[@data-stid='content-hotel-reviews-rating']")).getText();
            double actualRating = Double.parseDouble(tempRating.substring(0, tempRating.indexOf("/")).replace(",",""));

            List<WebElement> d1 = allItems.get(i).findElements(By.xpath(".//span[contains(text(), '%')]"));

            int actualDiscount = 0;
            if (d1.size() > 0) {
                String tempDiscount = d1.get(0).getText();
                actualDiscount = Integer.parseInt(tempDiscount.substring(tempDiscount.indexOf("%") - 2, tempDiscount.indexOf("%")).trim());
            }

            //storing in the map
            if (actualPrice > 100)
                price.put(hotelName, actualPrice);
            if (actualDiscount >= 20)
                discount.put(hotelName, actualDiscount);
            if (actualRating >= 4.5)
                rating.put(hotelName, actualRating);
        }


        // driver.close();



        // second branch fawad

//        1. Navigate to https://orbitz.com
//        2. By default "Hotel" is already selected
//        3. Going to - "Las Vegas, Nevada"
//        4. Check-in - Selects today's date
//        5. Check-out - 2 weeks later
//        6. Rooms - 2
//        a. Room 1:
//        i. Adults - 2
//        ii. Children - 2
//        1) Child 1 - 2
//        2) Child 2 - 4
//        b. Room 2:
//        i. Adults - 2
//        7. Click on Search
//        8. Print out names of all hotels displayed
//        9. Store all these Hotels in maps(3 different) by following criteria:
//        a. >= 4.5 stars
//        i. Output: Hotel name + stars
//        b. Has discount over 20%
//                i. Output: Hotel name + discount
//        c. Price is >$100
//        i. Output: Hotel name + price
//        10. Print out from 3 maps:
//        a. All values of each map
//        b. Hotels which has all of the  following criteria:
//			○ above 4.5 stars
//			○ price above $100
//			○ discount over 20%


    }
}
