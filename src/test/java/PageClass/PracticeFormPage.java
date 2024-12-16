package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class PracticeFormPage {

    WebDriver driver;

    // Locators for the elements
    By FirstNameField = By.id("firstName");
    By LastNameField = By.id("lastName");
    By EmailField = By.id("userEmail");
    By GenderField = By.id("gender-radio-2");
    By MobileNoField = By.name("userNumber");
    By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");
    // Constructor to initialize WebDriver
    public PracticeFormPage(WebDriver driver) {

        this.driver = driver;
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

    public void Select GenderField(String username) throws InterruptedException{
        WebElement Gender = driver.findElement(By.xpath(["//*@id=\"gender wrapper\"]")).click();


    //method to mobile
        public void EnterMobileField(String username) throws InterruptedException {
            WebElement Mobile = driver.findElement(MobileNoField);
            Mobile.sendKeys(username);
            Thread.sleep(3000);
        }


        public void SelectHobbies(String HobbiesType)
    {
        int ele = driver.findElements(HobbiesCheckBox).size();
        for (int i=1;i<=ele;i++)  //1 2 3
        {
            String ele1 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).getText();
            if(ele1.contains(HobbiesType))
            {
                driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).click();
            }
        }
    }

}


