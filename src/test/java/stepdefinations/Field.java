package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Field {
	WebDriver driver;
	


@Given("i entered system properties")
public void i_entered_system_properties() {
	System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    
}

@Given("I entered in google sign up page")
public void i_entered_in_google_sign_up_page() {
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
    
}

@When("I enetered value in first name filed")
public void i_enetered_value_in_first_name_filed() {
	WebElement firstnameEle = driver.findElement(By.id("firstName"));
	firstnameEle.sendKeys("jamesbond");
}

@When("I entered value in last name field")
public void i_entered_value_in_last_name_field() {
	WebElement lastnameEle = driver.findElement(By.id("lastName"));
	lastnameEle.sendKeys("katha");
    
}

@When("I entered value in user name field")
public void i_entered_value_in_user_name_field() {
	WebElement usernameEle = driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/input"));
	usernameEle.sendKeys("jameskatha2@gmail.com");
}

@When("I entered value in password field")
public void i_entered_value_in_password_field() {
	WebElement passowrdEle = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
	passowrdEle.sendKeys("xyz12345");
    
}

@When("I entered value in Confirm password field")
public void i_entered_value_in_Confirm_password_field() {
	WebElement confirmpassowrdEle = driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
	confirmpassowrdEle.sendKeys("xyz12345");
    
}

@Then("values should be entered")
public void values_should_be_entered() {
	System.out.println("vlues entered");
    
}
}


