package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messagereminder {
	
	WebDriver driver;
	public Messagereminder (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='patientData\']/div/span[1]/span/a/i")
	WebElement selectpatient;
	public WebElement Select_patient() {
		return selectpatient;
	}

}
