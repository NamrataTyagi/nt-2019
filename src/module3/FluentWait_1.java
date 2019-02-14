package module3;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_1 {

	
		public static void main(String[] args) 
		{

			//Instantiate the Browser and print it's path
			System.setProperty("webdriver.chrome.driver","chromedriver");
			System.out.println(System.getProperty("user.dir"));
			
			WebDriver driver = new ChromeDriver();
		
			// get the web site
			driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(250, TimeUnit.MILLISECONDS);
			wait.withTimeout(2, TimeUnit.MINUTES);
			wait.ignoring(NoSuchElementException.class); // Forcing to ignore this exception

			
			Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() 
			
			{
				public WebElement apply(WebDriver arg0) {
					System.out.println("Checking for the object!!");
					WebElement element = arg0.findElement(By.linkText("LinkText-4"));
					if (element != null) {
						System.out.println("A new dynamic object is found.");
					}
					return element;
				}
			};

			wait.until(function);
			
			driver.close();

	}

}
