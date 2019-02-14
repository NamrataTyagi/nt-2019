package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseFromKeyboard {

	public static void main(String[] args) 
	
	{
		
		//Instantiate the Browser
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement FName = driver.findElement(By.name("firstname"));
			
			Actions act = new Actions(driver);

			Action newact = act.moveToElement(FName)
					.keyDown(FName, Keys.SHIFT)
					.sendKeys("Namrata Testing")
					.keyUp(FName, Keys.SHIFT)
					.doubleClick(FName)
					.contextClick(FName)
					.build();
			
					newact.perform();
					
					
	}

}
