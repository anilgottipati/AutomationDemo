import PageClass.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
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
    public void userLaunchApplication() throws InterruptedException {
        PracticeFormPage.launchApplication();
    }


    @When("User Click Gender")
    public void userClickGender() throws InterruptedException {
        practiceFormPage.ClickButton("Value");
    }


    public void userEnter(String ele) {
    }

    @And("User Enter below details")
    public void userEnterBelowDetails(DataTable dataTable) throws InterruptedException {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {
            String Option = row.get(0);
            String Value = row.get(1);
            PracticeFormPage.EnterText(Option, Value);
        }
    }

    @Then("User Select State")
    public void userSelectState(String Option, String Value) throws InterruptedException {
        WebElement element = driver.findElement(By.id("stateCity-label"));
        practiceFormPage.SelectState("Value");
    }

    @Given("User Enter FirstName")
    public void UserEnterFirstName() throws InterruptedException {
        WebElement element = driver.findElement(By.id("firstName"));
//        PracticeFormPage.EnterText(Option, Value);
    }

    @And("User Enter  LastName")
    public void UserEnterLastName(String Option, String Value) throws InterruptedException {
        WebElement element = driver.findElement(By.id("lastName"));
        PracticeFormPage.EnterText(Option, Value);
    }

    @When("User Enter  Email")
    public void UserEnterEmail(String Option, String Value) throws InterruptedException {
        WebElement element = driver.findElement(By.id("userEmail"));
        PracticeFormPage.EnterText(Option, Value);
    }

    @Then("User Enter Mobile")
    public void UserEnterMobile(String Option, String Value) throws InterruptedException {
        WebElement element = driver.findElement(By.id("userNumber"));
        PracticeFormPage.EnterText(Option, Value);
    }

    @And("user on alerts page")
    public void userOnAlertsPage() {
        Alert alert = driver.switchTo().alert();
    }

    @And("user click on alert button")
    public void userClickOnAlertButton() {

    }
}




