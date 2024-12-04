import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caleanders {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\'Surekha'\\Desktop\\Chrome\\chromedriver.exe");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("dateOfBirthInput")).click();
        for (int i = 0; i <= 200; i++) {

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











