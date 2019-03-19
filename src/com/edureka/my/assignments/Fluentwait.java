package com.edureka.my.assignments;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		Function<WebDriver,WebElement> function = new Function<WebDriver,WebElement>(){
				
			public WebElement apply(WebDriver arg0) {
				System.out.println("checking for the object");
			 	WebElement element = arg0.findElement(By.linkText("LinkText-4"));
				if (element!=null) {
					System.out.println("Element is found");
					
				}
				return element;
			}
		};
	}
}
	