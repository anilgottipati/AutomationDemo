package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeFormPage {

    static WebDriver driver;
    public PracticeFormPage(WebDriver driver){
    PracticeFormPage.driver = driver;
    }



    static By FirstNameField = By.id("firstName");
    static By LastNameField = By.id("lastName");
    static By EmailField = By.id("userEmail");
    static By GenderField = By.id("genterWrapper");
    static By MobileNoField = By.name("userNumber");
    static By SelectStateField = By.id(("stateCity-label"));



    public static void launchApplication() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
    }


    // Method to enter username
    public void EnterFirstName(String Option , String Value) throws InterruptedException {
        WebElement Firstname = driver.findElement(FirstNameField);
        Firstname.sendKeys("Value");
        Thread.sleep(3000);
    }

    public static void EnterText(String Option, String Value) throws InterruptedException {
        WebElement Firstname = driver.findElement(By.id(Option));
        Firstname.sendKeys(Value);
        Thread.sleep(3000);
    }

    public static void EnterLastname(String Option , String Value) throws InterruptedException {
        WebElement Lastname = driver.findElement(LastNameField);
        Lastname.sendKeys("Value");
        Thread.sleep(3000);
    }



    //method to email
    public static void EnterEmailField(String Option , String Value) throws InterruptedException {
        WebElement Email = driver.findElement(EmailField);
        Email.sendKeys("Value");
        Thread.sleep(3000);
    }



    public void ClickButton(String Option, String Value) throws InterruptedException{
        String option = Option;
        driver.findElement(By.xpath("//*[text()='" +Option+"']")).click();
        Thread.sleep(3000);
    }


    //method to mobile
        public static void EnterMobileField(String Option , String Value) throws InterruptedException {
            WebElement Mobile = driver.findElement(MobileNoField);
            Mobile.sendKeys("Value");
            Thread.sleep(3000);
        }




    public static void EnterState(String Option , String Value) throws InterruptedException {
        WebElement State = driver.findElement(SelectStateField);
        Select dropdown = new Select(State);
        dropdown.selectByVisibleText(Option);
        State.sendKeys("Value");
        Thread.sleep(3000);
    }


    public void SelectState(String Option) {
        WebElement State = driver.findElement(By.id("stateCity-label"));
        State.sendKeys("Value");
    }

    public void ClickButton(String value) {
        String Option = "Option";
        driver.findElement(By.xpath("//*text()='" +Option+"'")).click();
    }

}


