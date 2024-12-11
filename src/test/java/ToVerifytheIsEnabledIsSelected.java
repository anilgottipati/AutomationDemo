import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifytheIsEnabledIsSelected {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/");

        driver.findElement(By.xpath("//*[contains(text(),'Forms')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'Practice Form')]")).click();
        Thread.sleep(3000);
        boolean ele = driver.findElement(By.xpath("//h1[contains(text(),'Practice Form')]")).isDisplayed();
        Thread.sleep(3000);
        Assert.assertTrue(ele);

        driver.close();
    }
}
