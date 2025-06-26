
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formPage
{
            WebDriver driver;
            By Firstname = By.id("firstname");
            By Lastname = By.id("lastName");

            public  void EnterFirstname(String firstname ) {
                WebElement FName = driver.findElement(Firstname);
                FName.sendKeys(firstname);
            }
            public  void  EnterLastname( String lastname){
                WebElement LName = driver.findElement(Lastname);
                LName.sendKeys(lastname);
            }





    }












