
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyAlertsToolsQA {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Dummy\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        driver.findElement(By.id("promtButton")).click();

        Alert alt = driver.switchTo().alert();
        alt.sendKeys("Testing");
        alt.accept();
        String ele = driver.findElement(By.id("promptResult")).getText();
        Assert.assertEquals("You entered Testing",ele);
        Thread.sleep(5000);
//        alt.dismiss();
        //Hello , share this practice page and share your knowledge
        //Accept will work for OK, Accept, Submit , Proceed
        //Dismiss will work for Cancel, Dismiss, Reject , Stop
//        WebElement OptionDropDown = driver.findElement(By.name("dropdown-class-example"));
//        Select Sel = new Select(OptionDropDown);
//        Sel.selectByVisibleText("Option3");
//        Thread.sleep(5000);
//        Sel.selectByIndex(1);
//        Thread.sleep(5000);
//        Sel.selectByValue("option1");
//        Thread.sleep(5000);
//        Select se1 = new Select(driver.findElement(By.name("dropdown-class-example")));
//         boolean checkbox1 = driver.findElement(By.id("checkBoxOption2")).isSelected();
//        driver.findElement(By.id("checkBoxOption2")).click();
//        boolean checkbox2 = driver.findElement(By.id("checkBoxOption2")).isSelected();
//        Assert.assertTrue(checkbox2);
//        boolean Text = driver.findElement(By.xpath("//*[text()='Suggession Class Example']")).isDisplayed();
//        driver.findElement(By.id("checkBoxOption2")).click();
//        Assert.assertTrue(Text);
        driver.close();

//                isEnabled
//                isDisplayed
//                isSelected
    }
}
