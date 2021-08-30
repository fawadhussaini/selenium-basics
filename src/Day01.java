import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Day01 {
public static void main(String[] args){

    System.out.println("hello, world!");
    System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get(" https://pwr.dominos.com/pwr/KeysLaborDetail.aspx?RGID=2");
    driver.close();
    List<String> list = new ArrayList<>();


}

}
