package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;

	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
		}
	public Loginpom(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
}
}