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
	
	@FindBy(xpath="//span//div//div//div//div")
	WebElement Patient_Client;
	public WebElement hoover_patient_client(){
		return Patient_Client;
	}
	
	
	@FindBy(xpath="//*[@id=\"menu logo\"]/div/div/span[1]/div")
	WebElement class_calander;
	public WebElement click_calander() {
		return class_calander;
	}
	
	@FindBy(xpath="//a[contains(@title,'New Appointment')]")
	WebElement new_appointment;
	public WebElement newappointment() {
		return new_appointment;
	}
	
	@FindBy(name="form_category")
	WebElement select_category;
	public WebElement category() {
		return select_category;
	}
	
	@FindBy(name="form_date")
	WebElement select_date;
	public WebElement date() {
		return select_date;
	}
	
	@FindBy(name="form_title")
	WebElement select_title;
	public WebElement titleform() {
		return select_title;
	}
	
	@FindBy(name="form_patient")
	WebElement patient_form;
	public WebElement selectpatient() {
		return patient_form;
	}
	
	@FindBy(name="searchby")
	WebElement Selectpatientby;
	public WebElement Select_patient_by() {
		return Selectpatientby;
	}
	
	@FindBy(id="searchparm")
	WebElement enter_id;
	public WebElement Enter_patient_id() {
		return enter_id;
	}
	
	@FindBy(id="submitbtn")
	WebElement clicksearch;
	public WebElement click_search() {
		return clicksearch;
	}
	
	

}
