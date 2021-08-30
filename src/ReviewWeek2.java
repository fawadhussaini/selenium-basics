import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ReviewWeek2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
       // driver.get("http://automation.techleadacademy.io/#/selectclass");
        driver.get("https://orbitz.com");
        //driver.close();

        // select class practice
//        WebElement selectE = driver.findElement(By.xpath("//select[@name='select1']"));
//        Select select = new Select(selectE);
//        select.selectByIndex(5);
//        select.selectByVisibleText("Seven");
//        System.out.println(select.isMultiple());
//        List <WebElement> list = select.getAllSelectedOptions();
//        list.forEach(a-> System.out.println(a.getText()));
        //select class practice
//        WebElement selectE = driver.findElement(By.xpath("//select[@name='select2']"));
//
//        Select select = new Select(selectE);
//        System.out.println(select.isMultiple());
//        select.selectByIndex(3);
//        List<WebElement> list = select.getOptions();
//        for(WebElement myList: list){
//            System.out.println(myList.getText());
//        }

        // select class practice multiple select
//        WebElement selectE = driver.findElement(By.id("cars"));
//        Select select = new Select(selectE);
//        select.selectByIndex(2);
//        select.selectByVisibleText("SDET");
//        select.selectByValue("QA");
//        List<WebElement> list1= select.getAllSelectedOptions();
//
//       list1.forEach(l -> System.out.println(l.getText()));


        // alert practice
//        driver.findElement(By.id("alertBox")).click();
//
//        Alert alert = driver.switchTo().alert();
//
//        System.out.println(alert.getText());
//        alert.accept();
//        Thread.sleep(2000);
//        driver.findElement(By.id("confirmBox")).click();
//        alert.accept();
//        String text =  driver.findElement(By.id("output")).getText();
//
//        if(text.equals("You pressed OK in confirmation popup")) {
//            System.out.println(text + "  | " + "You pressed OK in confirmation popup");
//
//        }else {
//            System.out.println("no , text is not there");
//        }
//        driver.findElement(By.id("promptBox")).click();
//        Thread.sleep(2000);
//        alert.sendKeys("fawad");
//        alert.accept();
//        Thread.sleep(2000);
//        driver.close();
    }
}
