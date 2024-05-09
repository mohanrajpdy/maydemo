package com.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.PageObjectManager.PageObjectM;
import com.Runner.Runner;
import com.base.Base;
import com.pom.Loginpom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base {
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectM k = new PageObjectM(driver);
	//Loginpom l = new Loginpom(driver);
	
	@Given("user Can Able to Lunch the Url")
	public void user_can_able_to_lunch_the_url() {
		geturl("https://adactinhotelapp.com/");
		maxi();
	    
	}
	@When("user Can Enter the User Name in UsernameField")
	public void user_can_enter_the_user_name_in_username_field() {
		
		inputvalue(k.getLog().getUser(), "mohanrajp");
	    
	}
	
	@When("user Can Enter the Password in PasswordField")
	public void user_can_enter_the_password_in_password_field() {
		
		inputvalue(k.getLog().getPass(), "UYC89O");
	   
	}
	@Then("user Can Click the Login Button Move on to Next Page")
	public void user_can_click_the_login_button_move_on_to_next_page() {
		clickon(k.getLog().getLogin());
		
	   
	}

	@When("user Can Select the Location")
	public void user_can_select_the_location() {
	   
	    WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));// using xpath
		Select s=new Select(loc);// using dropdown
		s.selectByValue("Melbourne");
		k.getSerhot().getLocation();
		///
		
	}
	@When("user Can Select the Hotel")
	public void user_can_select_the_hotel() {
		WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1=new Select(hot);
		s1.selectByIndex(2);// using by index
		k.getSerhot().getHotels();
	    
	}
	@When("user Can Select the RoomType")
	public void user_can_select_the_room_type() {
		WebElement rom = driver.findElement(By.id("room_type"));
		Select s2=new Select(rom);
		s2.selectByVisibleText("Double");// using by visibletext
		k.getSerhot().getRoomTypes();
	}
	    
	@When("User Can Select the NonofRoom")
	public void user_can_select_the_nonof_room() {
		WebElement nrom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(nrom);
		s3.selectByIndex(1);
		k.getSerhot().getNumberOfRooms();
	    
	}
	@When("user Can Select the CheckinDate")
	public void user_can_select_the_checkin_date() {
		WebElement checkin = driver.findElement(By.xpath(" //input[@name='datepick_in']"));
		checkin.sendKeys("02/05/2024");
		k.getSerhot().getCheckInDate();
	   
	}
	@When("user Can Select the Checkoutdate")
	public void user_can_select_the_checkoutdate() {
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.sendKeys("03/05/2024");
		k.getSerhot().getCheckOutDate();
	    
	}
	@When("user Can Select the AdultsPerRoom")
	public void user_can_select_the_adults_per_room() {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult);
		s4.selectByVisibleText("2 - Two"); // using visiable text
	   k.getSerhot().getAdultsPerRoom();
	}
	@When("user Can Select the ChildrenPerRoom")
	public void user_can_select_the_children_per_room() {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5=new Select(child); 
		s5.selectByIndex(2);
	    k.getSerhot().getChildranPerRoom();
	}
	@Then("user Can Click the Search Button to Navigate Next Page")
	public void user_can_click_the_search_button_to_navigate_next_page() {
		WebElement submit = driver.findElement(By.id("Submit"));
		k.getSerhot().getSearch();
		clickon(submit);
		//submit.click();
	   
	}
// 3rd page
	
	@When("User Can Select the Hotel")
	public void user_can_select_the_hotel1() {
		WebElement sele = driver.findElement(By.id("radiobutton_0"));
		k.getSelhot().getSelectHotel();
      clickon(sele);
	   
	}
	
	@Then("user Can Click the Countinue Button for Move On Next Page")
	public void user_can_click_the_countinue_button_for_move_on_next_page() {
		 WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
	     k.getSelhot().getContinue();
		 clickon(cont);
	   
	}

	//4th page
	@When("user Can Write the First Name in FirstNameField")
	public void user_can_write_the_first_name_in_first_name_field() {
		WebElement fname = driver.findElement(By.id("first_name"));
		k.getBookhot().getFirstName();
		inputvalue(fname, "WELCOME TO GREENS");
		
	}
	@When("user Can Write Last Name in LastNameField")
	public void user_can_write_last_name_in_last_name_field() {
		WebElement lname = driver.findElement(By.id("last_name"));
		k.getBookhot().getLastName();
		inputvalue(lname, "Chennai");
	}
	@When("user Can Write Customer Address in BillingAddressField")
	public void user_can_write_customer_address_in_billing_address_field() {
		WebElement billads = driver.findElement(By.id("address"));
	    k.getBookhot().getBillAddress();
		inputvalue(billads, "Ground floor, New No. W-41, Old W122, 3rd Ave, W Block, Anna Nagar, Chennai, Tamil Nadu 600040");
		}
	@When("user Can Enter Credit Card Number in CreditCardNoField")
	public void user_can_enter_credit_card_number_in_credit_card_no_field() {
		WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		k.getBookhot().getCardNo();
		inputvalue(cardno, "12345678905432523");
	}
	@When("user Can Selct CreditCard Type in CreditCardType Field")
	public void user_can_selct_credit_card_type_in_credit_card_type_field() {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardtype);
		k.getBookhot().getCardType();
		s6.selectByValue("AMEX");
	}
	@When("user Can Selct ExpiryDate  in ExpiryDateField")
	public void user_can_selct_expiry_date_in_expiry_date_field() {
		WebElement exdate = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(exdate);
		s7.selectByIndex(2);
		k.getBookhot().getExpiryDt();
	}
	@When("user Can Select CvvNumber in CvvNumberField")
	public void user_can_select_cvv_number_in_cvv_number_field() {
		WebElement exmonth = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(exmonth);
		s8.selectByIndex(3);
		k.getBookhot().getCvvNo();
	}
	@Then("user Can Click BookNow Button Move On to Next Page")
	public void user_can_click_book_now_button_move_on_to_next_page() {
		WebElement ccnum = driver.findElement(By.id("cc_cvv"));
		inputvalue(ccnum, "123");
		k.getBookhot().getBookNow();
	}

	@Then("user Can Click LogOut Button for LogOutSite")
	public void user_can_click_log_out_button_for_log_out_site() {
		WebElement booknow = driver.findElement(By.id("book_now"));
		clickon(booknow);
		k.getBookcon().getLogOut();
	}





	
	
	
}
