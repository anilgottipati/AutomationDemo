import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "E:\\Project Files\\DeskTop122024\\GITDemo\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        Thread.sleep(5000);

    }
}
