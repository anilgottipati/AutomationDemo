import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\'Surekha'\\Desktop\\Chrome\\chromedriver.exe");
        //driver.get("http://demoqa.com");
        driver.get("https://demoqa.com/frames");
      driver.switchTo().frame("frame1");
        Thread.sleep(50000);
        //driver.switchTo().frame("frame1");
        String ele = driver.findElement(By.id("sampleHeading")).getText();
       // String ele = driver.findElement(By.id("sampleHeading")).getText();

//driver.switchTo().frame("frame2");








      driver.close();
    }
    }
