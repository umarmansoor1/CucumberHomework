package com.freeCRM.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps {
	
	WebDriver driver;
	
	@Given("^I open browser$")
	public void i_open_browser()  {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		System.out.println("I opened chrome.");
	}

	@Given("^I navigate to FreeCRM$")
	public void i_navigate_to_FreeCRM() {
	    String url = "https://www.freecrm.com/index.html";
	    driver.get(url);
	    System.out.println("I navigated to FreeCRM.");
	}

	@Given("^I click on Sign Up$")
	public void i_click_on_Sign_Up() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	    System.out.println("I clicked on sign up.");
	}

	@When("^I enter Sign Up details$")
	public void i_enter_Sign_Up_details() throws Throwable {
		Thread.sleep(2000);
	    WebElement dropDown = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	    Select dd = new Select(dropDown);
	    dd.selectByVisibleText("Free Edition");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@xyz.com");
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("abcd@xyz.com");
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("john1991");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("doe12345");
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("doe12345");
	 System.out.println("Entered sign up details.");
	}

	@When("^I click on terms and conditions$")
	public void i_click_on_terms_and_conditions() throws Throwable {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='false']")).click();
	}

	@When("^I click on Submit$")
	public void i_click_on_Submit() throws Throwable {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='myButton']")).click();
	    System.out.println("I clicked on submit");
	}

	@Then("^I add company infortmation$")
	public void i_add_company_infortmation() throws Throwable {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Anonymous");
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("918-999-9999");
	    System.out.println("I added the company information.");
	}

	@Then("^I click on continue$")
	public void i_click_on_continue() throws Throwable {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='btnSubmit']")).click();
	    System.out.println("I clicked on continue");
	}

	@Then("^I click on complete registeration$")
	public void i_click_on_complete_registeration() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@name='finish']")).click();
	   
	    System.out.println("I completed registeration");
	}

}
