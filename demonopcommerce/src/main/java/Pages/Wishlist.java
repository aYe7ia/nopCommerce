package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wishlist extends PageBase{

    By wishListButton = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1']");
    By wishListTab = By.className("ico-wishlist");
    By closeWishListMessage = By.xpath("//span[@class='close']");
    public Wishlist(WebDriver driver) {
        super(driver);
    }
    public void clickOnWishListButton(){
        clickOnElement(wishListButton);
    }
    public void clickOnWishListTab(){
        clickOnElement(wishListTab);
    }
    public void clickOnCloseWishListMessage(){
        clickOnElement(closeWishListMessage);
    }


}
