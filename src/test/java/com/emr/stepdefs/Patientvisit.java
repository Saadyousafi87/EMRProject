package com.emr.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.emr.pageobjects.Openemrhomepage;
import com.emr.pageobjects.Patient_visit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Patientvisit {
	WebDriver driver;
	
	@Given("^user login to app with valid user name and password$")
	public void user_login_to_app_with_valid_user_name_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe" );
	    driver = new ChromeDriver();
	    driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
	    Openemrhomepage oh=new Openemrhomepage(driver);
	    oh.Username().sendKeys("admin");
	    oh.password().sendKeys("pass");
	    oh.login().click();
		
	}

	@When("^user select patient from patient finder$")
	public void user_select_patient_from_patient_finder() throws Throwable {
		Patient_visit pv=new Patient_visit(driver);
		pv.patientsearch().click();
		pv.select_patient_phil().click();
		
	    
	}

	@When("^click on patient/client button and click on visits button and click on create visit button$")
	public void click_on_patient_client_button_and_click_on_visits_button_and_click_on_create_visit_button() throws Throwable {
	    
	}

	@When("^enter consultation brief description, visit category, facility, billing facility, sensitivity and date of service$")
	public void enter_consultation_brief_description_visit_category_facility_billing_facility_sensitivity_and_date_of_service() throws Throwable {
	   
	}

	@When("^click on issue button and enter type, title, reffered by, out comes, click save button and click save button again$")
	public void click_on_issue_button_and_enter_type_title_reffered_by_out_comes_click_save_button_and_click_save_button_again() throws Throwable {
	    
	}

	@Then("^user receiving confirmation message and close the browser$")
	public void user_receiving_confirmation_message_and_close_the_browser() throws Throwable {
	    
	}

}
