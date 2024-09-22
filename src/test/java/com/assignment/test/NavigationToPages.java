package com.assignment.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationToPages {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
	
		driver = new ChromeDriver();       // Create a new instance of the ChromeDriver
		driver.manage().window().maximize();  //maximize window 
		
	}
	
		@Test(priority = 1)
		public void navigateToAmazonPage() {
			
			
		driver.get("https://www.amazon.in/");      //navigate to 1st page
		System.out.println("Get page title is: " + driver.getTitle());
		
		}
		
		
		@Test(priority = 2)
		public void navigateToWikipediaPage() {
			
		driver.get("https://www.wikipedia.org/");  //Navigate to 2nd page 
		System.out.println("Get page title is: " +driver.getTitle());
		
		}
		
		
		// Navigation interface methods 
		
		@Test(priority = 3)
		public void navigateBack() throws InterruptedException {
		
		driver.navigate().back();       //navigate to previous page amazon.com
		System.out.println("Navigated back Page title is: " + driver.getTitle());
		
		 Thread.sleep(2000);
		 
		}
		
		@Test(priority = 4)
	    public void navigateForward() throws InterruptedException {
		
		driver.navigate().forward();       //navigate to forward page wikipedia
        System.out.println("Navigated forward. Page title is: " + driver.getTitle());
		
        
        Thread.sleep(2000);
		}
		
		 @Test(priority = 5)
		 public void refreshPage() throws InterruptedException {
        driver.navigate().refresh();    //Refresh the current page
        System.out.println("Page refreshed Page title is: " + driver.getTitle());
		
        Thread.sleep(2000);
		 }
		 
        @AfterClass
        public void teardown() {
            // Close the browser after all tests
            if (driver != null) {
                driver.quit();
            }
       
			
		}

}
