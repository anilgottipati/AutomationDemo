import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Form {
    WebDriver driver;
    // Locators for the elements
     By usernameField = By.name("username");
     By passwordField = By.name("password");
     By loginButton = By.xpath("//span[text()='Admin']");
     By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");
    //Constructor to initialize WebDriver
     public Form(WebDriver driver)
     {
         this.driver = driver;
     }
     public void launchApplication()
     {
     WebDriverManager.chromedriver().setup();
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\chrome\\chromedriver.exe");
    // Create an instance of ChromeDriver
     WebDriver driver = new ChromeDriver();
    Form = new Form(driver);
    // Open a website
         driver.get("https://demoqa.com/automation-practice-form");
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
          //        WebDriverManager.chromedriver().setup();//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\chrome\\chromedriver.exe");//
    //Create an instance of ChromeDriver//
     WebDriver driver = new ChromeDriver();
     Form Form = new Form(driver);
    // Open a website//
     driver.get("https://demoqa.com/automation-practice-form");//

          public void SelectHobbies(String HobbiesType)
     {
     int ele = driver.findElements(HobbiesCheckBox).size();
     for (int i=1;i<=ele;i++)  //1 2 3
     {            String ele1 = driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).getText();
     if(ele1.contains(HobbiesType))
     {
     driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-" + i + "')]")).click();

     }
     public void launchApplication()
    {
    // Open a website
     driver.get("https://demoqa.com/automation-practice-form");

     }
     }
