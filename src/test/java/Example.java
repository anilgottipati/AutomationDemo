import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\'Surekha'\\Desktop\\Chrome\\chromedriver.exe");
         driver.get("https://seleniumbase.io/demo_page");
       driver.findElement(By.id("myTextInput")).sendKeys("Software");
        driver.findElement(By.id("myButton")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("mySelect")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("myFrame3")).click();

       // driver.findElement(By.xpath("//*[@id=\"mySelect\"]")).click();
       // Thread.sleep(5000);
       // driver.switchTo().frame("myFrame2");
               // driver.findElement(By.id("myFrame")).getText();
        driver.findElement(By.id("myLink1")).click();


    }

}