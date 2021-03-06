package com.emr.stepdefs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
	    Patient_visit pv = new Patient_visit(driver);
	    Openemrhomepage oh=new Openemrhomepage(driver);
	    oh.Username().sendKeys("admin");
	    oh.password().sendKeys("pass");
	    oh.login().click();
	    
		
	}

	@When("^user select patient from patient finder$")
	public void user_select_patient_from_patient_finder() throws Throwable {
		driver.findElement(By.cssSelector("i.fa.fa-list.fa-stack-1x")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='fin']")));
		driver.findElement(By.cssSelector("td[class='sorting_1']")).click();
		driver.switchTo().defaultContent();	
		
		
	
		
	    
	}

	@When("^click on patient/client button and click on visits button and click on create visit button$")
	public void click_on_patient_client_button_and_click_on_visits_button_and_click_on_create_visit_button() throws Throwable {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu logo\"]/div/div/span[4]/div/div"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu logo\"]/div/div/span[4]/div/ul/li[4]/div/div"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu logo\"]/div/div/span[4]/div/ul/li[4]/div/ul/li[1]/div")).click();
		//driver.switchTo().alert().accept();
	}

	@When("^enter consultation brief description, visit category, facility, billing facility, sensitivity and date of service$")
	public void enter_consultation_brief_description_visit_category_facility_billing_facility_sensitivity_and_date_of_service() throws Throwable {
		driver.switchTo().frame(driver.findElement(By.name("enc")));
		driver.findElement(By.name("reason")).sendKeys("this is a test");
		Select s = new Select(driver.findElement(By.cssSelector("select[name='pc_catid']")));
		s.selectByVisibleText("Office Visit");
		Select t = new Select (driver.findElement(By.cssSelector("select[name='form_sensitivity']")));
		t.selectByValue("high");
		driver.findElement(By.id("img_form_date")).click();
		
		while(!driver.findElement(By.xpath("/html/body/div[6]/table/thead/tr[1]/td[2]")).getText().contains("March, 2018")) {
			driver.findElement(By.xpath("/html/body/div[6]/table/thead/tr[2]/td[4]/div")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("12")) {
				driver.findElements(By.className("day")).get(i).click();
			}
		}
		
		
		
	}

	@When("^click on issue button and enter type, title, reffered by, out comes, click save button and click save button again$")
	public void click_on_issue_button_and_enter_type_title_reffered_by_out_comes_click_save_button_and_click_save_button_again() throws Throwable {
		driver.findElement(By.xpath("//a[@class='css_button link_submit']")).click();
	    
	}

	@Then("^user receiving confirmation message and close the browser$")
	public void user_receiving_confirmation_message_and_close_the_browser() throws Throwable {
	    
	}

}
