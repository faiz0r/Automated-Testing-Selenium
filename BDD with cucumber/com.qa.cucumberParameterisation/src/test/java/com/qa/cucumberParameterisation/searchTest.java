package com.qa.cucumberParameterisation;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchTest {
	
	String expected_title = "";
	
	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiza\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement searchBox=driver.findElement(By.id("sb_form_q"));
		searchBox.sendKeys(arg1);
		searchBox.submit();
		expected_title = arg1 + " - Bing";
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() {
	    // Write code here that turns the phrase above into concrete actions
		String my_title = driver.getTitle();
		assertEquals(my_title, expected_title);
	}

	@After
	public void teardown() {
		driver.quit();
	}
	
}
