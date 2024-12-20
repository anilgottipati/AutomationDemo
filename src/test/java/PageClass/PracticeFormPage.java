package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


public class PracticeFormPage {

     static WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        PracticeFormPage.driver = driver;
        driver.get("https://parabank.parasoft.com/parabank/login.htm;jsessionid=CF970277AF1165903C2603F9D522B406");

        PracticeFormPage.driver =driver;
    }


     By usernameField = By.id("username");
    static By passwordField = By.id("password");
    By LoginField;

    {
        LoginField = By.name("submit");
    }


    public static void launchApplication() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();
       PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
    }


    // Method to enter username
    public void Enterusername(String Option, String Value) throws InterruptedException {
        WebElement Firstname = usernameField.findElement(driver);
        Firstname.sendKeys("Value");
        sleep(3000);
    }

    public static void EnterText(String Option, String Value) throws InterruptedException {
        WebElement username = driver.findElement(By.id(Option));
        username.sendKeys(Value);
        sleep(3000);
    }
     // enter password
    public void Enterpassword(String Option, String Value) throws InterruptedException {
        WebElement Lastname = driver.findElement(passwordField);
        Lastname.sendKeys("Value");
        sleep(3000);
    }
     //click login
    public void ClickLogin(String Option) throws InterruptedException {
        WebElement ele = driver.findElement(By.id(Option));
        ele.click();
        sleep(3000);
    }




}


