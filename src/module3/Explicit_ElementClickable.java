package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_ElementClickable {

	public static void main(String[] args) 
	
	{

			
			//Instantiate the Browser and print it's path
			System.setProperty("webdriver.chrome.driver","chromedriver");
			System.out.println(System.getProperty("user.dir"));
			WebDriver driver = new ChromeDriver();
				
				//Open AUT
				driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

				WebDriverWait wait = new WebDriverWait(driver, 10);		
				WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-4")));
				e.click();
				

	}

}
