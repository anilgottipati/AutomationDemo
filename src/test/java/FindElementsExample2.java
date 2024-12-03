import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample2 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://seleniumbase.io/demo_page");
        int ele = driver.findElements(By.xpath("//a[contains(@id,'myLink')]")).size();
        for (int i=1;i<=ele;i++)  //1 2 3
        {
            String ele1 = driver.findElement(By.xpath("//a[contains(@id,'myLink"+i+"')]")).getText();
            if(ele1.contains("SeleniumBase Demo Page"))
            {
                driver.findElement(By.xpath("//a[contains(@id,'myLink"+i+"')]")).click();
            }
        }
        // Close the browser
        driver.close();
    }
}
