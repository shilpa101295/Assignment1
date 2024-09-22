package com.assignment.test;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormElements {

	WebDriver driver;
	
	@BeforeClass
	
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.bugbug.io/sign-up/");
		
	
	}
	
	@Test(priority = 1)
	public void Textfields() {
		
		//Create account form
		
		//Enter email
		WebElement email = driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys("abc@gmail.com");
		
		
		System.out.println("user enter email address");
		
		//Enter password
		WebElement password = driver.findElement(By.name("password1"));
		password.sendKeys("Demo@123!");
		
		//Enter confirm Password
		WebElement confirmPassword = driver.findElement(By.name("password2"));
		confirmPassword.sendKeys("Demo@123!");
		
	}
	
	@Test(priority = 2)
	public void checkboxenable() {
		
		WebElement checkboxclick=driver.findElement(By.cssSelector("button[data-testid='Button']"));
		checkboxclick.click();
		
	}
	
		
		@AfterClass
	    public void teardown() {
	        // Close the browser after the test is done
	        if (driver != null) {
	            driver.quit();
	        }
		
	}

		
	}
	
	
		
	
	

