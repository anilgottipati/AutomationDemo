import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQAElementsPage {

    WebDriver driver;

    // Locators for the elements
    By fullname = By.id("userName");

    By Email = By.id("userEmail");

    // Constructor to initialize WebDriver
    public ToolsQAElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterFullName(String name)
    {
        WebElement usernameElement = driver.findElement(fullname);
        usernameElement.sendKeys(name);
    }


    public void EnterEmail(String email)
    {
        WebElement usernameElement = driver.findElement(Email);
        usernameElement.sendKeys(email);
    }

    }
