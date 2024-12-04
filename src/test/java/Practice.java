import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
    public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\'Surekha'\\Desktop\\Chrome\\chromedriver.exe");
        //driver.get("http://demoqa.com");
        driver.get("https://demoqa.com/automation-practice-form");

        Formpagepractice formpagepractice = new Formpagepractice(driver);
        formpagepractice.enterFirstname("Rachuri");
        formpagepractice.enterLaststname("Surekha");
        formpagepractice.enterEmail("rachurirekha2@gmail.com");
        formpagepractice.enterMobileno("1234567898");
        formpagepractice.enterHobbiescheckbox("Reading");

      //driver.findElement(By.id("firstName")).sendKeys("Rachuri");
//      Thread.sleep(2000);
//     // driver.findElement(By.id("LastName")).sendKeys("Surekha");
//        Thread.sleep(2000);
//        driver.findElement(By.id("userEmail")).sendKeys("rachurirekha2@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.id("userNumber")).sendKeys("1234567898");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]")).click();
//        driver.findElement(By.xpath("//*[text()='Reading")).click();
// driver.findElement(By.xpath("//*[@id=\"state\"]")).click();
//  driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
//        Thread.sleep(5000);

driver.close();

    }
}
