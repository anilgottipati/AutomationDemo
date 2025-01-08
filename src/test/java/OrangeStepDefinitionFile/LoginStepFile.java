package OrangeStepDefinitionFile;

import OrangeHRMPages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginStepFile {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("user launch the Application")
    public void userLaunchTheApplication() {
        loginPage.launchApplication();
    }

    @When("User Enter UserName")
    public void userEnterUserName() {

        loginPage.EnterUserName("Admin1");
    }

    @And("User Enter Password")
    public void userEnterPassword() {
        loginPage.EnterPassword("Password1");
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


    @When("User Enter {string}")
    public void userEnter(String Value, DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {  // Skipping header row
            String FieldName = row.get(0);
            loginPage.EnterText(FieldName,Value);
        }
    }

    @And("User Click {string} Button")
    public void userClickButton(String btnName) {
        loginPage.ClickButton(btnName);
    }

    @Then("Verify the {string}")
    public void verifyThe(String text) {
        Assert.assertTrue(loginPage.VerifyMsg(text));
    }
}
