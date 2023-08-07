package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{


    By emailField = By.xpath("//input[@class='email']");
    By passwordField = By.xpath("//input[@class='password']");
    By login = By.xpath("//button[@class='button-1 login-button']");
    By logOut = By.className("ico-logout");

    By wrongEmail = By.xpath("//input[@class='email']");
    By wrongPassword = By.xpath("//input[@class='password']");
    By invalidCredential = By.xpath("//div[@class='message-error validation-summary-errors']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setEmailField(){
        setElementText(emailField,"test.07@exm.com");
    }
    public void setPasswordField(){
        setElementText(passwordField,"P@ssword$");
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }

    public void setWrongEmail(){
        setElementText(wrongEmail,"wrong@example.com");
    }
    public void setWrongPassword(){
        setElementText(wrongPassword,"Aa12345");
    }
    public String invalidCredentialMessage(){
        String invalid = driver.findElement(invalidCredential).getText();
        return invalid;
    }

}
