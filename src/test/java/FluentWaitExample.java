import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Create a FluentWait instance with a maximum wait time of 20 seconds
        // Check for the condition every 2 seconds and ignore NoSuchElementException
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))     // Maximum time to wait
                .pollingEvery(Duration.ofSeconds(2))     // Frequency of checking the condition
                .ignoring(NoSuchElementException.class); // Exception to ignore during wait
// Wait until the element is clickable
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("someElement"));
            }
        });

        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
        int ele = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]")).size();
        for (int i=1;i<=ele;i++)  //1 2 3
        {
            // Try to find an element with implicit wait
            WebElement element1 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]"));
            String ele1 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).getText();
            if(ele1.contains("Reading"))
            {
                driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).click();
            }
        }
        // Close the browser
        driver.close();
    }
}
