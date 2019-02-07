package com.edureka.my.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module5Assignment {

	public static void main(String[] args) throws InterruptedException
	
	{
		//set property and instantiate the webdriver
		
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//get the Edureka web site
		
		driver.navigate().to("https://www.edureka.co");
		
		
		//locate and click on the 'login' web element 
		
		driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/a[2]")).click();
		
		Thread.sleep(1000);

		//login with valid credentials
			
//		driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys("namrataktyagi@gmail.com");//user name
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).sendKeys("NannuBoulder18!"); //Password
		Thread.sleep(1000);
			
		
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click(); //Submit button
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")).click();   // My Login name
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[1]/a")).click(); // My Profile		
	
		
		Thread.sleep(1000);
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"personal_details\"]/i")).click(); // edit icon top right 
		
		
		
		
		
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//*[@name='currentrole']")).sendKeys("Senior A");
		
		Thread.sleep(1000);
		
		driver.close();
		driver.quit();
		
		//Navigate to my profile
		
		
		//update personal info
		
		
		
		//update professional info
		
		
		//explore the blogs?
		
		
		//navigate to main page
		
		
		//log out
		
		
	
		
		

	}

}
