package com.assignment.test;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.OnDealloc;

public class DynamicFunctions {

	WebDriver driver;
    WebDriverWait wait;
    
    @BeforeClass
    public void setup() {
    	
    	 driver = new ChromeDriver();
         
         // Define an explicit wait for handling dynamic elements
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         // Maximize browser window
         driver.manage().window().maximize();

         // Navigate to Amazon India
         driver.get("https://www.amazon.in");
    }
    
    
    @Test(priority = 1)
    public void searchItem() {
        // Wait for the search bar to be visible
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        
        // Enter a search term 
        searchBox.sendKeys("Laptop");
        
        // Click the search button
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }
    
    
    @Test(priority = 2)
    public void findDynamicElements() {
    	
        // Wait until the search results are loaded
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-price")));

       
        List<WebElement> productTitles = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));

       
        List<WebElement> productPrices = driver.findElements(By.cssSelector("span.a-price-whole"));

        // Print out the product titles and prices
        for (int i = 0; i < productTitles.size(); i++) {
            String title = productTitles.get(i).getText();
            String price = productPrices.get(i).getText();
            System.out.println("Product: " + title + " | Price: " + price);
        }
    }
    
       @Test(priority = 3)
    public void findLinks() {

        	
       List<WebElement> links = driver.findElements(By.tagName("a"));
    		
       System.out.println("Total number of links: " + links.size());
        	
        	
    }
        
	
    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }


	
		
	}
    
}

