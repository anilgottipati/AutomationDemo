import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToClickSports1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\Desktop\\chrome\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@name='radioButton']")).click();
        driver.findElement(By.id("autocomplete")).sendKeys("India");
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("name")).sendKeys("welcome");
        driver.findElement(By.id("confirmbtn")).click();




        Thread.sleep(100000);
        driver.close();
    }
}
