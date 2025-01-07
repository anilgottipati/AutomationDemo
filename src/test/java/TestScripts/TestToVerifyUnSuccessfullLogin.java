package TestScripts;

import OrangeHRMPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyUnSuccessfullLogin {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // How are you Main
        // How are you Branch123
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.launchApplication();
        loginPage.EnterUserName("Admin123");
        loginPage.EnterPassword("admin1231");
        loginPage.ClickButton();
        Assert.assertTrue(loginPage.VerifyMessage());

    }
}
