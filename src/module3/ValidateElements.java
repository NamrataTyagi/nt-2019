package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateElements {

	public static void main(String[] args) 
	{
		
		//Instantiate the Browser and print it's path
		
			System.setProperty("webdriver.chrome.driver","chromedriver");
			System.out.println(System.getProperty("user.dir"));
				
			WebDriver driver = new ChromeDriver();

			driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

			driver.findElement(By.id("profession-0")).click();
			
			WebElement element = driver.findElement(By.id("profession-0"));
			
			boolean result = element.isSelected();
			
			System.out.println(result);
	}

}
