import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToEnterNameAnil {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
        SurpracticeformPage surpracticeformPage = new SurpracticeformPage(driver);
//        driver.findElement(By.id("name")).sendKeys("Sample");
        surpracticeformPage.enterUserName("Sample");
        // Close the browser
        driver.close();
    }
}
