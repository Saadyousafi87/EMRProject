package com.emr.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.emr.pageobjects.Openemrhomepage;
import com.emr.pageobjects.Schedule;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Patientschedule {
	WebDriver driver;
	Schedule s = new Schedule(driver);
	
	@Given("^user login  the app with valid user name and password$")
	public void user_login_the_app_with_valid_user_name_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe" );
	    driver = new ChromeDriver();
	    driver.get("http://demo.openemr.io/openemr");
	    Openemrhomepage oh = new Openemrhomepage(driver);
	    oh.Username().sendKeys("admin");
	    oh.password().sendKeys("pass");
	    oh.login().click();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	}
	
	@When("^user click on calender button$")
	public void user_click_on_calender_button() throws Throwable {
		Schedule s= new Schedule(driver);
		Actions a = new Actions(driver);
		//a.moveToElement(s.hoover_patient_client()).build().perform();
		s.click_calander().click();
		
	   
	}

	@When("^click on new appointment button$")
	public void click_on_new_appointment_button() throws Throwable {
	s.newappointment().click();
	
	    
	}

	@When("^enter category, date, time, title, patient, provider, room number, comments and click save$")
	public void enter_category_date_time_title_patient_provider_room_number_comments_and_click_save() throws Throwable {
		// new window appears for appointment
		
		s.category().sendKeys("Office Visit");
		s.date().sendKeys("2017-12-28");
		s.titleform().sendKeys("Office Visit");
		s.selectpatient().click();
		//new patient id window opens
		s.Select_patient_by().sendKeys("ID");
		s.Enter_patient_id().sendKeys("1");
		s.click_search().click();
		
		
	    
	}
	
	@Then("^user receive confirmation message and close the browser$")
	public void user_receive_confirmation_message_and_close_the_browser() throws Throwable {
	    
	}
}
