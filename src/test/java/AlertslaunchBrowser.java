import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertslaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
       driver.findElement(By.id("alertButton")).click();
        Alert simpleAlert = driver.switchTo().alert();
        String alertdesc = simpleAlert.getText();
        simpleAlert.accept();

        Assert.assertEquals("You clicked a button",alertdesc);

        // Close the browser
        driver.close();
    }
}
