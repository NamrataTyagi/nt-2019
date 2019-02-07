package com.processnow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProcessNowInvalidLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	// Navigation commands
		
		driver.get("https://mobile.processnow.com");
		driver.findElement(By.id("UserModel_Email")).sendKeys("ntyagi@transfirstinvalid.com");
		driver.findElement(By.id("UserModel_Password")).sendKeys("Password2!");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				Thread.sleep(2000);
				driver.findElement(By.id("btnLogin")).click();	
				Thread.sleep(3000);
		//driver.navigate().back();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		Thread.sleep(5000);
		
		
		driver.close();

	}

}
