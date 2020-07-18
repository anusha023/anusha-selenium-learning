package elementLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.amazon.co.uk/");
		WebElement PrimeVideoElement = driver.findElementByLinkText("Prime Video");
		PrimeVideoElement.click();
		
	
	}

}
