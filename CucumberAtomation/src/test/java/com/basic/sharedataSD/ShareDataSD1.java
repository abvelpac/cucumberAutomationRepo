package com.basic.sharedataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ShareDataSD1 {
	
	WebDriver driver;
		
	public ShareDataSD1(SharedClass share) {
		driver = share.setup();
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName ) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
		Thread.sleep(1000);
	}

	
}
