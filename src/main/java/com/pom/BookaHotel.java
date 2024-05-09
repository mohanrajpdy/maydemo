package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotel {
	
	
	public WebDriver driver;

	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement BillAddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement CardNo;
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryDt;
	
	@FindBy(id="cc_cvv")
	private WebElement CvvNo;
	
	@FindBy(id="book_now")
	private WebElement BookNow;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillAddress() {
		return BillAddress;
	}

	public WebElement getCardNo() {
		return CardNo;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpiryDt() {
		return ExpiryDt;
	}

	public WebElement getCvvNo() {
		return CvvNo;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	public  BookaHotel(WebDriver d) {
		driver =d;
		PageFactory.initElements(driver, this);
		
	}
	

}
