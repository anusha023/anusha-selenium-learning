package elementLocators;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List <WebElement> policyElementList=driver.findElements(By.partialLinkText("Policy"));
		int numbermatchedlinks=	policyElementList.size();
		System.out.println(numbermatchedlinks);
		List <WebElement> tagElementList=driver.findElements(By.tagName("a"));
		int numberoflinks=	tagElementList.size();
		System.out.println(numbermatchedlinks);
	}

}
