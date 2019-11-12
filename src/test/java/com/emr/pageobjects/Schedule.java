package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedule {
	
	WebDriver driver;
	public Schedule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(@class,'menuLabel')and text()='Calendar']")
	WebElement Calendar;
	
	public WebElement Calendar(){
		return Calendar;
	}
	
	@FindBy(xpath="//a[@title='New Appointment']")
	WebElement new_Appointment;
	
	public WebElement Appointment() {
		return new_Appointment;
	}
	
	
	
}
