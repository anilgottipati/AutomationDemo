import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToClickSports2 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\Desktop\\chrome\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Testing");
        Thread.sleep(5000);
        driver.findElement(By.id("submit")).click();
        String Nme = driver.findElement(By.id("name")).getText();
        Assert.assertEquals("Name:Testing",Nme);
        driver.findElement(By.id("userEmail")).sendKeys("testing@gmail.com");
        Thread.sleep(5000);
        String eme = driver.findElement(By.id("email")).getText();
        Assert.assertEquals("Email:testing@gmail.com", eme);
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("hyderabad");
        Thread.sleep(50000);
        driver.findElement(By.id("submit")).click();
        String curr = driver.findElement(By.id("currentAddress")).getText();
        Assert.assertEquals("Current Address :hyderabad",curr);








        Thread.sleep(5000);
        driver.close();
    }
}
