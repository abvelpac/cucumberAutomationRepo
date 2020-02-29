package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleSD {

WebDriver driver;
	
	@Given("^User needs to be on google page$")
	public void user_need_to_be_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@When("^User enters search string$")
	public void user_enters_search_string() throws InterruptedException {
		driver.findElement(By.xpath("//input[@title='Buscar']")).sendKeys("selenium");
		Thread.sleep(1000);
	}
	
}
