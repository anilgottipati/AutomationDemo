import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeStepDefinitionFile {

    WebDriver driver = new ChromeDriver();

    PracticeFormPage practiceFormPage=new PracticeFormPage(driver);

    LoginPage loginPage =new LoginPage(driver);

    @Given("User launch the Application")
    public void user_launch_the_application() {
        // Write code here that turns the phrase above into concrete actions
        practiceFormPage.launchWidgetApplication();
    }
//    @When("User Enter the UserName")
//    public void user_enter_the_user_name() {
//        // Write code here that turns the phrase above into concrete actions
//        practiceFormPage.EnterText("firstName","Automation Selenium");
//    }


    @When("User Enter the FirstName")
    public void user_enter_the_first_name() throws InterruptedException {
        practiceFormPage.EnterText("firstName","Automation");
    }
    @When("User Enter the LastName")
    public void user_enter_the_last_name() throws InterruptedException {
        practiceFormPage.EnterText("lastName","Selenium");
    }


    @When("User Enter the Following details")
    public void user_enter_the_following_details(DataTable dataTable) throws InterruptedException {
        // Convert DataTable into a list of Users
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {  // Skipping header row
            String FieldName = row.get(0);
            String Value = row.get(1);
            practiceFormPage.EnterText(FieldName,Value);
        }

    }

    @When("User Click on {string} Button")
    public void userClickOnButton(String Button) {
        practiceFormPage.ClickButton(Button);
    }

    @When("User Enter the {string} and {string}")
    public void userEnterTheAnd(String arg0, String arg1) throws InterruptedException {
        practiceFormPage.EnterText(arg0,arg1);
    }

    @And("User Enter LastName")
    public void userEnterLastName() {

    }

    @When("User Enter FirstName")
    public void userEnterFirstName() {
    }

    @Given("User launch Application")
    public void userLaunchApplication(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {  // Skipping header row
            String Url = row.get(0);
            loginPage.launchApplication(Url);
        }

    }

    @Given("User launch Gmail Application")
    public void userLaunchGmailApplication() {
        loginPage.launchGmailApplication();
    }

    @Given("User launch WVPA Application")
    public void userLaunchWVPAApplication() {
        loginPage.launchWVPAApplication();
    }

    @When("User Click on {string}")
    public void userClickOn(String text) throws InterruptedException {
        practiceFormPage.ClickXpathButton(text);
    }

    @Given("User launch the Rahul Academy Application")
    public void userLaunchTheRahulAcademyApplication() {
        loginPage.launchRahulAcademyApplication();
    }

    @When("User Click on Alert")
    public void userClickOnAlert() {
        loginPage.ClickAlert();
    }

    @And("Alert Popup Message get displayed")
    public void alertPopupMessageGetDisplayed() {
        
        
    }

    @And("User Click on OK Button")
    public void userClickOnOKButton() {
    }

    @Then("Alert PopUp should Closed")
    public void alertPopUpShouldClosed() {
    }
}
