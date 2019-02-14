package com.processnow;

import java.util.concurrent.TimeUnit; //suggestion is shown because the wait is commented out

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProcessNowLoginValid {

	public static void main(String[] args) throws InterruptedException
	{
		//Instantiate the Browser
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		
	// Navigation commands
		
		driver.get("https://mobile.processnow.com");
		driver.findElement(By.id("UserModel_Email")).sendKeys("ntyagi@transfirst.com");
		driver.findElement(By.id("UserModel_Password")).sendKeys("Password2!");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
				driver.findElement(By.id("btnLogin")).click();	
				Thread.sleep(3000);
				driver.navigate().back();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//driver.close();
	}

}
