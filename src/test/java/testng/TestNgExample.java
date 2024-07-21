package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExample {

    @Test
    public void testCase_1() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void testCase_2() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testng.org/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
