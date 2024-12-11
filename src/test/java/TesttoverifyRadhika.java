import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesttoverifyRadhika {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());
        String Actual = driver.getTitle();
        Assert.assertEquals("Google",Actual);
         String ActualURL = driver.getCurrentUrl();
        Assert.assertTrue(ActualURL.contains("google"));
        // Close the browser
        driver.close();
    }
}
