package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patient_visit {
	
	WebDriver driver;
	public Patient_visit(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class=\"fa fa-list fa-stack-1x\"]")
	WebElement patient_search;
	public WebElement patientsearch() {
		return patient_search;
	}
	
	@FindBy(xpath=".//*[@id='pid_1']/td[1]")
	WebElement selectpatientphil;
	public WebElement select_patient_phil() {
		return selectpatientphil;
	}
	
	@FindBy(css="td[class='sorting_1']")
	WebElement Patientphil;
	public WebElement Patient_Phil() {
		return Patientphil;
	}
	

}
