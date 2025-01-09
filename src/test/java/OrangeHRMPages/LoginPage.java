package OrangeHRMPages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;

    // Locators for the elements
    By UserName = By.name("username");
    By Password = By.name("password");
    By Submit = By.xpath("//button[@type='submit']");
    By InvalidErrorMsg = By.xpath("//*[text()='Invalid credentials']");
    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void launchApplication()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void launchHospitalApplication()
    {
        driver.get("file:///C:/Users/Anil%20G/Desktop/Anil/SeleniumWebSiteTraining/HospitalRegistration.html");
    }

    public void EnterUserName(String name)
    {
        WebElement usernameElement = driver.findElement(UserName);
        usernameElement.sendKeys(name);
    }

    public void SelectDropDown(String dropdownName,String Value)
    {
        Select se=new Select(driver.findElement(By.id(dropdownName)));
        se.selectByVisibleText(Value);
    }

    public String VerifyTitle()
    {
      return driver.getTitle();

    }

    public String VerifyUrl()
    {
        return driver.getCurrentUrl();

    }


    public void EnterText(String FieldName,String Value)
    {
        WebElement usernameElement1 = driver.findElement(By.name(FieldName));
        usernameElement1.sendKeys(Value);
    }
    public void EnterPassword(String name)
    {
        WebElement usernameElement = driver.findElement(Password);
        usernameElement.sendKeys(name);
    }



    public void ClickButton()
    {
        WebElement SubmitElement = driver.findElement(Submit);
        SubmitElement.click();
    }

    public void ClickButton(String ButtonName)
    {
        WebElement SubmitElement = driver.findElement(By.xpath("//*[@type='"+ButtonName+"']"));
        SubmitElement.click();
    }


    public boolean VerifyMsg(String text)
    {
        WebElement SubmitElement1 = driver.findElement(By.xpath("//*[text()='"+text+"']"));
       return SubmitElement1.isDisplayed();
    }
    public boolean VerifyMessage()
    {
        WebElement VerifyElement = driver.findElement(InvalidErrorMsg);
       return VerifyElement.isDisplayed();
    }
}
