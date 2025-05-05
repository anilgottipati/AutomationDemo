import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    // Locators for the elements
    By Searchbox=By.xpath("//*[@class='search-keyword']");
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

    public void launchGreenKartApplication()
    {
        // Open a website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    public boolean VerifyText(String text) throws InterruptedException {
        Thread.sleep(5000);
      return driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).isDisplayed();

    }

    public void Search(String SearchText) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(Searchbox).sendKeys(SearchText);

    }

    public void VerifyItems(String SearchText) throws InterruptedException {
      int ele= driver.findElements(By.xpath("//*[contains(text(),'"+SearchText+"')]")).size();

    }

    public void AddToCart(String Text) throws InterruptedException {
     driver.findElement(By.xpath("//*[contains(text(),'"+Text+"')]//parent::div//descendant::button")).click();

    }

    public String CartItems() throws InterruptedException {
      return  driver.findElement(By.xpath("//*[text()='Items']//parent::tr//descendant::td/strong")).getText();

    }
}
