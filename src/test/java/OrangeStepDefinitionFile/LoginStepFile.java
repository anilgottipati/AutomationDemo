package OrangeStepDefinitionFile;

import OrangeHRMPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepFile {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("user launch the Application")
    public void userLaunchTheApplication() {
        loginPage.launchApplication();
    }

    @When("User Enter UserName")
    public void userEnterUserName() {

        loginPage.EnterUserName("Admin");
    }

    @And("User Enter Password")
    public void userEnterPassword() {
        loginPage.EnterPassword("Password");
    }

    @And("User Click on Submit Button")
    public void userClickOnSubmitButton() {
        loginPage.ClickButton();
    }

    @Then("Verify the Home Page")
    public void verifyTheHomePage() {
        loginPage.VerifyMessage();
    }

    @Then("Verify the Error Message")
    public void verifyTheErrorMessage() {

    }


    @And("User Click On {string} Button")
    public void userClickOnButton(String Button) {
        loginPage.ClickButton(Button);
    }

}
