import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    // Locators for the elements
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//span[text()='Admin']");
    By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");
    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void launchApplication(String url)
    {
        // Open a website
        driver.get("https://"+url+"");
    }

    public void launchGmailApplication()
    {
        // Open a website
        driver.get("https://Gmail.com");
    }

    public void launchWVPAApplication()
    {
        // Open a website
        driver.get("https://wvtrgextweb01.int.wvpatcs.net/login");
    }
}
