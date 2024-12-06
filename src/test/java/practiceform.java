
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceform {
            WebDriver driver;
            By FirstnameField = By.id("firstname");
            By LastnameField = By.id("lastname");
            By Email = By.id("userEmail");
            By Mobileno = By.id("userNumber");
            By Hobbiescheckbox = By.xpath("//*text()='music]");

            public practiceform(WebDriver driver) {
                this.driver = driver;


            }

            public void enterFirstname(String username) {
                WebElement firstname = driver.findElement(FirstnameField);
                firstname.sendKeys(username);

            }

            public void enterLastname(String Lastname) {
                WebElement lastname = driver.findElement(LastnameField);
                lastname.sendKeys(Lastname);
            }

            public void enterEmail(String EmailID) {
                WebElement mail = driver.findElement(Email);
                mail.sendKeys(EmailID);
            }

            public void enterno(String Mobile) {
                WebElement Number = driver.findElement(Mobileno);
                Number.sendKeys(Mobile);

            }

            public void enterHobbiescheckbox(String Hobbies) {
                WebElement Hobby = driver.findElement(Hobbiescheckbox);
                Hobby.click();
            }


}





