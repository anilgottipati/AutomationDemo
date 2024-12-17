package StepDefinitionFile;

import PageClass.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StepDefinition {
    WebDriver driver = new ChromeDriver();
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);



    @Given("User launch Application")
    public void userLaunchApplication() {
        PracticeFormPage.launchApplication();
    }

    @Given("User Enter FirstName")
    public void userEnterFirstName() throws InterruptedException {
        PracticeFormPage.Enterfirstname("Radhika");
    }


    @And("User Enter  LastName")
    public void userEnterLastName() throws InterruptedException {
        PracticeFormPage.EnterLastname("C");
    }

    @When("User Enter  Email")
    public void userEnterEmail() throws InterruptedException {
        PracticeFormPage.EnterEmailField("CR@47gmail.com");
    }

    @When("User Select Gender")
    public void userSelectGender() {
    }

    @Then("User Enter Mobile")
    public void userEnterMobile() throws InterruptedException {
        PracticeFormPage.EnterMobileField("758667686");
    }

    @When("user enter following details")
    public void userEnterFollowingDetails(DataTable dataTable) { throws InterruptedException
        List<List<String>> rows = dataTable.asLists(String.class);
        for(List<String> row : rows.subList(1, rows).size()){
            String FieldName = row.get(0);
            String Value = row.get(1);
            PracticeFormPage.EnterText(FieldName,Value);
        }
    }
}




