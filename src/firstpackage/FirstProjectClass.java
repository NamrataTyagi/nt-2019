package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProjectClass {

	public static void main(String[] args) {
		
		//initialize Chrome browser
	
		
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		

		
		
		/*initialize other browsers NOT TESTED 
		 
		//initialize Firefox browser
		
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"/geckodriver");
			WebDriver fdriver = new geckoDriver();
		    driver.manage().window().maximize();

		//initialize IE browser
		
			System.setProperty("webdriver.IE.driver",
					System.getProperty("user.dir")+"/iedriver");
			WebDriver idriver = new ieDriver();
			*/
		
		/*
		driver.close(); //close current active window
		driver.quit(); //close all the windows of the current instance
		*/
	}

}
	