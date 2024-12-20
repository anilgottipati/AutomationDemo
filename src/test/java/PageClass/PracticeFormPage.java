package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.awt.geom.Path2D.contains;
import static java.lang.Thread.sleep;


public class PracticeFormPage {

     static WebDriver driver;


    public PracticeFormPage(WebDriver driver) {
        PracticeFormPage.driver = driver;
        driver.get("https://parabank.parasoft.com/parabank/login.htm;jsessionid=CF970277AF1165903C2603F9D522B406");

        PracticeFormPage.driver =driver;
    }


     By usernameField = By.id("username");
    static By passwordField = By.id("password");
    By LoginField = By.name("submit");
    By LoanAmountField=By.id("amount");
    By DownPaymentField=By.id("downPayment");
    By LoanProvider=By.id("loanProviderName");
    By Date=By.id("responseDate");
    By Status=By.id("loanStatus");


    public static void launchApplication() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();
       PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
    }


    // Method to enter username
    public void Enterusername(String Option, String Value) throws InterruptedException {
        WebElement Firstname = usernameField.findElement(driver);
        Firstname.sendKeys("Value");
        sleep(3000);
    }

    public static void EnterText(String Option, String Value) throws InterruptedException {
        WebElement username = driver.findElement(By.id(Option));
        username.sendKeys(Value);
        sleep(3000);
    }
     // enter password
    public void Enterpassword(String Option, String Value) throws InterruptedException {
        WebElement Lastname = driver.findElement(passwordField);
        Lastname.sendKeys("Value");
        sleep(3000);
    }
     //click login
    public void ClickLogin(String Option) throws InterruptedException {
        WebElement ele = driver.findElement(By.id(Option));
        ele.click();
        sleep(3000);
    }

    public void navigatetohomepage(String Option)throws InterruptedException {

    driver.findElement(By.xpath("//*[contains(text(),'parabank')]")).click();

    }



     public void EnterLoan(String Option, String Value) throws InterruptedException {
         WebElement loan = driver.findElement(LoanAmountField);
         loan.sendKeys("Value");
     }

    public void EnterDownPayment(String Option, String Value) throws InterruptedException {
        WebElement downpayment = driver.findElement(DownPaymentField);
        downpayment.sendKeys("Value");
    }


    public void EnterLoanText(String Option, String Value) throws InterruptedException {
        WebElement loanText = driver.findElement(LoanProvider);
        loanText.sendKeys("Wealth Securities Dynamic Loans (WSDL)");
    }

    public void SimpleDateFormat{
        public static void string(String[] args){
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
            String strDate= formatter.format(date);
            System.out.println(strDate);
        }
    }

    public void EnterloanStatusText(String Option, String Value) throws InterruptedException {
        WebElement loanStatus = driver.findElement(Status);
        loanStatus.sendKeys("Approved");
    }


}


