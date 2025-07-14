
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyAnil {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Dummy\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(5000);
        boolean ele = driver.findElement(By.xpath("//*[text()='Customer ID/ User ID']")).isDisplayed();
        Assert.assertTrue(ele);
        // Close the browser
        driver.close();
    }
}