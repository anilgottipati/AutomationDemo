package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeFormPage {

    static WebDriver driver;
    public PracticeFormPage(WebDriver driver){
    this.driver = driver;
    }



    static By FirstNameField = By.id("firstName");
    static By LastNameField = By.id("lastName");
    static By EmailField = By.id("userEmail");
    By GenderField = By.id("gender-radio-2");
    static By MobileNoField = By.name("userNumber");

    public static void EnterText(String FieldName, String value) {
    }


    public static void launchApplication()
    {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
    }


    // Method to enter username
    public static void Enterfirstname(String username) throws InterruptedException {
        WebElement Firstname = driver.findElement(FirstNameField);
        Firstname.sendKeys(username);
        Thread.sleep(3000);
    }

    public static void EnterLastname(String username) throws InterruptedException {
        WebElement Lastname = driver.findElement(LastNameField);
        Lastname.sendKeys(username);
        Thread.sleep(3000);
    }
    //method to email
    public static void EnterEmailField(String username) throws InterruptedException {
        WebElement Email = driver.findElement(EmailField);
        Email.sendKeys(username);
        Thread.sleep(3000);
    }

    public void ClickButton(String Option) throws InterruptedException{
        String option = Option;
        driver.findElement(By.xpath("//*text()='" +Option+"'")).click();
    }


    //method to mobile
        public static void EnterMobileField(String username) throws InterruptedException {
            WebElement Mobile = driver.findElement(MobileNoField);
            Mobile.sendKeys(username);
            Thread.sleep(3000);
        }

    }


