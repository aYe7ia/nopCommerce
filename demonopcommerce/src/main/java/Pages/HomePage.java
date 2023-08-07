package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    By RegisterButton = By.xpath("//a[@class='ico-register']");
    public HomePage(WebDriver driver){
        super(driver);
    }
    public void clickOnRegisterButton() {
        clickOnElement(RegisterButton);
    }

    public void navigateToHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
}
