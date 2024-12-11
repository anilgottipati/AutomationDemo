import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
        int ele = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]")).size();
        for (int i=1;i<=ele;i++)  //1 2 3
        {

            // Wait explicitly for an element to be visible
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")));

            String ele1 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).getText();
            if(ele1.contains("Reading"))
            {
                driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).click();
            }
        }
        // Close the browser
        driver.close();

//        Aspect	Implicit Wait	Explicit Wait
//        Scope	Global for all elements in the WebDriver	Specific to the element and condition
//        Time Duration	Defined once for all elements	Defined individually for each wait condition
//        Type of Wait	Automatically waits for a given time	Waits for a specific condition (visibility, clickability, etc.)
//        Use Case	When you don't know which element might take time	When you know which element and condition to wait for
    }
}
