
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.Option;

public class practiceform{
    WebDriver driver;
    By FirstnameField = By.id("firstname");
    By LastnameField = By.id("lastname");
    By Email = By.id("userEmail");
    By Mobileno = By.id("userNumber");
    By Hobbiescheckbox = By.xpath("//*text()='music]");

    public practiceform(WebDriver driver) {
        this.driver = driver;


    }
    public void launchApplication()
    {
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        practiceform practiceform = new practiceform(driver);
        driver.get("https://demoqa.com/automation-practice-form")
    }

    public void enterFirstname(String username) {
        WebElement firstname = driver.findElement(FirstnameField);
        firstname.sendKeys(username);

    }

    public void enterLastname(String Lastname) {
        WebElement lastname = driver.findElement(LastnameField);
        lastname.sendKeys(Lastname);
    }

    public void enterEmail(String EmailID) {
        WebElement mail = driver.findElement(Email);
        mail.sendKeys(EmailID);
    }

    public void enterno(String Mobile) {
        WebElement Number = driver.findElement(Mobileno);
        Number.sendKeys(Mobile);

    }

    public void enterHobbiescheckbox(String Hobbies) {
        WebElement Hobby = driver.findElement(Hobbiescheckbox);
        Hobby.click();
    }
}











