package ToolsQAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPage {
    WebDriver driver;

    // Locators for the elements
    By FirstName = By.id("firstName");
    By LastName = By.id("lastName");
    By Email=By.id("userEmail");
    By NewTab = By.id("tabButton");
    By PhoneNumber = By.id("userNumber");
    By SubjectContainer = By.id("subjectsContainer");
    By Sports =By.id("hobbies-checkbox-1");
    // Constructor to initialize WebDriver
    public FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void LaunchApplication()
    {
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void EnterFirstName(String name)
    {
        WebElement usernameElement = driver.findElement(FirstName);
        usernameElement.sendKeys(name);
    }

    public void EnterPhoneNumber(String Number)
    {
        WebElement usernameElement = driver.findElement(PhoneNumber);
        usernameElement.sendKeys(Number);
    }

    public void EnterSubject(String Subject)
    {
        WebElement usernameElement = driver.findElement(SubjectContainer);
        usernameElement.sendKeys(Subject);
    }

    public void ClickHobbies()
    {
        WebElement usernameElement = driver.findElement(Sports);
    }

    public void EnterLastName(String name)
    {
        WebElement usernameElement = driver.findElement(LastName);
        usernameElement.sendKeys(name);
    }

    public void EnterEmail(String name)
    {
        WebElement usernameElement = driver.findElement(Email);
        usernameElement.sendKeys(name);
    }
}
