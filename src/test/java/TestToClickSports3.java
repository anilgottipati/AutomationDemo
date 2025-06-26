import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToClickSports3 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\Desktop\\chrome\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
        Thread.sleep(10000);
        WebElement result = driver.findElement(By.className("text-success"));
        Assert.assertEquals("You have selected Impressive",result);







        Thread.sleep(10000);
        driver.close();
    }
}
