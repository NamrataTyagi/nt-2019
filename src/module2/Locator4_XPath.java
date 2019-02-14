package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4_XPath {

	public static void main(String[] args) {

		{
			
			//Instantiate the Browser and print it's path
					System.setProperty("webdriver.chrome.driver","chromedriver");
					System.out.println(System.getProperty("user.dir"));
					WebDriver driver = new ChromeDriver();
					
			// Open the AUT
				/*driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
				
				driver.findElement(By.xpath("//*[@name='lastname']//preceding::input[1]")).sendKeys("Namrata");
				
				driver.findElement(By.xpath("//*[@name='lastname']//following::input[9]")).click();
				
				driver.findElement(By.xpath("//*[contains(@name,'profession')]//following::input[5]")).click();
				
				driver.findElement(By.xpath("//*[contains(@id, 'continents')]//following-sibling::option[4]")).click();*/
			
		}

	}

	}
		


