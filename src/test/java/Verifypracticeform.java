import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Verifypracticeform {
    WebDriver driver;
    practiceform practiceform = new practiceform(driver);
    @Given("User launch the Application")
    public void user_launch_the_application() {
        practiceform.launchApplication();
        throw new io.cucumber.java.PendingException();
    }
    @When("User Enter the FirstName")
    public void user_enter_the_first_name() {
        practiceform.enterLastname("userName","Anu");
        throw new io.cucumber.java.PendingException();
    }
    @And("User Enter the UserEmail")
    public void user_enter_the_user_email() {
        practiceform.enterEmail("Anu123@gmail.com");
        throw new io.cucumber.java.PendingException();
    }
    @Then("User Enter the UserNumber")
    public void user_enter_the_user_number() {
        practiceform.enterno("7465477557");
        throw new io.cucumber.java.PendingException();
    }
}
