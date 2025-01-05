package SeleniumCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("file:///C:/Users/Anil%20G/Desktop/Anil/SeleniumWebSiteTraining/HospitalRegistration.html");
        Thread.sleep(5000);
//       WebElement ele = driver.findElement(By.id("gender"));
        Select gender = new Select(driver.findElement(By.id("gender")));
//        Select gender1 = new Select(ele);
        gender.selectByIndex(0);
        gender.selectByVisibleText("Female");
        gender.selectByValue("other");

      
        // Close the browser
        driver.close();
    }
}
