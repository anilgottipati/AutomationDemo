package Arundathi;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Banking {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maddali Vamsi Krishn\\Desktop\\Automation\\AutomationDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id());

        driver.get("C:/Users/Maddali%20Vamsi%20Krishn/Desktop/banking.html");
        boolean header = driver.findElement(By.xpath("//h2[text()='Banking Application Form']")).isDisplayed();
        Assert.assertTrue(header);
        //Thread.sleep(5000);
        driver.findElement(By.id("full_name")).sendKeys("Arundhathi");
        //Thread.sleep(5000);
        driver.findElement(By.id("dob")).sendKeys("03/02/1981");
        //Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("arundhathi@gmail.com");
        //Thread.sleep(5000);
        driver.findElement(By.id("phone")).sendKeys("9989829318");
               //Thread.sleep(5000);
        Select AccountType = new Select(driver.findElement(By.id("account_type")));
        AccountType.selectByIndex(0);
        //Thread.sleep(5000);
       AccountType.selectByVisibleText("Business Account");
        //Thread.sleep(5000);
       AccountType.selectByVisibleText("Checking Account");
        //Thread.sleep(5000);
       driver.findElement(By.id("initial_deposit")).sendKeys("10000");
        //Thread.sleep(5000);
        driver.findElement(By.id("online_yes")).click();
        //Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("abcd");
        //Thread.sleep(5000);
        driver.findElement(By.id("confirm_password")).sendKeys("abcd");
        //Thread.sleep(5000);
        Select Sq1 = new Select(driver.findElement(By.id("security_question_1")));
        Sq1.selectByVisibleText("What is your mother's maiden name?");
       // Thread.sleep(5000);
        Sq1.selectByIndex(2);

       // Thread.sleep(5000);

        Sq1.selectByValue("first_pet");
        //Thread.sleep(5000);
        driver.findElement(By.id("security_answer_1")).sendKeys("browni");
        //Thread.sleep(5000);

        Select Sq2 = new Select(driver.findElement(By.id("security_question_2")));
        Sq2.selectByVisibleText("What was your first car?");
       // Thread.sleep(5000);
        Sq2.selectByIndex(2);
        //Thread.sleep(5000);

        Sq2.selectByValue("childhood_friend");
        //Thread.sleep(5000);
        driver.findElement(By.id("security_answer_2")).sendKeys("juuli");
        //Thread.sleep(5000);
        driver.findElement(By.id("transaction_history")).click();
       // Thread.sleep(5000);
        Select Transactionhistory = new Select(driver.findElement(By.id("history_duration")));
        Transactionhistory.selectByVisibleText("12 Months");
         //Thread.sleep(5000);
        Transactionhistory.selectByIndex(1);

        // Thread.sleep(5000);


        Transactionhistory.selectByValue("1");
       // Thread.sleep(5000);
        Transactionhistory.selectByValue("6");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Submit Application']")).click();
        Thread.sleep(5000);

        // Print the title of the page/

        // Close the browser
        driver.close();
    }


}
