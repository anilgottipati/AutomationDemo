package StepDefinitionFile;

import PageClass.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepFile {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage =new LoginPage(driver);
    @Given("User launch The SauceDemo Application")
    public void userLaunchTheSauceDemoApplication() {
        loginPage.launchSauceDemoApplication();
    }

    @And("User Enter UserName and Password")
    public void userEnterUserNameAndPassword() throws InterruptedException {
        loginPage.EnterUserName("standard_user");
        loginPage.EnterPassword("secret_sauce");
    }

    @And("Click on Login")
    public void clickOnLogin() throws InterruptedException {
        loginPage.ClickLogin();
    }

    @Then("Home Page Should get displayed")
    public void homePageShouldGetDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.getsauceLabs());
    }

    @And("User Enter username and Password")
    public void userEnterUsernameAndPassword() throws InterruptedException {
        loginPage.EnterUserName("locked_out_user");
        loginPage.EnterPassword("secret_sauce");
    }

    @And("User Enter username and Password for Problem User")
    public void userEnterUsernameAndPasswordForProblemUser() throws InterruptedException {
        loginPage.EnterUserName("problem_user");
        loginPage.EnterPassword("secret_sauce");
    }

    @And("User Enters {string} and {string}")
    public void userEntersAnd(String UserName, String Password) {
        loginPage.EnterCredentialsSauceDemo(UserName,Password);
    }
}
