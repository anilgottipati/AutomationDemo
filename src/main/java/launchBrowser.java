import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class launchBrowser {
        public static void main(String[] args) throws InterruptedException {
            // Setup WebDriver (automatically manages the browser driver)
            WebDriverManager.chromedriver().setup();

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
            // Create an instance of ChromeDriver
            WebDriver driver = new ChromeDriver();
            // Open a website
            driver.get("https://www.google.com");
            Thread.sleep(1000);

            // Close the browser
            driver.close();
        }

}
