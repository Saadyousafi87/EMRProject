package com.emr.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='appMenu']/span[8]/div/div"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu logo\"]/div/div/span[8]/div/ul/li[5]/div")).click();
		driver.switchTo().frame(driver.findElement(By.name("adm")));
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/a")).click();
		
		
		
		
		
	    
	}

	@When("^enter name, address, city, state, zip, email, phone$")
	public void enter_name_address_city_state_zip_email_phone() throws Throwable {
	//	driver.findElement(By.name("name")).sendKeys("Wallgreens");
	//	driver.findElement(By.name("address_line1")).sendKeys("6 mclean ave ");
	//	driver.findElement(By.name("city")).sendKeys("yonkers");
	//	driver.findElement(By.name("state")).sendKeys("ny");
	//	driver.findElement(By.name("zip")).sendKeys("10705");
	//	driver.findElement(By.name("email")).sendKeys("lababidi@alchiki.com");
	//	driver.findElement(By.name("phone")).sendKeys("090078601");
	//	Select s = new Select(driver.findElement(By.name("transmit_method")));
	//	s.deselectByValue("2");
		
		
	    
	}

	@When("^click save button$")
	public void click_save_button() throws Throwable {
	//	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/table/tbody/tr[10]/td/a[1]/span")).click();
		
	    
	}

	@Then("^userr get confirmation message and close browser$")
	public void userr_get_confirmation_message_and_close_browser() throws Throwable {
	  
	}

}
