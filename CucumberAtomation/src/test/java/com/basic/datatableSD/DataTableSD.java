package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableSD {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName ) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
		Thread.sleep(1000);
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
	
	@Then("^close browser$")
	public void close_broser() {
		driver.quit();
		driver = null;
	}
	
	@When("^Enter following data$")
	public void enter_following_data(DataTable table) throws InterruptedException {
		List<List <String>> data = table.raw();
		
		//String value1 = data.get(0).get(0);
		//String value2 = data.get(0).get(1);
		//String value3 = data.get(0).get(2);
	
		String value4 = data.get(1).get(0);
		String value5 = data.get(1).get(1);
		String value6 = data.get(1).get(2);
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(value4);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value5);	
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys(value6);
		Thread.sleep(2000);
	}
}
