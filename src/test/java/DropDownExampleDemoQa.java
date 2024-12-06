import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExampleDemoQa {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/select-menu");
        Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
        se.selectByIndex(7);
        Thread.sleep(5000);
        se.selectByVisibleText("Black");
        Thread.sleep(5000);
        se.selectByValue("6");
        Thread.sleep(5000);

        // Close the browser
        driver.close();
    }
}
