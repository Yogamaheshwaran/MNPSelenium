package com.qa.pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{

	//
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='pass']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	WebElement loginBtn;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()'", loginBtn);
		return new HomePage();
	}
	
//	public HomePage login(String un, String pwd) {
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()'", loginBtn);
//		
//		return new HomePage();
//	}
//	public boolean validateBtn() {
//		return true;
//	}
}


