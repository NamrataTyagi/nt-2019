package module2;

		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException
	
	{
		// NewTours example for finding elements using locators: id and name
		

		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver",
		"chromedriver");
		System.out.println(System.getProperty("user.dir"));
		WebDriver driver = new ChromeDriver();
		
	
		//Open Application under test
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		driver.findElement(By.id("ts_first_name")).sendKeys("Namrata");
		
		driver.findElement(By.name("ts_last_name")).sendKeys("Tyagi");
		
		driver.findElement(By.name("ts_address")).sendKeys("Address,Denver,USA");
		
		driver.findElement(By.name("ts_checkbox1")).click();
		
		driver.findElement(By.name("Submit1")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
