package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addpharmacy {
	
	WebDriver driver;
	public Addpharmacy(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='appMenu']/span[8]/div/div")
	WebElement Administrator;
	public WebElement addministration_button() {
		return Administrator;
	}
	
	@FindBy(xpath="//*[@id=\\\"menu logo\\\"]/div/div/span[8]/div/ul/li[5]/div")
	WebElement practice;
	public WebElement Practice_button() {
		return practice;
	}
	
	@FindBy(name="adm")
	WebElement iframe;
	public WebElement switch_frame() {
		return iframe;
	}
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/a")
	WebElement pharmacy;
	public WebElement add_pharmacy() {
		return pharmacy;
	}
	
	@FindBy(name="name")
	WebElement pharmacyname;
	public WebElement Pharmacy_name() {
		return pharmacyname;
	}
	
	@FindBy(name="address_line1")
	WebElement pharmacyaddress;
	public WebElement pharmacy_address() {
		return pharmacyaddress;
	}
	
	@FindBy(name="city")
	WebElement city;
	public WebElement pharmacy_city() {
		return city;
	}
	
	@FindBy(name="state")
	WebElement state;
	public WebElement pharmacy_state() {
		return state;
	}
	
	@FindBy(name="zip")
	WebElement zipcode;
	public WebElement pharmacy_zip() {
		return zipcode;
	}
	
	@FindBy(name="email")
	WebElement email;
	public WebElement pharmacy_email() {
		return email;
	}
	
	@FindBy(name="phone")
	WebElement phonenumber;
	public WebElement pharmacy_phone() {
		return phonenumber;
	}
	
	@FindBy(name="fax")
	WebElement fax;
	public WebElement pharmacy_fax() {
		return fax;
	}
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/form/table/tbody/tr[10]/td/a[1]")
	WebElement submit;
	public WebElement submit_button() {
		return submit;
	}
	
	
	


}
