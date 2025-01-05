package SeleniumCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("file:///C:/Users/Anil%20G/Desktop/Anil/SeleniumWebSiteTraining/IsEnabled.html");
        Thread.sleep(5000);

        Thread.sleep(1000);
        boolean header = driver.findElement(By.id("submitBtn")).isEnabled();

        boolean header1 = driver.findElement(By.id("disabledBtn")).isEnabled();

        boolean header2 = driver.findElement(By.id("email")).isEnabled();
      
        // Close the browser
        driver.close();
    }
}
