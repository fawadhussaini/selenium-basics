import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/notes");

        System.out.println(driver.findElement(By.cssSelector("div>h5[class='sc-gtsrHT gfuSqG']")).getText());

        System.out.println("1. "+driver.findElement(By.cssSelector("li>p[class='sc-dlnjwi dJXsSm']")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("p#first-list-item")).getText());

        System.out.println("2. "+driver.findElement(By.cssSelector("li:nth-child(2)>p")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li>p>p[class='sc-eCApnc iylGhi']")).getText());

        System.out.println("3. "+driver.findElement(By.cssSelector("li:nth-child(3)>p")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li>p>p[title='attribute'][class='sc-eCApnc iylGhi']")).getText());

        System.out.println("4. "+driver.findElement(By.cssSelector("li:nth-child(4)>p")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("p[name='code-block']")).getText());

        System.out.println("5. "+driver.findElement(By.cssSelector("li:nth-child(5)>p")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(5)>p>p[class='sc-eCApnc iylGhi']")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(5)>p>p:nth-child(3)")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(5)>p>p:nth-child(5)")).getText());

        System.out.println("6. "+driver.findElement(By.cssSelector("li:nth-child(6)>p")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(6)>p>p:nth-child(1)")).getText());

        System.out.println("7. "+driver.findElement(By.cssSelector("li:nth-child(7)>p")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(7)>p>p:nth-child(1)")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(7)>p>p:nth-child(3)")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(7)>p>p:nth-child(6)")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(7)>p>p:nth-child(8)")).getText());
        System.out.println("     "+driver.findElement(By.cssSelector("li:nth-child(7)>p>p:nth-child(10)")).getText());

        driver.close();
    }


}
