import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day03_Task2 {
    public static void main(String[] args) throws InterruptedException {
    //  m1();
    //  m2();

       // task1();


        task2();

    }

    public static void m1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Inputs")).click();
        String a = "12";
        String b = "10";
        String sum = "";
        int expected = Integer.parseInt(a)+Integer.parseInt(b);
        driver.findElement(By.id("a")).sendKeys(a);
        driver.findElement(By.id("b")).sendKeys(b);

        driver.findElement(By.name("button2")).click();
        sum = driver.findElement(By.name("answer2")).getText();
        int sum1 = Integer.parseInt(sum);
        System.out.println("the result is :"+( expected==sum1));
    }

    public static void m2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.name("first_name")).sendKeys("fawad");
        driver.findElement(By.name("last_name")).sendKeys("aaa");
        driver.findElement(By.name("email")).sendKeys("fawad.hussaini77@gamil.com");
        driver.findElement(By.name("phone")).sendKeys("20212125512");
        driver.findElement(By.name("address")).sendKeys("101 k st ");
        driver.findElement(By.name("city")).sendKeys("Washington");
        driver.findElement(By.name("zip")).sendKeys("20255");
        driver.findElement(By.name("button3")).click();

        String res = driver.findElement(By.name("answer3")).getText();
        System.out.println(res.equalsIgnoreCase("Thanks for contacting us, we will get back to you shortly."));

    }


    public static void task1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("DRESSES")).click();

        WebElement cassualDresses = driver.findElement(By.linkText("Casual Dresses"));
        System.out.println(cassualDresses.getAttribute("href"));
        cassualDresses.click();

        String casualDressesTitle = driver.findElement(By.className("cat-name")).getText();

        System.out.println("|"+casualDressesTitle+"|");
        System.out.println(casualDressesTitle.equalsIgnoreCase("CASUAL DRESSES "));

        driver.navigate().back();

        driver.findElement(By.linkText("Evening Dresses")).click();
        System.out.println(driver.getTitle().equals("Evening Dresses - My Store"));

        driver.close();

    }
    public static void task2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> nameList = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
//        list.forEach(element -> System.out.println(element.getText()));

        for(int i = 0; i < nameList.size(); i++){
            System.out.println("Name: " + nameList.get(i).getText() + " -- Price: " + priceList.get(i).getText());
        }


//        System.out.print(driver.findElement(By.className("inventory_item_name")).getText() + " : ");
//        System.out.println(driver.findElement(By.className("inventory_item_price")).getText());
//
        driver.findElement(By.className("inventory_item_name")).click();
//        nameList.get(0).click();

        System.out.println(driver.findElement(By.className("inventory_details_name")).getText());
        System.out.println(driver.findElement(By.className("inventory_details_desc")).getText());
        System.out.println(driver.findElement(By.className("inventory_details_price")).getText());

        driver.close();


    }


    }
