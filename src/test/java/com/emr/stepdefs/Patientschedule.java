package com.emr.stepdefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.emr.pageobjects.Openemrhomepage;
import com.emr.pageobjects.Schedule;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Patientschedule {
	WebDriver driver;
	
	
	
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
		Schedule S = new Schedule (driver);
		S.Calendar().click();
		//driver.findElement(By.xpath("//div[contains(@class,'menuLabel')and text()='Calendar']")).click();   
	}

	@When("^click on new appointment button$")
	public void click_on_new_appointment_button() throws Throwable {
		driver.switchTo().frame(driver.findElement(By.name("cal")));
		driver.switchTo().frame(driver.findElement(By.name("Calendar")));
		Schedule s = new Schedule(driver);
		s.Appointment().click();
		//driver.findElement(By.xpath("//a[@title='New Appointment']")).click();
		driver.switchTo().defaultContent();
		
		
	}

	@When("^enter category, date, time, title, patient, provider, room number, comments and click save$")
	public void enter_category_date_time_title_patient_provider_room_number_comments_and_click_save() throws Throwable {
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
		Select s = new Select (driver.findElement(By.name("form_category")));
		s.selectByVisibleText("Established Patient");
		driver.findElement(By.name("form_title")).sendKeys("Stablished Patient");
		Select S = new Select (driver.findElement(By.name("form_provider")));
		S.selectByVisibleText("Smith, Billy");
		driver.findElement(By.name("form_comments")).sendKeys("this is a test");
		driver.findElement(By.name("form_allday")).click();
		driver.findElement(By.id("img_date")).click();
		
		while (!driver.findElement(By.className("title")).getText().contains("April, 2018")) {
			driver.findElement(By.xpath("/html/body/div[2]/table/thead/tr[2]/td[4]/div")).click();
		}
		//List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
			}
		}
		driver.findElement(By.name("form_patient")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[3]/iframe")));
		driver.findElement(By.id("searchparm")).sendKeys("belford");
		driver.findElement(By.id("submitbtn")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[3]/iframe")));
		driver.findElement(By.id("1~Belford~Phil~1972-02-09")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
		driver.findElement(By.name("form_save")).click();
		driver.switchTo().alert().accept();
		
		  
	}
	
	@Then("^user receive confirmation message and close the browser$")
	public void user_receive_confirmation_message_and_close_the_browser() throws Throwable {
	    //confirmed
	}
}
