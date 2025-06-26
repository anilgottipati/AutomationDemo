
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsFormPage {
            WebDriver driver;
            By Username = By.id("userName");
            By Email = By.id("userEmail");
            By CurrentAddress= By.id("currentAddress");
    By Elements= By.xpath("//*[text()='Elements']");
    By TextBox= By.xpath("//*[text()='Text Box']");
    public ElementsFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Click(String text)
    {
        driver.findElement(By.xpath("//*[text()='"+text+"']")).click();
    }
    public void ClickElements()
    {
        WebElement element = driver.findElement(Elements);
        element.click();
    }

    public void ClickText()
    {
        WebElement element = driver.findElement(TextBox);
        element.click();
    }
    public void EnterUser(String username) {
        WebElement Name = driver.findElement(Username);
        Name.sendKeys(username);
    }

    public void EnterEmail(String email) {
        WebElement Name = driver.findElement(Email);
        Name.sendKeys(email);
    }

    public void CurrentAddress(String address) {
        WebElement Name = driver.findElement(CurrentAddress);
        Name.sendKeys(address);
    }








}





