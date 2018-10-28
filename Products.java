package pom;
import static utils.ConfigFileReader.*;

import org.openqa.selenium.By;
import enums.Url;

import utils.Log;
import utils.Utils;
public class Products extends Utils{

	private final By PRODUCT_TITLE = By.cssSelector("#productTitle");
    private final By AUTHOR = By.cssSelector(".a-link-normal.contributorNameID");
    private final By EDITION = By.cssSelector(".a-size-medium.a-color-secondary.a-text-normal");
    private final By PRICE = By.cssSelector(".a-size-medium.a-color-price.offer-price.a-text-normal");
    private final By ADD_TO_CART = By.cssSelector("#add-to-cart-button");

    public void navigateToProductPage(Products product){
        //String url = Url.BASEURL.getURL() + Url.PRODUCT_SECTION.getURL() + "/" + product.getProductId();
        //navigateToURL(url);
        //System.out.println("PRODUCT_PAGE: Navigated to " + url);
    }

}
