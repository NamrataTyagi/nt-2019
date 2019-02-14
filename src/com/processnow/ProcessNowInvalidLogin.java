package com.processnow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProcessNowInvalidLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));
		
		WebDriver driver = new ChromeDriver();

/*		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		// Part1 - get the name of the main window
		String mw = driver.getWindowHandle();

		System.out.println("Main Window Name - " + mw);
		
		System.out.println("=========================================================================");

		Thread.sleep(5000);

		// Part2 - Click on the new message window button
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		
		Thread.sleep(5000);
		String nww = driver.getWindowHandle();

		System.out.println("Main Window Name - " + nww);
		
		System.out.println("=========================================================================");

		// Part3 - 2 windows are opened and we are capturing the names of both the windows
		Set awn = driver.getWindowHandles();
		
		System.out.println("All Window Name - " + awn);
		
		System.out.println("=========================================================================");
		
		Thread.sleep(5000);
				
		//Part4 - using the for loop we are going to switch between the main window and the new windows.
		for(String nw : driver.getWindowHandles()) {
			
			Thread.sleep(5000);
			
			driver.switchTo().window(nw);

			Thread.sleep(5000);
			
			driver.switchTo().window(nw);
					
		}

		*/
	// Navigation commands
		
		driver.get("https://amazon.com");
		
			
		//driver.findElement(By.id("UserModel_Password")).sendKeys("Password2!");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				String mw = driver.getWindowHandle();
				System.out.println("Main Window Name - " + mw);
				System.out.println("=========================================================================");

				driver.findElement(By.id("nav-your-amazon")).click();

				Thread.sleep(1000);
				
				
				//find element in the new window 
//				String nw = driver.getWindowHandle();
//				driver.findElement(By.xpath("//*[@id=\"errorMessages\"]")).click();
//				System.out.println("New window Name  -" +nw);
//				System.out.println("=========================================================================");
				
				Set awn  = driver.getWindowHandles();
				System.out.println("All Window Name - " + awn);
				
				System.out.println("=========================================================================");
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		Thread.sleep(2000);
		driver.close();

	}

}
