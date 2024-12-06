import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class practice {

    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");

            driver.get("https://seleniumbase.io/demo_page");
            driver.findElement(By.id("myTextput")).sendKeys("Radhika");
            Thread.sleep(2000);
            driver.findElement(By.id("myButton")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("mySelect")).click();
            Thread.sleep(2000);
            Select se = new Select(driver.findElement(By.id("my select")));
            se.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.id("radiobutton2"));
            Thread.sleep(2000);
            driver.findElement(By.id("checkBox1")).click();
            Thread.sleep(2000);
            driver.switchTo().frame("frame2");
            Thread.sleep(2000);
            String ele = driver.findElement(By.id("iFrameText")).getText();
            driver.close();





        }
}
