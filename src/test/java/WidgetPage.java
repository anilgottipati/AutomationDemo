import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetPage {

    WebDriver driver;

    // Locators for the elements
    By DateField = By.id("datePickerMonthYearInput");

    // Constructor to initialize WebDriver
    public WidgetPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterFullName(String password) {
        WebElement passwordElement = driver.findElement(DateField);
        passwordElement.sendKeys(password);
    }
}
