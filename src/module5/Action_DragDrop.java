package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragDrop {

	public static void main(String[] args) 
	
	{


		//Instantiate the Browser 
				System.setProperty("webdriver.chrome.driver","chromedriver");
			
				WebDriver driver = new ChromeDriver();

			driver.get("http://jqueryui.com/droppable/");
			
			//Focus my web driver towards the IFrame and we will use reference Variable
			WebElement iFrame = driver.findElement(By.tagName("iframe"));
				
			//Switch the towards the IFrame
			driver.switchTo().frame(iFrame);
					
			//From Source Location
			WebElement From = driver.findElement(By.id("draggable"));
			
			//To Destination Location
			WebElement To = driver.findElement(By.id("droppable"));
			
			
			Actions act = new Actions(driver);
			
			//Perform the movement of the Element from source to destination location
			
			act.dragAndDrop(From, To).perform();
			
	}

}
