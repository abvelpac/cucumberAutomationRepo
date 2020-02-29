package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;

public class ShareDataSD2 {
	
	WebDriver driver;
	
	public ShareDataSD2(SharedClass share) {
		driver = share.setup();
	}
	
	@Then ("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String firstName) throws InterruptedException {
		String userNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		Assert.assertEquals(firstName, userNameActual);
		Thread.sleep(1000);
	}
		
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);	
		Thread.sleep(1000);
	}
	
	@But("^user Mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException {
		String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");	
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
}
