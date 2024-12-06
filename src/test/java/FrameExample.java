import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of Anil
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/frames");
        Thread.sleep(10000);
        driver.switchTo().frame("frame1");
        String ele = driver.findElement(By.id("sampleHeading")).getText();
        // Close the browser
        driver.close();
    }
}
