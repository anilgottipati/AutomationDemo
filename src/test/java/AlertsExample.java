import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // How are you Main
        // How are you Branch123
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("alertButton")).click();
        //Accept -->OK, Accept, Yes, Confirm  //dismiss -->NO, Decline, Cancel, Dismiss  //Gettext //SendKeys

        Alert simpleAlert = driver.switchTo().alert();
        String ele = simpleAlert.getText();
        Assert.assertEquals("You clicked a button",ele);
        simpleAlert.accept();
        // Close the browser
        driver.close();
    }
}
