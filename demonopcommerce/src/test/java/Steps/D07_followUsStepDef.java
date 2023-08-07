package Steps;

import Base.TestBase;
import Pages.Followus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef extends TestBase {

    Followus followusObject = new Followus(driver);



    @When("user clicks on facebook button")
    public void user_clicks_on_facebook_button() throws InterruptedException {
        followusObject.clickOnFacebook();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> test = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(test.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Thread.sleep(Long.parseLong("2"));
        driver.close();
        driver.switchTo().window(test.get(0));


    }

    @And("user clicks on twitter button")
    public void user_clicks_on_twitter_button() throws InterruptedException {
        followusObject.clickOnTwitter();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> test = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(test.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Thread.sleep(Long.parseLong("2"));
        driver.close();
        driver.switchTo().window(test.get(0));
    }

    @Then("user clicks on youtube button")
    public void user_clicks_on_youtube_button() throws InterruptedException {
        followusObject.clickOnYoutube();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> test = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(test.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Thread.sleep(Long.parseLong("2"));
        driver.close();
        driver.switchTo().window(test.get(0));

    }

    @And("user clicks on rss button")
    public void userClicksOnRssButton() throws InterruptedException {
        followusObject.clickOnRss();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Thread.sleep(Long.parseLong("2"));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
}
