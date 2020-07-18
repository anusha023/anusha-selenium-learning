package elementLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUpPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement FirstNameElement=driver.findElement(By.id("firstName"));
		FirstNameElement.sendKeys("James");
		WebElement LastNameElement= driver.findElement(By.name("lastName"));
		LastNameElement.sendKeys("Bond");
		WebElement userNameElement= driver.findElementByXPath("//*[@id=\"username\"]");
		userNameElement.sendKeys("JamesBond123789");
	}

}
