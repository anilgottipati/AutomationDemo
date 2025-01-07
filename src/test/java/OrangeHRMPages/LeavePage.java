package OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeavePage {
    WebDriver driver;

    // Locators for the elements
    By UserName = By.name("username");

    // Constructor to initialize WebDriver
    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }


}
