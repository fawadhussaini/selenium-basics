import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_Task1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/fawadhussaini/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // task 1
//        driver.get("http://automation.techleadacademy.io/#/iframes");
//        driver.switchTo().frame("note");
//        System.out.println(driver.findElement(By.xpath("//nav[@class='navbar navbar-dark bg-dark']/a")).getText());
//        driver.findElement(By.xpath("//input[@class='note-title']")).sendKeys("fawad");
//        driver.findElement(By.xpath("//textarea[@class='note-textarea']")).sendKeys("selenium class");
//        driver.findElement(By.xpath("//i[@class='fas fa-pen text-light new-note']")).click();
//        driver.findElement(By.xpath("//li[@class='list-group-item'][13]")).click();
//        String title1 =  driver.findElement(By.xpath("/html/body/div/div/div[1]/div/ul/li[38]/span")).getText();
//
//
//        if(title1.equals("fawad")){
//            System.out.println(title1);
//            System.out.println("the name matches");
//        }else {
//            System.out.println("no name is not the same");
//            System.out.println(title1);
//        }
        // task 1 copy from slack


        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/iframes");

        // select iframe
        driver.switchTo().frame("note");

        // locate title and text box and insert values
        driver.findElement(By.className("note-title")).sendKeys("Nick");
        driver.findElement(By.className("note-textarea")).sendKeys("Test Note");

        // clicking save button
        driver.findElement(By.cssSelector("i[class='fas fa-save text-light save-note']")).click();

        // selecting newly saved text on the left pane
        driver.findElement(By.xpath("//span[text()='Nick']/parent::li")).click();

        // test for title
        String titleExpectedResult = "Nick";
        String titleActualResult = driver.findElement(By.className("note-title")).getAttribute("value");
        System.out.println("Does the Expected Title and Actual Title match? " + titleExpectedResult + " = " + titleActualResult + " -> " + titleExpectedResult.equals(titleActualResult));

        // test for text
        String textExpectedResult = "Test Note";
        String textActualResult = driver.findElement(By.className("note-textarea")).getAttribute("value");
        System.out.println("Does the Expected Text and Actual Text match? " + textExpectedResult + " = " + textActualResult + " -> " + textExpectedResult.equals(textActualResult));

        // quiting browser
        driver.quit();

    }
}
