package pom;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	private static HashMap<String,WebDriver> drivers=new HashMap<String,WebDriver>();
	
	public static WebDriver getBrowserInstance(String Browser) {
		WebDriver driver=null;
		switch(Browser) {
			case "Firefox":
				driver=drivers.get("Firefox");
				if(driver==null) {
					System.setProperty("webdriver.gecko.driver", "E:\\\\Gecko\\geckodriver.exe");
					driver=new FirefoxDriver();
					drivers.put("Firefox", driver);
				}
					
				break;
			
		}		
		return driver;
		
	}
	
	public static void closeBrowser() {
		for(String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
	}
	
}
