package com.emr.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.emr.pageobjects.Addpharmacy;
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
		Addpharmacy ap = new Addpharmacy(driver);
		Actions a = new Actions(driver);
		//a.moveToElement(ap.addministration_button()).build().perform();
		//ap.Practice_button().click();
		//driver.switchTo().frame(ap.switch_frame());
		//ap.add_pharmacy().click();
		a.moveToElement(driver.findElement(By.xpath("//div[@class='appMenu']/span[8]/div/div"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu logo\"]/div/div/span[8]/div/ul/li[5]/div")).click();
		driver.switchTo().frame(driver.findElement(By.name("adm")));
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/a")).click();
		
		
		
		
		
	    
	}

	@When("^enter name, address, city, state, zip, email, phone$")
	public void enter_name_address_city_state_zip_email_phone() throws Throwable {
		Addpharmacy ap = new Addpharmacy(driver);
		//ap.Pharmacy_name().sendKeys("Wallgreens");
		//ap.pharmacy_address().sendKeys("6666 String Street");
		//ap.pharmacy_city().sendKeys("Longview");
		//ap.pharmacy_state().sendKeys("Florida");
		//ap.pharmacy_zip().sendKeys("44433");
		//ap.pharmacy_email().sendKeys("heya@invalid.email.com");
		//ap.pharmacy_phone().sendKeys("222-333-4444");
		//ap.pharmacy_fax().sendKeys("123456789");
	driver.findElement(By.name("name")).sendKeys("wallgreens");
	driver.findElement(By.name("address_line1")).sendKeys("6666 String Street");
	driver.findElement(By.name("city")).sendKeys("Longview");
	driver.findElement(By.name("state")).sendKeys("Florida");
	driver.findElement(By.name("zip")).sendKeys("44433");
	driver.findElement(By.name("email")).sendKeys("heya@invalid.email.com");
	driver.findElement(By.name("phone")).sendKeys("222-333-4444");
	driver.findElement(By.name("fax")).sendKeys("123456789");
	
		
	    
	}

	@When("^click save button$")
	public void click_save_button() throws Throwable {
		Addpharmacy ap = new Addpharmacy(driver);
		//ap.submit_button().click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/table/tbody/tr[10]/td/a[1]")).click();
	
	    
	}

	@Then("^userr get confirmation message and close browser$")
	public void userr_get_confirmation_message_and_close_browser() throws Throwable {
	  //confirmed
		
	}

}
