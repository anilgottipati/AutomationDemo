import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFormPage {

    WebDriver driver;

    // Locators for the elements
    By firstName=By.id("firstName");
    By name=By.id("name");
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//span[text()='Admin']");
    By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");
    // Constructor to initialize WebDriver
    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }
     public static int FinalPrice;
    public void EnterText(String Option, String Value) throws InterruptedException {
        WebElement usernameElement = driver.findElement(By.id(Option));
        usernameElement.clear();
        usernameElement.sendKeys(Value);
        Thread.sleep(3000);
    }

    public void EnterName(String Value) throws InterruptedException {
        WebElement usernameElement = driver.findElement(name);
        usernameElement.clear();
        usernameElement.sendKeys(Value);
        Thread.sleep(3000);
    }


    public void EnterFirstName(String Value) throws InterruptedException {
        WebElement usernameElement = driver.findElement(firstName);
        usernameElement.clear();
        usernameElement.sendKeys(Value);
        Thread.sleep(3000);
    }

    public void EnterText12(String Value, String Field) throws InterruptedException {
        WebElement usernameElement = driver.findElement(By.id(Field));
        usernameElement.clear();
        usernameElement.sendKeys(Value);
        Thread.sleep(3000);
    }


    public void ClickButton(String Option)
    {
        WebElement usernameElement = driver.findElement(By.id(Option));
        usernameElement.click();
    }




    public void launchApplication()
    {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void ClickXpathButton(String Option) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@text='"+Option+"'])[1]")).click();

    }

    public void SelectDropdown(String Option, String Value)
    {

    }

    public void VerifyAlerts(String Option, String Value)
    {

    }

    public void VerifyFrames(String Option, String Value)
    {

    }
    // Method to enter username
    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }

    // Method to perform login action
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public void SelectHobbies(String HobbiesType)
    {
        int ele = driver.findElements(HobbiesCheckBox).size();
        for (int i=1;i<=ele;i++)  //1 2 3
        {
            String ele1 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).getText();
            if(ele1.contains(HobbiesType))
            {
                driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).click();
            }
        }
    }

    public void launchWidgetApplication()
    {
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public int GetAddedPrice(String item,int kgs) throws InterruptedException {
        String price = driver.findElement(By.xpath("//*[text()='" + item + "']//parent::div//descendant::p")).getText();
        int OriginalPrice = Integer.parseInt(price);
        int noOfkgs=1+kgs;
        this.FinalPrice=OriginalPrice*noOfkgs;
        return FinalPrice;
    }

    public void GetQuantity(String  item,int Kgs) throws InterruptedException {
        for (int i=1;i<=Kgs;i++) {
            driver.findElement(By.xpath("//*[text()='" + item + "']//parent::div//descendant::a[@class='increment']")).click();
        }
    }

    public void verifyItemPrice() throws InterruptedException {
        String ActualPrice = driver.findElement(By.xpath("//*[text()='Price']//parent::tr//descendant::td/strong")).getText();
        int Final = Integer.parseInt(ActualPrice);
        Assert.assertEquals(Final,FinalPrice);
    }
}
