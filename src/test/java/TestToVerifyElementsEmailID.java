import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestToVerifyElementsEmailID {

    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        ToolsQAElementsPage toolsQAElementsPage = new ToolsQAElementsPage(driver);
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");

            driver.get("https://demoqa.com/text-box");
        toolsQAElementsPage.EnterFullName("ANIL");
        toolsQAElementsPage.EnterEmail("Anil@gmail.com");
            driver.findElement(By.id("userName")).sendKeys("SARAN");
        driver.findElement(By.id("userEmail")).sendKeys("anil@gmail.com");






        }
}
