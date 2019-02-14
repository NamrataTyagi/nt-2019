package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseHover {

	public static void main(String[] args) 
	
		{

		//Instantiate the Browser
			System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver = new ChromeDriver();
			
			{
			
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Jackets");
			
			driver.findElement(By.xpath("//*[@type='submit' and @class = 'vh79eN']")).click();
			
			WebElement MH = driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div._1HmYoV.hCUpcT > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div > a > div:nth-child(1) > div > div._3JlYXy > div > img"));

			Actions act = new Actions(driver);
			
			act.moveToElement(MH).perform();
	}		

	}

}
