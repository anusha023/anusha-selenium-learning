package elementLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.airbnb.co.uk/?_set_bev_on_new_domain=1594124762_C76ygsLPhtZneJXo");
		WebElement locationElement= driver.findElement(By.className("_1spzot3"));
		locationElement.sendKeys("london");
		WebElement searchElement= driver.findElement(By.className("_m9v25n"));
		searchElement.click();

	}

}
