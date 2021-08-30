import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
public class ReviewWeek_03 {
    public static void main(String[] args) throws InterruptedException{
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        task9();
    }
    // Xpath selector practice
    public static void task1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");
        driver.findElement(By.xpath("//a[@class='navbar-brand ml-3'][@href='#/notes']")).click();
        driver.findElement(By.xpath("//div/span[@class='menu-icon']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/a[@data-text='Xpath']")).click();
        System.out.println( driver.findElement(By.xpath("//p[@class='sc-dlnjwi dJXsSm']")).getText());

        driver.close();
    }
    // select class practice
    public static void task2() {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectclass");
        WebElement selected = driver.findElement(By.xpath("//select[@class='custom-select']"));

        Select select = new Select(selected);
        select.selectByValue("One");
        select.selectByIndex(1);
        select.selectByVisibleText("Three");


        System.out.println(  select.isMultiple());

        WebElement selecc = driver.findElement(By.id("cars"));
        Select select1 = new Select(selecc);
        select1.selectByIndex(2);
        select1.selectByVisibleText("QA");
        System.out.println(select1.isMultiple() );
        List<WebElement> option = select1.getAllSelectedOptions();
        for(WebElement a : option){
            System.out.println(a.getText());

        }
        System.out.println(select1.getAllSelectedOptions());

        driver.close();
    }
    // alert practice
    public static void task3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/alert");
        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(3000);
        driver.close();
    }
    //pop up window
    public static void task4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/popup");
        driver.findElement(By.xpath("//*[text()='Message']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("test@mail.test");
        driver.findElement(By.id("message-text")).sendKeys("test message");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.close();
    }
    //multiple window
    public static void task5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        // to get one window ID
//        String windowID = driver.getWindowHandle();
//        driver.switchTo().window(windowID);
//        Thread.sleep(2000);
        // to get the ID of all the windows
        List<WebElement> links = driver.findElements(By.xpath("//a[@class='link']"));
        links.forEach(webElement -> webElement.click());
        String thisWindowId = driver.getWindowHandle();
        Set<String> allTheIds =  driver.getWindowHandles();
        for(String s : allTheIds){
            if(!s.equalsIgnoreCase(thisWindowId)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle() + " window id is : "+s);
            }
        }
        driver.quit();


    }
    //iframe
    public static void task6() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/iframes");
        // switching to iframe
        driver.switchTo().frame("note");
        // sending value to title and note area
        driver.findElement(By.xpath("//input[@class='note-title']")).sendKeys("fawad");
        driver.findElement(By.xpath("//textarea[@class='note-textarea']")).sendKeys("I am testing the frame");
        // clicking on save button to  save the input.
        driver.findElement(By.xpath("//i[@class='fas fa-save text-light save-note']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
    // iframe nested .
    public static void task7() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/iframes");
        // switching to iframe
        Thread.sleep(2000);
        driver.switchTo().frame("parent-iframe");
        driver.switchTo().frame("budget-tracker");
        driver.findElement(By.id("t-name")).sendKeys("BTC");
        driver.findElement(By.id("add-btn")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("note");
        driver.findElement(By.xpath("//input[@class='note-title']")).sendKeys("fawad");
        driver.findElement(By.xpath("//textarea[@class='note-textarea']")).sendKeys("I am testing the frame");

        driver.findElement(By.xpath("//i[@class='fas fa-save text-light save-note']")).click();

        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.quit();
    }
    //working with table.
    public static void task8() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/tables");
        List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[1]"));
        List<WebElement> lastName = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        List<WebElement> age = driver.findElements(By.xpath("//tbody/tr/td[4]"));

        for(int i=0; i < names.size(); i++){
            System.out.println(names.get(i).getText()+" "+lastName.get(i).getText()+" is "+age.get(i).getText()+" years old");
        }
        driver.close();
    }
    // action class
    public static void task9() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/actionclass");
        action.moveToElement(driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg m-2']"))).perform();
        Thread.sleep(2000);
        driver.close();
    }
 }