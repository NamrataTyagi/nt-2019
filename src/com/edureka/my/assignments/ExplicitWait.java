package com.edureka.my.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://facebook.com");
		
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot account?")));
		
		e.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}

}
