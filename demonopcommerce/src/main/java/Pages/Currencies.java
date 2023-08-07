package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Currencies extends PageBase{
    By currenciesDropDown = By.id("customerCurrency");



    public Currencies(WebDriver driver) {
        super(driver);
    }

    public void selectEuroCurrency(){
        Select euroCurrency = new Select(driver.findElement(currenciesDropDown));
        euroCurrency.selectByVisibleText("Euro");
    }




}
