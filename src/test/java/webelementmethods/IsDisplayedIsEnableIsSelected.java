package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsEnableIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement emailElement = driver.findElementByXPath("//*[@id=\"email\"]");
		System.out.println(" email field is available " + emailElement.isDisplayed());
		
		emailElement.sendKeys("xyz@gmail.com");
		System.out.println("is field is editable :" + emailElement.isEnabled());
		
		WebElement femaleRadioButtomElement = driver.findElementByXPath("//*[@id=\"u_0_9\"]");
		femaleRadioButtomElement.click();
		System.out.println("female radio buttion is seleted :" + femaleRadioButtomElement.isSelected());

	}

}
