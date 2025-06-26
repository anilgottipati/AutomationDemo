import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToClickSports {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\Desktop\\chrome\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("practice");
        driver.findElement(By.id("lastName")).sendKeys("pract");
        driver.findElement(By.id("userEmail")).sendKeys("pract@gmail.com");
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("8765432191");
        driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3')]")).sendKeys("english");
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("hyderabad,telangana");
        driver.findElement(By.id("submit")).click();




        Thread.sleep(100000);
        driver.close();
    }
}
