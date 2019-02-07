package firstpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	// Navigation commands
		
		driver.navigate().to("https://www.facebook.com");// to get to URL which is not the current page
		//driver.findElement(By.id("loginbutton")).click();
		//Alert newAlert = driver.switchTo().alert();
		//newAlert.dismiss();
				
		driver.quit();
	}

}
