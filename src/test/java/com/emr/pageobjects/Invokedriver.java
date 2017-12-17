package com.emr.pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invokedriver {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Saad\\git\\EMRProject\\src\\test\\java\\com\\emr\\pageobjects\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe" );
			 driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
