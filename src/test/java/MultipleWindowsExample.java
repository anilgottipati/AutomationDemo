import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // How are you Main
        // How are you Branch123
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
              // Open a website
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(10000);
        practiceFormPage.ClickButton("tabButton");
        Set<String> allWindowHandles = driver.getWindowHandles();


        // Create an iterator to loop through all window handles
        Iterator<String> iterator = allWindowHandles.iterator();

        // Loop through each window handle
        String mainWindow = iterator.next();  // Main window -->Parent Window
        String newWindow = iterator.next();   // New window -->Child Window
        Thread.sleep(5000);
        // Switch to the new window
        driver.switchTo().window(newWindow);
        Thread.sleep(5000);
        // Perform actions on the new window (for example, print the title)
        System.out.println("Title of the new window: " + driver.getCurrentUrl());
        Assert.assertEquals("https://demoqa.com/sample",driver.getCurrentUrl());

        // Switch back to the main window
        driver.switchTo().window(mainWindow);

        // Perform actions on the main window
        System.out.println("Title of the new window: " + driver.getCurrentUrl());
        Assert.assertEquals("https://demoqa.com/browser-windows",driver.getCurrentUrl());
        // Close the browser
        driver.close();
    }
}
