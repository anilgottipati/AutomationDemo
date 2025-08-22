import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifytheBasicMethods1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://practice.expandtesting.com/radio-buttons");
//Usage of Is
        //isEnabled() method is used to check whether a web element
        // (like a button, input fi
        // eld, etc.) is enabled or disabled on the web pag



//        Assert.assertTrue(ele);

//        boolean ele1 =driver.findElement(By.xpath("//h1[contains(text(),'Practice Form')]")).isSelected();
//        Assert.assertTrue(ele1);
//        boolean ele2 =driver.findElement(By.xpath("//h1[contains(text(),'Practice Form')]")).isEnabled();
//        Assert.assertFalse(ele2);
        driver.close();
    }
}
