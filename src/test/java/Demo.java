import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
    WebDriver driver;
        By ContactNameField = By.name("ContactName");
        By ContactnumberField = By.name("contactnumber");
        By PickUpDateField = By.name("pickupdate");
        By PaymentMethodField = By.name("payment");

        public Demo(WebDriver driver)
        {
            this.driver = driver;
        }

            public void EnterText(String Option, String Value)
            {
                WebElement ContactnameElement = driver.findElement(By.xpath("//*[@id='"+Option+"' or @name='"+Option+"']"));
                ContactnameElement.clear();
                ContactnameElement.sendKeys(Value);
            }
            public void EnterText(String Value)
            {
                WebElement ContactnumberElement = driver.findElement(By.name("Value"));
                ContactnumberElement.sendKeys("Value");
            }
            public void PickUpDate(String Value)
            {
                driver.findElement(By.name("pickupdate")).sendKeys(Value);
            }
            public void PaymentMethod(String Option,String Value){
                    Select se  = new Select(driver.findElement(By.id(Option)));
        se.selectByIndex(2);


            }
        }




