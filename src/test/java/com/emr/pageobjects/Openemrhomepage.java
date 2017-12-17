package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Openemrhomepage {
	
	WebDriver driver;
	public Openemrhomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="authUser")
	WebElement name_user;
	
	public WebElement Username() {
		return name_user;
	}
	
	@FindBy(name="clearPass")
	WebElement user_pass;
	
	public WebElement password() {
		return user_pass;
	}
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement user_login;
	
	public WebElement login() {
		return user_login;
	}
	

}
