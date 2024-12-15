import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchGoogleBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).sendKeys("Amars");


        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("XpathEnteres");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Reading']")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("mySelect")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Set to 100%']")).click();
        Thread.sleep(5000);
        Select ele = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
        // Print the title of the page
//        System.out.println("Page Title: " + driver.getTitle());
//        String Actual = driver.getTitle();
//        Assert.assertEquals("Google",Actual);
//         String ActualURL = driver.getCurrentUrl();
//        Assert.assertTrue(ActualURL.contains("google"));
        // Close the browser
        driver.close();
    }
}
