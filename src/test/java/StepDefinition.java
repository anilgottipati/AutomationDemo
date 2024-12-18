import PageClass.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StepDefinition {
    WebDriver driver = new ChromeDriver();
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);


    @Given("User launch Application")
    public void userLaunchApplication() {
        practiceFormPage.launchApplication();
    }



    @When("User Click Gender")
    public void userClickGender() throws InterruptedException {
        practiceFormPage.ClickButton("Value");
    }


    @When("user enter following details")
    public void userEnterFollowingDetails(DataTable dataTable) throws InterruptedException{
        List<List<String>> rows = dataTable.asLists(String.class);
        for(List<String> row : rows.subList(1,rows.size())){
            String FieldName = row.get(0);
            String Value = row.get(1);
            practiceFormPage.EnterText(FieldName,Value);
        }
    }

    public void userEnter(String ele) {
    }

    @And("User Enter below details")
    public void userEnterBelowDetails(DataTable dataTable) throws InterruptedException {
        List<List<String>> rows = dataTable.asLists(String.class);
        for(List<String> row : rows.subList(1,rows.size())){
            String Option = row.get(0);
            String Value = row.get(1);
            practiceFormPage.EnterText(Option,Value);
        }
    }

    @Then("User Select State")
    public void userSelectState(String Option) {
        WebElement element = driver.findElement(By.id("stateCity-label"));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(Option);
    }

}




