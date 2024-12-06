import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("dateOfBirthInput")).click();
         for (int i=0;i<=300;i++)
        {
            driver.findElement(By.xpath("//button[text()='Previous Month']")).click();
            String ele = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__current-month')]")).getText();
            if(ele.contains("March 2023"))
            {
                driver.findElement(By.xpath("//div[text()='17']")).click();
                break;
            }
        }
        // Close the browser
        driver.close();
    }
}
