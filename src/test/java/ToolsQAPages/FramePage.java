package ToolsQAPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePage {


    WebDriver driver;
    By frameID = By.id("frame1");
    By FrameText = By.id("sampleHeading");

    // Constructor to initialize WebDriver
    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void SwitchFrame()
    {
         driver.switchTo().frame("frame1");
        getText();
    }

    public void LaunchFrame()
    {
        driver.get("https://demoqa.com/frames");
    }

    public String getText()
    {
        WebElement frameText = driver.findElement(FrameText);
       return frameText.getText();
    }
}
