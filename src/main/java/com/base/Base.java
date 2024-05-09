package com.base;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Base {
		
		public static WebDriver driver;
		public static WebDriver  browserLaunch(String browser) {
			
		
			if(browser.equalsIgnoreCase("Chrome")) {
				
			
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				
			}
			
			else if(browser.equals("edge")){
				
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
			}
			return driver;
		}
			
			public static void maxi() {
				driver.manage().window().maximize();
		}

			public static void geturl(String ur) {
				driver.get(ur);
			}
			
			public static void inputvalue(WebElement elem, String value) {
				elem.sendKeys(value);
			}
			public static void clickon(WebElement el) {
				el.click();
			}
			
			public static void dropdown(String options, WebElement ele, String value) {
				Select s= new Select(ele);
				if(options.equalsIgnoreCase("text")) {
					s.selectByVisibleText(value);
				}
				else if(options.equalsIgnoreCase("value")) {
					s.selectByValue(options);
				}
			
				else if(options.equalsIgnoreCase("value")) {
					s.selectByIndex(0);
				}
			}
			
	}

	

