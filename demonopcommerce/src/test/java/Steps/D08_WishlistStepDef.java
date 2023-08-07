package Steps;

import Base.TestBase;
import Pages.Wishlist;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class D08_WishlistStepDef extends TestBase {
    Wishlist wishListObject = new Wishlist(driver);

    @When("user clicks on wishlist user is on home page button")
    public void user_clicks_on_wishlist_user_is_on_home_page_button() {
        wishListObject.clickOnWishListButton();
    }

    @Then("success message The product has been added to your wishlist displayed")
    public void success_message_the_product_has_been_added_to_your_wishlist_displayed() {
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='content']")));
        Assert.assertEquals(driver.findElement(By.xpath("//p[@class='content']")).getText(),"The product has been added to your wishlist");
    }


    @And("user clicks on wishlist tab")
    public void user_clicks_on_wishlist_tab() {
        Wait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("ico-wishlist")));
        wishListObject.clickOnCloseWishListMessage();
        wishListObject.clickOnWishListTab();
    }
}
