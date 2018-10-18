package myCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutPage {
	
	@FindBy(name = "email")
	private WebElement emailField;
	
	@FindBy(name = "name")
	private WebElement nameField;
	
	@FindBy(name = "address")
	private WebElement addressField;

	
	public void search(String email, String name, String address) throws InterruptedException {
		emailField.sendKeys(email);
		nameField.sendKeys(name);
		addressField.sendKeys(address);
		emailField.submit();
		
	}

}
