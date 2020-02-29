package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoSD {

WebDriver driver;
	
	@Given("^User needs to be on demo site page$")
	public void user_need_to_be_on_demo_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	
	@When("^User enters first name$")
	public void user_enters_first_string() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tom");
		Thread.sleep(1000);
	}
	
	@When("^User enters last name$")
	public void user_enters_last_string() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jerri");
		Thread.sleep(1000);
	}
	
	
}
