import PageClass.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import static junit.framework.Assert.assertTrue;

public class StepDefinition {
    WebDriver driver = new ChromeDriver();
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);


    @Given("launch browser")
    public void launchApplication() throws InterruptedException {
        PracticeFormPage.launchApplication();
    }

    @And("user enters username and password")
    public void userEntersUsernameAndPassword() {
        driver.findElement(By.name("username")).sendKeys("Radhika");
        driver.findElement(By.name("password")).sendKeys("474747");

    }


    @When("user click on login")
    public void userClickOnLogin() {
         driver.findElement(By.name("submit")).click();
    }


    @Then("user is navigate to homepage")
    public void userIsNavigateToHomepage() {

    }

    @Then("account services will display")
    public void accountServicesWillDisplay() {
      WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Account Services']"));
     boolean isDisplayed = element.isDisplayed();
     assertTrue(isDisplayed) ;
    }



    @And("User Click on Request Loan")
    public void userClickOnRequestLoan() {
        driver.findElement(By.id("amount"));
    }

    @When("User Enter on Loan Amount")
    public void userEnterOnLoanAmount() {
        driver.findElement(By.id("downPayment"));
    }



    @When("User will see Loan Provider")
    public void userWillSeeLoanProvider() {
        driver.findElement(By.id("loanProviderName"));
    }

    @And("User will see current date")
    public void userWillSeeCurrentDate() {
        driver.findElement(By.id("responseDate"));
    }

    @Then("User will see Status")
    public void userWillSeeStatus() {
        driver.findElement(By.id("loanStatus"));
    }
}




