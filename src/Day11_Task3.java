import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day11_Task3 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

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
}
