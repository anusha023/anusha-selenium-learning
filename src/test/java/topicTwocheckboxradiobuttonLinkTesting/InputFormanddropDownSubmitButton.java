package topicTwocheckboxradiobuttonLinkTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormanddropDownSubmitButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		WebElement popupWindowElement = driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]"));
		popupWindowElement.click();


		WebElement inputFormsElement = driver.findElement(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
		inputFormsElement.click();
		WebElement inputFormSubmitElement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[5]/a"));
		inputFormSubmitElement.click();
		
		WebElement firstNameElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input"));
		firstNameElement.sendKeys("Siva");
		
		
		WebElement lastNameElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input"));
		lastNameElement.sendKeys("LakkiReddy");
		
		
		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input"));
		emailElement.sendKeys("abc@gmail.com");
		
		
		WebElement phoneElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input"));
		phoneElement.sendKeys("1234567890");
		
		
		WebElement addressElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input"));
		addressElement.sendKeys("6 cagney cresent");
		
		
		WebElement cityElement =driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input"));
		cityElement.sendKeys("Miltonkeynes");
		
		WebElement stateElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select"));
		Select stateSelection = new Select (stateElement);
		stateSelection.selectByVisibleText("Alabama");
		
		
		WebElement zipcodeElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input"));
		zipcodeElement.sendKeys("MK4 4TL");
		
		
		WebElement radioButtonElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input"));
		radioButtonElement.click();
		
		WebElement sendElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));
		sendElement.click();
	
		
		
		
	

	}

}
