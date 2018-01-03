package com.emr.stepdefs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.emr.pageobjects.Messagereminder;
import com.emr.pageobjects.Openemrhomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Remindermessage {
	WebDriver driver;
	Messagereminder m = new Messagereminder(driver);
	
	@Given("^user login to  app with valid user name and password\\.$")
	public void user_login_to_app_with_valid_user_name_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe" );
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("http://demo.openemr.io/openemr");
	    Openemrhomepage o = new Openemrhomepage(driver);
	    o.Username().sendKeys("admin");
	    o.password().sendKeys("pass");
	    o.login().click();
	    
	}

	@When("^user select the patient from patient finder$")
	public void user_select_the_patient_from_patient_finder() throws Throwable {
		driver.findElement(By.cssSelector("i.fa.fa-list.fa-stack-1x")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='fin']")));
		driver.findElement(By.cssSelector("td[class='sorting_1']")).click();
		driver.switchTo().defaultContent();
	    
	}

	@When("^click on message button and click on add new link$")
	public void click_on_message_button_and_click_on_add_new_link() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Messages ']")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("iframe[name='fin']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='msg']")));
		driver.findElement(By.xpath("//a[text()='Add New']")).click();
		
	}

	@When("^enter type, patient, status, to, enter the message and click on send message button$")
	public void enter_type_patient_status_to_enter_the_message_and_click_on_send_message_button() throws Throwable {
		Select s = new Select (driver.findElement(By.cssSelector("select[name='form_note_type']")));
		s.selectByValue("Patient Reminders");
		Select sl = new Select (driver.findElement(By.name("form_message_status")));
		sl.selectByIndex(2);
		Select c = new Select(driver.findElement(By.name("users")));
		c.selectByIndex(3);
		driver.findElement(By.name("note")).sendKeys("this is a test");
		driver.findElement(By.name("form_patient")).click();
		
		Set<String>Ids = driver.getWindowHandles();
		Iterator<String>it=Ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.id("searchparm")).sendKeys("Phil");
		
		
		
		
	    
	}

	@Then("^user receive confirmation message then close the browser$")
	public void user_receive_confirmation_message_then_close_the_browser() throws Throwable {
	    
	}

}
