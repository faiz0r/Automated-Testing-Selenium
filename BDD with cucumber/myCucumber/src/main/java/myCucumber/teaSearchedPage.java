package myCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class teaSearchedPage {

	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914886\"]/div/h1")
	private WebElement softwareText;
	
	public WebElement getSearch() {
		return softwareText;
	}
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
	private WebElement softwareText1;
	
	public WebElement getSearch1() {
		return softwareText1;
	}
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	private WebElement softwareText2;
	
	public WebElement getSearch3() {
		return softwareText2;
	}
	
}