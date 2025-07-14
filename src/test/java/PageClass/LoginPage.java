package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Locators for the elements
    By Searchbox=By.xpath("//*[@class='search-keyword']");
    By usernameField = By.name("username");
    By SauceUserName=By.id("user-name");
    By SaucePassword=By.id("password");
    By SauceLogin =By.id("login-button");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//span[text()='Admin']");
    By HobbiesCheckBox = By.xpath("//label[contains(@for,'hobbies-checkbox')]");
    // Constructor to initialize WebDriver
    public static String itemCount;
    public static int j;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void launchApplication(String url)
    {
        // Open a website
        driver.get("https://"+url+"");
    }

    public void launchSauceDemoApplication()
    {
        // Open a website
        driver.get("https://www.saucedemo.com/");
    }

    public void launchGmailApplication()
    {
        // Open a website
        driver.get("https://Gmail.com");
    }

    public void launchWVPAApplication()
    {
        // Open a website
        driver.get("https://wvtrgextweb01.int.wvpatcs.net/login");
    }

    public void launchGreenKartApplication()
    {
        // Open a website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    public boolean VerifyText(String text) throws InterruptedException {
        Thread.sleep(5000);
      return driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).isDisplayed();

    }

    public void Search(String SearchText) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(Searchbox).sendKeys(SearchText);

    }

    public void VerifyItems(String SearchText) throws InterruptedException {
      int ele= driver.findElements(By.xpath("//*[contains(text(),'"+SearchText+"')]")).size();

    }

    public void AddToCart(String Text) throws InterruptedException {
     driver.findElement(By.xpath("//*[contains(text(),'"+Text+"')]//parent::div//descendant::button")).click();

    }

    public String CartItems() throws InterruptedException {
        this.itemCount=
       driver.findElement(By.xpath("//*[text()='Items']//parent::tr//descendant::td/strong")).getText();
return itemCount;
    }

    public void launchOrangeHRMApplication()
    {
        // Open a website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void launchSauceDemoAplication()
    {
        // Open a website
        driver.get("https://www.saucedemo.com/");
    }

    public void ClickProduct(int ProductPrice)
    {
        int ele = driver.findElements(By.xpath("//div[@class='inventory_item_price']")).size();
        for (int i=1;i<=ele;i++)
        {
            String PPrice=driver.findElement(By.xpath("(//div[@class='inventory_item_price'])["+i+"]")).getText();
            String modified = PPrice.length() > 0 ? PPrice.substring(1) : PPrice;
            System.out.println(PPrice);
            String str = modified;
            double value = Double.parseDouble(str);
            int num = (int) value;


            if(num>=ProductPrice-1 && num<ProductPrice+1)
            {

                if(j>0)
                {
                    i=i-1;
                }
                driver.findElement(By.xpath("(//button[text()='Add to cart'])["+i+"]")).click();
                j++;
                this.j=j;
            }

        }
    }

    public void EnterCredentialsSauceDemo(String User,String Pass)
    {
      driver.findElement(By.id("user-name")).sendKeys(User);
        driver.findElement(By.id("password")).sendKeys(Pass);
        driver.findElement(By.id("login-button")).click();

    }

    public void EnterUserName(String text) throws InterruptedException {
        Thread.sleep(5000);
        WebElement username = driver.findElement(SauceUserName);
        username.sendKeys(text);

    }

    public void EnterPassword(String text) throws InterruptedException {
        Thread.sleep(5000);
        WebElement Password = driver.findElement(SaucePassword);
        Password.sendKeys(text);

    }

    public void ClickLogin() throws InterruptedException {
        Thread.sleep(5000);
        WebElement login = driver.findElement(SauceLogin);
        login.click();

    }

    public boolean getsauceLabs() throws InterruptedException {
        Thread.sleep(5000);
        boolean ele = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).isDisplayed();
        return ele;

    }


}
