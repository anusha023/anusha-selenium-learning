package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homepage {
	WebDriver driver;
	
	@Given("i needs to open google sign up page")
	public void i_needs_to_open_google_sign_up_page() {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    
	}

	@Then("sign up page should get opened")
	public void sign_up_page_should_get_opened() {
		WebElement signuppageele=driver.findElement(By.xpath("//*[@id=\"headingText\"]"));
		String actualValue = signuppageele.getText();
		String expectedValue = "Create your Google Account";
		
		Assert.assertEquals(actualValue, expectedValue, "Create your Google Account");
	    
	}
	
	
	

}
