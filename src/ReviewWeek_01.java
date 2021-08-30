import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewWeek_01 {
    public static void main(String[] args) throws InterruptedException{

        // task1();
        // task2();
        // task3();
        task4();

    }
    public static void task1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl().length());


        driver.close();
    }

    public static void task2(){

        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com");
        driver.findElement(By.linkText("DRESSES")).click();
        System.out.println( driver.findElement(By.linkText("DRESSES")).getAttribute("href"));
        driver.findElement(By.linkText("Casual Dresses")).click();

        String res =  driver.findElement(By.className("cat-name")).getText();
        System.out.println("is the header \"CASUAL DRESSES\":"+res.equals("CASUAL DRESSES"));
        driver.navigate().back();
        driver.findElement(By.linkText("Evening Dresses")).click();
        driver.close();
    }

    public static void task3(){
        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        System.out.println(driver.findElement(By.id("login_credentials")).getText());

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println();

        List<WebElement> list = driver.findElements(By.cssSelector("div[class = inventory_item_name]"));
        List<WebElement> myList = driver.findElements(By.cssSelector("div[class = inventory_item_price]"));

        //list.forEach(webElement -> System.out.println(webElement.getText()));
        for(int i = 0 ;  i < list.size() ; i++){
            System.out.println(list.get(i).getText()+" : "+myList.get(i).getText());
        }
        driver.findElement(By.cssSelector(".inventory_item_img")).click();
        System.out.println(driver.findElement(By.className("inventory_details_name")).getText());
        System.out.println(driver.findElement(By.className("inventory_details_desc")).getText());
        System.out.println(driver.findElement(By.className("inventory_details_price")).getText());

        driver.close();

    }

    public static void task4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        List<WebElement> list = driver.findElements(By.cssSelector("ul[id=homefeatured]>li[class^='ajax_block_product col-xs-12']>div>div>h5"));
        List<WebElement> list2 = driver.findElements(By.cssSelector("ul[id=homefeatured]>li[class^='ajax_block_product col-xs-12']>div>div>div>span[itemprop ='price']"));
        for(int i = 0; i <list.size(); i++){
            System.out.print(list.get(i).getText()+" | ");
            System.out.println(list2.get(i).getText());
        }

        driver.findElement(By.cssSelector("a[class='product-name'][href*='product=1&controller']")).click();


        driver.findElement(By.cssSelector("input[type='text'][value='1']")).clear();

        driver.findElement(By.cssSelector("input[type='text'][value='1']")).sendKeys("5");

        driver.findElement(By.cssSelector("div[class='box-cart-bottom']>div>p")).click();
       Thread.sleep(1000);
        // i can not print the text and price .
       // System.out.println(driver.findElement(By.cssSelector("div[class='layer_cart_cart col-xs-12 col-md-6']>div[class='layer_cart_row']>strong[class='dark")).getText());
        Thread.sleep(3000);

       // System.out.println(driver.findElement(By.cssSelector("div>div[class='layer_cart_row'")).getText());



        Thread.sleep(1000);

        String TotalProduct = driver.findElement(By.cssSelector("span[class='ajax_block_products_total']")).getText();
        Thread.sleep(1000);
        String TotalShipping = driver.findElement(By.cssSelector("span[class='ajax_cart_shipping_cost']")).getText();
        Thread.sleep(1000);
        String  total= driver.findElement(By.cssSelector("div>span[class='ajax_block_cart_total']")).getText();

        System.out.println("products price is: "+TotalProduct);
        System.out.println("Shipping price is: "+TotalShipping);
        System.out.println("Total price is: "+total);
        driver.findElement(By.cssSelector("a[class='btn btn-default button button-medium']")).click();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.cssSelector("td[class='cart_description']")).getText());
        Thread.sleep(3000);
        String TotalP = driver.findElement(By.cssSelector("td#total_product")).getText();
        Thread.sleep(3000);
        String TotalS = driver.findElement(By.cssSelector("td#total_shipping")).getText();
        Thread.sleep(3000);
        String t =  driver.findElement(By.cssSelector("td#total_price_without_tax")).getText();
        Thread.sleep(3000);
        System.out.println("current price "+TotalProduct+" | "+"previouse price "+ TotalP );
        System.out.println("current shipping "+TotalShipping+" | "+"previouse shipping "+ TotalS );
        System.out.println("current total "+total+" | "+"previouse total "+ t );

        Thread.sleep(5000);

        driver.close();
    }

}
