package pom;

import static utils.ConfigFileReader.*;

import javax.sound.midi.MidiDevice.Info;

import org.openqa.selenium.By;

import static utils.Log.*;
import utils.Utils;
public class LogIn extends Utils {

	 private final By USERNAME = By.cssSelector("#ap_email");
	 private final By PASSWORD = By.cssSelector("#ap_password");
	 private final By SIGNIN_BUTTON = By.cssSelector("#signInSubmit");
	
	 public LogIn() {
		 
	 }
	 
	 public void enterUserName(String userName) {
		 waitForElementToBeVisible(USERNAME);
		 sendKeys(USERNAME,userName);
		 info("Username entered");
	 }
	 
	 public void enterPassword(String password) {
		 waitForElementToBeVisible(PASSWORD);
		 sendKeys(PASSWORD,password);
		 info("Password entered");
	 }
	 
	 public void login() {
		 click(SIGNIN_BUTTON);
		 
	 }
}
