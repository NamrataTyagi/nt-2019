package com.edureka.my.assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Module5Assignment {

	public static void main(String[] args) throws InterruptedException
	
	{
		//set property and instantiate the webdriver
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//get the Edureka web site
		
		driver.navigate().to("https://www.edureka.co");
		
		
		//locate and click on the 'login' web element 
		
		driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/a[2]")).click();
		
		Thread.sleep(1000);

		//login with valid credentials
			
		//PageLoad
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
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
		
		System.out.println("executed upto line 66");
		
		
		
		Thread.sleep(1000);

		//Navigate to my profile
		driver.navigate().to("https://learning.edureka.co/my-profile");
		

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		Thread.sleep(1000);

		
		//update personal info
		driver.findElement(By.id("personal_details")).click();
		driver.navigate().to("https://learning.edureka.co/onboarding/personaldetails");
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/div[4]/input")).sendKeys("Senior QA");
		
		//update professional info
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/div[3]/div/input")).sendKeys("7203081791");
		
		// drop down for experience
		//driver.findElement(By.xpath("//*[@id=\"experience\"]")).click();
		Select years = new Select(driver.findElement(By.xpath("//*[@id=\"experience\"]")));
		years.selectByValue("7-10 years");
		
	
		Thread.sleep(3000);
		System.out.println("executed upto line 97");
		
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button")).click();
		Thread.sleep(1000);
		System.out.println("executed upto line 100");
		
		//driver.close();
		//driver.quit();
	
		
		//explore the blogs?
		
		
		//navigate to main page
		
		
		//log out
		
		
	
		
		

	}

}
