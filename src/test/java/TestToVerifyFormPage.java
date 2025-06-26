import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestToVerifyFormPage {
    public static void main(String[] args) throws InterruptedException {
       // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
       // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();


        // Open a website
        driver.get("https://demoqa.com/");
       Thread.sleep(5000);
       formPage Formpage = new formPage();
       Formpage.EnterFirstname("testing");
        // Close the browser
        driver.close();
    }
}
