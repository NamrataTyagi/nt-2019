package com.during.daily.lesson;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	
		
		public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver",
					"chromedriver");
//			System.getProperty("user.dir")+"/chromedriver");
					WebDriver driver = new ChromeDriver();
			System.out.println(System.getProperty("user.dir"));
			
	        try{
	            driver.get("http://google.co.in");
	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Test text");

	            //driver.findElement(By.xpath("//invalid*[@name='q']")).sendKeys("test");
	            System.out.println("Entered data in textfield");    
	        }   
	        catch (Exception e)
	        {  
	        	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
//	        	FileUtils.copyFile(scrFile, new File("/Users/namratatyagi/Selenium/Workspace/FirstProject/src/com/during/daily/lesson"
	        	FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"/src/com/during/daily/lesson"
	              			+System.currentTimeMillis()+".png"));
	            System.out.println("Screenshot is captured for failed testcase");
	        }  
	        //driver.close();
	    }  
	

	}


