package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt {

	public static void main(String[] args) 
	
	{
		
		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));

		WebDriver driver = new ChromeDriver();
		

		// open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		driver.findElement(By.id("prompt")).click();
		
		// Initialize the Alert Interface and Move the focus to Alert
		Alert pA = driver.switchTo().alert();

		pA.sendKeys("Namrata Tyagi");

		pA.accept();

	}

}
