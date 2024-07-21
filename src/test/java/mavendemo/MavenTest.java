package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
