import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyHTC {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("anil.gottipati@transcore.com");
        driver.findElement(By.id("input-password")).sendKeys("Testing@321");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("(//a[@aria-label='Shop by Category'])[2]")).click();
        Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Software')]")).click();
        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@aria-label='Search'])")).sendKeys("HTC");

        int ele = driver.findElements(By.className("text-ellipsis-2")).size();

        for (int i=1;i<ele;i++)
        {
            String expectedDevice = driver.findElement(By.xpath("(//a[@class='text-ellipsis-2'])[" + i + "]")).getText();
            if(expectedDevice=="HTC Touch HD")
            {

            }


        }


        driver.close();
    }
}
