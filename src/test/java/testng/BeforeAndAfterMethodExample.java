package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodExample {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase_1() throws InterruptedException {
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase_2() throws InterruptedException {
        driver.navigate().to("https://testng.org/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethodExample() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
