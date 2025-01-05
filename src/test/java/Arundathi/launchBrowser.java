package Arundathi;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("C:\\Users\\Anil G\\Desktop\\Anil\\SeleniumWebSiteTraining\\Site1.html");
        Thread.sleep(5000);
        boolean header = driver.findElement(By.xpath("//h1[text()='Welcome to My Test Site!']")).isDisplayed();
        Thread.sleep(1000);
        Assert.assertTrue(header);
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("submitBtn")).click();
        String welcomeMsg = driver.findElement(By.id("welcomeMessage")).getText();
        Assert.assertEquals("welcome back, user!",welcomeMsg);
        Assert.assertTrue(welcomeMsg.contains("welcome back"));
        // Close the browser
        driver.close();
    }
}
