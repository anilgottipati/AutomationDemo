package StepDefinitionFile;

import PageClass.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepFile {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage =new LoginPage(driver);
    @Given("User launch The SauceDemo Application")
    public void userLaunchTheSauceDemoApplication() {

    }

    @And("User Enter UserName and Password")
    public void userEnterUserNameAndPassword() {
    }

    @And("Click on Login")
    public void clickOnLogin() {
        
    }

    @Then("Home Page Should get displayed")
    public void homePageShouldGetDisplayed() {
    }
}
