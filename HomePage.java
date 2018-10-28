package pom;
import static utils.ConfigFileReader.*;

import org.openqa.selenium.By;

import utils.Log;
import utils.Utils;
public class HomePage extends Utils {
	private final By YOUR_ACC=By.id("nav-link-yourAccount");
	private final By SHOPPING_CART_ICON = By.cssSelector("#nav-cart");
	private final By SHOPPING_CART_COUNT = By.cssSelector("#nav-cart > #nav-cart-count");

	public HomePage() {
		
	}
	
	public void navigateToHomePage() {
		String url=readProperty("url");
		navigateToUrl(url);
	}
	
	public void navigateToSignInPage() {
		scrollToThenClick(YOUR_ACC);
		Log.info("Navigated to SignInPage");
	}
	
	public void signOut() {
		String url=readProperty("url")+readProperty("signOut");
		navigateToUrl(url);
	}
	public void selectShoppingCartIcon(){
        click(SHOPPING_CART_ICON);
    }
}
