
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToVerifyFindElements {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (automatically manages the browser driver)
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil G\\Desktop\\Dummy\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(5000);

        int count =driver.findElements(By.xpath("//h4[@class='product-name']")).size();

        for (int i=1;i<count;i++)
        {
            String text =driver.findElement(By.xpath("(//h4[@class='product-name'])["+i+"]")).getText();
            System.out.println("Vegetable Names"+text);
            if (text.contains("Brinjal"))
            {
                driver.findElement(By.xpath("(//a[@class='increment'])["+i+"]")).click();
                driver.findElement(By.xpath("(//*[text()='ADD TO CART'])["+i+"]")).click();
                break;
            }
        }

      String ItemCount = driver.findElement(By.xpath("//*[text()='Items']//parent::tr//child::td[3]")).getText();
      String ActualPrice =  driver.findElement(By.xpath("//*[text()='Price']//parent::tr//child::td[3]")).getText();
        int Price = Integer.parseInt(ActualPrice);
        Assert.assertEquals("1",ItemCount);
        Assert.assertEquals(70,Price);
        driver.close();

//                isEnabled
//                isDisplayed
//                isSelected
    }
}
