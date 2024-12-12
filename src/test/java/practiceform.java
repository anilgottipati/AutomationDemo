
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.Option;

public class practiceform {
    WebDriver driver;
    By FirstnameField = By.id("firstname");
    By LastnameField = By.id("lastname");
    By Email = By.id("userEmail");
    By Mobileno = By.id("userNumber");
    By Hobbiescheckbox = By.xpath("//*text()='music]");

    public practiceform(WebDriver driver) {
        this.driver = driver;


    }

    public void EnterText(String Option, String Value) {
        WebElement usernameElement = driver.findElement(By.id(Option));
        usernameElement.sendKeys("Value");

    }

    public void EnterText(String Option,String Value) {
        WebElement usernameElement = driver.findElement(By.id(Option));
        usernameElement.sendKeys("Value");
    }

    public void EnterText(String Option, String Value) {
        WebElement usernameElement = driver.findElement(By.id(Option));
        usernameElement.sendKeys("Value");
    }

    public void EnterText(String Option, String Value) {
        WebElement usernameElement = driver.findElement(By.id(Option));
        usernameElement.sendKeys("Value");

    }

    public void enterHobbiescheckbox(String "Hobbies") {
        WebElement Hobby = driver.findElement(Hobbiescheckbox);
        Hobby.click();
    }

    public void launchApplication()

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        practiceform practiceform = new practiceform(driver);
        driver.get("https://demoqa.com/text-box");
    }
}







