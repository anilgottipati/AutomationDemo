package TestScripts;

import OrangeHRMPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifySuccessfullLogin {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.launchApplication();
        loginPage.EnterUserName("Admin");
        loginPage.EnterPassword("admin123");
        loginPage.ClickButton();
        // Close the browser
        driver.close();
    }
}
