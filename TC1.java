package scripts;
import static utils.Utils.*;
import org.testng.annotations.Test;
import static utils.ConfigFileReader.*;
import pom.BrowserFactory;

import pom.HomePage;
import pom.LogIn;
import utils.Utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static pom.BrowserFactory.*;
public class TC1 extends Utils {
  @Test(priority=1)
  public void orderAction() {
	
	 HomePage homePage=new HomePage();
	 homePage.navigateToHomePage();
	 homePage.navigateToSignInPage();
	 LogIn login=new LogIn();
	 login.enterUserName(readProperty("userName"));
	 login.enterPassword(readProperty("password"));
	 login.login();
	 
  }
  
  @BeforeTest
  public void beforeTest() {
	  openBrowser("Firefox");
	  System.out.println("Test started");
	  
  }
  
  @AfterTest
  public void afterTest() {
	BrowserFactory.closeBrowser();
  }
  

}
