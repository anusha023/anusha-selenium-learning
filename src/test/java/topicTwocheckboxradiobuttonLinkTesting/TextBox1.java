package topicTwocheckboxradiobuttonLinkTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		WebElement popupWindowElement = driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]"));
		popupWindowElement.click();


		WebElement inputFormsElement = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
		inputFormsElement.click();

		WebElement simpleFormDemoElement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a"));
		simpleFormDemoElement.click();

		// Entering values in a text field WebElement textBoxElement =
		WebElement textBoxElement =  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input"));
		textBoxElement.sendKeys("test123"); 
		// Clearing values from a text field
		WebElement clearingtextBoxElement = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input"));
		clearingtextBoxElement.clear();
		 
		 
		 
		 
	}
}
		 
		 
		 