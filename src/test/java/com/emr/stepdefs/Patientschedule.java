package com.emr.stepdefs;

import java.util.Iterator;
import java.util.Set;
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
	    
	}
	
	@When("^user click on calender button$")
	public void user_click_on_calender_button() throws Throwable {
		Schedule s= new Schedule(driver);
		Actions a = new Actions(driver);
	
		
	   
	}

	@When("^click on new appointment button$")
	public void click_on_new_appointment_button() throws Throwable {
		Schedule s = new Schedule(driver);
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='cal']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='Calendar']")));
		s.newappointment().click();
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    
	}

	@When("^enter category, date, time, title, patient, provider, room number, comments and click save$")
	public void enter_category_date_time_title_patient_provider_room_number_comments_and_click_save() throws Throwable {
		Thread.sleep(5000);
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parent = it.next();
		String child = it.next();
		String subchild = it.next();
		driver.switchTo().window(child);
		Schedule s = new Schedule(driver);
		s.category().sendKeys("New Patient");
		

		
		
		

		
	    
	}
	
	@Then("^user receive confirmation message and close the browser$")
	public void user_receive_confirmation_message_and_close_the_browser() throws Throwable {
	    
	}
}
