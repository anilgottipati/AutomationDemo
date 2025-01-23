import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestToVerifyElementsTextForm {

    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");

            driver.get("https://demoqa.com/text-box");
            driver.findElement(By.id("userName")).sendKeys("SARAN");






        }
}
