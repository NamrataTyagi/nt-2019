package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Get commands
		
		driver.get("https://www.application.com"); //to get URL of AUT
		driver.getCurrentUrl(); //to capture the current URL in the browser
		driver.getTitle(); // to capture the title of the current page
		driver.getWindowHandles(); // to capture the name of the windows - useful to move back and forth
		
		/*
		driver.close(); //close current active window
		driver.quit(); //close all the windows of the current instance
		*/
	}
	
	
	

}
