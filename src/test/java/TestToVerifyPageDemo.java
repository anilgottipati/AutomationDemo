
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyPageDemo {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Dummy\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/");
        //*[text()='Elements']
        //*[text()='Text Box']
        Thread.sleep(5000);
        ElementsFormPage elementsFormPage = new ElementsFormPage(driver);
        elementsFormPage.Click("Elements");
        elementsFormPage.Click("Text Box");
        elementsFormPage.ClickElements();
        elementsFormPage.ClickText();
        elementsFormPage.EnterUser("Testing");
        elementsFormPage.EnterEmail("Test@gmail.com");
        elementsFormPage.CurrentAddress("Chennai");
        driver.quit();

//                isEnabled
//                isDisplayed
//                isSelected
    }
}
