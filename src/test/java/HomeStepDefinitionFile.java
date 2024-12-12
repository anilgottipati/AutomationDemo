import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeStepDefinitionFile {

    WebDriver driver = new ChromeDriver();

    PracticeFormPage practiceFormPage=new PracticeFormPage(driver);



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
    public void user_enter_the_first_name() {
        practiceFormPage.EnterText("firstName","Automation");
    }
    @When("User Enter the LastName")
    public void user_enter_the_last_name() {
        practiceFormPage.EnterText("lastName","Selenium");
    }

}
