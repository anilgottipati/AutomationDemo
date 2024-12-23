import PageClass.PracticeFormPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


import static jdk.internal.agent.Agent.getText;
import static junit.framework.Assert.assertTrue;

public class StepDefinition {
    WebDriver driver = new ChromeDriver();
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
    String submit;

    @Given("launch browser")
    public void launchApplication() throws InterruptedException {
        practiceFormPage.launchApplication();

    }



    @And("user enters username and password")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {
        WebElement usernameElement = driver.findElement(By.id("username"));
        PracticeFormPage.EnterText("username","Radhika");
        usernameElement.sendKeys("Radhika");

            WebElement passwordElement = driver.findElement(By.id("password"));
        PracticeFormPage.EnterText("password","4747");
        passwordElement.sendKeys("4747");
    }

    @Given("User enter below details")
    public void userEnterBelowDetails(DataTable dataTable) throws InterruptedException {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {
            String Option = row.get(0);
            String Value = row.get(0);
            PracticeFormPage.EnterText(Option, Value);

        }
    }





    @When("user click on login")
    public void userClickOnLogin() throws InterruptedException {
        practiceFormPage.ClickButton(submit);
    }


    @Then("user is navigate to homepage")
    public void userIsNavigateToHomepage() {
    driver.navigate().to("https://parabank.parasoft.com/parabank/overview.htm");
    }

    @Then("enter following details")
    public void enterFollowingDetails(DataTable dataTable) throws InterruptedException {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {
            String FieldName = row.get(0);
            String Value = row.get(0);
            PracticeFormPage.EnterText(FieldName, Value);

        }
    }



    @Then("account services will display")
    public void accountServicesWillDisplay() {
      WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Account Services']"));
     boolean isDisplayed = element.isDisplayed();
     assertTrue(isDisplayed) ;
    }



    @And("User Click on Request Loan")
    public void userClickOnRequestLoan() {
        WebElement element=driver.findElement(By.name(submit));
        element.click();
    }





        @When("User Enter on Loan Amount")
        public void userEnterOnLoanAmount() {
        WebElement Amount = driver.findElement(By.id("amount"));
        //Amount.sendKeys("200");
        PracticeFormPage.EnterText("1000");

    }

        @When("User Enter Down Payment")
        public void userEnterDownPayment(){
            WebElement Downpayment = driver.findElement(By.id("downPayment"));
           // Downpayment.sendKeys("200");
            PracticeFormPage.EnterText("200");

        }

    @Given("User enter details")
    public void userEnterDetails(DataTable dataTable) throws InterruptedException {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> row : rows.subList(1, rows.size())) {
            String Option = row.get(0);
            String Value = row.get(0);
            PracticeFormPage.EnterText(Option,Value);

        }
    }

    @When("User will see Loan Provider")
    public void userWillSeeLoanProvider() {

        WebElement Loanprovider = driver.findElement(By.id("loanProviderName"));
        System.out.println(("Wealth Securities Dynamic Loans (WSDL"));
    }

    @And("User will see current date")
    public void userWillSeeCurrentDate() {
        WebElement Date = driver.findElement(By.id("responseDate"));
        System.out.println(("Date"));
    }

    @Then("User will see Status")
    public void userWillSeeStatus() {
        WebElement status = driver.findElement(By.id("loanStatus"));
        System.out.println(("Approved"));
    }


}








