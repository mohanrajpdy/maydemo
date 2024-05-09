package com.PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookaHotel;
import com.pom.BookingCon;
import com.pom.Loginpom;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class PageObjectM {
	
	public WebDriver driver;
	
	private Loginpom log;
	
	private SearchHotel serhot;
		private SelectHotel selhot;
		private BookaHotel bookhot;
		private BookingCon bookcon;
		
		public Loginpom getLog() {
	
		log = new Loginpom(driver);
		return log;
		}
	public SearchHotel getSerhot() {
		serhot = new SearchHotel(driver);
		return serhot;
	}
	public SelectHotel getSelhot() {
		selhot = new SelectHotel(driver);
		return selhot;
	}
	public BookaHotel getBookhot() {
		bookhot = new BookaHotel(driver);
		return bookhot;
	}
	public BookingCon getBookcon() {
		bookcon = new BookingCon(driver);
		return bookcon;
	}
		public PageObjectM(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}

}
