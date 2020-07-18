package webelementmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTab {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		//Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can create object as shown below
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		System.out.println("Number of windows Before Click : " + driver.getWindowHandles().size());
		String parentWinHandle = driver.getWindowHandle();
		System.out.println("Driver is posession of the Window : " + parentWinHandle);
		
		//Clicking on the following element opens a new browser windw 
		
		//
		/*
		 * WebElement newbrowserWindowElement= driver.findElement(By.id("button1"));
		 * //WebElement newbrowserWindowElement=
		 * driver.findElement(By.xpath("//*[@onclick='newBrwTab()']"));
		 * newbrowserWindowElement.click(); String childWinHandle = "2";
		 * 
		 * driver.switchTo().window(childWinHandle);
		 * driver.manage().window().maximize();
		 */
		

	}

}
