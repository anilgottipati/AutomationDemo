package SeleniumCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("file:///C:/Users/Anil%20G/Desktop/Anil/SeleniumWebSiteTraining/EnabledIsSelected.html");
        Thread.sleep(5000);
        boolean newsLetter = driver.findElement(By.id("subscribe")).isSelected();
        Assert.assertTrue(newsLetter);
        driver.findElement(By.id("subscribe")).click();
        boolean newsLetter1 = driver.findElement(By.id("subscribe")).isSelected();
        Assert.assertFalse(newsLetter1);

      
        // Close the browser
        driver.close();
    }
}
