import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    WebDriver driver;

    // Locators for the elements
    By CurrentAddressField = By.id("currentAddress");
    By userEmailField = By.id("userEmail");

    // Constructor to initialize WebDriver
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }


}
