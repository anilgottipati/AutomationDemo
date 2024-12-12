
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceform {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        WebDriver driver;
        By FirstnameField = By.id("firstname");
        By LastnameField = By.id("lastname");
        By Email = By.id("userEmail");
        By Mobileno = By.id("userNumber");
        By Hobbiescheckbox = By.xpath("//*text()='music]");

            public practiceform(WebDriver driver) {
            this.driver = driver;


        }

        public void EnterText(String "Option",String "Value") {
            WebElement firstname = driver.findElement(FirstnameField);
            firstname.sendKeys("username");

        }

        public void EnterText(String "Option",String "Value") {
            WebElement lastname = driver.findElement(LastnameField);
            lastname.sendKeys("Lastname");
        }

        public void EnterText(String "Option",String "Value") {
            WebElement mail = driver.findElement(Email);
            mail.sendKeys("EmailID");
        }

        public void EnterText(String "Option",String "Value") {
            WebElement Number = driver.findElement(Mobileno);
            Number.sendKeys("Mobile");

        }

        public void enterHobbiescheckbox(String "Option",String "Value") {
            WebElement Hobby = driver.findElement(Hobbiescheckbox);
            Hobby.click();
        }


    }



}






