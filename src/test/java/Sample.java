
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.*;


public class Sample {
    public static void main(String[] args) throws InterruptedException {
       // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
//Test
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
       // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://www.google.com");
        Thread.sleep(10000);
        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());
        String Actual = driver. getTitle();



        // Close the browser
        driver.quit();
    }
}
