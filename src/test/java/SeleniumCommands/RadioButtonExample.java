package SeleniumCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("file:///C:/Users/Anil%20G/Desktop/Anil/SeleniumWebSiteTraining/EnabledIsSelected.html");
        Thread.sleep(5000);
        boolean ele = driver.findElement(By.name("subscribe")).isSelected();
        Assert.assertTrue(ele);
        boolean ele1 = driver.findElement(By.id("female")).isSelected();
        Assert.assertTrue(ele1);
        driver.findElement(By.id("male")).click();
        boolean ele3 = driver.findElement(By.id("female")).isSelected();
        Assert.assertFalse(ele3);
        boolean MaleRadioButton = driver.findElement(By.id("male")).isSelected();
        Assert.assertTrue(MaleRadioButton);

      
        // Close the browser
        driver.close();
    }
}
