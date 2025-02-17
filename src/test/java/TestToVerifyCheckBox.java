import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestToVerifyCheckBox {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Anil\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        boolean isChecked1 = driver.findElement(By.id("checkBoxOption2")).isSelected();
        boolean isChecked2 = driver.findElement(By.id("checkBoxOption3")).isSelected();
        Assert.assertTrue(isChecked1);
        Assert.assertFalse(isChecked2);
        boolean verifyText = driver.findElement(By.xpath("//h1[text()='Practice Page']")).isDisplayed();
        Assert.assertTrue(verifyText);

        boolean checkRadio = driver.findElement(By.xpath("//input[@value='radio2']")).isEnabled();
        // isEnabled
        //isdisplayed
        //IsSelected
        // Close the browser
        driver.close();
    }
}
