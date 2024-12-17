package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeFormPage {

    WebDriver driver;
    private String option;

    public PracticeFormPage(WebDriver driver){
    this.driver = driver;
    }



    By FirstNameField = By.id("firstName");
    By LastNameField = By.id("lastName");
    By EmailField = By.id("userEmail");
    By GenderField = By.id("gender-radio-2");
    By MobileNoField = By.name("userNumber");

    public static void EnterText(String FieldName, String value) {
    }


    public void launchApplication()
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
    public void Enterfirstname(String username) throws InterruptedException {
        WebElement Firstname = driver.findElement(FirstNameField);
        Firstname.sendKeys(username);
        Thread.sleep(3000);
    }

    public void EnterLastname(String username) throws InterruptedException {
        WebElement Lastname = driver.findElement(LastNameField);
        Lastname.sendKeys(username);
        Thread.sleep(3000);
    }
    //method to email
    public void EnterEmailField(String username) throws InterruptedException {
        WebElement Email = driver.findElement(EmailField);
        Email.sendKeys(username);
        Thread.sleep(3000);
    }

    public void ClickButton(String Option) throws InterruptedException{
        option = Option;
        driver.findElement(By.xpath("//*[text()='" +Option+"'")).click();
    }


    //method to mobile
        public void EnterMobileField(String username) throws InterruptedException {
            WebElement Mobile = driver.findElement(MobileNoField);
            Mobile.sendKeys(username);
            Thread.sleep(3000);
        }

    }


