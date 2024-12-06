import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/form-validation");
//        driver.get("https://practice.expandtesting.com/form-validation\");
        Demo demo=new Demo(driver);
    Thread.sleep(3000);
        demo.EnterText("ContactName", "Selenium");
        Thread.sleep(2000);
        demo.EnterText("contactnumber","758565879");
        Thread.sleep(2000);
        demo.EnterText("02/10/2002");
        Thread.sleep(2000);
        demo.PaymentMethod("validationCustom04", "cash");
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
