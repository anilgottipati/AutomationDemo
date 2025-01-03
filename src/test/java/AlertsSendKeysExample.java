import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSendKeysExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // How are you Main
        // How are you Branch123
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(10000);
//        driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
//        Thread.sleep(5000);
        driver.findElement(By.id("promtButton")).click();
        //Accept -->OK, Accept, Yes, Confirm  //dismiss -->NO, Decline, Cancel, Dismiss  //Gettext //SendKeys

        Alert simpleAlert = driver.switchTo().alert();
        String ele = simpleAlert.getText();
        simpleAlert.sendKeys("Auto Demo");
        Assert.assertEquals("Please enter your name",ele);
        simpleAlert.dismiss();
        // Close the browser
        driver.close();
    }
}
