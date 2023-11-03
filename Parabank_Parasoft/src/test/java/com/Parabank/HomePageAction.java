package com.Parabank;

import org.openqa.selenium.support.PageFactory;

public class HomePageAction {
HomePageLocators homepagelocators;
	
	public HomePageAction() {
		homepagelocators = new HomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(), homepagelocators);
	}
	
	public String getRegisterText() {
		return homepagelocators.registerMsg.getText();
	}
	
	public String getLoginText() {
		return homepagelocators.LoginverifyText.getText();
	}
}

