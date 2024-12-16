import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFormPage {

    WebDriver driver;

    // Locators for the elements
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By EmailField = By.name("userEmail");
    By MobileNoField = By.name("mobile");
    By loginButton = By.xpath("//span[text()='Admin']");
    By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");
    // Constructor to initialize WebDriver
    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterText(String Option, String Value) throws InterruptedException {
        WebElement usernameElement = driver.findElement(By.id(Option));
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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\GITDemo\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        // Open a website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    // Method to enter username
    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    //method to email
    public void enterEmail(String username) {
        WebElement usernameElement = driver.findElement(EmailField);
        usernameElement.sendKeys(username);
    }

    //method to mobile
    public void enterMobile(String username) {
        WebElement usernameElement = driver.findElement(MobileNoField);
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

    public void launchApplication();
    {
        // Open a website
        driver.get("https://demoqa.com/automation-practice-form");
    }
}
