import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Set implicit wait time for the WebDriver
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
        int ele = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]")).size();
        for (int i=1;i<=ele;i++)  //1 2 3
        {
            // Try to find an element with implicit wait
            WebElement element = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]"));
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
