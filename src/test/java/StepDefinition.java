package StepDefinitionFile;

import PageClass.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver = new ChromeDriver();
    PageClass pageClass = new PageClass(driver);
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);



    @Given("User launch Application")
    public void userLaunchApplication() {
        PracticeFormPage.launchApplication();
    }

    @Given("User Enter FirstName")
    public void userEnterFirstName() {
        PracticeFormPage.Enterfirstname("Radhika");
    }


    @When("User Enter  LastName")
    public void userEnterLastName() {
        PracticeFormPage.EnterLastname("C");
    }

    @When("User Enter  Email")
    public void userEnterEmail() {
        PracticeFormPage.EnterEmailField("CR@47gmail.com");
    }

    @When("User Select Gender")
    public void userSelectGender() {
    }

    @And("User Enter Mobile")
    public void userEnterMobile() {
        PracticeFormPage.EnterMobileField("758667686");
    }

    @When("user enter following details")
    public void userEnterFollowingDetails(DataTable dataTable) { throws InterruptedException
            List<List<String>> rows = dataTable.asLists(String.class);
        for(List<String> row : rows.subList(1,rows.size())){
            String FieldName = row.get(0);
            String Value = row.get(1);
            pageClass.EnterText(FieldName,Value);
        }
    }
}




