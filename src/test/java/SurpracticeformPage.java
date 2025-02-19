
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurpracticeformPage {
            WebDriver driver;
            By FirstnameField = By.id("firstname");
            By UserName = By.id("name");

            By RadioButton1=By.xpath("//input[@value='radio1']");
            public SurpracticeformPage(WebDriver driver) {
                this.driver = driver;


            }

    public void enterUserName(String username) {
        WebElement Name = driver.findElement(UserName);
        Name.sendKeys(username);

    }

    public boolean IsRadioButtonEnabled() {
        WebElement radioButton = driver.findElement(RadioButton1);
       return radioButton.isEnabled();
    }






}





