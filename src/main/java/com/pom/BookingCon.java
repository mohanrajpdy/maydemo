package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingCon {

	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement LogOut;

	public WebElement getLogOut() {
		return LogOut;
	}
	
	public BookingCon(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
}
