package firstpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		/*
		
		//by ID locator
		
		driver.findElement(By.id("u_0_c")).sendKeys("Testing_ID_Locator");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		
		
		//by Name locator
		
		driver.findElement(By.name("pass")).sendKeys("Testing_name-locator");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
				
				
		//by Class locator - usually not unique identifier!!
		
		driver.findElement(By.className("mbl _3m9 _6o _6s _mf")).getText();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	
				
		//by link text - link text is the text next to a link like - 'Forgot Account?'
				
		driver.findElement(By.linkText("Forgot account?"));
		driver.navigate().back();
		System.out.println("Found element by link text"); // in console text is visible
		
	  	

		//by partial link text - partial link text is a portion of the text next to a link like - 'ot Acc'

		driver.findElement(By.partialLinkText("ot acc"));
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("Found element by partial link text"); // check in console text is visible
		Thread.sleep(5000);
		
		driver.close();
		
		
		//by CSS locator

		driver.findElement(By.cssSelector("#u_0_c")).sendKeys("by CSS Selector"); 
		
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("Found element by CSS Selector"); // check in console text is visible
		Thread.sleep(5000);
		
		driver.close();
		*/
		
		
		//List the count of elements with tag name <a>
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		driver.close();
		
}
	}
