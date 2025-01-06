import ToolsQAPages.FramePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of Anil
        WebDriver driver = new ChromeDriver();
        FramePage framePage=new FramePage(driver);
        framePage.LaunchFrame();
        framePage.SwitchFrame();
        String ele = framePage.getText();
        Assert.assertEquals("This is a sample page",framePage.getText());
        // Close the browser
        driver.close();
    }
}
