import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyHobbies {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");



        int ele = driver.findElements(By.xpath("//*[contains(text(),'Option')]")).size();

        for (int i=1;i<ele;i++)
        {
            String expectedDevice = driver.findElement(By.xpath("//*[contains(text(),'Option["+i+")])")).getText();
            if(expectedDevice.contains("Option3"))
            {
                driver.findElement(By.xpath("//*[contains(text(),'Option["+i+")])")).click();
            }


        }


        driver.close();
    }
}
