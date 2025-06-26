import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToClickSports1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Dummy\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);
        driver.findElement(By.id("firstName")).sendKeys("Testing");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Female']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
