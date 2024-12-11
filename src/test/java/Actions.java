import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.jshell.tool.ConsoleIOContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

        public static void main(String[] args) throws InterruptedException {
            // Setup WebDriver (automatically manages the browser driver)
            WebDriverManager.chromedriver().setup();

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // Open a website
            driver.get("https://seleniumbase.io/demo_page");
            Thread.sleep(10000);
            PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
            Actions actions = new Actions(driver);
            WebElement menu = driver.findElement(By.id("myDropdown"));
            // Perform the mouse hover
            actions.moveToElement(menu).perform();
            Thread.sleep(5000);
            practiceFormPage.ClickButton("dropOption2");
            Thread.sleep(5000);
            WebElement elementToRightClick = driver.findElement(By.xpath("//*[text()='Link Two Selected']"));
            // Perform the right-click (context click)
            actions.contextClick(elementToRightClick).perform();
            Thread.sleep(5000);
            // Find the element to double-click on
            WebElement elementToDoubleClick = driver.findElement(By.id("doubleClickElement"));


            // Perform the double-click
            actions.doubleClick(elementToDoubleClick).perform();
            // Close the browser
            driver.close();
        }


}
