import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

    public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\'Surekha'\\Desktop\\Chrome\\chromedriver.exe");
        //driver.get("http://demoqa.com");
        driver.get("https://demoqa.com/automation-practice-form");
     //   Char ele = driver.findElement(By.xpath("//*[@id=\"genterWrappe]")).

    }
    }
