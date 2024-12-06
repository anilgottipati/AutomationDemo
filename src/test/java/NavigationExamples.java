import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExamples {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        // Print the title of the page

//        driver.findElement(By.id("APjFqb")).sendKeys("Cricket Scores");
        driver.findElement(By.xpath("//a[text()='Store']")).click();
        Thread.sleep(5000);
        String ActualURL = driver.getCurrentUrl();
        Assert.assertTrue(ActualURL.contains("store.google"));
        driver.navigate().back();
        Thread.sleep(5000);
        String ActualGoogle = driver.getCurrentUrl();
        Assert.assertTrue(ActualGoogle.contains("google"));
        // Close the browser
        driver.close();
    }
}
