import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day09_Task5 {


    public static class Day09_Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io/#/popup");
            driver.findElement(By.id("bmi_btn")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='form-control'][@name='feet']")).sendKeys("5");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='form-control'][@name='inch']")).sendKeys("9");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='form-control'][@name='weight']")).sendKeys("226");
            Thread.sleep(2000);
            driver.findElement(By.id("calculate_btn")).click();
            Thread.sleep(2000);
            String res =  driver.findElement(By.id("result_progress")).getText();
            Thread.sleep(2000);
            double num = Double.parseDouble(res);
            if(num<18.5)  {
                System.out.println("under weight");
            }else if(num>= 18.5 && num <25){
                System.out.println("normal");
            }
            else if(num>= 25 && num <30){
                System.out.println("over weight");
            }else {
                System.out.println("obese");
            }


        }

    }}