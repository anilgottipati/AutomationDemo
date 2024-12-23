package PageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;


public class PracticeFormPage {

     static WebDriver driver;


    public PracticeFormPage(WebDriver driver) {
        PracticeFormPage.driver = driver;
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
        PracticeFormPage.driver =driver;
    }


    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By ClickButton = By.name("submit");
    By FirstNameField=By.id("customer.firstName");
    By LastNameField = By.id("customer.lastName");
    By AddressField=By.id("customer.address.street");
    By CityField = By.id("customer.address.city");
    By StateField=By.id("customer.address.state");
    By ZipCode=By.id("customer.address.zipCode");
    By Phonenumber=By.id("customer.phoneNumber");
    By LoanAmountField=By.id("amount");
    By DownPaymentField=By.id("downPayment");
    By LoanProvider=By.id("loanProviderName");
    By Date=By.id("responseDate");
    By Status=By.id("loanStatus");


    public static void launchApplication() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
    }

    public static void EnterText(String number) {
    }


    // Method to enter username
    public void Enterusername(String Option, String Value) throws InterruptedException {
        WebElement Firstname = usernameField.findElement(driver);
        Firstname.sendKeys("username");
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
        Lastname.sendKeys("password");
        sleep(3000);
    }

     //click login
    public void ClickButton(String submit) throws InterruptedException {
        WebElement ele = driver.findElement(By.name(submit));
        ele.click();
        sleep(3000);
    }



    public void navigatetohomepage(String Option)throws InterruptedException {

    driver.findElement(By.xpath("//*[contains(text(),'parabank')]")).click();

    }

     public void EnterFirstname(String firstname){
        //WebElement FirstNameField= driver.findElement(By.id(Option));
       // FirstNameField.sendKeys(Value);
        //PracticeFormPage.EnterText(Value);
    driver.findElement(FirstNameField).sendKeys(firstname);
    }


    public void Enterlastname(String lastname){
        //WebElement LastNameField= driver.findElement(By.id(Option));
        //PracticeFormPage.EnterText(Value);
        driver.findElement(LastNameField).sendKeys(lastname);
    }

    public void Enteraddress(String address){
        //WebElement addressField= driver.findElement(By.id(Option));
        //PracticeFormPage.EnterText(Value);
        driver.findElement(AddressField).sendKeys(address);
    }

    public void Entercity(String City){
        //WebElement cityField= driver.findElement(By.id(Option));
        //PracticeFormPage.EnterText(Value);
        driver.findElement(CityField).sendKeys(City);
    }

    public void Enterstate(String State){
        //WebElement StateField= driver.findElement(By.id(Option));
       // PracticeFormPage.EnterText(Value);
        driver.findElement(StateField).sendKeys(State);
    }

    public void EnterZipcode(String zipcode){
        //WebElement zipcodeField= driver.findElement(By.id(Option));
       // PracticeFormPage.EnterText(Value);
        driver.findElement(ZipCode).sendKeys(zipcode);
    }

    public void EnterPhonenumber(String phonenumber ){
       // WebElement PhonenumberField= driver.findElement(By.id(Option));
       // PracticeFormPage.EnterText(Value);
        driver.findElement(By.id(phonenumber)).sendKeys((CharSequence) Phonenumber);
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
        System.out.println(("Wealth Securities Dynamic Loans (WSDL)"));
    }

    public void SimpleDateFormat(){

        Object string = Date;
            {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String strDate= formatter.format(date);
            System.out.println(strDate);
        }
    }

    public void EnterloanStatusText(String Option, String Value) throws InterruptedException {
        WebElement loanStatus = driver.findElement(Status);
        System.out.println(("Approved"));
    }


}


