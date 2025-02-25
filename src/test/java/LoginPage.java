import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;
    By AlertButton = By.id("alertbtn");
    // Locators for the elements
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//span[text()='Admin']");
    By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");

    By Entertext=By.id("name");
    By EnterExample=By.id("displayed-text");
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

    public void launchRahulAcademyApplication()
    {
        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }


    public void ClickAlert()
    {
        WebElement usernameElement = driver.findElement(AlertButton);
        usernameElement.click();
    }

    public void  EnterName(String text)
    {
        WebElement usernameElement = driver.findElement(Entertext);
        usernameElement.sendKeys(text);
    }

    public void  EnterHideExample(String text) throws InterruptedException {
        WebElement usernameElement = driver.findElement(EnterExample);
        usernameElement.clear();
        usernameElement.sendKeys(text);
        Thread.sleep(2000);
    }

    public void  ClickButton(String text) throws InterruptedException {
        WebElement ClickB = driver.findElement(By.xpath(" //input[@value='"+text+"']"));
        ClickB.click();
        Thread.sleep(3000);
    }


}
