package myCucumber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shoppingStep {
	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiza\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	@Given("^the correct web address$")
	public void the_correct_web_address(){
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://www.practiceselenium.com/welcome.html");
		teaSearchedPage bingSearchPage = PageFactory.initElements(driver, teaSearchedPage.class);
		assertEquals("We're passionate about tea. ", bingSearchPage.getSearch().getText());
	}
	
	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page(){
		driver.navigate().to("http://www.practiceselenium.com/menu.html");
		teaSearchedPage bingSearchPage = PageFactory.initElements(driver, teaSearchedPage.class);
		assertEquals("Menu", bingSearchPage.getSearch1().getText());
	} 
	
	@Then("^I can browse a list of the available products\\.$") 
	public void i_can_browse_a_list_of_the_available_products(){
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://www.practiceselenium.com/menu.html");
		teaSearchedPage bingSearchPage = PageFactory.initElements(driver, teaSearchedPage.class);
		assertEquals("Green Tea", bingSearchPage.getSearch3().getText());
	}
	
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("http://www.practiceselenium.com/menu.html");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Out'])[2]/following::span[1]")).click();
	  }

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("http://www.practiceselenium.com/menu.html");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
