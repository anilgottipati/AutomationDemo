import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        practiceFormPage.login("Admin","admin123");
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        Thread.sleep(5000);
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//*[@type='submit']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[text()='Admin']")).click();

        // Close the browser
        driver.close();
    }
}
