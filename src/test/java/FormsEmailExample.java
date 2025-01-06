import ToolsQAPages.FormsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormsEmailExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of Anil

        WebDriver driver = new ChromeDriver();
        FormsPage formsPage = new FormsPage(driver);
        // Open a website
        formsPage.LaunchApplication();
        formsPage.EnterFirstName("Amar");
        formsPage.EnterLastName("Auto");
        formsPage.EnterEmail("anil@gmail.com");

        // Close the browser
        driver.close();
    }
}
