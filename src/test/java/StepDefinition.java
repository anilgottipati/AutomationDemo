package StepDefinitionFile;

import PageClass.PracticeFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver.getCurrentUrl();
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


    @When("user click on login")
    public void userClickOnLogin() {
         driver.findElement(By.name("submit")).click();
    }


    @Then("user is navigate to homepage")
    public void userIsNavigateToHomepage() {
    driver.navigate().to("https://parabank.parasoft.com/parabank/overview.htm");
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
        Amount.sendKeys("1000");
    }

        @When("User Enter Down Payment")
        public void userEnterDownPayment(){
            WebElement Downpayment = driver.findElement(By.id("downPayment"));
            Downpayment.sendKeys("1000");

        }



    @When("User will see Loan Provider")
    public void userWillSeeLoanProvider() {

        WebElement Loanprovider = driver.findElement(By.id("loanProviderName"));
        Assert.assertEquals(("Wealth Securities Dynamic Loans (WSDL"), getText(String.valueOf(Loanprovider)));
    }

    @And("User will see current date")
    public void userWillSeeCurrentDate() {
        WebElement Date = driver.findElement(By.id("responseDate"));
        Assert.assertEquals(("Date"), getText(String.valueOf(Date)));
    }

    @Then("User will see Status")
    public void userWillSeeStatus() {
        WebElement status = driver.findElement(By.id("loanStatus"));
        Assert.assertEquals(("Approved"), getText(String.valueOf(status)));
    }


}






