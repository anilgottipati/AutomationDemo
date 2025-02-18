import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyAlerts {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        Alert al=driver.switchTo().alert();
        String ele1 = al.getText();//Run Time
        Assert.assertEquals("Please enter your name",ele1);
        al.accept();
//        al.sendKeys("Surendra");


//        al.dismiss();

               // OK, PROCEED, ACCEPT, SUBMIT , YES
                       //CANCEL, DENIED, DECLINE, NO, REJECT
        driver.close();
    }
}
