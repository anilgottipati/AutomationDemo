import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

    public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\'Surekha'\\Desktop\\Chrome\\chromedriver.exe");
        driver.get("https://demoqa.com/alerts");
        //driver.findElement(By.id("alertButton")).click();

        driver.findElement(By.xpath("//*[@id=\"javascriptAlertsWrapper\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"javascriptAlertsWrapper\"]")).click();
        Thread.sleep(5000);
        //driver.findElement(By.id("alertButton")).click();
    Alert simpleAlert= driver.switchTo().alert();
        String ele = simpleAlert.getText();
        Assert.assertEquals("You clicked a button",ele);
        simpleAlert.accept();
        // Close the browser
        driver.close();




    }
}
