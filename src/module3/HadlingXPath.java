package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadlingXPath {

	public static void main(String[] args) {


		//Instantiate the Browser and print it's path
				System.setProperty("webdriver.chrome.driver","chromedriver");
				System.out.println(System.getProperty("user.dir"));
				
				WebDriver driver = new ChromeDriver();
			// Open the AUT
			driver.get("https://www.facebook.com/");
			
			//driver.findElement(By.xpath("//*[@name='pass']//preceding::input[1]")).sendKeys("Abhresh");
			
			driver.findElement(By.xpath("//*[@id='month']//preceding::select/option[31]")).click();
			
			driver.findElement(By.xpath("//*[@id='day']//following::select/option[12]")).click();
			
			driver.findElement(By.xpath("//*[@id='month']//following::select/option[10]")).click();
			
			

	}

}
