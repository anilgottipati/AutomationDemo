import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomeStepDefinitionFile {

    WebDriver driver;
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
    @Given("that i am on the shopping website")
    public void that_i_am_on_the_shopping_website() {
        practiceFormPage.launchApplication();

    }
    @When("i add an item to the basket")
    public void i_add_an_item_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("i can view the item in my basket")
    public void i_can_view_the_item_in_my_basket() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("User launch the Application")
    public void user_launch_the_application() {
        // Write code here that turns the phrase above into concrete actions
        practiceFormPage.launchWidgetApplication();
    }
    @When("User Enter the UserName")
    public void user_enter_the_user_name() {
        // Write code here that turns the phrase above into concrete actions
        practiceFormPage.EnterText("userName","Automation Selenium");
    }
    @When("User Enter the UserEmail")
    public void user_enter_the_user_email() {
        // Write code here that turns the phrase above into concrete actions
        practiceFormPage.EnterText("userEmail","Auto@gmail.com");
    }
    @When("User Enter the currentAddress")
    public void user_enter_the_current_address() {
        // Write code here that turns the phrase above into concrete actions
        practiceFormPage.EnterText("currentAddress","Chennai");
    }
    @Then("click on submit")
    public void click_on_submit() {
        // Write code here that turns the phrase above into concrete actions
        practiceFormPage.ClickButton("submit");
    }
}
