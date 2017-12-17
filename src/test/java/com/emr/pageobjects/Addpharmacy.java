package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Addpharmacy {
	
	WebDriver driver;
	public Addpharmacy(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	


}
