package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver lpdriver= null;
	public loginPage(WebDriver driver) {
		this.lpdriver= driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath= "//button")
	WebElement loginbtn;
	public void loginToApplication(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}

}
