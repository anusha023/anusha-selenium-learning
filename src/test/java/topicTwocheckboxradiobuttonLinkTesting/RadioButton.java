package topicTwocheckboxradiobuttonLinkTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

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
		WebElement radioButtionDemoElement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a"));
		radioButtionDemoElement.click();
		
		WebElement maleRadioButtonElement = driver .findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
		maleRadioButtonElement.click();
		WebElement getmaleCheckedValueElement =driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]"));
		getmaleCheckedValueElement.click();
		Thread.sleep(30000);
		
		WebElement femaleRadioButtonElement = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input"));
		femaleRadioButtonElement.click();
		
		WebElement getCheckedValueElement =driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]"));
		getCheckedValueElement.click();
		
		
		
	}

}
