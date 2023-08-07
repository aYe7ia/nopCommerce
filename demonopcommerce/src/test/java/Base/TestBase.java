package Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase extends AbstractTestNGCucumberTests{
    public static WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
