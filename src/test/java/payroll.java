import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class payroll {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Radhika/Downloads/PayRoll.html");
                Thread.sleep(2000);

        //employe name

        WebElement EmployeeNameField = driver.findElement(By.name("Employee Name"));
        EmployeeNameField.sendKeys("anu");

        //hours
        WebElement HoursWorkedField = driver.findElement(By.name(" Hours Worked"));
        HoursWorkedField.sendKeys("80");

        //Hourly Rate
        WebElement HourlyRateField = driver.findElement(By.name("Hourly Rate"));
        HourlyRateField.sendKeys("40");

       //Tax Rate
        WebElement TaxRateField = driver.findElement(By.name("Tax Rate"));
        TaxRateField.sendKeys("2");


        //Calculate
        WebElement calculatePayrollbutton = driver.findElement(By.xpath("//button[@type='button']"));
        calculatePayrollbutton.click();

        driver.findElement(By.xpath("//*@id='payrollForm']/button")).click();
        Thread.sleep(2000);

        WebElement grossSalaryElement = driver.findElement(By.id("resultGross"));
        String actualGrossSalary = grossSalaryElement.getText();
        double expectedGrossSalary = (8 * 20) ;
        double ActualTaxDeduction = payroll.calculateTax(160,2);
        String expectedGrossSalaryStr = String.format("%.2f", expectedGrossSalary+0);
        Assert.assertEquals( expectedGrossSalaryStr, actualGrossSalary);
        WebElement actualTax = driver.findElement(By.id("result"));
        String TaxDeduction = actualTax.getText();
        double NetSalary1=(160.00-3.20);
        Assert.assertEquals(expectedGrossSalaryStr,NetSalary1+0);
        driver.quit();
    }
}










