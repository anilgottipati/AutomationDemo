import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Formpagepractice {


        WebDriver driver;
        By FirstnameField = By.id("firstName");
        By LastnameField =By.id("lastName");
        By Email=By.id("userEmail");
        By Mobileno = By.id("userNumber");
        By Hobbiescheckbox=By.xpath("//*[text()='Reading']");

    public Formpagepractice (WebDriver driver){
        this.driver = driver;
    }

    //Enter firstname
    public void enterFirstname(String username) {
        WebElement Firstname = driver.findElement(FirstnameField);
        Firstname.sendKeys(username);
    }

        //enter lastname
    public void enterLaststname(String Lastname) {
        WebElement lastname = driver.findElement(LastnameField);
        lastname.sendKeys(Lastname);
    }
       //enter email

    public void enterEmail(String EmailID){
        WebElement mail = driver.findElement(Email);
        mail.sendKeys(EmailID);
      }

      // enter Mobilenumber

      public void enterMobileno(String Mobile){
        WebElement Number = driver.findElement(Mobileno);
        Number.sendKeys(Mobile);
      }



      // enter checkboxHobbies
      public void enterHobbiescheckbox(String Hobbeis){
        WebElement hobby = driver.findElement(Hobbiescheckbox);
        hobby.click();
      }




            }












