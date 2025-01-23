import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQAFormsPage {

    WebDriver driver;

    // Locators for the elements
    By usernameField = By.name("username");

    // Constructor to initialize WebDriver
    public ToolsQAFormsPage(WebDriver driver) {
        this.driver = driver;
    }

}


