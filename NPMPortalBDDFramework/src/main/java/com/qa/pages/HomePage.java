package com.qa.pages;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Mahes Yoga')]")
	WebElement loggedUsername;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {

		return loggedUsername.isDisplayed();
	}

}
