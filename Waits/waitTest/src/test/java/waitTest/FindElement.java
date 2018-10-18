package waitTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FindElement {
	public WebDriver driver = null;
	static ExtentReports report = new ExtentReports("C:\\Users\\Faiza\\Desktop\\webpageTest\\waitTest.html", true);
	ExtentTest test;
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiza\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void testShafeeq() {
		test = report.startTest("Test Wait");
		test.log(LogStatus.INFO, "Navigating to testing page");
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		test.log(LogStatus.INFO, "Finding text");
		findShafeeq bingSearchPage = PageFactory.initElements(driver, findShafeeq.class);
		if(bingSearchPage.getElement(driver).getText().equals("I HATE YOU!\n-The Shafeeq")) {
			test.log(LogStatus.PASS, "Successfully found text");
		} else {
			test.log(LogStatus.FAIL, "Un-Succesfully found text");
		}
		report.endTest(test);
		assertEquals("I HATE YOU!\n-The Shafeeq", bingSearchPage.getElement(driver).getText());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@AfterClass
	public static void end() {
		report.flush();
	}

}
