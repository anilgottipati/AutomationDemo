import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestToVerifytheWidgetTextBox {
    public static void main(String[] args) throws InterruptedException {
       // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
       // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);

        // Open a website
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(10000);
        // Print the title of the page
        practiceFormPage.EnterText("userName","Automation Selenium");
        Thread.sleep(4000);
        practiceFormPage.EnterText("userEmail","Auto@gmail.com");
        Thread.sleep(4000);
        practiceFormPage.EnterText("currentAddress","Chennai");
        Thread.sleep(4000);
        practiceFormPage.ClickButton("submit");
        // Close the browser
        driver.close();
    }
}
