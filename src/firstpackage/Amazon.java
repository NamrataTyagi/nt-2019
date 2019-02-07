package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	// Search for red shoes on Amazon
		
		driver.navigate().to("https://www.amazon.com");// to get to URL which is not the current page

				/*driver.findElement( By.id("twotabsearchtextbox")).sendKeys("red shoes");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.navigate().back();*/
		
		driver.findElement(By.id("searchDropdownBox")).click();
		
	}

}
