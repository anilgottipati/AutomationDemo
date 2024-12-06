import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class app {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");

        driver.get("https://demoqa.com/automation-practice-form");

        practiceform practiceform = new practiceform(driver);
        practiceform.enterFirstname("radhika");

        driver.findElement(By.id("firstname")).sendKeys("Radhika");
        Thread.sleep(2000);
        driver.findElement(By.id("Lastname")).sendKeys("anu");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("anu@123gmail.com");;
        Thread.sleep(2000);
        driver.findElement(By.id("usernumber")).sendKeys("98765432");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/*[text()='music']")).click();



        driver.close();

    }
}
