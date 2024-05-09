package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement Location;
    
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomTypes;
	
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement CheckInDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement AdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChildranPerRoom;
	
	@FindBy(id="Submit")
	private WebElement Search;
	
	

	public WebElement getLocation() {
		return Location;
	}



	public WebElement getHotels() {
		return Hotels;
	}



	public WebElement getRoomTypes() {
		return RoomTypes;
	}



	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}



	public WebElement getCheckInDate() {
		return CheckInDate;
	}



	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}



	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}



	public WebElement getChildranPerRoom() {
		return ChildranPerRoom;
	}



	public WebElement getSearch() {
		return Search;
	}



	public SearchHotel(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
}
