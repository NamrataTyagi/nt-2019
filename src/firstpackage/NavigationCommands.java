package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {


		public static void main(String[] args) throws InterruptedException 
		
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
		// Navigation commands
			
			driver.navigate().to("https://www.facebook.com");// to get to URL which is not the current page
			driver.navigate().refresh(); //page refresh
			driver.navigate().back(); //previous page
			driver.navigate().forward(); //next page
		
		
		/*
		driver.close(); //close current active window
		driver.quit(); //close all the windows of the current instance
		*/
	}

}
