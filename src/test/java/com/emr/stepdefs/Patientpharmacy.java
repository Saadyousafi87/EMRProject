package com.emr.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.emr.pageobjects.Openemrhomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Patientpharmacy {
	WebDriver driver;
	
	@Given("^user visit app and login with valid username and password\\.$")
	public void user_visit_app_and_login_with_valid_username_and_password() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe" );
		    driver = new ChromeDriver();
		    driver.get("http://demo.openemr.io/openemr");
		    Openemrhomepage oh = new Openemrhomepage(driver);
		    oh.Username().sendKeys("admin");
		    oh.password().sendKeys("pass");
		    oh.login().click();
	    
	}

	@When("^user click on addministration button$")
	public void user_click_on_addministration_button() throws Throwable {
		
	    
	}

	@When("^enter name, address, city, state, zip, email, phone$")
	public void enter_name_address_city_state_zip_email_phone() throws Throwable {
	    
	}

	@When("^click save button$")
	public void click_save_button() throws Throwable {
	    
	}

	@Then("^userr get confirmation message and close browser$")
	public void userr_get_confirmation_message_and_close_browser() throws Throwable {
	  
	}

}
