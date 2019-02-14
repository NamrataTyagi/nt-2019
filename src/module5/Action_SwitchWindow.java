package module5;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_SwitchWindow {

		public static void main(String[] args) throws InterruptedException {

			//Instantiate the Browser
			System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");

			// Part1 - get the name of the main window
			String mw = driver.getWindowHandle();

			System.out.println("Main Window Name - " + mw);
			
			System.out.println("=========================================================================");

			Thread.sleep(5000);

			// Part2 - Click on the new message window button
			driver.findElement(By.xpath("//*[@id=\"btnCancelErrors\"]")).click();
			String nw = driver.getWindowHandle();
			System.out.println("New Window Name - " + nw);
	
			Thread.sleep(1000);

			// Part3 - Capturing the names of both the open windows
			Set awn = driver.getWindowHandles();
			
			System.out.println("All Window Name - " + awn);
			
			System.out.println("=========================================================================");
			
			Thread.sleep(5000);
					
			//Part4 - using for loop we are going to switch between the main window and the new windows.
			//for(String nw : driver.getWindowHandles()) {
				
				Thread.sleep(5000);
				
				driver.switchTo().window(nw);

				Thread.sleep(5000);
				
				driver.switchTo().window(nw);
						
	}

		}

