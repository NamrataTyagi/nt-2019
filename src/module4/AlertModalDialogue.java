package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertModalDialogue {

	public static void main(String[] args) {
		
		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));

		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//*[@class = '_2AkmmA _29YdH8']")).click();
			
			driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("Jackets");
			
			
			

	}

}
