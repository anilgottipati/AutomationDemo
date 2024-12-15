import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionslaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://seleniumbase.io/demo_page");
        Thread.sleep(1000);
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.id("myDropdown"))).perform();
        Thread.sleep(1000);
       driver.findElement(By.id("dropOption2")).click();
        Thread.sleep(1000);
        boolean ele1 = driver.findElement(By.xpath("//h3[text()='Link Two Selected']")).isDisplayed();
       Assert.assertTrue(ele1);
//        Assert.assertEquals("You clicked a button",alertdesc);

        // Close the browser
        driver.close();
    }
}
