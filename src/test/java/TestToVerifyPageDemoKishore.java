
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyPageDemoKishore {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Dummy\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/");
        Thread.sleep(5000);
        ElementsFormPage elementsFormPage = new ElementsFormPage(driver);
        elementsFormPage.EnterUser("Testing");
        elementsFormPage.EnterEmail("Test@gmail.com");
        elementsFormPage.CurrentAddress("Chennai");
        driver.quit();

//                isEnabled
//                isDisplayed
//                isSelected
    }
}
