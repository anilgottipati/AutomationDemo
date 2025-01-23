import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestToVerifyPracticeForm {

    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            ToolsQAElementsPage toolsQAElementsPage = new ToolsQAElementsPage(driver);
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");

            driver.get("https://demoqa.com/automation-practice-form");
            toolsQAElementsPage.EnterFullName("SARAN");
//           driver.findElement(By.id("firstName")).sendKeys("SARAN");
           driver.findElement(By.xpath("//*[@value='Male']")).click();




        }
}
