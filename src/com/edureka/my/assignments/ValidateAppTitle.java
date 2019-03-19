package com.edureka.my.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateAppTitle{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String AppTitle = driver.getTitle();
		System.out.println(AppTitle);

		 Boolean ExpectedTitle = AppTitle.equals("Instructor-Led Online Training with 24X7 Lifetime Support | Edureka");
		 System.out.println(ExpectedTitle);

	}

}
