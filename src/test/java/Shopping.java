import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.apache.logging.log4j.core.appender.rewrite.MapRewritePolicy.Mode.Add;

public class Shopping {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Desktop\\Testing\\chromedriver.exe");
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        //open website
        driver.get("file:///C:/Users/Radhika/Downloads/cardApplication.html");
        Thread.sleep(2000);
        int ele =driver.findElements(By.xpath("/html/body/h3")).size();
        for(int i=1;i<=ele;i++){
            String ele1 = driver.findElement(By.xpath("/html/body/div[3]/button" +i+"')]")).getText();
        if (ele1.contains("Product 4 - $40")){
            driver.findElement(By.xpath("/html/body/div[3]/button" +i+"')]")).click();
        }
        }

        // product
        WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Product 4 - $40')]"));
        element.click();
        Thread.sleep(2000);


        //add to cart
        WebElement addToCart = driver.findElement(By.xpath("//h3[contains(text(),'Product 4 - $40')]"));
        addToCart.click();
        Thread.sleep(2000);

        // total cart
        WebElement cartTotal = driver.findElement(By.id("total"));
        System.out.println("Cart Total:" + cartTotal);
        Thread.sleep(2000);


        driver.quit();
        driver.close();
       }

}
