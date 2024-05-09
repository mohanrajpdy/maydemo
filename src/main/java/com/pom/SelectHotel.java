package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement SelectHotel;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement Continue;
	
	
	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public SelectHotel(WebDriver d) {
		driver= d;
		PageFactory.initElements(driver,this);
		
	}

}
