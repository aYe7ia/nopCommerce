package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Followus extends PageBase{
    By Facebook = By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    By Twitter = By.xpath("//a[@href='https://twitter.com/nopCommerce']");
    By rss = By.xpath("//a[@href='/news/rss/1']");
    By Youtube = By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']");
    public Followus(WebDriver driver) {
        super(driver);
    }

    public void clickOnFacebook(){
        clickOnElement(Facebook);
    }
    public void clickOnTwitter(){
        clickOnElement(Twitter);
    }
    public void clickOnRss(){
        clickOnElement(rss);
    }
    public void clickOnYoutube(){
        clickOnElement(Youtube);
    }


}
