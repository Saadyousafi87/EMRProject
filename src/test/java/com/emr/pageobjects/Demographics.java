package com.emr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demographics {
	

	WebDriver driver;
	public Demographics(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
